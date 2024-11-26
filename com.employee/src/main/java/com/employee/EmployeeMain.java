package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeMain {
	private static String url = "jdbc:mysql://localhost:3306/employee";
	private static String user = "root";
	private static String password = "9938";
	public static Connection con;
	public static Scanner sc = new Scanner(System.in);
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("========================WELCOME TO EMPLOYEE MANAGER DATABASE=======================");
		System.out.println("===================================================================================");
		boolean flag = true;
		while (flag) {
			System.out.println("For Inserting Employee Details Enter :- 1");
			System.out.println("For Updateing Employee Details Enter :- 2");
			System.out.println("For Deleting Employee Details Enter :- 3");
			System.out.println("For Fetching Employee Details Enter :- 4");
			System.out.println("For Fetching All the Employee Details Enter :- 5");
			System.out.println("For Exit from the Employee Application Enter :- 6");
			System.out.println("===============================================================================");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.print("Enter your Choice:-");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				InsertUser.add();
				break;
			case 2:
				UpdateEmployee.update();
				break;
			case 3:
				DeleteEmployee.delete();
				break;
			case 4:
				FetchEmployee.display();
				break;
			case 5:
				FetchEmployee.displayAll();
				break;
			case 6:
				flag = false;
				break;
			default:
				System.out.println("Invalid Input Enter which Number are given there");
				System.out.println("===========================================================================");
				System.out.println();
				System.out.println();
			}
		}
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
