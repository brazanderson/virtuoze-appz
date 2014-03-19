/**
 * Copyright (C) 2004-2014 the original author or authors. See the notice.md file distributed with
 * this work for additional information regarding copyright ownership.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package com.brazoft.virtuoze.showcase.ui;

import org.fusesource.restygwt.client.Method;
import org.fusesource.restygwt.client.Resource;
import org.fusesource.restygwt.client.XmlCallback;

import com.brazoft.virtuoze.infra.BrowserStorage;
import com.brazoft.virtuoze.infra.BrowserStorage.StoreKey;
import com.brazoft.virtuoze.infra.MessageFormat;
import com.brazoft.virtuoze.infra.NodeIterable;
import com.brazoft.virtuoze.infra.Rest;
import com.brazoft.virtuoze.infra.Rest.PathBuilder;
import com.brazoft.virtuoze.ui.Elements;
import com.google.gwt.dom.client.Element;
import com.google.gwt.xml.client.Document;

public class CodeConsumer implements XmlCallback {
  private static final CodeConsumer instance = new CodeConsumer();

  public static CodeConsumer get() {
    return instance;
  }

  public CodeConsumer load() {
    Rest rest = new Rest(PathBuilder.get("code.xml"));
    rest.get().accept(Resource.CONTENT_TYPE_XML).send(this);
    return this;
  }

  @Override
  public void onFailure(Method method, Throwable exception) {

  }

  @Override
  public void onSuccess(Method method, Document response) {
    Element document = Elements.blockquote();
    document.setInnerHTML(response.toString());
    document = document.getFirstChildElement();
    
    BrowserStorage.get().store(Key.SAMPLE_CODE, new CodeRepository(document));
  }

  public static enum Key implements StoreKey {
    SAMPLE_CODE
  }

  public static class CodeRepository {
    private Element document;

    private CodeRepository(Element document) {
      this.document = document;
    }

    public static CodeRepository get() {
      return BrowserStorage.get().retrieve(Key.SAMPLE_CODE);
    }

    public final String java(String codeId, Object... args) {
      return SyntaxHighlighter.get().java(this.plain(codeId, args));
    }

    public final String xml(String codeId, Object... args) {
      return SyntaxHighlighter.get().xml(this.plain(codeId, args));
    }

    public String plain(String codeId, Object... args) {
      return MessageFormat.format(this.get(codeId), args);
    }
    
    private String get(String codeId){
      NodeIterable<Element> nodes = new NodeIterable<Element>(this.document.getElementsByTagName("code"));
      for(Element child : nodes){
        if(codeId.equals(child.getId())){
          return child.getInnerHTML();
        }
      }
      
      throw new IllegalArgumentException(codeId + " not found in code list");
    }
  }
}