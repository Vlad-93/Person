package menu;

import menu.comand.Command;
import menu.item.MenuItem;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerMenu extends StandardMenu {
    // Содержит названия команд (key) и сами команды (value)
    private final HashMap<MenuItem, Command> commands = new HashMap<>();

    MenuItem add = new MenuItem(1, "Add");
    MenuItem show = new MenuItem(2, "Show");
    MenuItem showSortedUnique = new MenuItem(3, "Show sorted unique");
    MenuItem exit = new MenuItem(4, "Exit");

    public CustomerMenu() {
        Command addCommand = () -> {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите имя: ");
            String firstName = scanner.nextLine();
            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine();

            listHandler.add(firstName, lastName);
            System.out.println("Пользователь добавлен");
        };

        Command showCommand = listHandler::show;
        Command showSortedUniqueCommand = listHandler::showSortedUnique;
        Command exitCommand = this::close;

        commands.put(add, addCommand);
        commands.put(show, showCommand);
        commands.put(showSortedUnique, showSortedUniqueCommand);
        commands.put(exit, exitCommand);
    }

    @Override
    public void menuStart() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String commandName = scanner.nextLine().toLowerCase();

            if (commandName.equals("exit") )
                return;

            if (commands.containsKey(commandName))
                commands.get(commandName).exec();
            else
                System.out.println("Unsupported command");
        }
    }

    @Override
    public void show() {
        for (MenuItem commandName : commands.keySet())
            System.out.println(commandName);

        System.out.println();
    }
}
