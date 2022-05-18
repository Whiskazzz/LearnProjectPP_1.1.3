package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDao dao = new UserDaoHibernateImpl();
//        UserDao dao1 = new UserDaoJDBCImpl();
//        dao1.createUsersTable();
        dao.createUsersTable();

        dao.saveUser("Daniil","Kulikov", (byte) 26);
        System.out.println("User с именем – Daniil добавлен в базу данных ");
        dao.saveUser("Alexandr","Bolotov", (byte) 36);
        System.out.println("User с именем – Alexandr добавлен в базу данных ");
        dao.saveUser("Oleg","IliNeOleg", (byte) 45);
        System.out.println("User с именем – Oleg добавлен в базу данных ");
        dao.saveUser("PochtiOleg","IliNePochtiOleg", (byte) 50);
        System.out.println("User с именем – PochtiOleg добавлен в базу данных ");

        dao.getAllUsers().forEach(System.out::println);
        dao.cleanUsersTable();
        dao.dropUsersTable();

    }
}
