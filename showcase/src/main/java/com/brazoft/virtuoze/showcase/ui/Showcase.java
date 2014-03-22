package com.brazoft.virtuoze.showcase.ui;

import com.brazoft.virtuoze.infra.BrowserStorage;
import com.brazoft.virtuoze.infra.BrowserStorage.StoreKey;
import com.brazoft.virtuoze.infra.api.EventHandler;
import com.brazoft.virtuoze.showcase.ui.pages.ClientPage;
import com.brazoft.virtuoze.ui.Container.Row.Column;
import com.brazoft.virtuoze.ui.Event;
import com.brazoft.virtuoze.ui.Image;
import com.brazoft.virtuoze.ui.Navbar;
import com.brazoft.virtuoze.ui.SidebarLayout;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public class Showcase implements EntryPoint {
  @Override
  public void onModuleLoad() {
    BrowserStorage.get().onComplete(new EventHandler<BrowserStorage.StoreKey>() {
      
      @Override
      public void onEvent(Event<StoreKey> e) {
        Showcase.this.init();
      }
    });
    
    CodeConsumer.get().load();
  }
  
  private void init(){
    SidebarLayout layout = new SidebarLayout();
    Column main = layout.main();
    
    final PageFlow pageFlow = new PageFlow(main);
    final PageList pageList = new PageList(pageFlow);
    
    final ClientPage client = new ClientPage();
    pageFlow.flow(client);
    main.add(client).style().top(64, Unit.PX);
    
    Navbar navbar = new Navbar();
    navbar.css().append(Navbar.Placement.TOP);
    navbar.brand().image(new Image().src(Bundle.icons.logo()));
    navbar.leftFacet().addItem().text("Client").onClick(new ClickHandler() {
      
      @Override
      public void onClick(ClickEvent event) {
        pageFlow.select(client.id());
        pageList.reset();
      }
    }).onClick(pageFlow);
    
    navbar.leftFacet().addItem().text("Server");
    navbar.rightFacet().addText().text(Bundle.constants.version());
    layout.top().add(navbar);
    
    layout.left().add(pageList);
    pageFlow.select(client.id());
  }
}