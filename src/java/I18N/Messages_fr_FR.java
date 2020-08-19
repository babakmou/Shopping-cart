
package I18N;

import java.util.ListResourceBundle;

/**
 *
 * @author babak
 */
public class Messages_fr_FR extends ListResourceBundle {
    
    public final Object[][] contents ={
        {"message.titlesearch","Recherche"},
        {"message.titleresult","Resultats"},
        {"message.welcome","Bienvenue à MonMagasin"},
        {"message.language","Sélectionnez votre langue préférée"},
        {"language.en","Anglais"},
        {"language.fr","Francais"},
        {"button.submit","Soumettre"},
        {"message.keyword", "Je cherche "},
        {"message.price", "Prix"},
        {"message.photo", "Photo"},
        {"message.name", "Nom"},
        {"message.description", "Description"},
        {"message.by", "Par"},
        {"message.manufacturer", "Fabriquant"},
        {"message.nosearchresult", "Aucun résultat pour votre recherche!"},
        {"button.addtocart", "Ajouter au panier"},
        {"message.cart","Panier"}
        
    };

    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
