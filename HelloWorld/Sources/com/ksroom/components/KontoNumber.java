package com.ksroom.components;

import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import er.extensions.components.ERXComponent;

public class KontoNumber extends ERXComponent {
	  private static final long serialVersionUID = 1L;

	  
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
public String Kontonummer() {
	System.err.println("String Kontonummer");
	return kontonummer;
}
  
private String kontonummer;

}
