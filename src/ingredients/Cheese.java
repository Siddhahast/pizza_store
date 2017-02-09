package ingredients;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class Cheese extends PizzaCondiments {

    private Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+ ", cheese";
    }

    @Override
    public int cost() {
        return pizza.cost() + 4;
    }
}
