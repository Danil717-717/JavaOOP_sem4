package terminal;

import terminal.Executable.CommandExecutable;

import java.util.Scanner;

public class TerminalReader extends CommandExecutableFactory {
    private static TerminalReader terminalReader;

    private CommandParser commandParser;


    public static TerminalReader getInstance(CommandParser commandParser) {
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser);
        }
        return terminalReader;
    }

    public TerminalReader(CommandParser commandParser) {
        this.commandParser = commandParser;
    }


    public void getI(int f) {
        Scanner in = new Scanner(System.in);
        while (true) {
            String coand = in.nextLine();
            String[] inp = commandParser.parseCommand(coand);
            CommandExecutableFactory commandExecutableFactory = new CommandExecutableFactory();
            CommandExecutable commandExecutable = commandExecutableFactory.create(inp);
            commandExecutable.execute();
        }
    }
}
