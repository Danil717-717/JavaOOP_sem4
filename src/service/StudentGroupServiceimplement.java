package service;


import data.StudentGroup;

import util.ReaderFromStudentGrTxt;

import util.WriterStudentGrToTxt;


public abstract class StudentGroupServiceimplement implements DataService{


    public void create(StudentGroup studentGroup) {
        WriterStudentGrToTxt.write(studentGroup);
    }


    public StudentGroup read(StudentGroup studentGroup) {
        return ReaderFromStudentGrTxt.read(studentGroup);

    }

}
