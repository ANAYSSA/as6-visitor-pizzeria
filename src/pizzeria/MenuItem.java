package pizzeria;

public interface MenuItem {
    void accept(MenuVisitor visitor);
}
