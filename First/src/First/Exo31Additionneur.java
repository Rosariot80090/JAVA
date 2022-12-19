package First;

import java.util.Scanner;
public class Exo31Additionneur {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);//entrée des données dans le system au clavier
        
        int nX = 0, nY = 0;

        System.out.println("Entrez votre premier nombre X ");//Affiche à l'écran
        nX = clavier.nextInt();//recueille le nombre

        System.out.println("Entrez votre deuxieme nombre Y ");
        nY = clavier.nextInt();

        System.out.println("la somme est de" + (nX+nY));
    }
}
