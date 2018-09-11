package com.springStudy.factory;

import com.springStudy.beans.BeanDefinition;

/**
 * 
 * 
 * **/
public interface BeanFactory {
  
  Object getBean(String name);
  
  void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception;
}
