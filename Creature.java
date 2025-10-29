public class Creature extends Carte {
    private String nom;
    private int degats;
    private int vie;

    public Creature(int cout, String nom, int degats, int vie) {
        super(cout);
        this.nom = nom;
        this.degats = degats;
        this.vie = vie;
        System.out.println("Une nouvelle créature.");
    }

    @Override
    public String toString() {
        return "Une créature " + nom + " " + degats + "/" + vie;
    }
}
