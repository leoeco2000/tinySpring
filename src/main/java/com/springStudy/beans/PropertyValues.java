package com.springStudy.beans;

import java.util.ArrayList;
import java.util.List;

public class PropertyValues {

  private final List<PropertyValue> propertyValueList = new ArrayList<>();
  
  public PropertyValues() {
  }
  
  public void addPropertyValue(PropertyValue pv) {
    propertyValueList.add(pv);
  }
  
  public List<PropertyValue> getPropertyValues() {
    return this.propertyValueList;
  }
}
