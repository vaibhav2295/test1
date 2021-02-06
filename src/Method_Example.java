import java.util.Scanner;

public class Method_Example {
    int a;
    int b;
    public  Method_Example(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    void multiple_values(int ... val)
    {
        System.out.println("Values passed are :");
        for (int i=0 ; i<val.length; i++)
        {
            System.out.println("Val : " +val[i]);
        }
    }
    int addition()
    {
        return a+b;
    }
    int subtraction()
    {
        return a-b;
    }
    int multiplication()
    {
        return a*b;
    }
    float division()
    {
        return (float)a/b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int val1 = s.nextInt();
        System.out.println("Enter second number : ");
        int val2 = s.nextInt();
        int choice;
        Method_Example me = new Method_Example(val1,val2);
        me.multiple_values(1,2,4,6,7,8,4,21,98);
        do {
            System.out.println("Enter your choice : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            choice = s.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("The addition is : "+ me.addition());
                    break;
                case 2:
                    System.out.println("The subtraction is : "+ me.subtraction());
                    break;
                case 3:
                    System.out.println("The multiplication is : "+ me.multiplication());
                    break;
                case 4:
                    System.out.println("The division is : "+ me.division());
                    break;
            }
        }while(choice != 5);
        System.out.println("Exiting the program");
    }
}
