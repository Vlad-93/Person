import person.Person;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Влад", "Скрипкин"));
        personList.add(new Person("Иван", "Иванов"));
        personList.add(new Person("Пётр", "Петров"));

        Collections.sort(personList);

        for (Person person : personList)
            System.out.println(person);
    }
}
