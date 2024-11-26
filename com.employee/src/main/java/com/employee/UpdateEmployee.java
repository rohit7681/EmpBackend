package com.employee;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {
	public static void update() {
		System.out.println();
		System.out.println("===========================ENTER YOUR CHOICE=======================================");
		System.out.println();

		boolean flag = true;
		while (flag) {
			System.out.println("For update your Name Enter :- 1");
			System.out.println("For update your Age Enter :- 2");
			System.out.println("For update your Sal Enter :- 3");
			System.out.println("For Exist from update Manue Enter :- 4");
			System.out.println("==================================================================================");
			System.out.print("Enter what you want :-");
			int option = EmployeeMain.sc.nextInt();
			switch (option) {
			case 1:
				String q1 = "update employee set name=? where id=?";
				System.out.print("Enter new name which you want to update :-");
				String name = EmployeeMain.sc.next();
				System.out.print("Enter Your id :-");
				int id = EmployeeMain.sc.nextInt();
				try {
					PreparedStatement pst = EmployeeMain.con.prepareStatement(q1);
					pst.setString(1, name);
					pst.setInt(2, id);
					boolean b = pst.execute();
					if (b) {

					} else
						System.out.println("Name Updated SucessFully");
					System.out.println("===================================================================");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				String q2 = "update employee set age=? where id=?";
				System.out.print("Enter age which you want to update :-");
				int age = EmployeeMain.sc.nextInt();
				System.out.print("Enter Your id :-");
				int id2 = EmployeeMain.sc.nextInt();
				try {
					PreparedStatement pst = EmployeeMain.con.prepareStatement(q2);
					pst.setInt(1, age);
					pst.setInt(2, id2);
					boolean b = pst.execute();
					if (b) {

					} else
						System.out.println("Age Updated SucessFully");
					System.out.println("===================================================================");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 3:
				String q3 = "update employee set sal=? where id=?";
				System.out.print("Enter new Sallary which you want to update :-");
				double sal = EmployeeMain.sc.nextDouble();
				System.out.print("Enter Your id :-");
				int id3 = EmployeeMain.sc.nextInt();
				try {
					PreparedStatement pst = EmployeeMain.con.prepareStatement(q3);
					pst.setDouble(1, sal);
					pst.setInt(2, id3);
					boolean b = pst.execute();
					if (b) {

					} else
						System.out.println("Sallary Updated SucessFully");
					System.out.println("===================================================================");

				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 4:
				System.out.println("===========================================================================");
				System.out.println();
				flag = false;
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
		
	}
}
