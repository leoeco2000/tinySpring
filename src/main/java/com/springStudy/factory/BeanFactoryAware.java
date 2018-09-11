package com.springStudy.factory;

public interface BeanFactoryAware {

  void setBeanFactory(BeanFactory beanFactory) throws Exception;
}