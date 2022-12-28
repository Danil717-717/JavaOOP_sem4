package repository;

public class GroupRepository implements Repository<String, Integer>{
    // изначально будет Object, тк тип не был задан


    @Override
    public String save(String entity) {
        return null;
    }

    @Override
    public String findById(Integer id) {
        return null;
    }



}
