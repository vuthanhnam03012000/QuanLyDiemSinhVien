package Controller;

import Entity.Student;
import DAO.StudentDAO;
import java.util.List;

public class StudentController {

    StudentDAO studentDAO = new StudentDAO();

    public StudentController() {
        studentDAO = new StudentDAO();
    }

    public List<Student> getAllStudent() {
        return studentDAO.getAllStudent();
    }

    public void addStudent(Student student) {
        studentDAO.addStudent(student);

    }

    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    public Student getStudentbyID(int id) {
        return studentDAO.getStudentbyID(id);
    }

    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    //public void findStudent(String name) throws SQLException{
    //studentdao.FindAllStudentByName(name);
    //}
}
