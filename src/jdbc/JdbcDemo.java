package jdbc;

//driver register
//connection establishment
//statement creation
//statement execute

import java.sql.*;

public class JdbcDemo {

    public static void main(String[] args) {

        try {

            Statement statement = Conn.getConnection().createStatement();

            String s = "select * from student";

            ResultSet rs = statement.executeQuery(s);

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }

        } catch ( SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
