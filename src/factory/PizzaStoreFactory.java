package factory;

import store.CaliforniaPizzaStore;
import store.PizzaStore;
import store.italianPizzaStore;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class PizzaStoreFactory {

    public static PizzaStore getPizzaStore(String store){
        if(store.equalsIgnoreCase("california")){
            return new CaliforniaPizzaStore();
        } else if(store.equalsIgnoreCase("italian")){
            return new italianPizzaStore();
        }
        return null;
    }

}
