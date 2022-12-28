package service;


import data.StudentGroup;
import repository.Repository;
import util.ReaderFromStudentGrTxt;
import util.WriterStudentGrToTxt;


public abstract class StudentGroupServiceimplement implements DataService {

    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    protected StudentGroupServiceimplement(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup searchGroup(int groupNumber) {
        return studentGroupIntegerRepository.findById(groupNumber);
    }


    public void create(StudentGroup studentGroup) {
        WriterStudentGrToTxt.write(studentGroup);
    }


    public StudentGroup read(StudentGroup studentGroup) {
        return ReaderFromStudentGrTxt.read(studentGroup);

    }

    //Collections.sort(List<Student>,new UserComparator());

}
