import java.util.ArrayList;
import java.util.List;

public class Catalogue <T extends Document>{
    private List<T> documents= new ArrayList<T>();

    public void ajouter(T document){
        documents.add(document);
    }
    public T rechercherParTitre(String titre){
        for(T document: documents){
            if(document.getTitre().equals(titre)){
                return document;
            }
        }
        return null;
    }
    public void afficher(){
        for(T document: documents){
            System.out.println(document.getTitre());
        }
    }
    public static <T extends Comparable<T>> T max(List<T> liste){
        T max = liste.get(0);
        for(T document: liste){
            if(document.compareTo(max)>0){
                max = document;
            }
        }
        return max;
    }
}
