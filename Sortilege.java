public class Sortilege extends Carte {
    private String nom;
    private String explication;

    public Sortilege(int cout, String nom, String explication) {
        super(cout);
        this.nom = nom;
        this.explication = explication;
        System.out.println("Un sortilège de plus");
    }

    @Override
    public String toString() {
        return "Un sortilège " + nom;
    }
}
