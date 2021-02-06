import java.util.Scanner;

public class Customers {
    String custName;
    String custPhone;
    String custCity;
    int custBalance;

    public void setCustomerDetails()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Customer Details : ");
        System.out.println("Customer Name : ");
        custName = s.next();
        System.out.println("Customer Phone : ");
        custPhone = s.next();
        System.out.println("Customer City : ");
        custCity = s.next();
        System.out.println("Initial Balance : ");
        custBalance = s.nextInt();
    }

    public void getCustomerDetails()
    {
        System.out.println("The Customer Details are : ");
        System.out.println("Customer Name : "+custName);
        System.out.println("Customer Phone : "+custPhone);
        System.out.println("Customer City : "+custCity);
        System.out.println("Initial Balance : "+custBalance);
    }

    public void getCustomerBalance()
    {
        System.out.println("Customer Balance is : "+custBalance);
    }

}
