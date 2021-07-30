import person.Person;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String firstName = scanner.next();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.next();

        Person person = new Person(firstName, lastName);

        System.out.println(person);
    }
}
