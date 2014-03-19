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

import com.brazoft.virtuoze.showcase.i18n.Constants;
import com.brazoft.virtuoze.showcase.i18n.Messages;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public class Bundle {
  public static final Icon icons = GWT.create(Icon.class);
  
  public static final Image images = GWT.create(Image.class);
  
  public static final Constants constants = GWT.create(Constants.class);
  
  public static final Messages messages = GWT.create(Messages.class);
  
  public static interface Icon extends ClientBundle{
    @Source("com/brazoft/virtuoze/showcase/images/16/logo.png")
    ImageResource logo();
  }
  
  public static interface Image extends ClientBundle{
    @Source("com/brazoft/virtuoze/showcase/images/64/a.png")
    ImageResource a();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/b.png")
    ImageResource b();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/c.png")
    ImageResource c();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/d.png")
    ImageResource d();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/e.png")
    ImageResource e();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/f.png")
    ImageResource f();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/favico.png")
    ImageResource favico();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/g.png")
    ImageResource g();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/h.png")
    ImageResource h();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/i.png")
    ImageResource i();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/j.png")
    ImageResource j();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/k.png")
    ImageResource k();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/l.png")
    ImageResource l();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/logo.png")
    ImageResource logo();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/m.png")
    ImageResource m();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/n.png")
    ImageResource n();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/o.png")
    ImageResource o();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/p.png")
    ImageResource p();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/q.png")
    ImageResource q();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/r.png")
    ImageResource r();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/s.png")
    ImageResource s();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/t.png")
    ImageResource t();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/u.png")
    ImageResource u();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/v.png")
    ImageResource v();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/w.png")
    ImageResource w();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/x.png")
    ImageResource x();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/y.png")
    ImageResource y();
    
    @Source("com/brazoft/virtuoze/showcase/images/64/z.png")
    ImageResource z();
  }
}
