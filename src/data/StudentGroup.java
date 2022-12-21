package data;

import java.util.ArrayList;


public class StudentGroup {

    protected String teacher;

    protected ArrayList <String> studentList = new ArrayList<>();

    protected int groupNumber;

    protected String studentGroup;

    public StudentGroup(String teacher, ArrayList<String> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
        this.studentGroup = studentGroup;
        this.groupNumber = Integer.parseInt(studentGroup);
    }

}
