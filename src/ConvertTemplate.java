import java.util.Scanner;

public class ConvertTemplate
{
    public static void main(String[] args)
    {
        boolean i=true;
        while (i)
        {
            HomePage();
            getChoice();
        }
    }

    public static void HomePage()
    {
        System.out.print("\n\n");
        System.out.println("MENU");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
    }

    public static void getChoice()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();

        switch (choice)
        {
            case 1:
                FahrenheitToCelsius();
                break;
            case 2:
                CelsiusToFahrenheit();
                break;
            case 0:
                Exit();
                break;
            default:
                System.out.print("ERROR!!!");
                break;
        }
    }

    public static void FahrenheitToCelsius()
    {
        double valueF, valueC;
        System.out.printf("Enter a number: ","\n");
        valueF=setInputValue();
        valueC=(5.0/9)*(valueF-32);
        System.out.print("Fahrenheit to Celsius: "+valueC);
    }

    public static void CelsiusToFahrenheit()
    {
        double valueF, valueC;
        System.out.printf("Enter a number: ","\n");
        valueC=setInputValue();
        valueF=(9.0/5)*(valueC+32);
        System.out.print("Celsius to Fahrenheit: "+valueF);
    }

    public static double setInputValue()
    {
        double input;
        Scanner sc=new Scanner(System.in);
        input=sc.nextDouble();
        return input;
    }

    public static void  Exit()
    {
        System.exit(0);
    }

}
