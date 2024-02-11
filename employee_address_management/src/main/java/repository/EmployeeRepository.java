package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Employee;
import service.ConnectionService;

public class EmployeeRepository {

	AddressRepository addressRepository = new AddressRepository();

	public void insertEmployee(Employee employee) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("insert into employee values (?,?,?,?,?)");
		statement.setInt(1, employee.getEmployee_id());
		statement.setString(2, employee.getFirst_name());
		statement.setString(3, employee.getLast_name());
		statement.setString(4, employee.getEmail());
		statement.setString(5, employee.getGender());
		statement.executeUpdate();
		connection.close();
	}

	public void deleteEmployee(int employee_id) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		int db = addressRepository.deleteAddress(employee_id);
		if (db != 0) {
			PreparedStatement statement = connection.prepareStatement("delete  from employee where employee_id = ?");
			statement.setInt(1, employee_id);
			int num = statement.executeUpdate();
			System.out.println("deleted succesfully");
		} else {
			System.out.println("enter correct id ");
		}
		connection.close();
	}

	public void getEmployee(int employee_id) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from employee where employee_id = ?");
		statement.setInt(1, employee_id);
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			System.out.println("                                        employee id ---------------->" + resultSet.getInt(1));
			System.out.println("                                        employee first name ---->" + resultSet.getString(2));
			System.out.println("                                        employee last name  ---->" + resultSet.getString(3));
			System.out.println("                                        employee email ----------->" + resultSet.getString(4));
			System.out.println("                                        employee gender --------->" + resultSet.getString(5));
		}
		connection.close();
	}

	public void updateEmployee(Employee employee, int employee_id) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection
				.prepareStatement("update employee set email = ? , gender = ? where employee_id = ?");
		statement.setString(1, employee.getEmail());
		statement.setString(2, employee.getGender());
		statement.setInt(3, employee_id);
		int num = statement.executeUpdate();
		if (num != 0)
			System.err.println(
					"********************************Updated Succesfully********************************************");
		else
			System.err.println("----------------------Invalid Id-----------------------------");
		connection.close();
	}

	public void getAllEMployees() throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from employee ");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			System.out.println("                                        *******************************************");
			System.out.println("                                        employee id ---------------->" + resultSet.getInt(1));
			System.out.println("                                        employee first name ---->" + resultSet.getString(2));
			System.out.println("                                        employee last name  ---->" + resultSet.getString(3));
			System.out.println("                                        employee email ----------->" + resultSet.getString(4));
			System.out.println("                                        employee gender --------->" + resultSet.getString(5));
		}
		connection.close();
	}
}
