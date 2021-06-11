package DAO;

import Connection.JDBCConnection;
import com.mysql.jdbc.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entity.Student;
import Entity.Subject;

public class SubjectDAO {

    public List<Subject> getAllSubject() {
        List<Subject> subjects = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM subject";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Subject subject = new Subject();

                subject.setStt(rs.getInt("stt"));
                subject.setMaMonHoc(rs.getString("mamh"));
                subject.setTenMonHoc(rs.getString("tenmh"));

                //add het may cai tren vao arraylist students o tren
                subjects.add(subject);
            }
        } catch (SQLException e) {
        }

        return subjects;

    }

    public Student getSubjectbymamh(String mamh) {

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM subject WHERE mamh =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(mamh));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                Subject subject = new Subject();
                subject.setStt(rs.getInt("stt"));
                subject.setMaMonHoc(rs.getString("mamh"));
                subject.setTenMonHoc(rs.getString("tenmh"));

                return subject;

            }
        } catch (SQLException e) {
        }

        return null;

    }

    public void addSubject(Subject subject) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO subject (stt, mamh, tenmh) values (?,?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, subject.getStt());
            preparedStatement.setInt(2, subject.getMaMonHoc());
            preparedStatement.setString(3, subject.getTenMonHoc());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
        }

    }

    public void updateSubject(Subject subject) {

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = " UPDATE subject set stt =?, tenmh =?  WHERE mamh = ?";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, subject.getStt());
            preparedStatement.setInt(2, subject.getMaMonHoc());
            preparedStatement.setString(3, subject.getTenMonHoc());

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
        }

    }

    public void deleteSubject(int mamh) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "DELETE FROM subject WHERE mamh = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, mamh);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
        }
    }
}
