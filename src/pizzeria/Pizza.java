package pizzeria;

public class Pizza implements MenuItem {
    private int price = 2500;

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visitPizza(this);
    }
}
