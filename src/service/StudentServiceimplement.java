package service;


import data.Student;
import data.StudentGroup;
import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.util.Iterator;

public abstract class StudentServiceimplement  implements DataService{

    @Override
    public void create(User user) {

        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);

    }

    public StudentGroup getGroup(){
        return new StudentGroup();
    }

    public StudentGroup getGroup(int number){
        return new StudentGroup(number);
    }

    public void removeStudent(String fio){
        Iterator<Student> studentGroup = getGroup().iterator();
        while(studentGroup.hasNext()){
            Student student = studentGroup.next();
            if(fio.equals(student.getFio())){
                studentGroup.remove();
            }
        }

    }
}
