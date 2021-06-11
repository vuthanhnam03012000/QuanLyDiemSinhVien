package DAO;

import Entity.User;
import Connection.JDBCConnection;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

//    User urs = new User();

    public ResultSet checkLogin(User urs) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection cnn = JDBCConnection.getJDBCConnection();
        try {
            ps = cnn.prepareStatement("select * from user where username=? and password=?");
            ps.setString(1, urs.getUsername());
            ps.setString(2, urs.getPassword());
            rs = ps.executeQuery();
            return rs;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

}
