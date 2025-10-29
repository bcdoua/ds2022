public class Jeu {
    private Carte[] tabCartes;
    private int nb;
    private final int MAX;

    public Jeu(int max) {
        System.out.println("On change de main");
        MAX = max;
        tabCartes = new Carte[MAX];
        nb = 0;
    }

    public void ajouter(Carte c) {
        if (nb < MAX) {
            tabCartes[nb] = c;
            nb++;
        } else {
            System.out.println("Le jeu est plein !");
        }
    }

    public void jouer() {
        System.out.println("Je joue une carte...");
        for (int i = 0; i < nb; i++) {
            if (tabCartes[i] != null) {
                System.out.println("La carte jouée est :");
                System.out.println(tabCartes[i].toString());
                tabCartes[i] = null;
                return;
            }
        }
        System.out.println("Plus de cartes à jouer !");
    }

    public void afficher() {
        for (int i = 0; i < nb; i++) {
            if (tabCartes[i] != null)
                System.out.println(tabCartes[i].toString());
        }
    }
}
