import java.util.Scanner;

public class AccountServices extends  Customers{
    Scanner  s = new Scanner(System.in);
    String serviceType;
    int serviceAmount;
    int tenure;
    public void showServices()
    {
        int choice =0;
        do {
        System.out.println("The services offered are : ");
        System.out.println("1. Open Fixed Deposit");
        System.out.println("2. Open PPF Account");
        System.out.println("3. Exit");
        choice = s.nextInt();
        switch (choice)
        {
            case 1:
                OpenFD();
                break;
            case 2:
                OpenPPF();
                break;
        }
        }while(choice != 3);
    }

    public void  OpenFD()
    {
        serviceType = "Fixed Deposit";
        System.out.println("Enter FD Amount ");
       serviceAmount = s.nextInt();
        System.out.println("Enter tenure ");
        tenure = s.nextInt();
        System.out.println("Fixed Deposit account opened successfully ");
    }

    public void  OpenPPF()
    {
        serviceType = "PPF Account";
        System.out.println("Enter Initial Amount to open PPF account ");
        serviceAmount = s.nextInt();
        tenure = 15;
        System.out.println("PPF account opened successfully ");
    }

    public void  showCustServices()
    {
        System.out.println("Service taken : " + serviceType);
        System.out.println("Amount : " + serviceAmount);
        System.out.println("Tenure : " + tenure);
    }
}
