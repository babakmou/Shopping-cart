
package I18N;

import java.util.ListResourceBundle;

/**
 *
 * @author babak
 */
public class Messages_en_CA extends ListResourceBundle {

    public final Object[][] contents ={
        {"message.titlesearch","Search"},
        {"message.titleresult","Results"},
        {"message.welcome","Welcome to MonMagasin"},
        {"message.language","Select Your Preferred Language"},
        {"language.en","English"},
        {"language.fr","French"},
        {"button.submit","Submit"},
        {"message.keyword", "I am looking for "},
        {"message.price", "Price"},
        {"message.photo", "Photo"},
        {"message.name", "Name"},
        {"message.description", "Description"},
        {"message.by", "By"},
        {"message.manufacturer", "Manufacturer"},
        {"message.nosearchresult", "No results for your seach!"},
        {"button.addtocart", "Add to Cart"},
        {"message.cart","Cart"}
    };
    
    @Override
    protected Object[][] getContents() {
        return contents;
    }
    
}
