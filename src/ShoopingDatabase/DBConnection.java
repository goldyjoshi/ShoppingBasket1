package ShoopingDatabase;

import com.company.ItemAndQyt;

import java.sql.*;

public class DBConnection {

    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/Shop";
        String userName = "goldy";
        String password = "password";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, userName, password);
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return connection;
    }

//    public ResultSet itemAndQytByName (final String name) {
//        ResultSet resultSet = null;
//        Statement statement;
//        String sql = "select * from Shop_Items where item_Name = " + "'" + name + "'" + ";";
//        Connection connection = getConnection();
//        try {
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery(sql);
//        } catch (SQLException sqlException) {
//            sqlException.printStackTrace();
//        }
//        System.out.println(resultSet);
//        return resultSet;
//    }

    public void itemAndQytByName(final String itemName) {
        ResultSet resultSet = null;
        Connection connection = getConnection();
        String sql = "select * from Shop_Items where item_Name = ?" ;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,"Rice");
            ResultSet result = preparedStatement.executeQuery();
            System.out.println(result);
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
    }
}
