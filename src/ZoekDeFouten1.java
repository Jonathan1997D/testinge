import java.util.Scanner;

public class ZoekDeFouten1
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int number1=0;          // eerste getal om op te tellen
        int number2=0;          // tweede getal om op te tellen
        int sum;              // som van number1 en number2

        System.out.print("Enter first integer: "); // prompt 
        number1 = input.nextInt(); // leest eerste getal van de gebruiker
        System.out.print("Enter second integer: "); // prompt 
        number2 = input.nextInt(); // leest tweede getal van de gebruiker

        sum = number1 + number2; // de getallen optellen
        
        System.out.printf("Sum is %d%n", sum); // de som weergeven
        
    }
}
