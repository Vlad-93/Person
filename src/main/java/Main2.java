import person.Person;
import person.PersonListHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        System.out.println("Для завершения заполнения списка введите: 0");

        while(true) {
            System.out.print("\nВведите имя: ");
            String firstName = scanner.next();

            if (firstName.equals("0"))
                break;

            System.out.print("Введите фамилию: ");
            String lastName = scanner.next();

            if (lastName.equals("0"))
                break;

            personList.add(new Person(firstName, lastName));
        }

        System.out.println("\nСписок пользователей:");

        for (Person person : personList)
            System.out.println(person);

    }

}
