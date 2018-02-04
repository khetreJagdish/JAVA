package com.lara;

import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CustomerManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for insert");
		System.out.println("Enter 2 for read");
		System.out.println("Enter 3 for update");
		System.out.println("Enter 4 for delete");
		System.out.println("Enter 5 for search");
		int action = sc.nextInt();
		if (action == 1) {
			insertUser(sc);
		} else if (action == 2) {
			readUsers(sc);
		} else if (action == 3) {
			update(sc);
		} else if (action == 4) {
			delete(sc);
		} else if (action == 5) {
			search(sc);
		} else {
			System.out.println("Invalid input ");
		}
	}

	private static void insertUser(Scanner sc) {
		readUsers(sc);
		System.out.println("Above users are already inserted ");
		String name;
		Integer id, age;
		System.out.println("Enter Unique Id");
		id = sc.nextInt();
		System.out.println("Enter name");
		name = sc.next();
		System.out.println("Enter age");
		age = sc.nextInt();
		String sql = "INSERT INTO CUSTOMER " + "VALUES(" + id + ", ' " + name +  " ', " + age + ")";
		Connection con = null;
		Statement stmt = null;
		try {
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException ex) {
			ex.printStackTrace();
		} finally {
			Util.closeResources(null, stmt, con);
		}
		System.out.println(name + " saved successfully");
		readUsers(sc);
	}

	private static void readUsers(Scanner sc) 
	{
		System.out.println("Reading all users");
		System.out.println("-------------------");
		String sql = "SELECT * FROM CUSTOMER";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = Util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			boolean flag = true;
			while (rs.next()) 
			{
				if (flag) 
				{
					flag = false;
					System.out.print("ID");
					System.out.print("\t");
					System.out.print("NAME");
					System.out.print("\t");
					System.out.println("AGE");
				}
				System.out.print(rs.getInt("ID"));
				System.out.print("\t");
				System.out.print(rs.getString("NAME"));
				System.out.print("\t");
				System.out.println(rs.getInt("AGE"));
			}
		} 
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		finally 
		{
			Util.closeResources(rs, stmt, con);
		}
	}

	private static void update(Scanner sc) 
	{
		readUsers(sc);
		System.out.print("Enter id of ");
		System.out.print("user which you ");
		System.out.println("have to update ");
		Integer id = sc.nextInt();
		Object[] user = readUser(id);
		String name = (String) user[1];
		Integer age = (Integer) user[2];
		System.out.println("user with id: " + id);
		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("update name (y/n)?");
		boolean updateRequired = false;
		
		if ("y".equalsIgnoreCase(sc.next())) 
		{
			System.out.println("Enter new Name ");
			name = sc.next();
			updateRequired = true;
		}
		System.out.println("update age (y/n)?");
		if ("y".equalsIgnoreCase(sc.next())) 
		{
			System.out.println("Enter new age");
			age = sc.nextInt();
			updateRequired = true;
		}
		if (updateRequired) 
		{
			String sql = "UPDATE CUSTOMER " + "SET NAME = '" + name + "'," + "AGE = " + age + "WHERE ID =" + id;
			Connection con = null;
			Statement stmt = null;
			try 
			{
				con = Util.getConnection();
				stmt = con.createStatement();
				stmt.executeUpdate(sql);
			}
			catch (SQLException ex) 
			{
				ex.printStackTrace();
			}
			finally 
			{
				Util.closeResources(null, stmt, con);
			}
			System.out.println("record " + id + " updated successfully");
			readUsers(sc);

		} 
		else 
		{
			System.out.println("no update is required");
		}
	}

	private static Object[] readUser(Integer id) 
	{
		Object[] record = new Object[3];
		String sql = "SELECT * FROM CUSTOMER " + "WHERE ID = " + id;
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try 
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) 
			{
				record[0] = rs.getInt("id");
				record[1] = rs.getString("name");
				record[2] = rs.getInt("age");
			}
		} 
		catch (SQLException ex) 
		{
			Util.closeResources(rs, stmt, con);
		}
		return record;
	}

	private static void delete(Scanner sc) 
	{
		readUsers(sc);
		System.out.print("Enter id of the record, ");
		System.out.println("Which you have to delete, ");
		Integer id = sc.nextInt();
		Object[] record = readUser(id);
		System.out.println("This is the record, You selected to delete");
		System.out.println("id: " + record[0]);
		System.out.println("name:" + record[1]);
		System.out.println("age: " + record[2]);
		System.out.println("still you want to delete?(y/n)");
		if ("y".equalsIgnoreCase(sc.next())) {
			deleteUser(id);
			readUsers(sc);
		} 
		else 
		{
			System.out.println("operation cancelled");
		}
	}

	private static void deleteUser(Integer id) 
	{
		String sql = "delete from customer" + " where id = " + id;
		Connection con = null;
		Statement stmt = null;
		try 
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} 
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		}
		finally 
		{
			Util.closeResources(null, stmt, con);
		}
		System.out.println("Record " + id + " deleted successfully");
	}

	private static void search(Scanner sc) 
	{
		System.out.println("Enter search key word");
		String key = sc.next();
		StringBuffer sql = new StringBuffer();
		sql.append("select * from customer ");
		sql.append("where name like '%" + key + "%' ");
		try 
		{
			int test = Integer.parseInt(key);
			sql.append(" or id = " + key);
			sql.append(" or age = " + key);
		} 
		catch (NumberFormatException ex) 
		{
		}
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try 
		{
			con = Util.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql.toString());
			boolean flag = true;
			
			while (rs.next()) 
			{
				if (flag) 
				{
					System.out.print("ID");
					System.out.print("\tNAME");
					System.out.println("\tAge");
					flag = false;
				}
				System.out.print(rs.getInt("id"));
				System.out.print("\t" + rs.getString("name"));
				System.out.println("\t" + rs.getInt("age"));
			}
			if (flag) 
			{
				System.out.println("no records available for your search " + key);
			}
		} 
		catch (SQLException ex) 
		{
			ex.printStackTrace();
		} 
		finally 
		{
			Util.closeResources(rs, stmt, con);
		}
	}
}
