package First;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            System.out.println("Entrez votre nom :");
            Scanner sc = new Scanner(System.in);
            String nom = sc.next();
            System.out.println("Bonjour  "+nom);
    }
}