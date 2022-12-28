package controller;


import data.Teacher;
import service.TeacherServiceImplement;

public class TeacherController extends Controller<Teacher, Integer>{
    public TeacherController(TeacherServiceImplement teacherServiceImplement) {
        super(teacherServiceImplement);


    }

    public Teacher saveTeacher(Teacher entity) {
        return null;
    }


    public Teacher findTeacherById(Integer id) {
        return null;
    }

    public Teacher findTeacherByFio(String fio) {
        return null;
    }
}
