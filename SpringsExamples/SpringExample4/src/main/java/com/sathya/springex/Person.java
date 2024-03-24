package com.sathya.springex;

public class Person {
private String name;
private String email;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public void personinfo() {
	System.out.println("hello"+name+"welcome to sathyatech");
	System.out.println("hello"+email+"notifications will sent to this mail");
}

public Person() {
	System.out.println("person constructor : :object created");
}

}
