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
import com.brazoft.virtuoze.showcase.ui.Example;
import com.brazoft.virtuoze.showcase.ui.Page;
import com.brazoft.virtuoze.ui.Container.Row;
import com.brazoft.virtuoze.ui.Heading;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;
import com.brazoft.virtuoze.ui.Paragraph;
import com.brazoft.virtuoze.ui.Thumbnail;
import com.brazoft.virtuoze.ui.ViewPort;

public class ThumbnailPage extends Page {
  private static final String TITLE = "Thumbnail";

  public ThumbnailPage() {
    super(TITLE);
    this.setup();
  }

  private void setup() {
    this.addTitle().text("Default example");
    this.addText().text("By default, Bootstrap's thumbnails are designed to showcase linked images.");
    Row row = new Row();
    row.addColumn().span(4, ViewPort.MEDIUM).add(this.createThumbnail(false));
    row.addColumn().span(4, ViewPort.MEDIUM).add(this.createThumbnail(false));
    row.addColumn().span(4, ViewPort.MEDIUM).add(this.createThumbnail(false));
    Example example = this.addExample();
    example.sample().add(row);

    this.addTitle().text("Custom content");
    this.addText().text("By default, Bootstrap's thumbnails are designed to showcase linked images.");
    row = new Row();
    row.addColumn().span(4, ViewPort.MEDIUM).add(this.createThumbnail(true));
    row.addColumn().span(4, ViewPort.MEDIUM).add(this.createThumbnail(true));
    row.addColumn().span(4, ViewPort.MEDIUM).add(this.createThumbnail(true));
    example = this.addExample();
    example.sample().add(row);
  }

  private Thumbnail createThumbnail(boolean caption) {
    Thumbnail thumbnail = new Thumbnail();
    thumbnail.image().src(Bundle.images.logo());
    if(caption){
      thumbnail.caption()
      .add(new Heading(Heading.Level.THREE).text("Thumbnail label"))
      .add(new Paragraph().text("Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit."));
    }
    
    return thumbnail;
  }

  @Override
  public ThumbnailPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Extend Bootstrap's grid system with the thumbnail component to easily display grids of images, videos, text, and more.");
    return this;
  }
}