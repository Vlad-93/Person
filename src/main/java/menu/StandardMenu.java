package menu;

import person.PersonListHandler;

import java.util.Scanner;

public class StandardMenu implements AutoCloseable {
    protected final PersonListHandler listHandler = new PersonListHandler();

    private void addToList() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        listHandler.add(firstName, lastName);
        System.out.println("Пользователь добавлен");
    }

    private void listShow() {
        listHandler.show();
    }

    public void menuStart() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String command = scanner.nextLine().toLowerCase();

            switch (command) {
                case "1":
                case "add":
                    addToList();
                    break;
                case "2":
                case "show":
                    listShow();
                    break;
                case "3":
                case "exit":
                    close();
                    return;
                default:
                    System.out.println("Unsupported command");
            }
        }
    }

    public void show() {
        System.out.println("Menu:");
        System.out.println("1.Add");
        System.out.println("2.Show");
        System.out.println("3.Exit\n");
    }

    @Override
    public void close() {
        listHandler.close();
    }

}
