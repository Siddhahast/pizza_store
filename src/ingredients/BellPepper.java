package ingredients;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class BellPepper extends PizzaCondiments {
    private Pizza pizza;

    public BellPepper(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", yellow capsicum";
    }

    @Override
    public int cost() {
        return pizza.cost() + 17;
    }
}
