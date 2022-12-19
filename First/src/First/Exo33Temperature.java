/* Conversion de temperature
  En utilisant la formule C = (5/9)(F-32) écrire un programme qui lit une temperature exprimée en degrés Fahrenheit
  et affiche sa valeur en degrés Celsius.
 */

package First;
import java.util.Scanner;
public class Exo33Temperature
    {
    public static void main(String[] args)
        {
            //Entrée dans le system les données au clavier.
            Scanner clavier = new Scanner(System.in);
            // déclaration variable d'entrée
            double fahrenheit  = 0.0;
            // variable convertie de sortie
            double celcius = 0.0;

            System.out.println("Entrez vos degrés Fahrenheit   ");
            //Stockage de la saisie dans la variable
            fahrenheit = clavier.nextDouble();
            //Formule de conversion de Fahrenheit en Celsius
            celcius = 5/9.0*(fahrenheit-32);

            System.out.println( fahrenheit  + " degrés Fahrenheit a pour valeur  " + celcius + " degrés Celsius ");
        }

    }