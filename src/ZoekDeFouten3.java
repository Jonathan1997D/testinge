/* In deze applicatie wordt de constante PI uit de klasse Math gebruikt.
* Indien de waarde van de variabele 4 is, dan komt op het scherm een 
* foutboodschap.
*/
public class ZoekDeFouten3
{

    public static void main(String[] args)
    {
        int getal = (int) Math.PI;

        System.out.println(getal);
        System.out.println(Math.PI);
        
        if(getal == 4)
            System.out.println("Er is iets fout gebeurd!");
    }
}
