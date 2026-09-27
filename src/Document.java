
public abstract class Document implements Comparable<Document>{

    private String titre;

    public Document(String titre) {
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public abstract String descriptionCourte();

    public int compareTo(Document document) {
        return this.titre.compareTo(document.titre);
    }
}
