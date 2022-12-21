package Controller;

import data.Student;
import data.Teacher;
import service.DataService;
import service.StudentServiceimplement;
import service.TeacherServiceImplement;

public class Controller {

    private DataService studentServiceimplement;   // создали переменную
    private DataService teacherServiceimplement;   // создали переменную


    public Controller(StudentServiceimplement studentServiceimplement){
        this.studentServiceimplement = studentServiceimplement;   // инициализировали ее
    }

    public Student createStudent(Student student){
        studentServiceimplement.create(student);
        return (Student) studentServiceimplement.read(student);

    }

    public Teacher createTeacher(Teacher teacher){
        teacherServiceimplement.create(teacher);
        return (Teacher) studentServiceimplement.read(teacher);

    }
}
