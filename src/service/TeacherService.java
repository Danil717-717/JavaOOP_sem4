package service;

import data.Teacher;
import repository.TeacherRepository;

public class TeacherService {
    private final TeacherRepository  teacherRepository;


    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void saveTeacher(Teacher entity) {

        teacherRepository.save(entity);
    }


    public Teacher findStudentById(int id) {

        return teacherRepository.findById(id);
    }


    public Teacher findTeachertByFio(String fio) {

        return teacherRepository.findByFio(fio);
    }
}
