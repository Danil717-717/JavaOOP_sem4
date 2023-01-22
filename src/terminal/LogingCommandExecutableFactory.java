/*
- Создать класс LogingCommandExecutableFactory, наследующий класс CommandExecutableFactory
- Переопределить единственный метод так, чтобы он вызывал внутри себя метод предка, но в начале и конце распечатывал информацию о входных и выходных параметрах

 */


package terminal;

import service.StudentService;
import terminal.executable.CommandExecutable;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl {

    public LogingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
    }

    public LogingCommandExecutableFactory(StudentService studentService, StudentService studentFio) {
        super(studentService, studentFio);
    }

    @Override
    public CommandExecutable create (Command command){

        System.out.println(command);

        CommandExecutable commandExecutable = super.create(command);

        //ResultDisplayed resultDisplayed = resultDisplayedFactory.create(command.getMainCommand(), commandExecutable);
        //resultDisplayed.display();

        System.out.println("GoodWork");
        return commandExecutable;
    }

}
