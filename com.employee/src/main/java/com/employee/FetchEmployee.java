package com.employee;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchEmployee {
	public static void display() {
		System.out.print("Enter your Id:-");
		int id = EmployeeMain.sc.nextInt();
		String q = "select * from employee where id=?";
		try {
			PreparedStatement pstm = EmployeeMain.con.prepareStatement(q);
			pstm.setInt(1, id);
			boolean b = pstm.execute();
			if (b) {
				ResultSet r = pstm.getResultSet();
				while (r.next()) {
					System.out.println();
					System.out.println("=========================ENTERED ID DETAILS============================");
					System.out.println("id = " + r.getInt("id"));
					System.out.println("Name = " + r.getString("name"));
					System.out.println("Age = " + r.getInt("age"));
					System.out.println("Sal = " + r.getDouble("sal"));
					System.out.println("======================================================================");
					System.out.println();
					System.out.println();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void displayAll() {
		String q = "select * from employee";
		try {
			PreparedStatement pstm = EmployeeMain.con.prepareStatement(q);
			boolean b = pstm.execute();
			if (b) {
				ResultSet r = pstm.getResultSet();
				while (r.next()) {
					System.out.println("=========================All EMPLOYE DETAILS============================");
					System.out.println("id = " + r.getInt("id"));
					System.out.println("Name = " + r.getString("name"));
					System.out.println("Age = " + r.getInt("age"));
					System.out.println("Sal = " + r.getDouble("sal"));
					System.out.println("======================================================================");
					System.out.println();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
