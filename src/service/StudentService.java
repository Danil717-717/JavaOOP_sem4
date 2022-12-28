package service;

import data.Student;
import repository.StudentRepository;

public class StudentService {

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public void saveStudent(Student entity) {
        studentRepository.save(entity);
    }


    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }


    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }
}
