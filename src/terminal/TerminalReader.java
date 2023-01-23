package terminal;

import terminal.executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader implements CommandParser  {
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

    public void getReader() {
        Scanner scan = new Scanner(System.in);
        while (true) {                      // for( ; ; )
            String command = scan.nextLine();
            //String[] inputTerminal = commandParser.parseCommand(command);  //мы его убрали
            Command command1 = commandParser.parseCommand(command);
            //CommandExecutableFactoryImpl commandExecutableFactoryImpl = new CommandExecutableFactoryImpl(new StudentService(new StudentRepository()));
            CommandExecutable commandExecutable = commandExecutableFactory.create(command1);
            commandExecutable.execute();
            commandExecutableFactory.create(command1);
        }
    }

    @Override
    public Command parseCommand(String inputCommand) {
        String input = inputCommand;
        String[] mass = input.split("");
        System.out.println(mass);
        return parseCommand(inputCommand);
    }
}
