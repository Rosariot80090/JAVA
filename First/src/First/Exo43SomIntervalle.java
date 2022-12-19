package First;
/*Écrivez un programme qui saisit deux nombres n1 et n2
et qui calcul ensuite la somme des entiers de n1 à n2.
 */
import java.util.Scanner;
public class Exo43SomIntervalle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        System.out.println("Entrer un nombre n1 :  ");
        n1 = sc.nextInt();

        int n2 = 0;
        System.out.println("Entrer un nombre n2 :  ");
        n2 = sc.nextInt();

        int j = 0;

        for (int i = (n1+1); i < n2; i++) {
            j = j + i;
        }
        System.out.println("La somme dans l'intervalle n1 et n2 est  :  " +j);
    }
}
