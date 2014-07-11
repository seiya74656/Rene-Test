package com.ksroom.tests;

import junit.framework.Assert;
import junit.framework.TestCase;

import com.ksroom.MyHelperClass;


public class Sample extends TestCase {

  public void testStringWithNtimesString() {

    Assert.assertEquals(MyHelperClass.stringWithNtimesString(2, "Hallo"), "HalloHallo");
    Assert.assertEquals(MyHelperClass.stringWithNtimesString(5, "a"), "aaaaa");

  }

}
