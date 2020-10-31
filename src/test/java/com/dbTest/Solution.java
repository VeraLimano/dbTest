package com.dbTest;
import java.sql.*;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

//import com.infotech.util.Util;

public class Solution {
    public static void main(String[] args) {
        HibernateImp dao = new HibernateImp();
//        DaoImpl dao = new DaoImpl();
        Util util = new Util();


//        dao.removeUserById(2);

        dao.createUsersTable();

        dao.saveUser("Jim", "Kerry", (byte) 45);
        dao.saveUser("Margot", "Robbie", (byte) 30);
        dao.saveUser("John", "Depp", (byte) 57);
        dao.saveUser("Tom", "Cruise", (byte) 58);

        dao.getAllUsers();

       dao.cleanUsersTable();

       dao.dropUsersTable();

//

//        util.getSessionFactory().close();
//        System.out.println(util.getSessionFactory().isClosed());
    }
}

