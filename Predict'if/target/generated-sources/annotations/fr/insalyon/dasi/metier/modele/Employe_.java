package fr.insalyon.dasi.metier.modele;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-06T16:02:55")
@StaticMetamodel(Employe.class)
public class Employe_ { 

    public static volatile SingularAttribute<Employe, Calendar> dateDeNaissance;
    public static volatile SingularAttribute<Employe, Boolean> connected;
    public static volatile SingularAttribute<Employe, Integer> nbrConsultation;
    public static volatile SingularAttribute<Employe, String> numeroTel;
    public static volatile SingularAttribute<Employe, String> mail;
    public static volatile SingularAttribute<Employe, String> mdp;
    public static volatile SingularAttribute<Employe, Boolean> genre;
    public static volatile SingularAttribute<Employe, Long> id;
    public static volatile SingularAttribute<Employe, String> nom;
    public static volatile SingularAttribute<Employe, String> prenom;

}