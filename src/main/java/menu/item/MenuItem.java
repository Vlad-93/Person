package menu.item;

public class MenuItem {
    private final String name;
    private final int number;

    MenuItem(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
