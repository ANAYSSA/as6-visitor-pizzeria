package pizzeria;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> order = List.of(new Pizza(), new Drink());
        BillVisitor bill = new BillVisitor();
        KitchenVisitor kitchen = new KitchenVisitor();

        for (MenuItem item : order) {
            item.accept(bill);
            item.accept(kitchen);
        }

        System.out.println("Total: " + bill.getTotal() + " KZT");
    }
}
