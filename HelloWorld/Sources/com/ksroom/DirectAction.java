// Generated by the WOLips Templateengine Plug-in at Feb 3, 2014 1:25:28 PM
package com.ksroom;

import com.ksroom.components.Main;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WORequest;

import er.extensions.appserver.ERXDirectAction;


public class DirectAction extends ERXDirectAction {
  public DirectAction(WORequest request) {
    super(request);
  }

  public WOActionResults defaultAction() {
    return pageWithName(Main.class.getName());
  }
  
  public WOActionResults logoutAction() {
    
    session().terminate();
    
    return defaultAction();
  }
  
  
  
  
  
  
  
}
