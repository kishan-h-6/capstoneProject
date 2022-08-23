package capstoneFruitBasket;

import java.util.ArrayList;

public class fruitSorting {
    static ArrayList<fruits> topFruitList = new ArrayList<>();
    static ArrayList<fruits> middleFruitList = new ArrayList<>();
    static ArrayList<fruits> lastFruitList = new ArrayList<>();
    public static String sortBySize(ArrayList<fruits> fruitsArrayList){
      for(int i=0;i<fruitsArrayList.size();i++){
         switch (fruitsArrayList.get(i).fruitSize){
             case "Small" : topFruitList.add(fruitsArrayList.get(i));
             break;
             case "Medium" : middleFruitList.add(fruitsArrayList.get(i));
                 break;
             case "Large" : lastFruitList.add(fruitsArrayList.get(i));
                 break;
             default: System.out.println(" Wrong input provided for "+ fruitsArrayList.get(i));

         }
      }
        return (" Small Fruits : "+topFruitList+"\n Medium Fruits : "+middleFruitList+ "\n Large Fruits : "+lastFruitList);

    }
    public void clearArrayList(){
        topFruitList.clear();
        middleFruitList.clear();
        lastFruitList.clear();
    }
    public static String sortByColor(ArrayList<fruits> fruitsArrayList){
        for(int i=0;i<fruitsArrayList.size();i++){
           if(fruitsArrayList.get(i).fruitColor.contains("Light")){
               topFruitList.add(fruitsArrayList.get(i));
           } else if (fruitsArrayList.get(i).fruitColor.contains("Dark")) {
               middleFruitList.add(fruitsArrayList.get(i));

           }
           else {
               lastFruitList.add(fruitsArrayList.get(i));
           }
        }
        return (" Light Coloured Fruits : "+topFruitList+"\n Dark Coloured Fruits : "+middleFruitList+ "\n Regular Coloured Fruits : "+lastFruitList);

    }

    public static String sortByType(ArrayList<fruits> fruitsArrayList){
        for(int i=0;i<fruitsArrayList.size();i++){
            switch (fruitsArrayList.get(i).fruitType){
                case "Simple" : topFruitList.add(fruitsArrayList.get(i));
                    break;
                case "Aggregate" : middleFruitList.add(fruitsArrayList.get(i));
                    break;
                case "Composite" : lastFruitList.add(fruitsArrayList.get(i));
                    break;
                default: System.out.println(" Wrong input provided for "+ fruitsArrayList.get(i));

            }
        }
        return (" Simple Type Fruits : "+topFruitList+"\n Aggregate type Fruits : "+middleFruitList+ "\n Composite type Fruits : "+lastFruitList);

    }
}


