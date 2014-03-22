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

import com.brazoft.virtuoze.showcase.ui.CodeConsumer.CodeRepository;
import com.brazoft.virtuoze.showcase.ui.Example;
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.ui.Button;
import com.brazoft.virtuoze.ui.Icon;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.ListItem;
import com.brazoft.virtuoze.ui.OrderList;
import com.brazoft.virtuoze.ui.Tag;
import com.brazoft.virtuoze.ui.Text;
import com.brazoft.virtuoze.ui.css.ButtonColor;
import com.google.gwt.dom.client.DivElement;

public class IconPage extends Page {
  private static final String TITLE = "Icons";
  public IconPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addTitle().text("Available glyphs");
    this.addText().html("Includes 200 glyphs in font format from the Glyphicon Halflings set. <a href='http://glyphicons.com/'>Glyphicons</a> Halflings are normally not available for free, but their creator has made them available for Bootstrap free of cost. As a thank you, we only ask that you include a link back to <a href='http://glyphicons.com/'>Glyphicons</a> whenever possible.");
    Example example = this.addExample();
    example.sample().add(new Button().text("Iconic").icon(Icon.LEAF));
    Button btn = new Button().text("Iconic").icon(Icon.CLOUD);
    btn.css().append(ButtonColor.PRIMARY);
    example.sample().add(btn);
    example.code().add(CodeRepository.get().java("icon"));
    
    OrderList iconList = new OrderList(OrderList.Type.UNORDERED);
    iconList.css().set("bs-glyphicons-list");
    for(Icon icon : Icon.values()){
      ListItem item = iconList.addItem();
      icon.appendTo(item);
      Text text = new Text();
      text.css().set("glyphicon-class").append("small");
      item.add(text.text("Icon." + icon.name()));
    }
    Tag<DivElement> iconsContainer = Tag.asDiv();
    iconsContainer.css().set("bs-glyphicons");
    this.body().add(iconsContainer.add(iconList));
  }

  @Override
  public IconPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Use them in buttons, button groups for a toolbar, navigation, or prepended form inputs.");
    return this;
  }
}