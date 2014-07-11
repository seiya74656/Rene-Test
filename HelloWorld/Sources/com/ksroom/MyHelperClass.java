package com.ksroom;

public class MyHelperClass {

  /**
   * String multiplication.
   * 
   * @param n 
   *        The number of times to concatenate a given string.
   * @param s 
   *        The string to be multiplied.
   * 
   * @return 
   *        multiplied string
   */
  public static String stringWithNtimesString(int n, String s) {
    StringBuilder sb = new StringBuilder(n * (s != null ? s.length() : "null".length()));
    for (int i=0; i<n; i++) {
      sb.append(s);
    }
    return sb.toString();
  }

}
