package First;

import java.util.Scanner;

/*En réponse votre programme doit afficher l’âge de l’utilisateur et indiquer si l’utilisateur est majeur ou mineur */
public class Exo42Age
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);

        int age=1;
        System.out.print("Entrez un age :  ");
        age = sc.nextInt();

        if (age<=0)
        {
            System.out.print(" Vous n'êtes pas encore né !!!");
        }
        if (age>0 && age<=18)
        {
            System.out.print(" Vous êtes Mineur");
        }
        if (age>18 && age<150)
        {
            System.out.print(" Vous êtes Majeur");
        }
        if (age>150)
        {
            System.out.print(" Vous êtes DIEU");
        }
    }
}