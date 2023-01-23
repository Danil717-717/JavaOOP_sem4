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
import repository.StudentRepository;
import service.StudentService;
import terminal.executable.CommandExecutable;
import terminal.executable.CreateStudentExecutable;
import terminal.executable.DeleteStudentExecutable;
import terminal.executable.NoneCommandExecutable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{

    private StudentService studentService;
    private StudentService studentFio;

    public CommandExecutableFactoryImpl(StudentService studentService) {
        this.studentService = studentService;
    }

    public CommandExecutableFactoryImpl(StudentService studentService, StudentService studentFio) {
        this.studentService = studentService;
        this.studentFio = studentFio;
    }

    public CommandExecutable create (Command command){
        Student student = new Student(command.getFirstArgument());

        if (command.isCreateCommand() && student != null){
            return  new CreateStudentExecutable(new StudentService(new StudentRepository()),studentService);
        } else if (command.isDeleteCommand() && student != null) {
            return new DeleteStudentExecutable(new StudentService(new StudentRepository()),studentService);
        }else
            return new NoneCommandExecutable();


    }


}
