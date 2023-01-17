/*
- Создать класc CommandExecutableFactory
- Реализовать в нём метод CommandExecutable create (String[] input),
  где в зависимости от переданных параметров создается тот или иной класс
- Использовать этот класс и метод в классе TerminalReader
HW
- Повторить задание с семинара №5
- Реализовать команды для терминального клиента: удалить студента по имени удалить студента по номеру группы и возрасту
- Продумать логику отображения результата выполнения команды

 */

package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.CommandExecutable;
import terminal.executable.CreateStudentExecutable;
import terminal.executable.DeleteStudentExecutable;
import terminal.executable.DeleteStudentExecutableFioAge;

public class CommandExecutableFactory {

    private StudentService studentService;
    private StudentService studentFio;
    private String fio;
    private int age;
    private int groupNumber;

    public CommandExecutable create (String[] input){

        if(input[0].equals("/add")){
            return new CreateStudentExecutable(
                    studentService, new Student(input[1] ));
        }
        if(input[0].equals("/dell")){
            return new DeleteStudentExecutable(studentService, new Student(input[1] ));
        }
        if(input[0].equals("/dellfio")) {
            return new DeleteStudentExecutableFioAge(studentService, new Student(input[1]), fio, age, groupNumber);
        }
        return null;

    }


}
