
package First;/*Écrire un programme qui saisit un code Unicode en décimal et affiche le caractère correspondant.
        Exemple : la saisie de l’entier 65 donne le caractère « A ».*/

import java.util.Scanner;

public class Exo36ASCII
{
    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer un Unicode");
        char convert = (char)sc.nextInt();

        System.out.println("La valeur Ascii est :  "+convert+"");


    }
}