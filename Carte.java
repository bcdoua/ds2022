public class Carte {
    protected int cout;

    public Carte(int cout) {
        this.cout = cout;
    }

    public int getCout() {
        return cout;
    }

    public String toString() {
        return "Carte avec coût : " + cout;
    }
}
