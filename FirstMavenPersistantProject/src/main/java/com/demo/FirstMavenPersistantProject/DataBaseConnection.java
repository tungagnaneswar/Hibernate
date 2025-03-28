package com.demo.FirstMavenPersistantProject;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.ResultSet;

public class DataBaseConnection {

	/**
	 * This Is JDBC Driver Path
	 */
	public static String dpath = "com.mysql.cj.jdbc.Driver";

	/**
	 * This Is URL Of DataBase Connection
	 */
	public static String url = "jdbc:mysql://localhost:3306/bankapp?user=root&password=SVECIT50";

	/**
	 * sqlQuery Variable Is By Default null. Create Your Own Query
	 */
	public static String sqlQuery = null;
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;

	public DataBaseConnection() {

	}
}
