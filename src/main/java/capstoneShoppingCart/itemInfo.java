package capstoneShoppingCart;

import java.util.HashMap;
import java.util.Map;

public class itemInfo {
    public String itemName;
    public Double itemPrice;
    public static Map<String, Integer> map = new HashMap<>();
    public itemInfo() {
        addItemToShop("Milk",25);
        addItemToShop("Newspaper",5);
        addItemToShop("Apple",40);
    }

    public static void addItemToShop(String itemName,int price) {
        itemInfo.map.put(itemName,price);
    }

    public itemInfo(String itemName, Double itemPrice) {
        this.itemName = itemName;

        this.itemPrice = itemPrice;
    }
    public void displayPriceChart(){
        map.forEach((k,v) -> {
            System.out.println("Item Name : " + k + ", Price : " + v);});
    }

    public void updateItemPrice(String itemName,int itemPrice){
        map.put(itemName,itemPrice);
    }
    @Override
    public String toString() {
        return "itemInfo{" +
                "itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                '}';
    }
}
