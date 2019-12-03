package com.hcl.department;

import java.util.Scanner;



public class AddDepartmentMain {
	
	public static void main(String[] args) {
		DepartmentDAO dao=new DepartmentDAO();

		Department department=new Department();
		int deptno=dao.generateDeptno();
		department.setDeptno(deptno);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter dname..");
		department.setDname(sc.nextLine());
		System.out.println("Enter LOC..");
		department.setLoc(sc.nextLine());
		System.out.println("Enter CITY..");
		department.setCity(sc.nextLine());
		System.out.println("Enter HEAD..");
		department.setHead((sc.nextLine()));
		System.out.println(dao.addDepartment(department));
		
	}


}
