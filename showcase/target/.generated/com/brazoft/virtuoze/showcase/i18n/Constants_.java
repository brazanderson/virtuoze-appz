package com.brazoft.virtuoze.showcase.i18n;

public class Constants_ implements com.brazoft.virtuoze.showcase.i18n.Constants {
  
  public java.lang.String alertDanger() {
    return "<strong>Oh snap!</strong> Change a few things up and try submitting again.";
  }
  
  public java.lang.String alertInfo() {
    return "<strong>Heads up!</strong>This alert needs your attention, but it's not super important.";
  }
  
  public java.lang.String alertSuccess() {
    return "<strong>Well done!</strong>You successfully read this important alert message.";
  }
  
  public java.lang.String alertWarning() {
    return "<strong>Warning!</strong> Better check yourself, you're not looking too good.";
  }
  
  public java.lang.String blockquote() {
    return "For quoting blocks of content from another source within your document.";
  }
  
  public java.lang.String blockquoteFooter() {
    return "Someone famous and virtuous";
  }
  
  public java.lang.String bodyCopy() {
    return "Bootstrap's global default <code>font-size</code> is <strong>14px</strong>, with a <code>line-height</code> of <strong>1.428</strong>. This is applied to the <code>&lt;body&gt;</code> and all paragraphs. In addition, <code>&lt;p&gt;</code> (paragraphs) receive a bottom margin of half their computed line-height (10px by default). Use Paragraph class to create it.";
  }
  
  public java.lang.String caDescription() {
    return "Know all you can do with Virtuoze Client Architecture. We just cover some gaps to provide you amazing solutions.";
  }
  
  public java.lang.String caIntro() {
    return "All the Virtuoze Client Architecture is based on <a href=\"http://www.gwtproject.org\" target=\"_blank\">GWT</a> and <a href=\"http://getbootstrap.com\" target=\"_blank\">Bootstrap</a>. Furthermore, we just develop amazing widgets, that it is not present in native Bootstrap, to empower your web applications.";
  }
  
  public java.lang.String ceIntro() {
    return "You probably know GWT compiles Java code into Javascript one. We prefer to use GWT compiled Javascript than use embedded Javascript (like jquery). Always it is possible, we will migrate native Javascript code to GWT one. All the bootstrap pieces you find here are using <code>GWT compiled</code> code instead of using <code>bootstrap.js</code>.";
  }
  
  public java.lang.String ceTitle() {
    return "Compiled vs Embedded Javascript";
  }
  
  public java.lang.String crossBrowser() {
    return "Cross-browser compatibility";
  }
  
  public java.lang.String gsHTML5() {
    return "Bootstrap makes use of certain HTML elements and CSS properties that require the use of the HTML5 doctype. Include it at the beginning of all your projects.";
  }
  
  public java.lang.String gsNormalizeCss() {
    return "For improved cross-browser rendering, we use <a target=\"_blank\" href=\"http://necolas.github.io/normalize.css/\">Normalize.css</a>, a project by <a target=\"_blank\" href=\"http://twitter.com/necolas\">Nicolas Gallagher</a> and <a target=\"_blank\" href=\"http://twitter.com/jon_neal\">Jonathan Neal</a>.";
  }
  
  public java.lang.String home() {
    return "Home";
  }
  
  public java.lang.String leadBodyCopy() {
    return "Make a paragraph stand out by calling <code>lead()</code> method.";
  }
  
  public java.lang.String mavenArchetype() {
    return "If you prefer, we provide a maven archetype. It is the easiest way to start using Virtuoze from scratch.";
  }
  
  public java.lang.String mavenPieces() {
    return "Virtuoze is based on Maven. All you need to do is put virtuoze dependencies to your project's pom.xml.";
  }
  
  public java.lang.String profile() {
    return "Profile";
  }
  
  public java.lang.String sampleParagraphText() {
    return "Nullam quis risus eget urna mollis ornare vel eu leo. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nullam id dolor id nibh ultricies vehicula.<br/><br/>Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec ullamcorper nulla non metus auctor fringilla. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Donec ullamcorper nulla non metus auctor fringilla.<br/><br/>Maecenas sed diam eget risus varius blandit sit amet non magna. Donec id elit non mi porta gravida at eget metus. Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit.<br/><br/>";
  }
  
  public java.lang.String sampleText() {
    return "Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Duis mollis, est non commodo luctus.";
  }
  
  public java.lang.String user() {
    return "user";
  }
  
  public java.lang.String version() {
    return "3.0.0";
  }
  
  public boolean getBoolean(java.lang.String arg0) {
    Boolean target = (Boolean) cache.get(arg0);
    if (target != null) {
      return target.booleanValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  
  public double getDouble(java.lang.String arg0) {
    Double target = (Double) cache.get(arg0);
    if (target != null) {
      return target.doubleValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  
  public float getFloat(java.lang.String arg0) {
    Float target = (Float) cache.get(arg0);
    if (target != null) {
      return target.floatValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  
  public int getInt(java.lang.String arg0) {
    Integer target = (Integer) cache.get(arg0);
    if (target != null) {
      return target.intValue();
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  
  public java.util.Map<java.lang.String, java.lang.String> getMap(java.lang.String arg0) {
    java.util.Map<java.lang.String, java.lang.String> target = (java.util.Map<java.lang.String, java.lang.String>) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  
  public java.lang.String getString(java.lang.String arg0) {
    java.lang.String target = (java.lang.String) cache.get(arg0);
    if (target != null) {
      return target;
    }
    if(arg0.equals("alertDanger")) {
      String answer = alertDanger();
      cache.put("alertDanger",answer);
      return answer;
    }
    if(arg0.equals("alertInfo")) {
      String answer = alertInfo();
      cache.put("alertInfo",answer);
      return answer;
    }
    if(arg0.equals("alertSuccess")) {
      String answer = alertSuccess();
      cache.put("alertSuccess",answer);
      return answer;
    }
    if(arg0.equals("alertWarning")) {
      String answer = alertWarning();
      cache.put("alertWarning",answer);
      return answer;
    }
    if(arg0.equals("blockquote")) {
      String answer = blockquote();
      cache.put("blockquote",answer);
      return answer;
    }
    if(arg0.equals("blockquoteFooter")) {
      String answer = blockquoteFooter();
      cache.put("blockquoteFooter",answer);
      return answer;
    }
    if(arg0.equals("bodyCopy")) {
      String answer = bodyCopy();
      cache.put("bodyCopy",answer);
      return answer;
    }
    if(arg0.equals("caDescription")) {
      String answer = caDescription();
      cache.put("caDescription",answer);
      return answer;
    }
    if(arg0.equals("caIntro")) {
      String answer = caIntro();
      cache.put("caIntro",answer);
      return answer;
    }
    if(arg0.equals("ceIntro")) {
      String answer = ceIntro();
      cache.put("ceIntro",answer);
      return answer;
    }
    if(arg0.equals("ceTitle")) {
      String answer = ceTitle();
      cache.put("ceTitle",answer);
      return answer;
    }
    if(arg0.equals("crossBrowser")) {
      String answer = crossBrowser();
      cache.put("crossBrowser",answer);
      return answer;
    }
    if(arg0.equals("gsHTML5")) {
      String answer = gsHTML5();
      cache.put("gsHTML5",answer);
      return answer;
    }
    if(arg0.equals("gsNormalizeCss")) {
      String answer = gsNormalizeCss();
      cache.put("gsNormalizeCss",answer);
      return answer;
    }
    if(arg0.equals("home")) {
      String answer = home();
      cache.put("home",answer);
      return answer;
    }
    if(arg0.equals("leadBodyCopy")) {
      String answer = leadBodyCopy();
      cache.put("leadBodyCopy",answer);
      return answer;
    }
    if(arg0.equals("mavenArchetype")) {
      String answer = mavenArchetype();
      cache.put("mavenArchetype",answer);
      return answer;
    }
    if(arg0.equals("mavenPieces")) {
      String answer = mavenPieces();
      cache.put("mavenPieces",answer);
      return answer;
    }
    if(arg0.equals("profile")) {
      String answer = profile();
      cache.put("profile",answer);
      return answer;
    }
    if(arg0.equals("sampleParagraphText")) {
      String answer = sampleParagraphText();
      cache.put("sampleParagraphText",answer);
      return answer;
    }
    if(arg0.equals("sampleText")) {
      String answer = sampleText();
      cache.put("sampleText",answer);
      return answer;
    }
    if(arg0.equals("user")) {
      String answer = user();
      cache.put("user",answer);
      return answer;
    }
    if(arg0.equals("version")) {
      String answer = version();
      cache.put("version",answer);
      return answer;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  
  public java.lang.String[] getStringArray(java.lang.String arg0) {
    java.lang.String[] target = (java.lang.String[]) cache.get(arg0);
    if (target != null) {
      return target;
    }
    throw new java.util.MissingResourceException("Cannot find constant '" +arg0 + "'; expecting a method name", "com.brazoft.virtuoze.showcase.i18n.Constants", arg0);
  }
  java.util.Map cache = new java.util.HashMap();
}
