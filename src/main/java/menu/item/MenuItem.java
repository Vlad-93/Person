package menu.item;

import java.util.Objects;

public class MenuItem {
    private final int number;
    private final String name;

    public MenuItem(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public MenuItem(String name) {
        this.name = name;
        this.number = 0;
    }

    @Override
    public String toString() {
        return number + ". " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenuItem)) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equalsIgnoreCase(menuItem.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name.toLowerCase());
    }

    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
}
