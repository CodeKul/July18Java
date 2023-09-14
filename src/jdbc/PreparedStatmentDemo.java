package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatmentDemo {
    public static void main(String[] args) {

        try {
            String insert = "insert into student(id,name) values(?,?)";
            PreparedStatement preparedStatement = Conn.getConnection().prepareStatement(insert);

            int id;
            String name;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter values");
            id = scanner.nextInt();
            name = scanner.next();

            preparedStatement.setInt(1,id);
            preparedStatement.setString(2,name);

            int i = preparedStatement.executeUpdate();
            System.out.println("rows inserted "+i);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
