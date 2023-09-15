package jdbc;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableDemo {
    public static void main(String[] args) {

        try {
            CallableStatement callable = Conn.getConnection().prepareCall("call getData()");

            ResultSet rs = callable.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
