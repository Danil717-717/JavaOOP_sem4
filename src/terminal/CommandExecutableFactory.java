/*
- Переименовать класс  CommandExecutableFactory в CommandExecutableFactoryImpl
- Создать интерфейс CommandExecutableFactory и имплементировать от него класс CommandExecutableFactoryImpl.
- В классе TerminalReader реализовать DIP, то есть возможность менять реализации CommandExecutableFactory

 */

package terminal;

import terminal.executable.CommandExecutable;

public interface CommandExecutableFactory {
    CommandExecutable create(Command command);
}
