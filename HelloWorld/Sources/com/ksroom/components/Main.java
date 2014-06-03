// Generated by the WOLips Templateengine Plug-in at Feb 3, 2014 1:25:28 PM
package com.ksroom.components;

import com.ksroom.Application;
import com.ksroom.Session;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WOSession;
import com.webobjects.foundation.NSArray;
import com.webobjects.foundation.NSDictionary;
import com.webobjects.foundation.NSMutableArray;
import com.webobjects.foundation.NSMutableDictionary;
import com.webobjects.foundation.NSTimestamp;

import er.extensions.appserver.ERXApplication;
import er.extensions.appserver.ERXSession;
import er.extensions.components.ERXComponent;
import er.extensions.foundation.ERXTimestampUtilities;

public class Main extends ERXComponent {
  private static final long serialVersionUID = 1L;
  private String myTextForDisplay = "Hello World from the Java world";

  public Main(WOContext context) {
    super(context);
    
   // Application application = (Application) Application.application();
    
    Application application = (Application) ERXApplication.application();

    Session session = (Session) ERXSession.session();
    
    
    //NSArray
//    NSMutableArray
//  NSDictionary  
//  NSMutableDictionary  
    
   // Application application = 
    //		(Application)Application.application();
    
    
    
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

  public Welcome kontoAbfrage() {
	  Welcome nextPage = pageWithName(Welcome.class);
	  // meine änderung
	  
			  return nextPage;
  }

  public Welcome2 sayHi3() {
	  Welcome2 nextPage = pageWithName(Welcome2.class);
	  return nextPage;
  }
  public KontoNumber sayHi2() {
	  KontoNumber nextPage = pageWithName(KontoNumber.class);
	  
	  // meine änderung
	  
			  return nextPage;
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
    return now().timestampByAddingGregorianUnits(0, 0, 1, 0, 0, 0);
  }

  public NSTimestamp tomorrow2() {
	  return ERXTimestampUtilities.tomorrow();
	  }
 
  
  
}