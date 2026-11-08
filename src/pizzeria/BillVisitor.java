package pizzeria;

public class BillVisitor implements MenuVisitor {
    private int total;

    @Override
    public void visitPizza(Pizza pizza) {
        total += pizza.getPrice();
    }

    @Override
    public void visitDrink(Drink drink) {
        total += drink.getPrice();
    }

    public int getTotal() {
        return total;
    }
}
