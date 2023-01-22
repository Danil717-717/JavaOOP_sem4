/*
- Создать класс StudentTable
- Реализовать метод удаления по имени boolean removeByName (String name), который бы удалял студента из таблицы по имени
- Создать в классе StudentRepository зависимость класса StudentTable
- Вызывать метод removeByName из одноименного метода класса

 */


package db;

import data.Student;
import repository.StudentRepository;

public class StudentTable extends Table<Student> {

    public boolean removeByName (String fio){
        for(Student student: element){
            if(student.getFio().equals(fio)){
                element.remove(student);
                return true;
            }
        }
        return false;
    }


}
