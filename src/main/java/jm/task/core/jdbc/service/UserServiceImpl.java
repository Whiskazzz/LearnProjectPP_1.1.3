package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final static UserDao temp = new UserDaoJDBCImpl();
    public void createUsersTable() {
        temp.createUsersTable();
    }

    public void dropUsersTable() {
        temp.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        temp.saveUser(name,lastName,age);
    }

    public void removeUserById(long id) {
        temp.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return temp.getAllUsers();
    }

    public void cleanUsersTable() {
        temp.cleanUsersTable();
    }
}
