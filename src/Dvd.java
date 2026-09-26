public class Dvd extends Document {

    private int duree;

    public Dvd(String titre, int duree) {
        super(titre);
        this.duree = duree;
    }

    @Override
    public String descriptionCourte() {
        return getTitre() + " - " + duree + " min";
    }
}