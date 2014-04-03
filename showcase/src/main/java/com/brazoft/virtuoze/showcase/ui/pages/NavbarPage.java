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

import com.brazoft.virtuoze.showcase.ui.Callout;
import com.brazoft.virtuoze.showcase.ui.Example;
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.showcase.ui.CodeConsumer.CodeRepository;
import com.brazoft.virtuoze.ui.DropButton;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.Navbar.Facet.DropItem;
import com.brazoft.virtuoze.ui.Navbar;
import com.brazoft.virtuoze.ui.OrderList;
import com.brazoft.virtuoze.ui.Paragraph;

public class NavbarPage extends Page {
  private static final String TITLE = "Navbar";
  public NavbarPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addTitle().text("Default navbar");
    this.addText().text("They begin collapsed (and are toggleable) in mobile views and become horizontal as the available viewport width increases.");
    
    Callout callout = this.addCallout(Callout.Color.WARNING);
    callout.addHeading().text("Overflowing content");
    callout.addText().html("Since Bootstrap doesn't know how much space the content in your navbar needs, you might run into issues with content wrapping into a second row. To resolve this, you can: ");
    OrderList options = new OrderList(OrderList.Type.ORDERED);
    options.addItem().text("Reduce the amount or width of navbar items.");
    options.addItem().text("Hide certain navbar items at certain screen sizes using ViewPort enum.");
    callout.add(options);
    
    Example example = this.addExample();
    Navbar navbar = new Navbar();
    navbar.brand().text("Brand");
    navbar.leftFacet().addItem().text("Link");
    navbar.leftFacet().addText().text("Text");
    navbar.leftFacet().addButton().text("Button");
    DropItem button = navbar.rightFacet().addDropItem();
    button.text("Dropdown");
    button.menu().addItem().text("Link");
    example.sample().add(navbar);
    example.code().add(CodeRepository.get().java("navbar"));
    
    this.addTitle().text("Facets");
    this.addText().html("Align nav links, forms, buttons, or text, using the <code>leftFacet()</code> or <code>rightFacet()</code> methods.");
    
    this.addTitle().text("Placement variations");
    this.addText().html("Bootstrap give you some placement variations to Navbar component. Just use Navbar.Placement class to use these placements like <code>Navbar.Placement.BOTTOM</code>, <code>Navbar.Placement.STATIC</code> and <code>Navbar.Placement.TOP</code>");
    
    this.addSubtitle().text("Fixed to top");
    callout = this.addCallout(Callout.Color.DANGER);
    callout.addHeading().text("Body padding required");
    callout.addText().html("The fixed navbar will overlay your other content, unless you add <code>padding</code> to the top of the <code>&lt;body&gt;</code>. Try out your own values or use our snippet below. Tip: By default, the navbar is 50px high.");
    callout.addCode().add(CodeRepository.get().css("navbar.top.snippet"));
    
    this.addSubtitle().text("Fixed to bottom");
    callout = this.addCallout(Callout.Color.DANGER);
    callout.addHeading().text("Body padding required");
    callout.addText().html("The fixed navbar will overlay your other content, unless you add <code>padding</code> to the bottom of the <code>&lt;body&gt;</code>. Try out your own values or use our snippet below. Tip: By default, the navbar is 50px high");
    callout.addCode().add(CodeRepository.get().css("navbar.bottom.snippet"));
    
    this.addSubtitle().text("Static top");
    this.addText().text("Create a full-width navbar that scrolls away with the page. Unlike the fixed classes, you do not need to change any padding on the body.");
    
    this.addSubtitle().text("Inverted navbar");
    this.addText().html("Modify the look of the navbar by adding <code>Navbar.Type.INVERSE</code> to css appender.");
    navbar = new Navbar();
    navbar.css().append(Navbar.Type.INVERSE);
    navbar.brand().text("Brand");
    navbar.leftFacet().addItem().text("Link");
    navbar.leftFacet().addText().text("Text");
    navbar.leftFacet().addButton().text("Button");
    button = navbar.rightFacet().addDropItem();
    button.text("Dropdown");
    button.menu().addItem().text("Link");
    example = this.addExample();
    example.sample().add(navbar);
    example.code().add(CodeRepository.get().java("navbar.inverse"));
    
  }

  @Override
  public NavbarPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Navbars are responsive meta components that serve as navigation headers for your application or site.");
    return this;
  }
}