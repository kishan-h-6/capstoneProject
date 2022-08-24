package capstoneFruitBasket;

import java.util.ArrayList;

public class fruitBowlMain extends fruitSorting{

        public static void main(String[] args){
            fruitSorting fruitObject = new fruitSorting();
            ArrayList<fruits> fruitList = new ArrayList<fruits>();
            fruitList.add(new fruits("Apple", "Light Red","Simple","Medium"));
            fruitList.add(new fruits("JackFruit", "Dark Yellow","Composite","Large"));
            fruitList.add(new fruits("Grapes", "Purple","Simple","Small"));
            fruitList.add(new fruits("Strawberry", "Red","Aggregate","Small"));
            fruitList.add(new fruits("Watermelon", "Green","Simple","Large"));

            System.out.println(sortBySize(fruitList));
            System.out.println("***************************");
            fruitObject.clearFruitBasket();
            System.out.println(sortByColor(fruitList));
            System.out.println("***************************");
            fruitObject.clearFruitBasket();
            System.out.println(fruitSorting.sortByType(fruitList));

        }

}
