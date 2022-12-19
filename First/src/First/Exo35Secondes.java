/*II s'agit pour un nombre de secondes entré au clavier d'en déduire,
son expression en nombre d'heures de minutes et de secondes.*/

package First;

import java.util.Scanner;

public class Exo35Secondes
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sec = 0;
        int min = 0;
        int hre = 0;

        //Saisie d'un nombre de secondes

        System.out.println("Entrer un nombre de secondes supérieur à 60");
        sec = sc.nextInt();

        hre = sec / 3600;
        sec = sec % 3600;

        min = sec / 60;
        sec = sec /60;

        if(hre!=0)
        {
            System.out.print(hre + "  heures  ");
        }
        if(min!=0)
        {
            System.out.print(min + "  minutes  ");
        }
        if(sec!=0)
        {
            System.out.print(sec + "  secondes  ");
        }
    }
}