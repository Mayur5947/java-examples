package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import model.Employee;
import repository.EmployeeRepository;

public class ConnectionService {

	public Connection getConnection() {
		String user = "root";
		String password = "root";
		String url = "jdbc:mysql://localhost:3306/employee_address_db";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
