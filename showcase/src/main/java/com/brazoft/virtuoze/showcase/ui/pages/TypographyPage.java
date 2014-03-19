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
import com.brazoft.virtuoze.showcase.ui.Callout;
import com.brazoft.virtuoze.showcase.ui.CodeConsumer.CodeRepository;
import com.brazoft.virtuoze.showcase.ui.Example;
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.ui.Blockquote;
import com.brazoft.virtuoze.ui.DescriptionList;
import com.brazoft.virtuoze.ui.Heading;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.OrderList;
import com.brazoft.virtuoze.ui.Paragraph;
import com.brazoft.virtuoze.ui.css.HeadingClass;

public class TypographyPage extends Page {
  private static final String TITLE = "Typography";

  public TypographyPage() {
    super(TITLE);
    this.setup();
  }

  private void setup() {
    this.headingSection();
    this.paragraphSection();
    this.blockquoteSection();
    this.listSection();
    this.descriptionSection();
  }
  
  private void descriptionSection(){
    this.addTitle().text("Description");
    this.addText().text("A list of terms with their associated descriptions.");
    
    DescriptionList description = this.descriptionSample();
    Example example = this.addExample();
    example.sample().add(description);
    example.code().add(CodeRepository.get().java("typography.description"));
    
    this.addSubtitle().text("Horizontal variation");
    description = this.descriptionSample().horizontal();
    example = this.addExample();
    example.sample().add(description);
    example.code().add(CodeRepository.get().java("typography.description.horizontal"));
    
    Callout callout = this.addCallout(Callout.Color.INFO);
    callout.addHeading().text("Auto-truncating");
    callout.addText().html("Horizontal description lists will truncate terms that are too long to fit in the left column with <code>text-overflow</code>. In narrower viewports, they will change to the default stacked layout.");
  }
  
  private DescriptionList descriptionSample(){
    DescriptionList description = new DescriptionList();
    description.addItem("Description lists", "A description list is perfect for defining terms.");
    description.addItem("Euismod", "Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit. Donec id elit non mi porta gravida at eget metus.");
    return description;
  }
  
  private void listSection(){
    this.addTitle().text("Lists");
    this.addSubtitle().text("Unordered");
    this.addText().html("A list of items in which the order does <em>not</em> explicitly matter.");
    Example example = this.addExample();
    OrderList list = this.listSample(OrderList.Type.UNORDERED);
    example.sample().add(list);
    example.code().add(CodeRepository.get().java("typography.list.unordered"));
    
    this.addSubtitle().text("Ordered");
    this.addText().html("A list of items in which the order <em>does</em> explicitly matter.");
    example = this.addExample();
    list = this.listSample(OrderList.Type.ORDERED);
    example.sample().add(list);
    example.code().add(CodeRepository.get().java("typography.list.ordered"));
    
    this.addSubtitle().text("Unstyled");
    this.addText().html("Remove the default <code>list-style</code> and left margin on list items (immediate children only). <strong>This only applies to immediate children list items</strong>, meaning you will need to add the class for any nested lists as well.");
    example = this.addExample();
    this.listSample(OrderList.Type.UNORDERED);
    list.classes().append(OrderList.Style.UNSTYLED);
    example.sample().add(list);
    example.code().add(CodeRepository.get().java("typography.list.unstyled"));
    
    this.addSubtitle().text("Inline");
    this.addText().html("Place all list items on a single line with <code>display: inline-block;</code> and some light padding.");
    example = this.addExample();
    list = this.listSample(OrderList.Type.UNORDERED);
    list.classes().append(OrderList.Style.INLINE);
    example.sample().add(list);
    example.code().add(CodeRepository.get().java("typography.list.inline"));
  }
  
  private OrderList listSample(OrderList.Type type){
    OrderList list = new OrderList(type);
    list.addItem().text("Lorem ipsum dolor sit amet");
    list.addItem().text("Consectetur adipiscing elit");
    list.addItem().text("Integer molestie lorem at massa");
    return list;
  }
  
  private void blockquoteSection(){
    this.addTitle().text("Blockquotes");
    this.addText().html("For quoting blocks of content from another source within your document.");
    
    Example example = this.addExample();
    example.sample().add(new Blockquote().text(Bundle.constants.sampleText()));
    example.code().add(CodeRepository.get().java("typography.blockquote", Bundle.constants.sampleText()));
    
    this.addSubtitle().text("Footer variation");
    example = this.addExample();
    example.sample().add(new Blockquote().text(Bundle.constants.sampleText()).footer(Bundle.constants.someoneFamousVirtuous()));
    example.code().add(CodeRepository.get().java("typography.blockquote.footer", Bundle.constants.sampleText(), Bundle.constants.someoneFamousVirtuous()));
  
    this.addSubtitle().text("Alternate display");
    example = this.addExample();
    example.sample().add(new Blockquote().text(Bundle.constants.sampleText()).footer(Bundle.constants.someoneFamousVirtuous()).reverse());
    example.code().add(CodeRepository.get().java("typography.blockquote.reverse", Bundle.constants.sampleText(), Bundle.constants.someoneFamousVirtuous()));
  }
  
  private void paragraphSection(){
    this.addTitle().text("Body copy");
    this.addText().html("Bootstrap's global default <code>font-size</code> is <strong>14px</strong>, with a <code>line-height</code> of <strong>1.428</strong>. This is applied to the <code>&lt;body&gt;</code> and all paragraphs. In addition, <code>&lt;p&gt;</code> (paragraphs) receive a bottom margin of half their computed line-height (10px by default). Use Paragraph class to create it.");
    
    Example example = this.addExample();
    example.sample().add(new Paragraph().html(Bundle.constants.sampleParagraphText()));
    example.code().add(CodeRepository.get().java("typography.paragraph", Bundle.constants.sampleParagraphText()));
    
    this.addSubtitle().text("Lead body copy");
    this.addText().html("Make a paragraph stand out by calling <code>lead()</code> method.");
    
    example = this.addExample();
    example.sample().add(new Paragraph().html(Bundle.constants.sampleText()).lead());
    example.code().add(CodeRepository.get().java("typography.paragraph.lead", Bundle.constants.sampleText()));
  }
  
  private void headingSection(){
    this.addTitle().text("Heading");
    this.addText().html("All HTML headings are available through <code>Heading</code> class.");
    Example example = this.addExample();
    for(Heading.Level level : Heading.Level.values()){
      example.sample().add(new Heading(level).text(Bundle.messages.headingText(level.level())));
    }
    example.code().add(CodeRepository.get().java("typography.heading"));
    
    this.addText().html("<code>.h1</code> through <code>.h6</code> classes are also available, just use HeadingClass. You probably wanna use it for when you want to match the font styling of a heading but still want your text to be displayed inline.");
    example = this.addExample();
    for(Heading.Level level : Heading.Level.values()){
      Paragraph text = new Paragraph().text(Bundle.messages.headingText(level.level()));
      text.classes().set(HeadingClass.get(level));
      example.sample().add(text);
    }
    example.code().add(CodeRepository.get().java("typography.heading.classes"));
    
    this.addText().html("Create lighter, headline text in any heading. Just call <code>headline()</code> method");
    example = this.addExample();
    for(Heading.Level level : Heading.Level.values()){
      example.sample().add(new Heading(level).text(Bundle.messages.headingText(level.level())).headline("Secondary Text"));
    }
    example.code().add(CodeRepository.get().java("typography.heading.secondary"));
  }
  
  @Override
  public TypographyPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Bootstrap sets basic global display, typography, and link styles.");
    return this;
  }
}