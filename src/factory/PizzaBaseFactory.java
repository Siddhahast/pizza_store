package factory;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public abstract class PizzaBaseFactory {

    public abstract Pizza getPizzaBase(String pizzaBase);

}
