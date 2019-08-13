package com.wire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
public class Developer {
@Value("Bhimsen")
private String devName;
private Technology tech;
public String getDevName() {
	return devName;
}
public void setDevName(String devName) {
	this.devName = devName;
}
public Technology getTech() {
	return tech;
}
@Autowired
@Qualifier("Java")
public void setTech(Technology tech) {
	this.tech = tech;
}
}