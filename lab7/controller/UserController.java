package lab.task2.controller;

import lab.task2.model.User;
import lab.task2.model.UserDAO;

import java.util.Map;

public class UserController {
    public static boolean create(User user) {
        return new UserDAO().insertEntity(user);
    }

    public static boolean check(String login, String password) {
        Map<String, String> users = new UserDAO().getAll();
        return users.containsKey(login) && users.get(login).equals(password);
    }
}
