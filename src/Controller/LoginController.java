package Controller;

import DAO.UserDAO;
import Entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginController {

    UserDAO userDAO = new UserDAO();

    public LoginController() {
    }

    public ResultSet checkLogin(User urs) {
        try {
            ResultSet rs;
            rs = userDAO.checkLogin(urs);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
