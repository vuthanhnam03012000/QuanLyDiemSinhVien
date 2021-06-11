package DAO;

import Connection.JDBCConnection;
import com.mysql.jdbc.Connection;
import java.util.List;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Entity.StudentMark;

public class StudentMarkDAO {

    public List<StudentMark> getAllMark() {
        
        //Tao List sau do add du lieu vao List
        List<StudentMark> studentMarks = new ArrayList<>();
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM student_mark";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                StudentMark studentMark = new StudentMark();

                studentMark.setId(rs.getString("Id"));
                studentMark.setName(rs.getString("Name"));
                studentMark.setTenMonHoc(rs.getString("Tenmon"));
                studentMark.setDiemChuyenCan(rs.getString("Diem15"));
                studentMark.setDiemGiuaKy(rs.getString("Diem45"));
                studentMark.setDiemThi(rs.getString("DiemThi"));
                studentMark.setDiemTongKet(rs.getString("Diemtongket"));
                studentMark.setXepLoai(rs.getString("Xeploai"));
                studentMark.setMaMonHoc(rs.getString("MaMh"));
                
                studentMarks.add(studentMark);
            }
        } catch (SQLException e) {
        }
        return studentMarks;
    }

    public StudentMark getStudentMarkByID(int id) {

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "SELECT * FROM student_mark WHERE Id =?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(id));
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                StudentMark studentMark = new StudentMark();
                studentMark.setId(rs.getString("id"));
                studentMark.setName(rs.getString("Name"));
                studentMark.setTenMonHoc(rs.getString("Tenmon"));
                studentMark.setDiemChuyenCan(rs.getString("Diem15"));
                studentMark.setDiemGiuaKy(rs.getString("Diem45"));
                studentMark.setDiemThi(rs.getString("Diemthi"));
                studentMark.setDiemTongKet(rs.getString("Diemtongket"));
                studentMark.setMaMonHoc(rs.getString("MaMh"));

                return studentMark;

            }
        } catch (SQLException e) {
        }

        return null;

    }

    public void addMark(StudentMark studentMark) {
        Connection connection = JDBCConnection.getJDBCConnection();
        //ham them diem, insert du lieu vao ?,?,?,?,?,?,?
        String sql = "INSERT INTO student_mark (Id, Name, Tenmon, Diem15, Diem45, Diemthi, Diemtongket, Xeploai, MaMh) values (?,?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, studentMark.getId());
            preparedStatement.setString(2, studentMark.getName());
            preparedStatement.setString(3, studentMark.getTenMonHoc());
            preparedStatement.setFloat(4, studentMark.getDiemChuyenCan());
            preparedStatement.setFloat(5, studentMark.getDiemGiuaKy());
            preparedStatement.setFloat(6, studentMark.getDiemThi());
            preparedStatement.setFloat(7, studentMark.getDiemTongKet());
            preparedStatement.setString(8, studentMark.getXepLoai());
            preparedStatement.setInt(9, studentMark.getMaMonHoc());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
        }

    }

    public void updateMark(StudentMark studentMark) {

        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = " UPDATE student_mark set Name =?, Tenmon =?,Diem15 =?, Diem45 = ?, Diemthi = ?,"
                + "Diemtongket = ?, Xeploai = ?, MaMh = ?  WHERE Id = ?";
        try {

            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, studentMark.getName());
            preparedStatement.setString(2, studentMark.getTenMonHoc());
            preparedStatement.setFloat(3, studentMark.getDiemChuyenCan());
            preparedStatement.setFloat(4, studentMark.getDiemGiuaKy());
            preparedStatement.setFloat(5, studentMark.getDiemThi());
            preparedStatement.setFloat(6, studentMark.getDiemTongKet());
            preparedStatement.setString(7, studentMark.getXepLoai());
            preparedStatement.setInt(8, studentMark.getMaMonHoc());
            preparedStatement.setInt(9, studentMark.getId());
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
        }

    }

    public void deleteMark(int id) {
        Connection connection = JDBCConnection.getJDBCConnection();
        String sql = "DELETE FROM student_mark WHERE Id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);

        } catch (SQLException e) {
        }
    }
}
