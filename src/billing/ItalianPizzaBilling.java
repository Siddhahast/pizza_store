package billing;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class ItalianPizzaBilling implements PizzaBilling {

    private double vat = 12.0;

    @Override
    public int cost(Pizza pizza) {
        double cost = pizza.cost();
        double service = (vat/100.0)*cost;
        int total = (int) (cost + service);
        return total;
    }
}
