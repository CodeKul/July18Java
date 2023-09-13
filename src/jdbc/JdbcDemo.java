package jdbc;

//driver register
//connection establishment
//statement creation
//statement execute

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/july18","root3","password");

            Statement statement = connection.createStatement();

            String s = "select * from student";

            ResultSet rs = statement.executeQuery(s);

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
