package com.hcl.department;


	import java.util.Scanner;



	public class SearchDepartmentMain {
		public static void main(String[] args) {
			int deptno;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter deptno..");
			deptno=sc.nextInt();
			DepartmentDAO dao=new DepartmentDAO();
		
			Department department=dao.searchDepartment(deptno);
			if(department!=null) {
				System.out.println("DName="+department.getDname());
				System.out.println("loc="+department.getLoc());
				System.out.println("city="+department.getCity());
				System.out.println("head="+department.getHead());
			} else {
				System.out.println("Record not found....");
			}
			
		}

	}


