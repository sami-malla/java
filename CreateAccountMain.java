package com.hcl.department;

import java.util.List;


public class CreateAccountMain {
	public static void main(String[] args) {
		DepartmentDAO dao=new DepartmentDAO();
		List<Department> DepartmentList=dao.showDepartment();
		   for (Department department : DepartmentList) {
			   System.out.println("Deptno"   +department.getDeptno());
			   System.out.println("Dname"   +department.getDname());
			   System.out.println("Loc"   +department.getLoc());
			   System.out.println("City"   +department.getCity());
			   System.out.println("Head"   +department.getHead());
			
		}
		}
}
	



