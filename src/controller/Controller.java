package controller;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import service.DataService;
import service.StudentServiceimplement;
import service.TeacherServiceImplement;
import service.StudentGroupServiceimplement;

public class Controller {

    private DataService studentServiceimplement;                                        // создали переменную
    private DataService teacherServiceimplement;                                       // создали переменную

    private DataService studentGroupServiceimplement;

    private DataService groupNumber;



    public Controller(StudentServiceimplement studentServiceimplement){
        this.studentServiceimplement = studentServiceimplement;                       // инициализировали student
    }

    public Controller(TeacherServiceImplement teacherServiceImplement){
        this.teacherServiceimplement = teacherServiceImplement;                       // инициализировали teacher
    }

    public Controller(StudentGroupServiceimplement studentGroupServiceimplement){
        this.studentGroupServiceimplement = studentGroupServiceimplement;                 // инициализировали StudentGr
    }


    public Student createStudent(Student student){
        studentServiceimplement.create(student);
        return (Student) studentServiceimplement.read(student);

    }

    public Teacher createTeacher(Teacher teacher){
        teacherServiceimplement.create(teacher);
        return (Teacher) teacherServiceimplement.read(teacher);

    }

    public StudentGroup createTeacher(StudentGroup studentGroup){
        studentGroupServiceimplement.create(studentGroup);
        return (StudentGroup) studentGroupServiceimplement.read(studentGroup);

    }

    public StudentGroup createGroup(int groupNumber){
        return (StudentGroup) studentGroupServiceimplement.createGroups(groupNumber);

    }
}
