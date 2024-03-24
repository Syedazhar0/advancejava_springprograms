package com.sathya.springex;

public class PatientDetails {
	private DoctorPatienet doctorPatienet;
	private Phrmacy1 phrmacy1;
private String name;
private int age;


public DoctorPatienet getDoctorPatienet() {
	return doctorPatienet;
}
public void setDoctorPatienet(DoctorPatienet doctorPatienet) {
	this.doctorPatienet = doctorPatienet;
}
public Phrmacy1 getPhrmacy1() {
	return phrmacy1;
}
public void setPhrmacy1(Phrmacy1 phrmacy1) {
	this.phrmacy1 = phrmacy1;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public void patientd() {
	System.out.println("patient name "+name);
	System.out.println("patient age "+age);
	doctorPatienet.Doctordetails();
	phrmacy1.pAtienet();
}

}

