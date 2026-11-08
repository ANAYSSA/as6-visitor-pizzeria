package pizzeria;

public class Drink implements MenuItem {
    private int price = 500;

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(MenuVisitor visitor) {
        visitor.visitDrink(this);
    }
}
