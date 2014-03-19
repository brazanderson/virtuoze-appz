package com.brazoft.virtuoze.showcase.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Bundle_Icon_default_InlineClientBundleGenerator implements com.brazoft.virtuoze.showcase.ui.Bundle.Icon {
  private static Bundle_Icon_default_InlineClientBundleGenerator _instance0 = new Bundle_Icon_default_InlineClientBundleGenerator();
  private void logoInitializer() {
    logo = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "logo",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(externalImage),
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
  private static final java.lang.String externalImage = "data:image/png;base64,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";
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
