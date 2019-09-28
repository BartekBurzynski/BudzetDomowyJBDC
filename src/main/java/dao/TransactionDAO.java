package dao;

import model.Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionDAO {

    public void insert(Transaction transaction) throws SQLException, ClassNotFoundException {
        Connection connection = connect();

        String sql = "INSERT INTO transaction(type, description, amount, date) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, transaction.getType());
        preparedStatement.setString(2, transaction.getDescription());
        preparedStatement.setInt(3, transaction.getAmount());
        preparedStatement.setString(4, transaction.getDate());
        preparedStatement.executeUpdate();

        connection.close();
    }

    private Connection connect() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/zadanie24?characterEncoding=utf8&serverTimezone=UTC";
        return DriverManager.getConnection(url, "root", "root");
    }

    public void update(Transaction transaction) throws SQLException, ClassNotFoundException {
        Connection connection = connect();

        String sql = "UPDATE  transaction SET type = ?, description = ?, amount = ?, date =? where id = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, transaction.getType());
        preparedStatement.setString(2, transaction.getDescription());
        preparedStatement.setInt(3, transaction.getAmount());
        preparedStatement.setString(4, transaction.getDate());
        preparedStatement.setInt(5, transaction.getId());
        preparedStatement.executeUpdate();

        connection.close();
    }

    public void deleteByID(int id) throws SQLException, ClassNotFoundException {
        Connection connection = connect();

        String sql = "DELETE FROM  transaction  where id = ? ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

        connection.close();
    }
}
