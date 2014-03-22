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
import com.brazoft.virtuoze.ui.Alert;
import com.brazoft.virtuoze.ui.Alert.Color;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.Paragraph;

public class AlertPage extends Page {
  private static final String TITLE = "Alert";
  
  public AlertPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    Paragraph text = this.addText();
    text.html("Wrap any text and an optional dismiss button in <code>Alert</code> and one of the four contextual classes (e.g., <code>Alert.Color.SUCCESS</code>) for basic alert messages.");
    
    Example example = this.addExample();
    
    example.sample().add(this.createAlert(Color.SUCCESS, Bundle.constants.alertSuccess()))
    .add(this.createAlert(Color.INFO, Bundle.constants.alertInfo()))
    .add(this.createAlert(Color.WARNING, Bundle.constants.alertWarning()))
    .add(this.createAlert(Color.DANGER, Bundle.constants.alertDanger()));
    
    example.code().add(CodeRepository.get().java("alert", Bundle.constants.alertSuccess(), Bundle.constants.alertInfo(), Bundle.constants.alertWarning(), Bundle.constants.alertDanger()));
    
    this.addTitle().text("Dismissable");
    
    text = this.addText().text("Build on any alert by adding an optional close button. Use closeable() method.");
    
    example = this.addExample();
    example.sample().add(this.createAlert(Color.SUCCESS, Bundle.constants.alertSuccess()).closeable());
    example.code().add(CodeRepository.get().java("alert.dismissable", Bundle.constants.alertSuccess()));
  }
  
  private Alert createAlert(Alert.Color color, String sample){
    Alert alert = new Alert();
    alert.css().append(color);
    alert.add(new Paragraph().html(sample));
    return alert;
  }

  @Override
  public Page summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.");
    return this;
  }
}