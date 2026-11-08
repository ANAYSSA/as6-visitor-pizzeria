# Assignment 6 — Visitor

A small Java pizzeria example with a pizza (2500 KZT) and a drink (500 KZT).

## Run

```bash
javac -d out src/pizzeria/*.java
java -cp out pizzeria.Main
```

## How it works

`MenuItem` is the element interface. `Pizza` and `Drink` implement `accept`. `MenuVisitor` declares `visitPizza` and `visitDrink`.

`BillVisitor` adds item prices to the bill. `KitchenVisitor` prints preparation instructions. `Main` holds a list of items and calls `accept` with both visitors. These operations are kept outside the item classes.

Double dispatch: `item.accept(bill)` first calls the actual item's `accept`. A pizza calls `bill.visitPizza(this)`, while a drink calls `bill.visitDrink(this)`. The selected visitor then runs its operation for that item type.

The bill visitor accumulates a total, so create a new `BillVisitor` for a new bill.

Expected output:

```text
Bake pizza in the oven.
Pour drink into a cup.
Total: 3000 KZT
```

## Clean Code

1. Meaningful names: `Pizza` and `Drink` represent items; `BillVisitor` and `KitchenVisitor` describe operations.
2. Single responsibility: billing and kitchen instructions belong to separate visitors.
3. Polymorphism: `accept` calls the matching visitor method, with no `instanceof` or type-checking chains.
4. Encapsulation: item prices are private. Visitors read only the needed price through `getPrice`, without changing the items.
5. Open/Closed principle: a third visitor, such as `PackingVisitor`, can implement both visit methods without changing existing elements or visitor interfaces. `Main` can then pass it to `accept`.
