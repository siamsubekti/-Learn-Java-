package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */

    private HashMap<Furniture, Integer> furnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        this.furnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        furnitures.put(type, furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return furnitures;
    }

    public float getTotalOrderCost() {
        float totalCost = 0.0f;
        for(Map.Entry<Furniture, Integer> entry : furnitures.entrySet()){
            totalCost += (entry.getKey().cost()*entry.getValue());
        }
        return totalCost;
        // TODO: Complete the method
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        if (!furnitures.containsKey(type))
            return 0;
        return this.furnitures.get(type);
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        if(!furnitures.containsKey(type))
            return 0.0f;
        return this.furnitures.get(type)*type.cost();
    }

    public int getTotalOrderQuantity() {
        int totalQty = 0;
        for(Map.Entry<Furniture, Integer> entry : furnitures.entrySet()){
            totalQty += entry.getValue();
        }
        // TODO: Complete the method
        return totalQty;
    }
}