package person;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Person p) {
        return this.lastName.compareTo(p.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
