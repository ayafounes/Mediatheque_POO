public class Dvd extends Document {

    private int duree;
    private boolean emprunte;

    public Dvd(String titre, int duree) {
        super(titre);
        this.duree = duree;
        this.emprunte = false;
    }

    @Override
    public String descriptionCourte() {
        return getTitre() + " - " + duree + " min";
    }
    public void emprunte() {
        if (emprunte) {
            throw new IllegalStateException("Dvd deja emprunté");
        }
        emprunte = true;
    }
    public void retourner() {
        emprunte = false;
    }
}