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
import com.brazoft.virtuoze.ui.Image;
import com.brazoft.virtuoze.ui.ListGroup.ListGroupItem;

public class ImagePage extends Page {
  private static final String TITLE = "Image";
  public ImagePage() {
    super(TITLE);
    this.setup();
  }
  
  private void setup(){
	  this.addTitle().text("Shapes");
	  this.addText().html("Add classes to an <code>Image</code> to easily style images in any project.");
	  Example example = this.addExample();
	  example.sample().add(this.createImage(Image.Shape.CIRCLE)).add(this.createImage(Image.Shape.ROUNDED))
	  .add(this.createImage(Image.Shape.THUMBNAIL));
	  example.code().add(CodeRepository.get().java("image"));
	  
	  this.addTitle().text("Responsive");
	  this.addText().html("Images in Bootstrap 3 can be made responsive-friendly via <code>responsive()</code> method of <code>Image</code> class. This applies <code>max-width: 100%;</code> and <code>height: auto;</code> to the image so that it scales nicely to the parent element.");
	  example = this.addExample();
	  example.sample().add(new Image().src(Bundle.images.logo()).responsive());
	  example.code().add(CodeRepository.get().java("image.responsive"));
  }
  
  private Image createImage(Image.Shape shape){
	  Image image = new Image().src(Bundle.images.v());
	  image.css().append(shape);
	  return image;
  }

  @Override
  public ImagePage summary(ListGroupItem item) {
    item.addHeading().text(TITLE);
    item.addText().text("Decorate your images using some shapes and make it even responsive.");
    return this;
  }
}