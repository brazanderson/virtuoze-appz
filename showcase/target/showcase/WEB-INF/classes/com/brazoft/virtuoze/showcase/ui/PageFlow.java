package com.brazoft.virtuoze.showcase.ui;

import java.util.HashMap;
import java.util.Map;

import com.brazoft.virtuoze.ui.NavigationFlow;
import com.brazoft.virtuoze.ui.api.UIWidget;

public class PageFlow extends NavigationFlow {

  private Map<String, Page> pages = new HashMap<String, Page>();
  
  private Page page;
  
  public PageFlow(UIWidget pageContainer) {
    super(pageContainer);
  }
  
  public PageFlow flow(Page page){
    this.pages.put(page.id(), page);
    return this;
  }
  
  public PageFlow select(String id){
    this.page = this.pages.get(id);
    return this;
  }
  
  @Override
  protected UIWidget page() {
    return this.page;
  }
}