
import java.util.Scanner;

public class ZoekDeFouten2
{
    public static void main (String[] arg)
    {
        Scanner input = new Scanner(System.in);
        int getal1,getal2;
        
        System.out.print("Geef eerste getal: "); // prompt 
        getal1 = input.nextInt(); // leest eerste getal van de gebruiker
        System.out.print("Geef tweede getal: "); // prompt 
        getal2 = input.nextInt(); // leest tweede getal van de gebruiker
        
        if(getal1%getal2==0)
            System.out.printf("%d is een veelvoud van %d",getal1,getal2);
    }

}
