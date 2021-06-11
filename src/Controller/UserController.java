package Controller;

import DAO.UserDAO;
import Entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserController {

    UserDAO userDAO = new UserDAO();

    public ResultSet userLoginController(User user) {

        ResultSet rs = null;
        try {
            rs = userDAO.checkLogin(user);
        } catch (SQLException e) {
            System.err.println("Error: " + e.toString());
        }
        return rs;
    }

}
