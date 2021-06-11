package Controller;

import DAO.StudentMarkDAO;
import Entity.StudentMark;

import java.util.List;

public class StudentMarkController {

    StudentMarkDAO studentMarkDAO = new StudentMarkDAO();

    public List<StudentMark> getAllMark() {
        return studentMarkDAO.getAllMark();
    }

    public void addStudentMark(StudentMark studentMark) {
        studentMarkDAO.addMark(studentMark);
    }

    public void deleteStudentMark(int id) {
        studentMarkDAO.deleteMark(id);
    }

    public StudentMark getStudentMarkByID(int id) {
        return studentMarkDAO.getStudentMarkByID(id);
    }

    public void updateStudentMark(StudentMark studentmark) {
        studentMarkDAO.updateMark(studentmark);
    }
}
