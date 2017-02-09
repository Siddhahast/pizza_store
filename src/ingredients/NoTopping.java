package ingredients;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class NoTopping extends PizzaCondiments {

    private String description = "plain";
    private Pizza pizza;

    public NoTopping(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", "+description;
    }

    @Override
    public int cost() {
        return pizza.cost() + 0;
    }
}
