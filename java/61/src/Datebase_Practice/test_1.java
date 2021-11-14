package Datebase_Practice;

/**
 * @Author 墨宣
 * @Date 2021/10/25 13:17
 * 目的：数据库
 */

import java.sql.*;

public class test_1 {
    public static void main(String[] args) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
        Connection conn = null;
        Statement statement = null;
        String url="jdbc:mysql://localhost:3306/?serverTimezone=UTC";
        String username="root";
        String password="123456";
        try {
            conn = DriverManager.getConnection(url,username,password);
            statement = conn.createStatement();
            statement.executeUpdate("drop database if exists test2");
            statement.executeUpdate("create database test2");
            statement.executeUpdate("use test2");
            String sql = "create table student(" + "id int not null," + "name varchar(20)," + "sex varchar(4)," + "age int)";
            statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
