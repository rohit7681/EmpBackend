package com.employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertUser {
	public static void add() {
		System.out.print("Enter your Employee id:-");
		int id = EmployeeMain.sc.nextInt();
		System.out.print("Enter your Employee age:-");
		int age = EmployeeMain.sc.nextInt();
		System.out.print("Enter your Employee sal:-");
		double sal = EmployeeMain.sc.nextDouble();
		System.out.print("Enter your Employee name:-");
		String name = EmployeeMain.sc.next();
		name = name.toUpperCase();
		String query = "insert into employee values(?,?,?,?)";
		try {
			PreparedStatement pst = EmployeeMain.con.prepareStatement(query);
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, age);
			pst.setDouble(4, sal);
			boolean b = pst.execute();
			if (b) {

			} else {
				System.out.println("Employee data Inserted SucessFully");
				System.out.println("==============================================================================");
				System.out.println();
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
