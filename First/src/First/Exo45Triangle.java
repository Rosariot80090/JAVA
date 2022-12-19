package First;

import java.util.Scanner;

public class Exo45Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*Écrire un programme qui affiche un triangle isocèle formé d'étoiles.
La hauteur du triangle (c'est-à-dire son nombre de lignes) sera donnée par l'utilisateur.
        combien de lignes ?
                5
                *
               ***
              *****
             *******
            *********
 */
        int L ; //nombre de lignes pour le triangle
        System.out.print("Saisissez le nombre de lignes L : ");
        L = sc.nextInt();

        for(int i=1 ; i<=L ; i++ )
        {
            for (int j=i ; j<L; j++ )
                System.out.print(" ");

            for(int k=1; k<(i*2); k++)
                    System.out.print("*");
                System.out.print("\n");
        }
    }
}
