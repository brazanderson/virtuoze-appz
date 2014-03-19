package com.brazoft.virtuoze.showcase.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Bundle_Icon_pt_StaticClientBundleGenerator implements com.brazoft.virtuoze.showcase.ui.Bundle.Icon {
  private static Bundle_Icon_pt_StaticClientBundleGenerator _instance0 = new Bundle_Icon_pt_StaticClientBundleGenerator();
  private void logoInitializer() {
    logo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "logo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      0, 0, 93, 16, false, false
    );
  }
  private static class logoInitializer {
    static {
      _instance0.logoInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return logo;
    }
  }
  public com.google.gwt.resources.client.ImageResource logo() {
    return logoInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseForStaticFiles() + "26C32DFFED75746F50945FD59FADDA24.cache.png";
  private static com.google.gwt.resources.client.ImageResource logo;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      logo(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("logo", logo());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'logo': return this.@com.brazoft.virtuoze.showcase.ui.Bundle.Icon::logo()();
    }
    return null;
  }-*/;
}
