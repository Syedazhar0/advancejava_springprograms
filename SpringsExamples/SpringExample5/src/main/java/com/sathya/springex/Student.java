package com.sathya.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
private EmailService emailService;
	@Autowired
private JavaCourseService javaCourseService;

public void details() {
	System.out.println("details are :");
	emailService.message();
	javaCourseService.courseInfo();
}
public Student() {
	System.out.println("student constructor : : object is created successfully");
}
}
