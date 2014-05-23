package com.ksroom.components;

import org.treasureboat.foundation.enums.iface.ITBFLocalizable;
import org.treasureboat.foundation.enums.iface.ITBFVersion;

import com.webobjects.foundation.NSKeyValueCodingAdditions;

/**
 * org.treasureboat.foundation.enums.ETBFEuropeanUnion
 */
public enum ETBFEuropeanUnion implements ITBFLocalizable, ITBFVersion {

  YES, 
  NO;

  //********************************************************************
  //  Implements ITBFLocalizable
  //********************************************************************

  @Override
  public String localizableKey() {
    StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName());
    sb.append(NSKeyValueCodingAdditions.KeyPathSeparator);
    sb.append(name());
    return sb.toString();
  }

  //********************************************************************
  //  Implements ITBFVersion
  //********************************************************************

  @Override
  public int versionNumber() {
    return 1;
  }

}
