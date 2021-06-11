package Controller;

import DAO.SubjectDAO;
import Entity.Student;
import Entity.Subject;

import java.util.List;

public class SubjectController {

    SubjectDAO subjectDao = new SubjectDAO();

//    public SubjectController() {
//        subjectDao = new SubjectDAO();
//    }

    public List<Subject> getAllSubjects() {
        return subjectDao.getAllSubject();
    }

    public void addSubject(Subject subject) {
        subjectDao.addSubject(subject);

    }

    public void deleteSubject(int mamh) {
        subjectDao.deleteSubject(mamh);
    }

    public Student getSubjectbymamh(int mamh) {
        return getSubjectbymamh(mamh);
    }

    public void updateSubject(Subject subject) {
        subjectDao.updateSubject(subject);
    }

}
