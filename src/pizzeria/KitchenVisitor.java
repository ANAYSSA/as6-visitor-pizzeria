package pizzeria;

public class KitchenVisitor implements MenuVisitor {
    @Override
    public void visitPizza(Pizza pizza) {
        System.out.println("Bake pizza in the oven.");
    }

    @Override
    public void visitDrink(Drink drink) {
        System.out.println("Pour drink into a cup.");
    }
}
