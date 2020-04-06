package fr.insalyon.dasi.metier.modele;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author untra
 */
@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    @Column(unique=true)
    private String mail;
    private String mdp;
    private String numeroTel;
    @Temporal(TemporalType.DATE)
    private Calendar dateDeNaissance;
    private boolean genre; //true stands for male, false stands for female
    private int nbrConsultation=0;
    private boolean connected=false;

    protected Employe(){
        
    }
    
    public Employe(String nom, String prenom, String mail, String numeroTel, String mdp,int year,int month, int day,boolean genre){
        this.nom=nom;
        this.prenom=prenom;
        this.mail=mail;
        this.mdp=mdp;
        this.genre=genre;
        this.numeroTel=numeroTel;
        Calendar cal=new GregorianCalendar(year+1900,month,day);
        this.dateDeNaissance=cal;
        //this.dateDeNaissance=cal.getTime();
        
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Calendar getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Calendar dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public boolean isGenre() {
        return genre;
    }

    public void setGenre(boolean genre) {
        this.genre = genre;
    }

    public int getNbrConsultation() {
        return nbrConsultation;
    }

    public void setNbrConsultation(int nbrConsultation) {
        this.nbrConsultation = nbrConsultation;
    }
    @Override
    public String toString(){
         return "Employe{" + "nom=" + nom + ", prenom=" + prenom + ",  numeroTel=" + numeroTel + ", mail=" + mail + ", motDePasse=" 
                + mdp + ", dateDeNaissance=" + dateDeNaissance.get(Calendar.DAY_OF_MONTH) + "/"+ dateDeNaissance.get(Calendar.MONTH) + "/"+ (dateDeNaissance.get(Calendar.YEAR) - 1900) + ", connected=" + connected + '}';
    }
}
