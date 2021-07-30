package menu;

import menu.comand.Command;

import java.util.HashMap;
import java.util.Scanner;

public class CustomerMenu extends StandardMenu {
    // Содержит названия команд (key) и сами команды (value)
    private final HashMap<String, Command> commands = new HashMap<>();

    public CustomerMenu() {
        Command add = () -> {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите имя: ");
            String firstName = scanner.nextLine();
            System.out.print("Введите фамилию: ");
            String lastName = scanner.nextLine();

            listHandler.add(firstName, lastName);
            System.out.println("Пользователь добавлен");
        };

        Command show = listHandler::show;
        Command showSortedUnique = listHandler::showSortedUnique;
        Command exit = this::close;

        commands.put("Add", add);
        commands.put("Show", show);
        commands.put("Show sorted unique", showSortedUnique);
        commands.put("Exit", exit);
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
        int commandNumber = 1;

        for (String commandName : commands.keySet())
            System.out.printf("%d.%s\n", commandNumber++, commandName);

        System.out.println();
    }
}
