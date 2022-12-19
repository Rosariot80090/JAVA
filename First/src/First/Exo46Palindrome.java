package First;

import java.util.Scanner;

/*Ecrivez un programme Palindrome.java qui lit une chaine de caractères
 du clavier et qui teste s'il s'agit d'un palindrome.
 Exemple d'exécution: Entrez un mot ou une phrase :
  Otto C'est un palindrome !
 Pour ce programme, il convient d'utiliser plusieurs méthodes prédéfinies
  de la classe String, comme par exemple charAt(), toLowerCase()
  et length(). chaine.toLowerCase() permet de convertir
  tous les caractères de chaine en minuscule.
*/
public class Exo46Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saisissez un mot :  ");
        String mot = sc.nextLine();
        String Pal = mot.toLowerCase();//Converti tout en minuscule

        if (mot) {
            System.out.println(Pal +"  est un Palindrome");
        }else{
            System.out.println(Pal +"  n'est un Palindrome");
        }
       for (int i=0; i<Pal.length();i++){
        boolean Pal = true;

    }
}
