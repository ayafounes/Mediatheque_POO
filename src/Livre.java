public class Livre extends Document implements Empruntable{

    private String auteur;
    private Boolean emprunte;

    public Livre(String titre, String auteur) {
        super(titre);
        this.auteur = auteur;
        this.emprunte = false;
    }
    public boolean getEmprunt() {
        return emprunte;
    }

    @Override
    public String descriptionCourte() {
        return getTitre() + " - " + auteur;
    }

    @Override
    public void emprunter() {
        if (emprunte) {
            throw new IllegalStateException ("Livre déja  emprunté");
        }
        emprunte = true;

    }

    @Override
    public void retourner() {
        emprunte = false;
    }
}