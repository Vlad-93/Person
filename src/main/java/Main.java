import person.Person;

public class Main {

    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];

        Person person = new Person(firstName, lastName);

        System.out.println(person);
    }
}
