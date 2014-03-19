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

import com.brazoft.virtuoze.ui.Composite;
import com.brazoft.virtuoze.ui.Elements;
import com.brazoft.virtuoze.ui.Widget;

public class Example extends Widget<Example> {
  private Code code = new Code();

  private Sample sample = new Sample();

  public Example() {
    super(Elements.div());
    this.addChild(this.sample).addChild(this.code);
  }

  public Code code() {
    return this.code;
  }

  public Sample sample() {
    return this.sample;
  }

  public class Sample extends Composite<Sample> {
    public Sample() {
      super(Elements.div());
      this.classes().set("bs-example");
    }
  }

  public class Code extends Widget<Code> {
    public Code() {
      super(Elements.div());
      this.classes().set("highlight");
    }

    public Code add(String code) {
      this.element().setInnerHTML(code);
      return this;
    }
  }
}