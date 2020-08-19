/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import entite.Produit;
import java.util.ArrayList;

/**
 *
 * @author babak
 */
public class Commande extends ArrayList<Produit> {

    private static Commande instance;

    private Commande() {
    }

    public static Commande getInstance() {
        if (instance == null) {
            instance = new Commande();
        }
        return instance;
    }
    
    public static void ajouterAuPanier(Produit produit){
        instance.add(produit);
    }
    public static void supprimerDuPanier(Produit produit){
        instance.remove(produit);
    }
    public static int getNbrItems(){
        return instance.size();
    }

}
