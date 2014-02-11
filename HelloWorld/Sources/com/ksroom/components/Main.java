// Generated by the WOLips Templateengine Plug-in at Feb 3, 2014 1:25:28 PM 
package com.ksroom.components;

import com.ksroom.Application;
import com.webobjects.appserver.WOApplication;
import com.webobjects.appserver.WOContext;
import com.webobjects.foundation.NSTimestamp;

import er.extensions.components.ERXComponent;

public class Main extends ERXComponent {
  private static final long serialVersionUID = 1L;
  private String myTextForDisplay = "Hello World from the Java world";

  public Main(WOContext context) {
    super(context);
    
    Application application = 
    		(Application)Application.application();
    application.incrementMainPageCounter();
    
    for (String aKey : context.request().headerKeys()) {
    	System.out.println(aKey);
    }
    System.out.println("accept-language =" + context.request().headerForKey("accept-language"));
    System.out.println("user-agent =" + context.request().headerForKey("user-agent"));
    System.out.println("host =" + context.request().headerForKey("host"));
  }

  public void setMyTextForDisplay(String myTextForDisplay) {
    this.myTextForDisplay = myTextForDisplay;
  }
  public String myTextForDisplay() {
    return myTextForDisplay;
  }

  public Welcome sayHi() {
	  Welcome nextPage = pageWithName(Welcome.class);
			  return nextPage;
  }
  public WOApplication getApplikation() {
	  return application();	  
  }
  /**
   * @return the now
   */
  public NSTimestamp now() {
    return new NSTimestamp();
  }

  /**
   * @return the tomorrow
   */
  public NSTimestamp tomorrow() {
    return new NSTimestamp();
  }

}
