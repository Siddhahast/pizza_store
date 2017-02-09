package entity;

import entity.Pizza;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class ThinCrustPizza extends Pizza {

    private String baseName = "Thin_Crust_Pizza";

    @Override
    public String getDescription() {
        return baseName;
    }

    @Override
    public int cost() {
        return 16;
    }
}
