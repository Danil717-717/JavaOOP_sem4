package service;


import data.Student;
import data.StudentGroup;

import data.comparators.UserComparator;
import util.ReaderFromStudentGrTxt;

import util.WriterStudentGrToTxt;

import java.util.Collections;
import java.util.List;


public abstract class StudentGroupServiceimplement implements DataService{


    public void create(StudentGroup studentGroup) {
        WriterStudentGrToTxt.write(studentGroup);
    }


    public StudentGroup read(StudentGroup studentGroup) {
        return ReaderFromStudentGrTxt.read(studentGroup);

    }

    //Collections.sort(List<Student>,new UserComparator());

}
