package com.ksroom.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import com.webobjects.appserver.WORequest;
import com.webobjects.appserver.WOResponse;

public class Welcome extends MyMainComponent {
  /**
   * Do I need to update serialVersionUID?
   * See section 5.6 <cite>Type Changes Affecting Serialization</cite> on page 51 of the 
   * <a href="http://java.sun.com/j2se/1.4/pdf/serial-spec.pdf">Java Object Serialization Spec</a>
   */
  private static final long serialVersionUID = 1L;

  //********************************************************************
  //  RR Methods : メソッド
  //********************************************************************

  @Override
  public void awake() {
    super.awake();

    // System.err.println("awake");
  }

  @Override
  public void takeValuesFromRequest(WORequest request, WOContext context) {
    //System.err.println("takeValuesFromRequest");

    super.takeValuesFromRequest(request, context);
  }

  @Override
  public WOActionResults invokeAction(WORequest request, WOContext context) {
    //System.err.println("invokeAction");

    return super.invokeAction(request, context);    
  }

  @Override
  public void appendToResponse(WOResponse response, WOContext context) {
    //System.err.println("appendToResponse");

    super.appendToResponse(response, context);
  }

  @Override
  public void sleep() {
    //System.err.println("sleep");

    super.sleep();
  }

  //********************************************************************
  //  
  //********************************************************************

  public Welcome(WOContext context) {
    super(context);



    MyMainComponent.sampleStaticPublicString = "25";

    samplePublicString = "55";

    sampleWhateverString = "33";

    sampleProtectedString = "xx";

    setSampleString("YYYY");

    System.err.println(sampleString());

    ///Session session = (Session) session();


    if (session() instanceof ISampleInterface) {
      ISampleInterface i = (ISampleInterface) session();

      System.err.println(i.backgroundColor());


    }
  }







  public WOActionResults doSomething() {
    System.out.println("--> I am doing something : " + scanner() + sampleString());

    return null;
  }


  public void setScanner(String scanner) {
    this.scanner = scanner;
  }
  public String scanner() {
    return scanner;
  }
  private String scanner;


}