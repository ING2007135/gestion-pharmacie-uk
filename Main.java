import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner clavier = new Scanner(System.in);

        Pharmacie pharmacie = new Pharmacie();

        int choix;

        do {

            System.out.println("\n===========================================");

            System.out.println();

            System.out.println("            GESTION PHARMACIE");

            System.out.println();

            System.out.println("===========================================");

            System.out.println();

            System.out.println("          1. Ajouter medicament");

            System.out.println();

            System.out.println("          2. Afficher medicaments");

            System.out.println();

            System.out.println("                3. Vente");

            System.out.println();

            System.out.println("               4. Quitter");

            System.out.println();

            System.out.println("===========================================");

            System.out.println();

            System.out.print("                Votre choix : ");

            choix = clavier.nextInt();

            System.out.println();




            switch(choix) {

                case 1:

                    clavier.nextLine();

                    System.out.print("        Nom      : ");

                    String nom = clavier.nextLine();

                    System.out.print("        Prix     : ");

                    double prix = clavier.nextDouble();

                    System.out.print("        Quantite : ");

                    int quantite = clavier.nextInt();

                    Medicament m =

                        new Medicament(nom, prix, quantite);

                    pharmacie.ajouter(m);

                    break;

                case 2:

                    pharmacie.afficherTous();

                    break;

                case 3:

                    clavier.nextLine();

                    System.out.print("    Nom du medicament : ");

                    String nomMed = clavier.nextLine();

                    System.out.print("    Quantite a vendre : ");

                    int qte = clavier.nextInt();

                    pharmacie.vendre(nomMed, qte);

                    break;

                case 4:

                    System.out.println("Merci d'avoir utilise le programme.");
                    break;

                default:

                    System.out.println("Choix invalide, réessayez !");
            }

        } while(choix != 4);

        clavier.close();
    }
}
