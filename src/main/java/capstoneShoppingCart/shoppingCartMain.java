package capstoneShoppingCart;

import capstoneFruitBasket.fruits;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class shoppingCartMain {
    public static void main(String[] args){

        itemInfo item = new itemInfo();             //constructor initialises fruits with default prices
        item.addItemToShop("orange",90);    //adding new item to shop
        item.updateItemPrice("orange",70);  //updating item price
        item.displayPriceChart();                               // displaying items in shop for reference

        System.out.println("*************************");
        customerInfo customer1 = new customerInfo("Kishan",2000.0);
        customer1.displayEWalletBalance();
        customer1.addItemToCart("Milk",7);      //adding items to cart for customer 1
        customer1.addItemToCart("orange",1);
        customer1.addItemToCart("Milk",1);
        customer1.addItemToCart("Milk",3);
        customer1.displayShoppingCart();
        customer1.addItemToCart("Milk",4);
        customer1.removeItemFromCart("Milk",2); // removing items from cart of customer 1
        customer1.checkoutShoppingCart();                   // checkout process completed
        customer1.displayEWalletBalance();                  // customer 1 balance updated after purchase
        System.out.println("*******************************");
        customer1.addItemToCart("Newspaper",2);
        customer1.checkMilkOffer();
        customer1.removeItemFromCart("orange",1);   // trying to remove item which doesn't exist in cart for testing logic
        customer1.addItemToCart("Soda",1);          //adding an item which doesn't exist in shop for testing logic
        customer1.displayShoppingCart();
        customer1.checkoutShoppingCart();
        customer1.displayEWalletBalance();
    }
}



