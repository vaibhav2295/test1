import java.util.Scanner;

public class AccountTransactions extends  AccountType{
    int trxAmount;
    Scanner s = new Scanner(System.in);
    public  void setTrxChoice()
    {
        int choice = 0;
        do {
            System.out.println("Which transaction you want to perform : ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    DepositAmount();
                    break;
                case 2:
                    WithdrawAmount();
                    break;
                case 3:
                    getCustomerBalance();
                    break;
            }
        }while(choice != 4);
    }

    public void DepositAmount()
    {
        System.out.println("Enter the amount to deposit");
        trxAmount = s.nextInt();
        custBalance = custBalance + trxAmount;
        System.out.println("Amount is deposited successfully");
    }
    public void WithdrawAmount()
    {
        int custAmount = custBalance;
        System.out.println("Enter the amount to withdraw");
        trxAmount = s.nextInt();
        custBalance = custBalance - trxAmount;
        if (custBalance <= 0)
        {
            System.out.println("The requested amount can not be withdrawn due to insufficient balance in your account");
            custBalance = custAmount;
        }
        else
        {
            System.out.println("Amount is withdrawn successfully");
        }
    }
}
