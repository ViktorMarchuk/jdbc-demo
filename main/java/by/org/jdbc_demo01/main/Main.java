package by.org.jdbc_demo01.main;


import java.sql.*;
import java.util.Properties;

public class Main{
    private static final String DELETE = "DELETE FROM subscriber WHERE id=?";
    private static final String INSERT = "INSERT INTO subscriber (id, name, number) VALUES(?,?,?)";


    public static void main(String[] args){
        InsertingData data = new InsertingData();
      /*  try{
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
        try(Connection connection = DriverManager.getConnection(url, properties)){*/
          data.insertData(1, 10, 2, "King kong", 3, 897353);
         /*   PreparedStatement statement = connection.prepareStatement(DELETE);
           statement.setInt(1, 8);
            //statement.setString(1, "Peter");
           // statement.setInt(3, 900023);
        //    int rowUpdate = statement.executeUpdate();
          //  System.out.println(rowUpdate);*/
       /* }catch(SQLException e){
            e.printStackTrace();
        }*/
    }
}

// hello word!!!