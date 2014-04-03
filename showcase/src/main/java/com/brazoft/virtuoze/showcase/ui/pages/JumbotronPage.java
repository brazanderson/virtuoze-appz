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

import com.brazoft.virtuoze.showcase.ui.Example;
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.showcase.ui.CodeConsumer.CodeRepository;
import com.brazoft.virtuoze.ui.Jumbotron;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;

public class JumbotronPage extends Page {
  private static final String TITLE = "Jumbotron";
  public JumbotronPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    Example example = this.addExample();
    Jumbotron jumbotron = new Jumbotron();
    jumbotron.header().text("Hi there!");
    jumbotron.message().text("This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.");
    jumbotron.button().text("Learn more");
    example.sample().add(jumbotron);
    example.code().add(CodeRepository.get().java("jumbotron"));
  }

  @Override
  public JumbotronPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.");
    return this;
  }
}