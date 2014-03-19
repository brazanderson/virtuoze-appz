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

import com.brazoft.virtuoze.showcase.ui.pages.AlertPage;
import com.brazoft.virtuoze.showcase.ui.pages.BadgePage;
import com.brazoft.virtuoze.showcase.ui.pages.BreadcrumbPage;
import com.brazoft.virtuoze.showcase.ui.pages.ButtonPage;
import com.brazoft.virtuoze.showcase.ui.pages.TypographyPage;
import com.brazoft.virtuoze.ui.ListGroup;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.Widget;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class PageList extends Widget<PageList> {
  private ListGroup list = new ListGroup();
  
  private PageFlow flow;
  
  public PageList(PageFlow flow) {
    this.compound(this.list);
    this.flow = flow;
    this.setup();
  }
  
  private void setup(){
    this.add(new AlertPage())
    .add(new BadgePage())
    .add(new BreadcrumbPage())
    .add(new ButtonPage());
    this.add(new TypographyPage());
  }
  
  public PageList reset(){
    this.list.reset();
    return this;
  }
  
  public PageList add(final Page page){
    this.flow.flow(page);
    ListGroupItem item = this.list.addItem();
    item.onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        PageList.this.flow.select(page.id());
      }
    });
    
    page.summary(item.onClick(this.flow));
    return this;
  }
}