package by.org.jdbc_demo01.main;

import java.sql.*;
import java.util.Properties;

public class InsertingData{
    private static final String INSERT = "INSERT INTO subscriber (id, name, number) VALUES(?,?,?)";

    public void insertData(int column1, int id, int column2, String name, int column3, int number){
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/phone_book";
        Properties properties = new Properties();
        properties.put("user", "root");
        properties.put("password", "02071977");
        properties.put("autoReconnect", "true");
        properties.put("characterEncoding", "UTF-8");
        properties.put("useUnicode", "true");
        properties.put("useSSL", "true");
        try{
            Connection connection = DriverManager.getConnection(url, properties);
            PreparedStatement statement = connection.prepareStatement(INSERT);
            statement = connection.prepareStatement(INSERT);
            statement.setInt(column1, id);
            statement.setString(column2, name);
            statement.setInt(column3, number);
            int res = statement.executeUpdate();
            System.out.println(res);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
