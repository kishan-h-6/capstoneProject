package capstoneShoppingCart;

public class customerInfo extends shoppingCart{
    public String customerName;
    public static double eWalletBalance;
    public void displayEWalletBalance(){
        System.out.println("The Balance of Customer : "+customerName+" is Rs. "+eWalletBalance);
    }
    public customerInfo(String customerName, Double eWalletBalance) {
        this.customerName = customerName;
        this.eWalletBalance = eWalletBalance;
    }
    public void checkoutShoppingCart(){
        if(eWalletBalance<total){
            System.out.println("Sufficient Balance not available");
        }
        else {
            System.out.println("******************");
            System.out.println("Checkout Process in progress : ");
            System.out.println("******************");
          double tempBalance=getEWalletBalance();
          if(total>=100){
              System.out.println("5% discount is applied");
              System.out.println("Cost before discount : "+total+" ");
              total=total-(total/20);
              System.out.println("Total Cost after discount : "+total);
              setEWalletBalance(tempBalance-total);
              shoppingCart.cartList.clear();
              total=0;
              System.out.println("******************");
          }
          else {
              setEWalletBalance(tempBalance-total);
              shoppingCart.cartList.clear();
              total=0;

          }
        }
    }
    public String getCustomerName() {

        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public static Double getEWalletBalance() {
        return eWalletBalance;
    }

    public static void setEWalletBalance(Double eWalletBalance) {
        customerInfo.eWalletBalance = eWalletBalance;
    }
    @Override
    public String toString() {
        return "customerInfo{" +
                "customerName='" + customerName + '\'' +
                ", eWalletBalance=" + eWalletBalance +
                '}';
    }
}

