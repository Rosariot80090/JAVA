package First;

import java.util.Scanner;

/*Écrivez un programme qui demande un nombre à l’utilisateur puis qui test si ce nombre est pair.
        Le programme doit afficher le résultat « nombre pair » ou « nombre impair ».
        Vous devez utiliser l’opérateur modulo « % » qui donne le reste d’une division.
        a%2 donne le reste de la division de  a par 2, si ce reste est égal à zéro, a est divisible par 2. */
public class Exo41Parite
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int nX = sc.nextInt();

        if(nX%2==0)
        {
            System.out.println(+nX+" est un nombre pair");
        }
        else
        {
            System.out.println(+nX+" est un nombre impair");
        }
    }
}