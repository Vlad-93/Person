package person;

import java.util.*;

public class PersonListHandler implements AutoCloseable {
    private final List<Person> personList;

    public PersonListHandler() {
        this.personList = new ArrayList<>();
    }

    public PersonListHandler(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person p) {
        personList.add(p);
    }

    public void add(String firstName, String lastName) {
         add(new Person(firstName, lastName));
    }

    public void show() {
        System.out.print(this);
    }

    public void showSortedUnique() {
        List<Person> sortedPersonList = new ArrayList<>(personList);

        Collections.sort(sortedPersonList);
        PersonListHandler listHandler = new PersonListHandler(sortedPersonList);
        System.out.println(listHandler);
    }

    @Override
    public void close() {
        personList.clear();
    }

    @Override
    public String toString() {
        if (personList.isEmpty())
            return "Список пуст\n";

        StringBuilder sb = new StringBuilder();

        for (Person person : personList) {
            sb.append(person);
            sb.append('\n');
        }

        return sb.toString();
    }
}
