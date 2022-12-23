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

        if (estUnPalindrome(mot)) {
            System.out.println("le mot est un palindrome");
        } else
            System.out.println("le mot n'est pas un palindrome");
    }
public static Boolean estUnPalindrome(String mot) {
        boolean palindrome = true;

        for(int i=0; i<mot.length(); i++) {
            if(mot.charAt(i) != mot.charAt(mot.length() - 1 - i))
                palindrome = false;
        }
        return palindrome;
    }
}
