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
import com.brazoft.virtuoze.ui.Badge;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.Pills;

public class BadgePage extends Page {
  private static final String TITLE = "Badge";
  
  public BadgePage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    String value = "10";
    
    Example example = this.addExample();
    example.sample().add(new Badge().text(value));
    example.code().add(CodeRepository.get().java("badge", value));
    
    this.addTitle().text("Self collapsing");
    this.addText().html("When there are no new or unread items, badges will simply collapse (via CSS's <code>:empty</code> selector) provided no content exists within.");
    
    Callout callout = this.addCallout(Callout.Color.DANGER);
    callout.addHeading().text(Bundle.constants.crossBrowser());
    callout.addText().html("Badges won't self collapse in Internet Explorer 8 because it lacks support for the <code>:empty</code> selector.");
    
    this.addTitle().text("Adapts to active nav states");
    this.addText().text("Built-in styles are included for placing badges in active states in pill navigations.");
    
    example = this.addExample();
    Pills pills = new Pills();
    pills.addPill().text(Bundle.constants.home()).addBadge().text(value);
    pills.addPill().text(Bundle.constants.profile());
    
    example.sample().add(pills);
    example.code().add(CodeRepository.get().java("badge.adapt.pill", Bundle.constants.home(), value, Bundle.constants.profile()));
  }

  @Override
  public Page summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().html("Easily highlight new or unread items by adding a <code>Badge</code> to links, Bootstrap navs, and more.");
    return this;
  }
}