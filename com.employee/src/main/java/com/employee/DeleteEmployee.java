package com.employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeleteEmployee {
	
	public static void delete() {
		System.out.println("Enter your Employee_Id:-");
		int id=EmployeeMain.sc.nextInt();
		try {
			String q="delete from employee where id=?";
			PreparedStatement pstm=EmployeeMain.con.prepareStatement(q);
			pstm.setInt(1, id);
			boolean b=pstm.execute();
			if(b) {
				
			}
			else
				System.out.println("Deleted SucessFully");
				System.out.println("==========================================================================");
				System.out.println();
				System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
