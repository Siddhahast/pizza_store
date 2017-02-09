package entity;

/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class ItalianThinCrustPizza extends Pizza {

    private String baseName = "Italian_Thin_Crust_Pizza";

    @Override
    public String getDescription() {
        return baseName;
    }

    @Override
    public int cost() {
        return 22;
    }
}
