package com.springStudy.beans;

public interface BeanDefinitionReader {
  void loadBeanDefinitions(String location) throws Exception;
}
