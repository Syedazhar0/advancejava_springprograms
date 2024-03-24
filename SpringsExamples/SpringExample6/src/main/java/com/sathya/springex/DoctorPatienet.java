package com.sathya.springex;

public class DoctorPatienet {
	
	
private int DoctorId ;
private String DoctorName;

public int getDoctorId() {
	return DoctorId;
}
public void setDoctorId(int doctorId) {
	DoctorId = doctorId;
}
public String getDoctorName() {
	return DoctorName;
}
public void setDoctorName(String doctorName) {
	DoctorName = doctorName;
}

public void Doctordetails() {
	System.out.println("doctor id "+DoctorId);
	System.out.println("doctor name"+DoctorName);
}
}
