package entite;
// Generated 13-May-2020 11:29:20 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Commande generated by hbm2java
 */
@Entity
@Table(name="COMMANDE"
    ,schema="DEMO"
)
public class Commande  implements java.io.Serializable {


     private int id;
     private Client client;
     private Date dateCommande;
     private Date dateLivraison;
     private BigDecimal prixTotal;
     private String etat;
     private Set<Paiement> paiements = new HashSet<Paiement>(0);
     private Set<Lignecommande> lignecommandes = new HashSet<Lignecommande>(0);

    public Commande() {
    }

	
    public Commande(int id, Date dateCommande, BigDecimal prixTotal) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.prixTotal = prixTotal;
    }
    public Commande(int id, Client client, Date dateCommande, Date dateLivraison, BigDecimal prixTotal, String etat, Set<Paiement> paiements, Set<Lignecommande> lignecommandes) {
       this.id = id;
       this.client = client;
       this.dateCommande = dateCommande;
       this.dateLivraison = dateLivraison;
       this.prixTotal = prixTotal;
       this.etat = etat;
       this.paiements = paiements;
       this.lignecommandes = lignecommandes;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=5, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CLIENT")
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_COMMANDE", nullable=false, length=7)
    public Date getDateCommande() {
        return this.dateCommande;
    }
    
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DATE_LIVRAISON", length=7)
    public Date getDateLivraison() {
        return this.dateLivraison;
    }
    
    public void setDateLivraison(Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    
    @Column(name="PRIX_TOTAL", nullable=false, precision=8)
    public BigDecimal getPrixTotal() {
        return this.prixTotal;
    }
    
    public void setPrixTotal(BigDecimal prixTotal) {
        this.prixTotal = prixTotal;
    }

    
    @Column(name="ETAT", length=30)
    public String getEtat() {
        return this.etat;
    }
    
    public void setEtat(String etat) {
        this.etat = etat;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="commande")
    public Set<Paiement> getPaiements() {
        return this.paiements;
    }
    
    public void setPaiements(Set<Paiement> paiements) {
        this.paiements = paiements;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="commande")
    public Set<Lignecommande> getLignecommandes() {
        return this.lignecommandes;
    }
    
    public void setLignecommandes(Set<Lignecommande> lignecommandes) {
        this.lignecommandes = lignecommandes;
    }




}

