package com.ksroom.components;

import com.webobjects.appserver.WOContext;

import er.extensions.components.ERXComponent;

public class MyMainComponent extends ERXComponent {

  /* o : this belongs to CLASS : MyMainComponent */
  public static String sampleStaticPublicString = "12";

  /* o : IVAR for Object */
  public String samplePublicString;

  /* x : package */
  String sampleWhateverString;

  /* o : all Objecte for this Instance */
  protected String sampleProtectedString;



  //********************************************************************
  //  Constructor : コンストラクタ
  //********************************************************************

  public MyMainComponent(WOContext context) {
    super(context);

    sampleString = "bla";

    EColor y = EColor.Yellow;
    printCode(y);


    System.err.println(y.name()); // --> Yellow


    ETBFEuropeanUnion eu = ETBFEuropeanUnion.NO;
    printCode(eu);
  }

  public void printCode(Enum e) {
    if (e instanceof ITBFLocalizable) {
      ITBFLocalizable xx = (ITBFLocalizable) e;
      System.err.println(xx.localizableKey());
    } else {

      System.err.println(e);
    }
  }




  public void setSampleString(String sampleString) {
    System.err.println(sampleString);

    this.sampleString = sampleString;
    _sampleString = sampleString;
  }
  public String sampleString() {
    return "(" + sampleString + ")";
  }
  /* o : private */
  private String sampleString;

  private String _sampleString;






}
