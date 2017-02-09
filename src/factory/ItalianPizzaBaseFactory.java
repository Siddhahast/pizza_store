package factory;

import entity.ItalianThinCrustPizza;
import entity.Pizza;
import entity.ThinCrustPizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class ItalianPizzaBaseFactory extends PizzaBaseFactory {

    @Override
    public Pizza getPizzaBase(String pizzaBase) {
        if(pizzaBase.equalsIgnoreCase("thincrust")){
            return new ItalianThinCrustPizza();
        }
        return null;
    }
}
