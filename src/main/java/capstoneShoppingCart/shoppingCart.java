package capstoneShoppingCart;

import java.util.*;

public class shoppingCart extends itemInfo {

    static ArrayList<ArrayList> cartList = new ArrayList<>();
    static double total = 0;

    public void getTotal() {
        total = 0;
        for (int i = 0; i < cartList.size(); i++) {
            total += Double.valueOf((String) cartList.get(i).get(3));
        }
    }

    public void displayShoppingCart() {
        for (int i = 0; i < cartList.size(); i++) {
            System.out.println("Item Name : " + cartList.get(i).get(0) + " | Quantity : " + cartList.get(i).get(1) + " | Price : " + cartList.get(i).get(2) + " | Total : " + cartList.get(i).get(3));
        }
        getTotal();
        System.out.println("******************************");
        System.out.println("Current Total Cost : " + total);

    }

    public void checkMilkOffer() {
        for (int i = 0; i < cartList.size(); i++) {
            if (cartList.get(i).get(0) == "Milk") {
                double tmp = Double.valueOf((String) cartList.get(i).get(1));
                System.out.println("Milk Offer Applied , With " + tmp + " Milk Get : " + tmp / 2 + " Milk Free!");
            }
        }
    }

    public void removeItemFromCart(String itemName, int quantity) {
        for (int i = 0; i < cartList.size(); i++) {
            if (cartList.get(i).get(0) == itemName) {
                int tmp = Integer.valueOf((String) cartList.get(i).get(1));
                if ((tmp - quantity) <= 0) {
                    cartList.remove(i);
                    System.out.println("Object removed from cart completely");
                } else {
                    cartList.get(i).set(1, Integer.toString(tmp - quantity));
                    cartList.get(i).set(3, Double.toString((tmp - quantity) * (Double.valueOf((String) cartList.get(i).get(2)))));
                    System.out.println("qty reduced from cart  : " + tmp + " by removing " + quantity + " " + itemName + " new quantity TO : " + (tmp - quantity));
                    getTotal();
                    return;
                }
            }
        }
        System.out.println("Cannot remove an item : " + itemName + " which isn't present in the cart");
    }

    public void addItemToCart(String itemName, int quantity) {
        try {
            for (int i = 0; i < cartList.size(); i++) {     // adding items which is already present in the cart
                if (cartList.get(i).get(0) == itemName) {
                    Integer tmp = Integer.valueOf((String) cartList.get(i).get(1));
                    cartList.get(i).set(1, Integer.toString(quantity + tmp));
                    cartList.get(i).set(3, Integer.toString((quantity + tmp) * (Integer.valueOf((String) cartList.get(i).get(2)))));
                    getTotal();
                    return;
                }
            }


            ArrayList<String> tempCart = new ArrayList<String>();       // adding new item into the shopping cart
            tempCart.add(itemName);                                     // cartList is a 2D list ,(name,quantity,price,totalItemCost)
            tempCart.add(Integer.toString(quantity));
            tempCart.add(Integer.toString(itemInfo.map.get(itemName)));
            tempCart.add(Integer.toString(itemInfo.map.get(itemName) * quantity));
            cartList.add(tempCart);                                     // adding a temp list into the cartList
        } catch (Exception e) {
            System.out.println("Cannot add item : " + itemName + " which isn't present in the shop");
        }
    }
}
