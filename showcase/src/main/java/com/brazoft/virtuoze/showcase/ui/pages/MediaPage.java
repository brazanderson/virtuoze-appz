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
import com.brazoft.virtuoze.ui.Media;
import com.brazoft.virtuoze.ui.MediaList;
import com.brazoft.virtuoze.ui.css.Floating;

public class MediaPage extends Page {
  private static final String TITLE = "Media object";
  public MediaPage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
    this.addTitle().text("Default media");
    this.addText().text("The default media allow to float a media object (images, video, audio) to the left or right of a content block.");
    Example example = this.addExample();
    
    Media media = this.createMedia();
    media.body().add(this.createMedia());
    example.sample().add(media);
    example.code().add(CodeRepository.get().java("media"));
    
    this.addTitle().text("Media list");
    this.addText().text("You can use media inside list (useful for comment threads or articles lists).");
    
    MediaList list = new MediaList();
    list.add(this.createMedia());
    media = this.createMedia();
    media.object().css().append(Floating.RIGHT);
    media.body().add(this.createMedia());
    list.add(media);
    list.add(this.createMedia());
    example = this.addExample();
    example.sample().add(list);
    example.code().add(CodeRepository.get().java("media.list"));
  }
  
  private Media createMedia(){
    Media media = new Media();
    media.object().addImage().src(Bundle.images.favico());
    media.body().addHeading().text("Media heading");
    media.body().addText().text("Cras sit amet nibh libero, in gravida nulla. Nulla vel metus scelerisque ante sollicitudin commodo. Cras purus odio, vestibulum in vulputate at, tempus viverra turpis. Fusce condimentum nunc ac nisi vulputate fringilla. Donec lacinia congue felis in faucibus.");
    return media;
  }

  @Override
  public MediaPage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Abstract object styles for building various types of components (like blog comments, Tweets, etc) that feature a left- or right-aligned image alongside textual content.");
    return this;
  }
}