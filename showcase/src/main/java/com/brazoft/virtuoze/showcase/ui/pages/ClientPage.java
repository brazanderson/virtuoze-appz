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
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.showcase.ui.SyntaxHighlighter;
import com.brazoft.virtuoze.ui.HTML;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;

public class ClientPage extends Page {
  private static final String TITLE = "Virtuoze Client Architecture";
  public ClientPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addText().html("All the Virtuoze Client Architecture is based on <a href='http://www.gwtproject.org' target='_blank'>GWT</a> and <a href='http://getbootstrap.com' target='_blank'>Bootstrap</a>. Furthermore, we just develop amazing widgets, that it is not present in native Bootstrap, to empower your web applications.");
    this.addTitle().text("Compiled vs Embedded Javascript");
    this.addText().html("You probably know GWT compiles Java code into Javascript one. We prefer to use GWT compiled Javascript than use embedded Javascript (like jquery). Always it is possible, we will migrate native Javascript code to GWT one. All the bootstrap pieces you find here are using <code>GWT compiled</code> code instead of using <code>bootstrap.js</code>.");
    this.addTitle().text("Getting Started");
    this.addText().html("Bootstrap makes use of certain HTML elements and CSS properties that require the use of the HTML5 doctype. Include it at the beginning of all your projects.");
    String head = HTML.head().toString();
    head = head.substring(0, head.lastIndexOf("-->") + 3);
    this.addText().html(SyntaxHighlighter.get().xml("<!DOCTYPE html>\r\n<html>\r\n\t" + head + "\r\n\t</head>\r\n\t..."));
    this.addTitle().text("Normalize.css");
    this.addText().html("For improved cross-browser rendering, we use <a target='_blank' href='http://necolas.github.io/normalize.css/'>Normalize.css</a>");
    this.addTitle().text("Maven");
    this.addText().html(Bundle.constants.mavenPieces());
    this.addText().html(CodeRepository.get().xml("client.maven.parent"));
    this.addText().html(CodeRepository.get().xml("client.maven.dependencies"));
    this.addTitle().text("Maven archetype");
    this.addText().html(Bundle.constants.mavenArchetype());
    this.addText().html(CodeRepository.get().plain("client.maven.archetype", Bundle.constants.version()));
  }

  @Override
  public ClientPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Know all you can do with Virtuoze Client Architecture. We just cover some gaps to provide you amazing solutions.");
    return this;
  }
}