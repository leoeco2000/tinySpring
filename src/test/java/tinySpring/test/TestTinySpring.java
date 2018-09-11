package tinySpring.test;

import java.util.Map;
import org.junit.Test;
import com.springStudy.beans.BeanDefinition;
import com.springStudy.beans.PropertyValue;
import com.springStudy.beans.PropertyValues;
import com.springStudy.factory.AutowireCapableBeanFactory;
import com.springStudy.factory.BeanFactory;
import com.springStudy.io.ResourceLoader;
import com.springStudy.xml.XmlBeanDefinitionReader;
import tinySpring.test.service.HelloWorldService;

public class TestTinySpring {

  public void testStep1() throws Exception {
    // 1.初始化beanfactory
    BeanFactory beanFactory = new AutowireCapableBeanFactory();

    // 2.bean定义
    BeanDefinition beanDefinition = new BeanDefinition();
    beanDefinition.setBeanClassName("tinySpring.test.HelloWorldService");

    // 3.设置属性
    PropertyValues propertyValues = new PropertyValues();
    propertyValues.addPropertyValue(new PropertyValue("text", "Hello World!"));
    beanDefinition.setPropertyValues(propertyValues);

    // 4.生成bean
    beanFactory.registerBeanDefinition("helloWorldService", beanDefinition);

    // 5.获取bean
    HelloWorldService helloWorldService =
        (HelloWorldService) beanFactory.getBean("helloWorldService");
    helloWorldService.helloWorld();
  }

  @Test
  public void testStep5() throws Exception {
    // 1.读取配置
    XmlBeanDefinitionReader xmlBeanDefinitionReader =
        new XmlBeanDefinitionReader(new ResourceLoader());
    xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");

    // 2.初始化BeanFactory并注册bean
    BeanFactory beanFactory = new AutowireCapableBeanFactory();
    for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader
        .getRegistry().entrySet()) {
      beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(),
          beanDefinitionEntry.getValue());
    }

    // 3.获取bean
    HelloWorldService helloWorldService =
        (HelloWorldService) beanFactory.getBean("helloWorldService");
    helloWorldService.helloWorld();
  }
}
