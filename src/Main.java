/*
  -Создать package – data. Работу продолжаем в нем
  -Реализовать абстрактный класс User и его наследники Student и Teacher.
  -Родитель имеет в себе общие данные (фио, год рождения, паспорт (серия номер),
  а наследники собственные параметры (номер группы для Student, кафедра для Teacher).
 */

/*
  -Создать package – util. Работу продолжаем в нем
  -Создать классы WriterToTxt и ReaderFromTxt имеющие
  статичные методы для записи (write) /чтения (read) в/из txt файла
 */

/*
  -Создать package – service. Работу продолжаем в нем
  -Создать интерфейс DataService описывающий реализацию конкретных
  сервисов по управлению сущностями (create, read)
  Создать для сущности Student отдельный Service реализующий
  интерфейс DataService. Create и read операции реализуются путем
  вызова utils методов
 */

/*
  -Создать package – view. Работу продолжаем в нем
  -Создать абстрактный класс UserView, содержащий в себе метод
  void showTheBest(List<User> userList) , нутри вызывающий
  абстрактный метод User findTheBest(List<User> userList)
  -Создать класс StudentView, унаследованный или имплементирующий
  UserView , содержащий в себе реализация findTheBest
 */



public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }
}