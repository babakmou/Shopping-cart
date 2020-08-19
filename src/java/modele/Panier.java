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
public class Panier extends ArrayList<Produit> {

    private static Panier instance;

    private Panier() {
    }

    public static Panier getInstance() {
        if (instance == null) {
            instance = new Panier();
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
