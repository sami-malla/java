package com.hcl.project1;

public class Customer {

	private int cusid;
	private String cusname;
	private double annualpremiun;
	private double modalpremium;
	private int paymode;
	public int getCusid() {
		return cusid;
	}
	public void setCusid(int cusid) {
		this.cusid = cusid;
	}
	public String getCusname() {
		return cusname;
	}
	public void setCusname(String cusname) {
		this.cusname = cusname;
	}
	public double getAnnualpremiun() {
		return annualpremiun;
	}
	public void setAnnualpremiun(double annualpremiun) {
		this.annualpremiun = annualpremiun;
	}
	public double getModalpremium() {
		return modalpremium;
	}
	public void setModalpremium(double modalpremium) {
		this.modalpremium = modalpremium;
	}
	public int getPaymode() {
		return paymode;
	}
	public void setPaymode(int paymode) {
		this.paymode = paymode;
	}
	@Override
	public String toString() {
		return "Customer [cusid=" + cusid + ", cusname=" + cusname + ", annualpremiun=" + annualpremiun
				+ ", modalpremium=" + modalpremium + ", paymode=" + paymode + "]";
	}
	
	
	
}