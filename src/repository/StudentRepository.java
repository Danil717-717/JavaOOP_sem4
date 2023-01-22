package repository;

import data.Student;
import db.StudentTable;


public class StudentRepository implements UserRepository<Student,Integer> {

    private StudentTable studentTable;

    public StudentRepository(){

    }

    public StudentRepository(StudentTable studentTable) {
        this.studentTable = studentTable;
    }



    @Override
    public Student save(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {return null; }

    @Override
    public Student findByFio(String fio) {
        return null;
    }

    public Student deleteStudentFioAge(Student student, String fio, int age, int groupNumber) {return null;}
}
