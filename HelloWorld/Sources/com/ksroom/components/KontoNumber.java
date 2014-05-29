package com.ksroom.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import er.extensions.components.ERXComponent;

public class KontoNumber extends ERXComponent {
  /**
   * Do I need to update serialVersionUID?
   * See section 5.6 <cite>Type Changes Affecting Serialization</cite> on page 51 of the 
   * <a href="http://java.sun.com/j2se/1.4/pdf/serial-spec.pdf">Java Object Serialization Spec</a>
   */
  private static final long serialVersionUID = 1L;

  //********************************************************************
  //  Constructor : コンストラクタ
  //********************************************************************
	  
  public KontoNumber(WOContext aContext) {
    super(aContext);
	System.err.println("Kontonummer Constructor");

  }


  public WOActionResults doSomething() {
///    System.out.println("--> I am doing something : " + kontonummer() + sampleString());

    return null;
  }



/**
 * @param kontonummer the kontonummer to set
 */
public void setKontonummer(String kontonummer) {
	System.err.println("setKontonummer");
	this.kontonummer = kontonummer;
}

/**
 * @return the kontonummer
 */
public String kontonummer() {
	System.err.println("String Kontonummer");
	return kontonummer;
}
  
private String kontonummer;

}
