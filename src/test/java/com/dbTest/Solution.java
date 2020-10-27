package com.dbTest;
import java.sql.*;

public class Solution {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();

        dao.createUsersTable();

        dao.saveUser("Jim", "Kerry", (byte) 45);
        dao.saveUser("Margot", "Robbie", (byte) 30);
        dao.saveUser("John", "Depp", (byte) 57);
        dao.saveUser("Tom", "Cruise", (byte) 58);

        dao.getAllUsers();

       dao.cleanUsersTable();

       dao.dropUsersTable();
    }
}

