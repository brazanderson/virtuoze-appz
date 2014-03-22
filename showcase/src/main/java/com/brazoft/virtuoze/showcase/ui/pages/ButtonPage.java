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
import com.brazoft.virtuoze.ui.Button;
import com.brazoft.virtuoze.ui.ButtonGroup;
import com.brazoft.virtuoze.ui.DropButton;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.SplitButton;
import com.brazoft.virtuoze.ui.api.UIClass;
import com.brazoft.virtuoze.ui.css.ButtonColor;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class ButtonPage extends Page {
  private static final String TITLE = "Button";
  public ButtonPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addTitle().text("Colors");
    this.addText().text("Use any of the available button classes to quickly create a styled button.");
    Example example = this.addExample();
    example.sample().add(new Button().text("Default"))
    .add(this.createButton("Primary", ButtonColor.PRIMARY))
    .add(this.createButton("Success", ButtonColor.SUCCESS))
    .add(this.createButton("Info", ButtonColor.INFO))
    .add(this.createButton("Warning", ButtonColor.WARNING))
    .add(this.createButton("Danger", ButtonColor.DANGER))
    .add(this.createButton("Link", ButtonColor.LINK));
    example.code().add(CodeRepository.get().java("button.color"));
    
    this.addTitle().text(Bundle.constants.sizing());
    this.addText().html("Fancy larger or smaller buttons? Just use <code>Button.Size</code> class");
    example = this.addExample();
    example.sample().add(this.createButton("Large", Button.Size.LARGE))
    .add(this.createButton("Default", ButtonColor.DEFAULT))
    .add(this.createButton("Small", Button.Size.SMALL))
    .add(this.createButton("Extra Small", Button.Size.X_SMALL));
    example.code().add(CodeRepository.get().java("button.size"));
    
    this.addText().html("Create block level buttons—those that span the full width of a parent— by calling <code>block()</code> method.");
    example = this.addExample();
    example.sample().add(new Button().text("Block").block());
    example.code().add(CodeRepository.get().java("button.block"));
    
    this.addTitle().text("Active state");
    this.addText().html("Buttons will appear pressed (with a darker background, darker border, and inset shadow) when active. This is done via <code>activate()</code> method.");
    example = this.addExample();
    final Button btn = new Button().text("Block").activate();
    btn.onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        if(btn.active()){
          btn.deactivate();
          return;
        }
        btn.activate();
      }
    });
    example.sample().add(btn);
    example.code().add(CodeRepository.get().java("button.active"));
    
    this.addTitle().text("Disabled state");
    this.addText().html("Make buttons look unclickable by fading them back 50% calling <code>disable()</code> method.");
    example = this.addExample();
    example.sample().add(new Button().text("Block").disable().onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        // It should not be called on a disabled button.
        Window.alert("If this message is appearing, it is wrong... :|");
      }
    }));
    example.code().add(CodeRepository.get().java("button.disable"));
    
    this.addTitle().text("Toggle Button");
    this.addText().html("Just call <code>toggleable</code> to activate toggling on a single button.");
    example = this.addExample();
    example.sample().add(this.createButton("Toggle", ButtonColor.DEFAULT).toggleable());
    example.code().add(CodeRepository.get().java("button.toggleable"));
    
    this.addTitle().text("Button dropdowns");
    this.addText().html("Use any button to trigger a dropdown menu by using <code>DropButton</code> class.");
    example = this.addExample();
    example.sample().add(this.createDropButton("Default", ButtonColor.DEFAULT))
    .add(this.createDropButton("Primary", ButtonColor.PRIMARY))
    .add(this.createDropButton("Success", ButtonColor.SUCCESS))
    .add(this.createDropButton("Info", ButtonColor.INFO))
    .add(this.createDropButton("Warning", ButtonColor.WARNING))
    .add(this.createDropButton("Danger", ButtonColor.DANGER));
    example.code().add(CodeRepository.get().java("button.dropdown"));
    
    this.addTitle().text("Split button dropdowns");
    this.addText().html("Similarly, create split button dropdowns with <code>SplitButton</code> class.");
    example = this.addExample();
    example.sample().add(this.createSplitButton("Default", ButtonColor.DEFAULT))
    .add(this.createSplitButton("Primary", ButtonColor.PRIMARY))
    .add(this.createSplitButton("Success", ButtonColor.SUCCESS))
    .add(this.createSplitButton("Info", ButtonColor.INFO))
    .add(this.createSplitButton("Warning", ButtonColor.WARNING))
    .add(this.createSplitButton("Danger", ButtonColor.DANGER));
    example.code().add(CodeRepository.get().java("button.split"));
    
    this.addTitle().text("Dropup variation");
    this.addText().html("Trigger dropdown menus above elements by calling <code>up()</code> method.");
    example = this.addExample();
    example.sample().add(this.createDropButton("Default", ButtonColor.DEFAULT).up());
    example.sample().add(this.createSplitButton("Default", ButtonColor.DEFAULT).up());
    example.code().add(CodeRepository.get().java("button.dropup"));
    
    this.addTitle().text("Button groups");
    this.addText().html("Group a series of buttons together on a single line with the button group. Just use <code>ButtonGroup</code> class.");
    example = this.addExample();
    ButtonGroup btnGroup = this.createButtonGroup();
    example.sample().add(btnGroup);
    example.code().add(CodeRepository.get().java("button.group"));
    
    this.addTitle().text(Bundle.constants.sizing());
    this.addText().html("Instead of applying button sizing classes to every button in a group, just add <code>ButtonGroup.Size</code> class.");
    example = this.addExample();
    btnGroup = this.createButtonGroup();
    btnGroup.css().append(ButtonGroup.Size.LARGE);
    example.sample().add(btnGroup);
    example.code().add(CodeRepository.get().java("button.group.sizing"));
    
    this.addTitle().text("Vertical variation");
    this.addText().html("Make a set of buttons appear vertically stacked rather than horizontally. <strong class='text-danger'>Split button dropdowns are not supported here.</strong>");
    example = this.addExample();
    btnGroup = this.createButtonGroup();
    btnGroup.css().append(ButtonGroup.Orientation.VERTICAL);
    example.sample().add(btnGroup);
    example.code().add(CodeRepository.get().java("button.group.vertical"));
    
    this.addTitle().text("Block level variation");
    this.addText().html("Just wrap a series of button in ButtonGroupBlock");
    example = this.addExample();
    example.sample().add(this.createButtonGroup(ButtonGroup.Type.BLOCK));
    example.code().add(CodeRepository.get().java("button.group.block"));
    
    this.addTitle().text("Checkbox behavior");
    this.addText().html("Just call <code>checkbox()</code> method to enable a group of checkboxes for checkbox style toggling on button group.");
    example = this.addExample();
    example.sample().add(this.createButtonGroup().checkbox());
    example.code().add(CodeRepository.get().java("button.group.checkbox"));
    
    this.addTitle().text("Radio behavior");
    this.addText().html("Just call <code>radio()</code> method to enable a group of radio for radio style toggling on button group.");
    example = this.addExample();
    example.sample().add(this.createButtonGroup().radio());
    example.code().add(CodeRepository.get().java("button.group.radio"));
  }
  
  private ButtonGroup createButtonGroup(){
    return this.createButtonGroup(ButtonGroup.Type.DEFAULT);
  }
  
  private ButtonGroup createButtonGroup(ButtonGroup.Type type){
    return new ButtonGroup(type).add(new Button().text("left"))
    .add(new Button().text("middle"))
    .add(new Button().text("right"));
  }
  
  private SplitButton createSplitButton(String text, UIClass clazz){
    SplitButton btn = new SplitButton();
    btn.text(text).css().append(clazz);
    btn.menu().addItem().text("Action");
    btn.menu().addItem().text("Another Action");
    btn.menu().addDivider();
    btn.menu().addItem().text("Vituous Action").onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("You've got the power. Go virtuous. :)");
      }
    });
    
    return btn;
  }
  
  private DropButton createDropButton(String text, UIClass clazz){
    DropButton btn = new DropButton();
    btn.text(text).css().append(clazz);
    btn.menu().addItem().text("Action");
    btn.menu().addItem().text("Another Action");
    btn.menu().addDivider();
    btn.menu().addItem().text("Vituous Action").onClick(new ClickHandler() {
      @Override
      public void onClick(ClickEvent event) {
        Window.alert("You've got the power. Go virtuous. :)");
      }
    });
    
    return btn;
  }
  
  private Button createButton(String text, UIClass clazz){
    Button btn = new Button().text(text);
    btn.css().append(clazz);
    return btn;
  }

  @Override
  public ButtonPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Do more with buttons. Control button states or create groups of buttons for more components like toolbars.");
    return this;
  }
}