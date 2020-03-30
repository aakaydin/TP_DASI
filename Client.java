package fr.insalyon.dasi.metier.modele;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DASI Team
 */
@Entity
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    protected String nom;
    protected String prenom;
    protected String adresse; 
    //@Column(unique = true)
    protected String numeroTel;
    protected String mail;
    protected String motDePasse;
    protected Date dateDeNaissance;
    protected boolean connected;
        
    
    protected Client() {
    }

    public Client(String nom, String prenom, String adresse, String numeroTel, String mail, String motDePasse, Date dateDeNaissance, boolean connected) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.numeroTel = numeroTel;
        this.mail = mail;
        this.motDePasse = motDePasse;
        this.dateDeNaissance = dateDeNaissance;
        this.connected = connected;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public String getMail() {
        return mail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", numeroTel=" + numeroTel + ", mail=" + mail + ", motDePasse=" 
                + motDePasse + ", dateDeNaissance=" + dateDeNaissance.DAY_OF_MONTH + "/"+ dateDeNaissance.MONTH + "/"+ dateDeNaissance.MONTH + ", connected=" + connected + '}';
    }

    
    

}
