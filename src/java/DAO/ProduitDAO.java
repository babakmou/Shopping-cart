/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import control.NewHibernateUtil;
import entite.Produit;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author babak
 */
public class ProduitDAO {

    static SessionFactory sessionFactory = null;
    static Session session = null;

    /**
     *
     * @param motCle
     * @param prixMin
     * @param prixMax
     * @param fabriquant
     * @return
     */
    public static List<Object[]> getResultat(String[] motCle, double prixMin, double prixMax, String fabriquant) {

        sessionFactory = NewHibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Criteria cr = session.createCriteria(Produit.class);

        if (motCle.length == 1) {
            cr.add(Restrictions.ilike("nom", motCle));
        } else {
            LogicalExpression nomOrExp = Restrictions.or(Restrictions.ilike("nom", "%" + motCle[0] + "%"),
                    Restrictions.ilike("nom", "%" + motCle[1] + "%"));

            for (int i = 2; i < motCle.length; i++) {
                nomOrExp = Restrictions.or(Restrictions.ilike("nom", "%" + motCle[i] + "%"), nomOrExp);
            }
        }

        cr.add(Restrictions.ge("prix", prixMin));
        cr.add(Restrictions.le("prix", prixMax));
        cr.add(Restrictions.ilike("fabriquant", "%" + fabriquant + "%"));

        List<Object[]> liste = cr.list();
        session.close();
        return liste;
    }

    /**
     *
     * @param id
     * @return
     */
    public static Produit get(int id) {
        sessionFactory = NewHibernateUtil.getSessionFactory();
        session = sessionFactory.openSession();
        Produit produit = (Produit) session.get(Produit.class, id);
        session.close();
        return produit;
    }

}
