package com.hcl.project1;

public class CustomerException extends Exception {

	public CustomerException()
	{
		
	}
	public CustomerException(String error)
	{
		super(error);
	}
}