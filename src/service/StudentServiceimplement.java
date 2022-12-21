package service;


import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

public abstract class StudentServiceimplement  implements DataService{

    @Override
    public void create(User user) {

        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);

    }
}
