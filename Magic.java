public class Magic {
    public static void main(String[] args) {
        Jeu maMain = new Jeu(10);

        Terrain t = new Terrain('B');
        maMain.ajouter(t);

        Creature c = new Creature(6, "Gobelin", 4, 6);
        maMain.ajouter(c);

        Sortilege s = new Sortilege(1, "Amplificatum", "Il augmente la taille de l'objet ou de l'animal visé");
        maMain.ajouter(s);

        System.out.println("Là, j'ai en stock :");
        maMain.afficher();

        maMain.jouer(); 
    }
}
