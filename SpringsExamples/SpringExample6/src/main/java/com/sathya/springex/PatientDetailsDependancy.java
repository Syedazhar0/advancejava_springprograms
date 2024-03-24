package com.sathya.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PatientDetailsDependancy {
	
	@Bean 
	public DoctorPatienet doctorPatienet() {
	         DoctorPatienet doctorPatienet=new DoctorPatienet();
	         doctorPatienet.setDoctorId(101);
	         doctorPatienet.setDoctorName("Azhar");
			return doctorPatienet;
	         
	}
	
	@Bean
	public Phrmacy1 phrmacy1() {
		Phrmacy1 phrmacy1 = new Phrmacy1();
		phrmacy1.setPharNmae("medicover pharmacy");
		phrmacy1.setPharLocation("hyderabad");
		return phrmacy1;
	}
	
	@Bean
	public PatientDetails patientDetails() {
		PatientDetails patientDetails=new PatientDetails();
		patientDetails.setAge(20);
		patientDetails.setName("saikiran");
		patientDetails.setDoctorPatienet(doctorPatienet());
		patientDetails.setPhrmacy1(phrmacy1());
		return patientDetails;
	}

}
