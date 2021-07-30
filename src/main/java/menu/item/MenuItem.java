package menu.item;

public class MenuItem {
    private final int number;
    private final String name;

    public MenuItem(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
}
