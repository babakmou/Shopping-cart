package entite;
// Generated 13-May-2020 11:29:20 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * UtilisateurWeb generated by hbm2java
 */
@Entity
@Table(name="UTILISATEUR_WEB"
    ,schema="DEMO"
)
public class UtilisateurWeb  implements java.io.Serializable {


     private int id;
     private String adresseIp;
     private String userAgent;
     private Set<Client> clients = new HashSet<Client>(0);

    public UtilisateurWeb() {
    }

	
    public UtilisateurWeb(int id, String adresseIp, String userAgent) {
        this.id = id;
        this.adresseIp = adresseIp;
        this.userAgent = userAgent;
    }
    public UtilisateurWeb(int id, String adresseIp, String userAgent, Set<Client> clients) {
       this.id = id;
       this.adresseIp = adresseIp;
       this.userAgent = userAgent;
       this.clients = clients;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false, precision=5, scale=0)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="ADRESSE_IP", nullable=false, length=30)
    public String getAdresseIp() {
        return this.adresseIp;
    }
    
    public void setAdresseIp(String adresseIp) {
        this.adresseIp = adresseIp;
    }

    
    @Column(name="USER_AGENT", nullable=false, length=80)
    public String getUserAgent() {
        return this.userAgent;
    }
    
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="utilisateurWeb")
    public Set<Client> getClients() {
        return this.clients;
    }
    
    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }




}


