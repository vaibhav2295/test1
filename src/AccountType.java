import java.util.Scanner;

public class AccountType extends Customers{
    String accountType;
    public  void setAccountType()
    {
        setCustomerDetails();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account type : ");
        accountType = s.next();
    }

    public  void getAccountType()
    {
        getCustomerDetails();
        System.out.println("Account type : " +accountType);
    }

}
