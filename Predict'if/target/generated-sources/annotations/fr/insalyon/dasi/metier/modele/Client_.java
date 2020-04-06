package fr.insalyon.dasi.metier.modele;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-04-06T16:02:55")
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Date> dateDeNaissance;
    public static volatile SingularAttribute<Client, Boolean> connected;
    public static volatile SingularAttribute<Client, String> motDePasse;
    public static volatile SingularAttribute<Client, String> numeroTel;
    public static volatile SingularAttribute<Client, String> mail;
    public static volatile SingularAttribute<Client, String> adresse;
    public static volatile SingularAttribute<Client, Long> id;
    public static volatile SingularAttribute<Client, String> nom;
    public static volatile SingularAttribute<Client, String> prenom;

}