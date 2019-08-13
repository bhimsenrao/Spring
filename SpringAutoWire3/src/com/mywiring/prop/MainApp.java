package com.mywiring.prop;


import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class MainApp{  
  
    public static void main(String[] args) {  
        ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");  
  
        Country countryObj = (Country) appContext.getBean("CountryBean");  
        String countryName=countryObj.getCountryName();  
        Capital capital=countryObj.getCapital();  
        String capitalName=capital.getCapitalName();  
        System.out.println(capitalName+" is capital of "+countryName);  
         
    }  
} 
