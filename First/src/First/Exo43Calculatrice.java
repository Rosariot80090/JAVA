package First;

import java.util.Scanner;

import static java.lang.System.*;

public class Exo43Calculatrice {
    public static void main (String[] args) {
        Scanner sc = new Scanner(in);


        double a ;
        System.out.print("Entrer un nombre a  :  ");
        a = sc.nextDouble();

        System.out.print("Entrer l'opérateur :  ");
        String var = sc.next();

        double b ;
        System.out.print("Entrer un nombre b  :  ");
        b = sc.nextDouble();

        switch (var){
            case "/":
                if(b==0){
                    System.out.print("Erreur : le diviseur b doit être différent de ZERO !!");
                }else {
                    System.out.print("Le quotient est : " + (a / b));
                }
                break;
            case "*":
                System.out.print("Le produit est : "+(a*b));
                break;
            case "+":
                System.out.print("La somme est : "+(a+b));
                break;
            case "-":
                System.out.print("La différence est : "+(a-b));
                break;
            default:
                System.out.print("Erreur : Opérateur inconnu !!!");
        }
        }
    }