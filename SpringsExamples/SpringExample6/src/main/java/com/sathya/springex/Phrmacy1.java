package com.sathya.springex;

public class Phrmacy1 {
private String pharNmae;
private String pharLocation;
public String getPharNmae() {
	return pharNmae;
}
public void setPharNmae(String pharNmae) {
	this.pharNmae = pharNmae;
}
public String getPharLocation() {
	return pharLocation;
}
public void setPharLocation(String pharLocation) {
	this.pharLocation = pharLocation;
}
public void pAtienet() {
	System.out.println("parmacy name"+pharNmae);
	System.out.println("pharmacy location "+pharLocation);
}
}
