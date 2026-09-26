import java.util.ArrayList;
import java.util.List;

public class Catalogue <T extends Document>{
    private List<T> documents= new ArrayList<T>();

    public void ajouter(T document){
        documents.add(document);
    }
    public T rechercherParTitre(String titre){
        for(T document: documents){
            if(document.getTitre().equals(titre)){}
        }
        return null;
    }
    public void afficher(){
        for(T document: documents){
            System.out.println(document.getTitre());
        }
    }
}
