package capstoneShoppingCart;

import capstoneFruitBasket.fruits;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class shoppingCartMain {
    public static void main(String[] args){
        itemInfo item = new itemInfo();
        item.addItemToShop("orange",90);
        item.updateItemPrice("orange",70);
        item.displayPriceChart();
        System.out.println("*************************");
        customerInfo customer1 = new customerInfo("Kishan",1000);
        customer1.addItemToCart("Milk",7);
        customer1.addItemToCart("orange",1);

        customer1.addItemToCart("Milk",1);
        customer1.addItemToCart("Milk",3);
        customer1.removeItemFromCart("Milk",2);


        customer1.removeItemFromCart("Milk",1);
        customer1.displayShoppingCart();
        customer1.checkMilkOffer();
        customer1.checkoutShoppingCart();
        customer1.displayEWalletBalance();
        customerInfo customer2 = new customerInfo("Ram",2000);
        customer2.displayEWalletBalance();
        customer2.addItemToCart("Milk",1);
        customer2.displayShoppingCart();
        customer2.checkoutShoppingCart();
        customer2.displayEWalletBalance();


    }
}



