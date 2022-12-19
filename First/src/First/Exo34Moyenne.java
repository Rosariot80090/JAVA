/*Il s’agit de calculer une moyenne sur la base de trois notes sachant que :

        une note de devoir surveillé a un coefficient de 3
        une note d’interrogation écrite a un coefficient de 2
        une note de travaux pratique a un coefficient de 1

 */
package First;

import java.util.Scanner;
public class Exo34Moyenne
{
    public static void main (String[] args)
    {
    //Saisie des notes au clavier
        Scanner sc = new Scanner(System.in);

       /*Déclaration des coefficients en constantes*/
        int c1 = 3;
        int c2 = 2;
        int c3 = 1;
        int somcoef=c1+c2+c3;

        //Invite à la saisie des notes
        double ds = 0.0;   /*devoir surveillé*/
        System.out.println("Entrez la note du Devoir Surveillé");
        ds = sc.nextDouble();

        double ie = 0.0;   /*interrogation écrite*/
        System.out.println("Entrez la note interrogation écrite");
        ie = sc.nextDouble();

        double tp = 0.0;   /* travaux pratiques*/
        System.out.println("Entrez la note des travaux pratiques");
        tp = sc.nextDouble();

        /*résultat intermédiaire*/
        double r1 = (double) c1 * ds;
        double r2 = (double) c2 * ie;
        double r3 = (double) c3 * tp;
        double somenote = r1+r2+r3;

        System.out.println("La moyenne de l'élève est  " + (somenote/somcoef));

    }
}