package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl daoJDBC = new UserDaoJDBCImpl();
        daoJDBC.createUsersTable();

        daoJDBC.saveUser("Daniil","Kulikov", (byte) 26);
        System.out.println("User с именем – Daniil добавлен в базу данных ");
        daoJDBC.saveUser("Alexandr","Bolotov", (byte) 36);
        System.out.println("User с именем – Alexandr добавлен в базу данных ");
        daoJDBC.saveUser("Oleg","IliNeOleg", (byte) 45);
        System.out.println("User с именем – Oleg добавлен в базу данных ");
        daoJDBC.saveUser("PochtiOleg","IliNePochtiOleg", (byte) 50);
        System.out.println("User с именем – PochtiOleg добавлен в базу данных ");

        daoJDBC.getAllUsers().forEach(System.out::println);
        daoJDBC.cleanUsersTable();
        daoJDBC.dropUsersTable();

    }
}
