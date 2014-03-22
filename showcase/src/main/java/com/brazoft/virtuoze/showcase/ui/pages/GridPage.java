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
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;

public class GridPage extends Page {
  private static final String TITLE = "Grid system";
  public GridPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addText().html("Bootstrap includes a responsive, mobile first fluid grid system that appropriately scales up to 12 columns as the device or viewport size increases. It includes predefined classes for easy layout options, as well as powerful mixins for generating more semantic layouts.");
    
    this.addTitle().text("Fixed width container");
    this.addText().html(Bundle.messages.containerStyle("Fixed width", "FIXED"));
    Example example = this.addExample();
    example.code().add(CodeRepository.get().java("container.fixed"));
    
    this.addTitle().text("Fluid container");
    this.addText().html(Bundle.messages.containerStyle("Fluid", "FLUID"));
    example = this.addExample();
    example.code().add(CodeRepository.get().java("container.fluid"));
    
    this.addTitle().text("Rows");
    this.addText().html("Just call <code>addRow()</code> method of <code>Container</code> class.");
    example = this.addExample();
    example.code().add(CodeRepository.get().java("container.row"));
    
    this.addTitle().text("Columns");
    this.addText().html("Just call <code>addColumn()</code> method of <code>Row</code> class.");
    example = this.addExample();
    example.code().add(CodeRepository.get().java("container.column"));
    
    this.addTitle().text("Responsive Layout");
    this.addText().html("Don't want your columns to simply stack in smaller devices? Just call <code>span()</code> method and configure your grid for each <code>ViewPort</code> instance.");
    example = this.addExample();
    example.code().add(CodeRepository.get().java("container.span"));
    
    this.addTitle().text("Responsive column resets");
    this.addText().html("With the four tiers of grids available you're bound to run into issues where, at certain breakpoints, your columns don't clear quite right as one is taller than the other. To fix that, use <code>clearfix()</code> and <code>ViewPort</code>");
    example = this.addExample();
    example.code().add(CodeRepository.get().java("container.clearfix"));
    
    this.addTitle().text("Offsetting columns");
    this.addText().html("Move columns to the right using <code>offset()</code> method and <code>ViewPort</code> class. It increases the left margin of a column by <code>*</code> columns. For example, <code>offset(4, ViewPort.MEDIUM)</code> moves it over four columns on medium Viewport.");
    example = this.addExample();
    example.code().add(CodeRepository.get().java("container.offset"));
  }

  @Override
  public GridPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Grid systems are used for creating page layouts through a series of rows and columns that house your content.");
    return this;
  }
}