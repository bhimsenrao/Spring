package com.spr.jdbc;

public class Person {
private int id;
private String pname;
public Person() {
	super();
	// TODO Auto-generated constructor stub
}
public Person(int id, String pname) {
	super();
	this.id = id;
	this.pname = pname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "Person [id=" + id + ", pname=" + pname + "]";
}

}
