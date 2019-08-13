package com.bean;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
public class MainApplication {

    public static void main(String []a) {

//        Resource res =new ClassPathResource("spconfig.xml");
//        BeanFactory fac = new XmlBeanFactory(res);

    	ApplicationContext fac=new ClassPathXmlApplicationContext("spconfig.xml");
        MyService myservice=(MyService)fac.getBean("myservice");
        System.out.println("Before print");
        System.out.println(myservice.getJob().getMyJob());
    }
}
