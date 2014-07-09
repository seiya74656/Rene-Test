package com.ksroom.components;

import java.util.Formatter;

import com.sun.org.apache.xpath.internal.operations.Equals;
import com.webobjects.appserver.WOActionResults;
import com.webobjects.appserver.WOContext;
import er.extensions.components.ERXComponent;

// next time I have to show you
// javadoc, todo, fix, eclipse codes, dash, log, trasureboat

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
	  kontostandalt = kontostand; //Setzt den Kontostandalt wert noch auf den unveränderten Kontostand nach einzahlung
	  kontostand = einzahlen + kontostand; //Führt die Kontostand einzahlung durch.
	  
///    System.out.println("--> I am doing something : " + einzahlen() + sampleString());
    return null;
  }



/**
 * @param einzahlen the einzahlen to set
 */
public void setEinzahlen(float einzahlen) {
	this.einzahlen = einzahlen;
}

/**
 * @return the einzahlen
 */
public float getEinzahlen() {
	System.err.println("Int Einzahlen");
	return einzahlen;
}
  
public float einzahlen;


// Selbe wie Kontonummer, nur mit Kontostand als float

public void setKontostand(float kontostand) {
	this.kontostand = kontostand;
	}

public float getKontostand()
{
  return kontostand;
}

public float kontostand = 999.0f; /// 999 Anfangswert wenn Programmgestartet wird.


//Selbe wie Kontostand, nur mit altem wert

public void setKontostandalt(float kontostandalt) {
	if (kontostandalt == 0.0f) kontostandalt = kontostand; // Soll wenn noch keine Einzahlung getätigt wurde auf den Anfagswert 999 stellen.
	this.kontostandalt = kontostandalt + 1f;
	}


public float getKontostandalt()
{
return kontostandalt;
}

public float kontostandalt; 

}
