package DAO;

import Connection.JDBCConnection;
import com.mysql.jdbc.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entity.Student;

public class StudentDAO {

    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<Student>();
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM student_info";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Student student = new Student();

                student.setId(rs.getString("Id"));
                student.setName(rs.getString("Name"));
                student.setGender(rs.getString("Gender"));
                student.setDate(rs.getString("Date"));
                student.setLop(rs.getString("Lop"));
                student.setAddress(rs.getString("Address"));
                //add het may cai tren vao arraylist students o tren
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;

    }

    public Student getStudentbyID(int id) {

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM student_info WHERE Id =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                Student student = new Student();
                student.setId(rs.getString("id"));
                student.setName(rs.getString("Name"));
                student.setGender(rs.getString("Gender"));
                student.setDate(rs.getString("Date"));
                student.setLop(rs.getString("Lop"));
                student.setAddress(rs.getString("Address"));

                return student;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }

    public void addStudent(Student student) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "INSERT INTO student_info (Id, Name, Gender, Date, Lop, Address) values (?,?,?,?,?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getGender());
            preparedStatement.setString(4, student.getDate());
            preparedStatement.setString(5, student.getLop());
            preparedStatement.setString(6, student.getAddress());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updateStudent(Student student) {

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = " UPDATE student_info set Name =?, Gender= ?, Date =?,Lop =?, Address = ?  WHERE Id = ?";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getGender());
            preparedStatement.setString(3, student.getDate());
            preparedStatement.setString(4, student.getLop());
            preparedStatement.setString(5, student.getAddress());
            preparedStatement.setInt(6, student.getId());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void deleteStudent(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "DELETE FROM student_info WHERE Id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /* public ArrayList<Student> FindAllStudentByName(String name) throws SQLException{
    
    Connection connection = JDBCConnection.getJDBCConnection();
    
        String sql = "Select * FROM student_info WHERE name = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet rs = preparedStatement.executeQuery();
        ArrayList<Student> studentList = new ArrayList<Student>();
        while( rs.next() ){
        Student student = new Student();

                student.setId(rs.getString("Id"));
                student.setName(rs.getString("Name"));
                student.setGender(rs.getString("Gender"));
                student.setDate(rs.getString("Date"));
                student.setLop(rs.getString("Lop"));
                student.setAddress(rs.getString("Address"));
                studentList.add(student);
        
        }
        return studentList;
    }*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
