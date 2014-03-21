package com.brazoft.virtuoze.showcase.i18n;

/**
 * Interface to represent the messages contained in resource bundle:
 * 	/Users/andersonbraz/Documents/workspace/brazoft/maven/virtuoze-appz/showcase/src/main/resources/com/brazoft/virtuoze/showcase/i18n/Messages.properties'.
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated "H{0}. Heading".
   * 
   * @return translated "H{0}. Heading"
   */
  @DefaultMessage("H{0}. Heading")
  @Key("headingText")
  String headingText(String arg0);
}
