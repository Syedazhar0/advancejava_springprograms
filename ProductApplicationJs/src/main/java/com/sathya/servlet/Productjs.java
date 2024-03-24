package com.sathya.servlet;

import java.sql.Date;
import java.util.Arrays;

public class Productjs {
	private int proid;
	private String pname;
	private double pprice;
	private String pbrand;
	private String pMadeIn;
	private Date pmfd;
	private Date pexpdate;
	private byte [] pimage;
	private byte [] proAudio;
	private byte [] proVideo;
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPbrand() {
		return pbrand;
	}
	public void setPbrand(String pbrand) {
		this.pbrand = pbrand;
	}
	public String getpMadeIn() {
		return pMadeIn;
	}
	public void setpMadeIn(String pMadeIn) {
		this.pMadeIn = pMadeIn;
	}
	public Date getPmfd() {
		return pmfd;
	}
	public void setPmfd(Date pmfd) {
		this.pmfd = pmfd;
	}
	public Date getPexpdate() {
		return pexpdate;
	}
	public void setPexpdate(Date pexpdate) {
		this.pexpdate = pexpdate;
	}
	public byte[] getPimage() {
		return pimage;
	}
	public void setPimage(byte[] pimage) {
		this.pimage = pimage;
	}
	public byte[] getProAudio() {
		return proAudio;
	}
	public void setProAudio(byte[] proAudio) {
		this.proAudio = proAudio;
	}
	public byte[] getProVideo() {
		return proVideo;
	}
	public void setProVideo(byte[] proVideo) {
		this.proVideo = proVideo;
	}
	@Override
	public String toString() {
		return "Productjs [proid=" + proid + ", pname=" + pname + ", pprice=" + pprice + ", pbrand=" + pbrand
				+ ", pMadeIn=" + pMadeIn + ", pmfd=" + pmfd + ", pexpdate=" + pexpdate + ", pimage="
				+ Arrays.toString(pimage) + ", proAudio=" + Arrays.toString(proAudio) + ", proVideo="
				+ Arrays.toString(proVideo) + "]";
	}
	}