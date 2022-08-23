package capstoneShoppingCart;

public class customerInfo extends shoppingCart{
    public String customerName;

    public static int eWalletBalance;

    public void displayEWalletBalance(){
        System.out.println("The Balance of Customer : "+customerName+" is Rs. "+eWalletBalance);
    }
    public customerInfo(String customerName, int eWalletBalance) {
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
          int tempBalance=geteWalletBalance();
          if(total>=100){
              System.out.print("Cost before discount "+total+" ");
              total=total-(total/20);
              System.out.println(" Cost after discount "+total);

              seteWalletBalance(tempBalance-total);
              shoppingCart.cartList.clear();
              total=0;
          }
          else {
              seteWalletBalance(tempBalance-total);
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

    public static int geteWalletBalance() {

        return eWalletBalance;
    }

    public static void seteWalletBalance(int eWalletBalance) {
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
