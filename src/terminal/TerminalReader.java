package terminal;

import repository.StudentRepository;
import service.StudentService;
import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader  {
    private static TerminalReader terminalReader;

    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }
    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    public void getReader(int f) {
        Scanner scan = new Scanner(System.in);
        while (true) {                      // for( ; ; )
            String command = scan.nextLine();
            //String[] inputTerminal = commandParser.parseCommand(command);  //мы его убрали
            Command command1 = commandParser.parseCommand(command);
            //CommandExecutableFactoryImpl commandExecutableFactoryImpl = new CommandExecutableFactoryImpl(new StudentService(new StudentRepository()));
            //CommandExecutable commandExecutable = commandExecutableFactoryImpl.create(command1);
            //commandExecutable.execute();
            commandExecutableFactory.create(command1);
        }
    }
}
