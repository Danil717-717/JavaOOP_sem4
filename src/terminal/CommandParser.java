/*
- Создать пекедж terminal. Дальнейшие работы ведем в нем
- Создать интерфейс CommandParser c методом String[] parseCommand (String inputCommand)
- Создать класс TerminalReader, который содержит переменную CommandParser и метод,
  который в бесконечном цикле слушает команды с помощью Scanner(System.in)


- Создать интерфейс CommandExecutable c абстрактным методом execute()
- Реализовать 2 класса, имплементировав созданный интерфейс, CreateStudentExecutable и DeleteStudentExecutable.
  В унаследованных методах они должны обращаться к методом класса StudentService.
- Подумать какие переменные могли бы содержать созданные классы

- Создать класc CommandExecutableFactory
- Реализовать в нём метод CommandExecutable create (String[] input), где в зависимости от переданных параметров создается тот или иной класс
- Использовать этот класс и метод в классе TerminalReader

  HW
- Повторить задание с семинара №5
- Реализовать команды для терминального клиента: удалить студента по имени удалить студента по номеру группы и возрасту
- Продумать логику отображения результата выполнения команды
 */


package terminal;

public interface CommandParser {
    String[] parseCommand(String inputCommand);

}
