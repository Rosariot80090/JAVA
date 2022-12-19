/* --------Diviseur
Modifier le programme Additionneur pour effectuer une division */
package First;

import java.util.Scanner;

public class Exo32Diviseur
{
      public static void main (String[] args)

    {
        Scanner clavier = new Scanner(System.in);//entrée des données dans le system au clavier
        
        int nX = 0, nY = 1;

        System.out.println("Entrez la dividande X ");//Affiche à l'écran
        nX = clavier.nextInt();//recueille le nombre

        System.out.println("Entrez le diviseur Y ");
        nY = clavier.nextInt();
        
        if(nY!=0){
            System.out.println("Le diviseur doit être différent de ZERO");
        }else{
            System.out.println("Veuillez ressaisir un diviseur différent de ZERO");
            nY = clavier.nextInt();
        }
        if(nY!=0){
            System.out.println("Le résultat de la division est " + (nX/nY));
        }

    }  
        
}
