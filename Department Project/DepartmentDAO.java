package com.hcl.department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;




public class DepartmentDAO {
	Connection connection;
	PreparedStatement pst;
	
	
	public String deleteDepartment(int deptno) {
		connection=DaoConnection.getConnection();
		Department department=searchDepartment(deptno);
		String result="";
		if(department!=null) {
			String cmd="Delete From Department where deptno=?";
			try {
				pst=connection.prepareStatement(cmd);
				pst.setInt(1, deptno);
				pst.executeUpdate();
				result="record deleted....";
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			result=" record not found";
		}
		 return result;
	}
	

	public Department searchDepartment(int deptno) {
		connection=DaoConnection.getConnection();
		String cmd="select * from Department where deptno=?";
		Department department=null;
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1, deptno);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				department=new Department();
				department.setDname(rs.getString("dname"));
				department.setLoc(rs.getString("loc"));
				department.setCity(rs.getString("city"));
				department.setHead(rs.getString("head"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return department;
	}
	
	public String addDepartment(Department department) {
		connection=DaoConnection.getConnection();
		String cmd="insert into department(deptno,dname,loc,city,head)"+"values(?,?,?,?,?)";
		String result="";
		try {
			pst=connection.prepareStatement(cmd);
			pst.setInt(1,department.getDeptno());
			pst.setString(2,department.getDname());
			pst.setString(3,department.getLoc());
			pst.setString(4,department.getCity());
			pst.setString(5,department.getHead());
			pst.executeUpdate();
			result="Department record added....";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result=e.getMessage();
		}
		return result;
	}
	
	
	public int generateDeptno(){
		connection=DaoConnection.getConnection();
		String cmd=" Select CASE WHEN MAX(Deptno) IS NULL THEN 1 "+ " ELSE MAX(Deptno)+1 END Deptno from Department";
		int Deptno=0;
		try {
		pst=connection.prepareStatement(cmd);
		ResultSet rs=pst.executeQuery();
		rs.next();
		Deptno=rs.getInt("Deptno");
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return Deptno;
		}
		public List<Department> showDepartment() {
		connection = DaoConnection.getConnection();
		String cmd = "select * from Department";
		Department department = null;
		List<Department> departmentList = new ArrayList<Department>();
		try {
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		while(rs.next()){
			department = new Department();
			department.setDeptno(rs.getInt("deptno"));
			department.setDname(rs.getString("dname"));
			department.setLoc(rs.getString("loc"));
			department.setCity(rs.getString("city"));
			department.setHead(rs.getString("head"));
			departmentList.add(department);
		}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		return departmentList;
		}


}