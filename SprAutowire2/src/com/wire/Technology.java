package com.wire;
import org.springframework.beans.factory.annotation.Value;

public class Technology {
@Value("Java")	
private String techname;
private int experience;
public String getTechname() {
	return techname;
}
public void setTechname(String techname) {
	this.techname = techname;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
}
