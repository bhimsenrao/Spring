package com.mywiring.prop;

import org.springframework.beans.factory.annotation.Autowired;  
public class Country {  
  
    String countryName;  
  
    @Autowired  
    Capital capital;  
    public String getCountryName() {  
        return countryName;  
    }  
    public void setCountryName(String countryName) {  
        this.countryName = countryName;  
    }  
    public Capital getCapital() {  
        return capital;  
    }  
}  

