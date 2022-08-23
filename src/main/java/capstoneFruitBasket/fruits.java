package capstoneFruitBasket;

public  class fruits {
    public String fruitName;
    public String fruitColor;
    public String fruitType;
    public String fruitSize;

    public fruits(String fruitName,String fruitColor, String fruitType, String fruitSize) {
        this.fruitName=fruitName;
        this.fruitColor = fruitColor;
        this.fruitType = fruitType;
        this.fruitSize = fruitSize;
    }

    @Override
    public String toString() {
        return "fruits{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitColor='" + fruitColor + '\'' +
                ", fruitType='" + fruitType + '\'' +
                ", fruitSize='" + fruitSize + '\'' +
                '}';
    }
}
