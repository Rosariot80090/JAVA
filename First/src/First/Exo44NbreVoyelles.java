package First;
/*Écrire le programme qui compte le nombre de voyelles d’un mot saisi au clavier, en utilisant :

    length() qui rend le nombre de lettres d’une chaîne donnée ([documentation]
    (https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#length())).

    substring(p,n) qui extrait d’une chaîne donnée une sous chaîne de n caractères
    à partir de la position p (documentation).

    .charAt() qui extrait le caractère à l'indice demandé (documentation)

    IndexOf(chaîne) qui restitue le rang de la première occurrence de schaîne dans chaîne donnée
     (si non trouvé : -1) (documentation).
*/

import java.util.Scanner;
public class Exo44NbreVoyelles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int longueur = 0;
        int nombreDeVoyelles = 0;
        String mot ="";

        System.out.println("Entrer un mot : ");
        mot = sc.next();

        longueur = mot.length();

        for(int i=0; i<mot.length(); i++)
        {
            if(mot.charAt(i)=='a' || mot.charAt(i)=='e' ||
               mot.charAt(i) =='i' || mot.charAt(i) =='o' ||
               mot.charAt(i)=='u' || mot.charAt(i)=='y')
            {
                nombreDeVoyelles++;
            }
        }
        System.out.println("Le nombre de voyelles dans le mot " +mot + " est de "+ nombreDeVoyelles);
    }
}
