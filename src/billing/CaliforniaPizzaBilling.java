package billing;
import entity.Pizza;
import billing.PizzaBilling;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class CaliforniaPizzaBilling implements PizzaBilling {

    private double serviceTax = 10.0;

    @Override
    public int cost(Pizza pizza) {
        double cost = pizza.cost();
        double service = (serviceTax/100)*cost;
        int total = (int) (cost + service);
        return total;
    }
}
