package ingredients;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class Capsicum extends PizzaCondiments {

    private Pizza pizza;

    public Capsicum(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", capsicum";
    }

    @Override
    public int cost() {
        return pizza.cost() + 12;
    }
}
