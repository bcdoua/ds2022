public class Terrain extends Carte {
    private char couleur;

    public Terrain(char couleur) {
        super(0); 
        this.couleur = couleur;
        System.out.println("Un nouveau terrain.");
    }

    @Override
    public String toString() {
        String nomCouleur = "";
        switch (couleur) {
            case 'B': nomCouleur = "Blanc"; break;
            case 'b': nomCouleur = "Bleu"; break;
            case 'n': nomCouleur = "Noir"; break;
            case 'r': nomCouleur = "Rouge"; break;
            case 'v': nomCouleur = "Vert"; break;
        }
        return "Un terrain " + nomCouleur;
    }
}
