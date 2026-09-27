public class BibliothequeTest {
    void testEmpruntNormal() {
        Livre l =new Livre("ABC","Tom");
        l.emprunter();
        System.out.println("Emprunt effectué correctement");
    }
    void testDoubleEmprunt() {
        Livre l=new Livre("ABC","Tom");
        l.emprunter();
        try {
            l.emprunter();

            System.out.println("Erreur : le double emprunt a été accepté");
        }
        catch (IllegalStateException e) {
            System.out.println("Test réussi : double emprunt refusé");
        }
    }
    void testRechercheInfructueuse() {
        Catalogue<Livre> catalogue = new Catalogue<>();
        Livre l =new Livre("ABC","Tom");
        catalogue.ajouter(l);
        Livre res= catalogue.rechercherParTitre("ABC");
        if (res == null) {
            System.out.println("Test réussi : livre non trouvé");
        }
        else {
            System.out.println("Erreur : un livre a été trouvé");
        }

    }
}
