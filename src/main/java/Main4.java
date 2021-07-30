import menu.StandardMenu;

public class Main4 {

    public static void main(String[] args) {
        StandardMenu menu = new StandardMenu();
        menu.show();

        menu.menuStart();
//        PersonListHandler personList = new PersonListHandler();
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Menu:");
//        System.out.println("1.Add");
//        System.out.println("2.Show");
//        System.out.println("3.Exit\n");
//
//        L:while(true) {
//            String command = scanner.nextLine().toLowerCase();
//
//            switch (command) {
//                case "1":
//                case "add":
//                    System.out.print("Введите имя: ");
//                    String firstName = scanner.nextLine();
//                    System.out.print("Введите фамилию: ");
//                    String lastName = scanner.nextLine();
//
//                    personList.add(firstName, lastName);
//                    System.out.println("Пользователь добавлен");
//                    break;
//                case "2":
//                case "show":
//                    personList.show();
//                    break;
//                case "3":
//                case "exit":
//                    scanner.close();
//                    personList.close();
//                    break L;
//                default:
//                    System.out.println("Unsupported command");
//            }
//        }

    }

}
