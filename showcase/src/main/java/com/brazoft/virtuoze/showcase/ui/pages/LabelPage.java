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
import com.brazoft.virtuoze.ui.Heading;
import com.brazoft.virtuoze.ui.Label;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;

public class LabelPage extends Page {
  private static final String TITLE = "Label";

  public LabelPage() {
    super(TITLE);
    this.setup();
  }

  private void setup() {
    this.addText().html("You can attach labels to headings. Just use <code>appendTo()</code> method.");
    Example example = this.addExample();
    
    for(Heading.Level level : Heading.Level.values()){
      Heading heading = new Heading(level).text("Heading example");
      new Label().text("Label").appendTo(heading);
      example.sample().add(heading);
    }
    example.code().add(CodeRepository.get().java("label.heading"));
    
    this.addTitle().text("Available variations");
    this.addText().text("Add any of the below mentioned modifier classes to change the appearance of a label.");
    example = this.addExample();
    example.sample().add(this.createLabel(Label.Color.DEFAULT));
    example.sample().add(this.createLabel(Label.Color.PRIMARY));
    example.sample().add(this.createLabel(Label.Color.SUCCESS));
    example.sample().add(this.createLabel(Label.Color.INFO));
    example.sample().add(this.createLabel(Label.Color.WARNING));
    example.sample().add(this.createLabel(Label.Color.DANGER));
    example.code().add(CodeRepository.get().java("label.variations"));
  }
  
  private Label createLabel(Label.Color color){
    Label label = new Label().text(color.name().replace("label-", ""));
    label.css().append(color);
    return label;
  }

  @Override
  public LabelPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Adaptative labels to headings and appearance variations to hightlight texts.");
    return this;
  }
}