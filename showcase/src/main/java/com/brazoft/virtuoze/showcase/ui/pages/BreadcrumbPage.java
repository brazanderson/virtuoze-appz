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
package com.brazoft.virtuoze.showcase.ui.pages;

import com.brazoft.virtuoze.showcase.ui.Bundle;
import com.brazoft.virtuoze.showcase.ui.CodeConsumer.CodeRepository;
import com.brazoft.virtuoze.showcase.ui.Example;
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.ui.Breadcrumb;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class BreadcrumbPage extends Page {
  private static final String TITLE = "Breadcrumb";
  public BreadcrumbPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addText().text("Separators are automatically added in CSS through <code>:before</code> and <code>content</code>.");
    Example example = this.addExample();
    Breadcrumb breadcrumb = new Breadcrumb();
    breadcrumb.addItem().text(Bundle.constants.home()).onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("Home item clicked");
      }
    });
    breadcrumb.addItem().text(Bundle.constants.profile());
    breadcrumb.addItem().text(Bundle.constants.user());
    example.sample().add(breadcrumb);
    example.code().add(CodeRepository.get().java("breadcrumb"));
  }

  @Override
  public BreadcrumbPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Indicate the current page's location within a navigational hierarchy.");
    return this;
  }
}