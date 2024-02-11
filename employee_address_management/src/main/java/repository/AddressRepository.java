package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Address;
import service.ConnectionService;

public class AddressRepository {

	public void insertAddress(Address address, int employee_id) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("insert into address values (?,?,?)");
		statement.setInt(1, address.getAddress_id());
		statement.setString(2, address.getCity());
		statement.setInt(3, employee_id);
		statement.executeUpdate();
		connection.close();

	}

	public int deleteAddress(int employee_id) throws SQLException {

		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("delete from address where employee_id = ?");
		statement.setInt(1, employee_id);
		int num = statement.executeUpdate();
		connection.close();
		return num;
	}

	public void updateAddress(String city, int employee_id) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("update address set city = ? where employee_id= ?");
		statement.setString(1, city);
		statement.setInt(2, employee_id);
		int num = statement.executeUpdate();
		if (num != 0)
			System.out.println("-----------------------------Updated Succesfully------------------------");
		else
			System.out.println("*******************Invalid Id*******************");
		connection.close();
	}

	public void getAddress(int employee_id) throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from address where employee_id = ?");
		statement.setInt(1, employee_id);
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			System.out.println("*****************************************************************");
			System.out.println(
					"                                      address id ---------------->" + resultSet.getInt(1));
			System.out.println("                                       city ---->" + resultSet.getString(2));
		}
		connection.close();
	}

	public void getAllAddress() throws SQLException {
		ConnectionService connectionService = new ConnectionService();
		Connection connection = connectionService.getConnection();
		PreparedStatement statement = connection.prepareStatement("select * from address ");
		ResultSet resultSet = statement.executeQuery();
		while (resultSet.next()) {
			System.out.println("*****************************************************************");
			System.out.println(
					"                                      address id ---------------->" + resultSet.getInt(1));
			System.out.println("                                       city ---->" + resultSet.getString(2));
		}
		connection.close();
	}
}
