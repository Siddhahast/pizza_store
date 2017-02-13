package entity;

import entity.Pizza;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by siddhahastmohapatra on 09/02/17.
 */
public class ThinCrustPizza extends Pizza {

    private String baseName = "Thin_Crust_Pizza";
    private Map<String , Integer> ingredientsMap;

    public ThinCrustPizza(){
        ingredientsMap = new HashMap<String, Integer>();
    }

    @Override
    public String getDescription() {
        return baseName;
    }

    @Override
    public int cost() {
        return 16;
    }

    @Override
    public void addIngredient(String ingredient) {
        if(ingredientsMap.get(ingredient)==null){
            ingredientsMap.put(ingredient, 1);
        } else{
            ingredientsMap.put(ingredient, ingredientsMap.get(ingredient)+1);
        }
    }


}
