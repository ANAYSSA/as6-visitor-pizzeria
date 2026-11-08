package pizzeria;

public interface MenuVisitor {
    void visitPizza(Pizza pizza);
    void visitDrink(Drink drink);
}
