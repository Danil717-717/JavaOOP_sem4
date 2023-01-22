/*
- Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
- Реализовать в нем булевские методы для проверки введенных команд
- отредактировать класс CommandExecutableFactory, убрав из него хардкод и начав принимать на вход объект Command

 */


package terminal;

import java.util.List;

public class Command {


    private final static String ADD = "/add";
    private final static String DEL = "/del";

    private List<String> arguments;
    private String mainFirstCommand;

    public String getFirstArgument(){
        return arguments.get(0);
    }

    public boolean isCreateCommand(){
        return mainFirstCommand.equals("/add");
    }

    public boolean isDeleteCommand(){
        return mainFirstCommand.equals("/del");
    }






}
