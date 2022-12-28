package controller;

import data.Student;
import service.StudentServiceimplement;

public class StudentController extends Controller<Student, Integer> {
    public StudentController(StudentServiceimplement studentServiceimplement) {
        super(studentServiceimplement);
    }

    public Student saveStudent(Student entity) {
        return null;
    }


    public Student findStudentById(Integer id) {
        return null;
    }


    public Student findStudentByFio(String fio) {
        return null;
    }
}
