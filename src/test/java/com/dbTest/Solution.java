package com.dbTest;
import java.sql.*;

public class Solution {
    public static void main(String[] args) {
        Util util = new Util();

        String query = "select * from user1";
//        String sql = "INSERT INTO user1 (name, lastName, age) VALUES( 'Kate', 'San', 25)";
        String sql = "DELETE FROM user1 WHERE id=1";
//            String sql = "INSERT INTO users VALUES(1, 'JIM', '123')";
//            String sql = "CREATE TABLE user1 (id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(20), lastName VARCHAR(20), age TINYINT)";

        try {
            Statement statement = util.getConnection().createStatement();
            statement.executeUpdate(sql);
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                User user = new User();
                user.setId(resultSet.getLong("id"));
                user.setName(resultSet.getString("name"));
                user.setLastName(resultSet.getString("lastName"));
                user.setAge(resultSet.getByte("age"));
                System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

