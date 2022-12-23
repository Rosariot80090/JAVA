package First;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Exo52Tableaux {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
On recherche dans un tableau contenant 20 prénoms, un prénom saisi au clavier.
Lorsque cet élément est trouvé, on l’élimine du tableau en décalant les cases qui le suivent,
et en mettant à blanc la dernière case
 */

        ArrayList<String> tab = new ArrayList<String>();
        tab.add("Emma ");    //0
        tab.add("Louise ");  //1
        tab.add("Ambre ");   //2
        tab.add("Lina ");    //3
        tab.add("Rose ");    //4
        tab.add("Chloé ");   //5
        tab.add("Mia ");     //6
        tab.add("Léa ");     //7
        tab.add("Anna ");    //8
        tab.add("Lisa ");    //9
        tab.add("Julia ");   //10
        tab.add("Romy ");    //11
        tab.add("Lilou ");   //12
        tab.add("Inès ");    //13
        tab.add("Léonie ");  //14
        tab.add("Jeanne ");  //15
        tab.add("Zoé ");     //16
        tab.add("Iris ");    //17
        tab.add("Lola ");    //18
        tab.add("Adèle ");   //19

        System.out.println(tab);

        System.out.print("Element à rechercher et à supprimer: ");
        String var=sc.nextLine();

        if(tab.contains(var)) {
            System.out.println("Le prénom existe dans le tableau");
            tab.remove(var);
            tab.add("  ");
        }else{
            System.out.println("Le prénom n'existe pas dans le tableau");
        }
        /*Ecrire un programme qui permet de trier un tableau en utilisant le tri à bulles.*/
        System.out.println(tab);{
            Collections.sort(tab);

            for (String i : tab){
                System.out.print(i);
            }
        }
    }
}
