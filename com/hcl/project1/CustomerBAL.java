package com.hcl.project1;

import java.util.*;



public class CustomerBAL {
	

	static StringBuilder sb=new StringBuilder();
	public void writeCustomerFileBal() {
		new CustomerDAO().writeCustomerFileDao();
	}
	
	public void readCustomerFileBal() {
		new CustomerDAO().readCustomerFileDao();
	}
	public boolean addCustomerBal(Customer objcustomer) throws CustomerException{
		boolean isAdded=true;
		if(objcustomer.getCusid()<=0){
			sb.append("customer no cannot be negative or zero \r\n");
			isAdded=false;
		}
		if(objcustomer.getCusname().length() <=5){
			sb.append("cusname more than 5 characters \r\n");
			isAdded=false;
		}
		if(objcustomer.getAnnualpremiun()<=20000 && objcustomer.getAnnualpremiun()>=100000){
			sb.append("Annualpremium is should be 20000 and 100000 \r\n");
			isAdded=false;
		}
		if(objcustomer.getModalpremium() <=1000 && objcustomer.getModalpremium()>=50000){
			sb.append("modal premiun should be in 1000 to 50000 \r\n");
			isAdded=false;
		}
		if(objcustomer.getPaymode()<=1 && objcustomer.getPaymode()>=3)
		{
			sb.append("paymentmode should be in 1,2,3 \r\n");
			isAdded=false;
		}
		if(isAdded==false)
		{
			throw new CustomerException(sb.toString());
		}else{
			new CustomerDAO().addCustomerDao(objcustomer);
		}
		return isAdded;
	}
	
	public List<Customer> showCustomerBal()
	{
		return new CustomerDAO().showCustomerDao();
	}
	
	public Customer serachCustomerBal(int cusid)
	{
		return new CustomerDAO().searchCustomerDao(cusid);		
	}
	
	public String updateCustomerBal(Customer objcustomer){
		return new CustomerDAO().updateCustomerDao(objcustomer);
	}
	public String deleteCustomerBal(int cusid){
		return new CustomerDAO().deleteCustomerDao(cusid);
	}
}