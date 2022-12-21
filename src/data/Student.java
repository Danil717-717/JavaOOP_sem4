package data;
//номер группы для Student
public class Student extends User{
    private int groupNumber;

    public Student(String fio, int age, int pass, int groupNumber) {
        super(fio, age, pass);
        this.groupNumber = groupNumber;
    }
}
