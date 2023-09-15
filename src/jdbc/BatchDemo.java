package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo {
    public static void main(String[] args) {

        try {
            String insert = "insert into student(id,name) values(?,?)";
            PreparedStatement preparedStatement = Conn.getConnection().prepareStatement(insert);

            for (int i = 1; i <= 100; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "name " + i);
                preparedStatement.addBatch();
            }

            int[] i = preparedStatement.executeBatch();

            System.out.println("rows inserted " + i.length);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
