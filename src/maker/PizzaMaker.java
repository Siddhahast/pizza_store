package maker;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public interface PizzaMaker {

    public Pizza makePizza(String[] ingredients);

    public void setPizza(Pizza pizza);

}
