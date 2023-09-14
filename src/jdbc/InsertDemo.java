package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) {
        try {

            Statement statement = Conn.getConnection().createStatement();

            String insert = "insert into student(id,name) values(2,'Sai')";
//            String update = "update student set name='Ram' where id =2";
//            String delete  = "delete from student where id = 2";
            int i = statement.executeUpdate(insert);

            System.out.println("rows inserted " + i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
