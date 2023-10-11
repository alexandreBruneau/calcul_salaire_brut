// calcul de salaire brut

package fr.dampierre;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // 1. Récupération du salaire brut
        Scanner clavier = new Scanner(System.in);
        System.out.println("Veuillez entrez le salaire horaire");
        double salaireHeure = clavier.nextDouble();
        // 2. Récupération du nombre d'heures travaillées
        int heureTravaillees;
        System.out.println("Veuillez entrez le nombre d'heures travaillées");
        heureTravaillees = clavier.nextInt();
        clavier.close();
        // 3. Calcul du salaire brut
        double salaireBrut = salaireHeure * heureTravaillees;
        // 4. Affichage du salaire brut
        String message = "Le salaire brut est : " + salaireBrut;
        System.out.println(message);
    }

}
