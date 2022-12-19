//Écrivez un programme qui affiche la somme des nombres inférieurs à N.
package First;

import java.util.Scanner;

public class Exo42Somme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez un nombre Entier n : ");
        int n = sc.nextInt();

        int j = 0;

        for(int i=1; i<n; i++){
            j=j+i;
        }
        System.out.println("La somme des " + n + " premiers nombres est  :  " +j);
    }

}