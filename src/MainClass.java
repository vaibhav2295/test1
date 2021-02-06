import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Starting Customer Banking Services");
        Scanner s = new Scanner(System.in);

        System.out.println("Please select an option : ");
        System.out.println("1. Open customer account and perform transactions ");
        System.out.println("2. Take services FD/PPF ");
        System.out.println("3. Exit ");
        int choice = s.nextInt();
        if(choice == 1) {
                AccountTransactions at = new AccountTransactions();
            at.setAccountType();
            at.getAccountType();
            at.setTrxChoice();
            at.getCustomerBalance();
        }
        else if(choice == 2)
        {
            AccountServices as = new AccountServices();
            as.setCustomerDetails();
            as.showServices();
            as.getCustomerDetails();
            as.showCustServices();
        }
        System.out.println("Exiting from Customer Banking Services");
    }
}
