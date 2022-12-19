package First;//Écrivez un programme qui affiche les nombres inférieurs à N.

import java.util.Scanner;

public class Exo41IntInfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=0;
        System.out.println("Entrez un nombre Entier n  :  ");
        n = sc.nextInt();

     {
         while (n>0)
         System.out.println(--n);
     }
    }
}