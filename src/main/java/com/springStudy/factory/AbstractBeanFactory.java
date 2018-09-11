package com.springStudy.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import com.springStudy.beans.BeanDefinition;

public abstract class AbstractBeanFactory implements BeanFactory {

  private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

  public Object getBean(String name) {
    return this.beanDefinitionMap.get(name).getBean();
  }

  public void registerBeanDefinition(String name, BeanDefinition beanDefinition) throws Exception {
    Object bean = doCreateBean(beanDefinition);
    beanDefinition.setBean(bean);
    this.beanDefinitionMap.put(name, beanDefinition);
  }

  abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
