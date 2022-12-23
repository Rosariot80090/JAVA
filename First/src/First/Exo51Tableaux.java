package First;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

/*
Exercice 1
Écrivez un programme permettant de créer un tableau, dont la taille est saisie au clavier.
Ensuite l'utilisateur doit rentrer les différentes valeurs du tableau.
Puis votre programme doit afficher le contenu du tableau.
 */
public class Exo51Tableaux {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] tab = new int[5];
        tab[0] = 15;
        tab[1] = 30;
        tab[2] = 23;
        tab[3] = 14;
        tab[4] = 13;

        for (int i = 0; i < 5; i++) {
            System.out.println(tab[i]);
        }
    }
}