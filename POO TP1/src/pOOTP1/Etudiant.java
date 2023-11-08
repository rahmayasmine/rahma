package pOOTP1;
import java.time.LocalDate;
import java.time.Month;
public class Etudiant {
  String nom , prenom,adresse_mail,adresse_postale;
  LocalDate date_de_naissance ;
  

public Etudiant(String nom, String prenom, String adresse_mail, String adresse_postale,LocalDate date_de_naissance) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse_mail = adresse_mail;
	this.adresse_postale = adresse_postale;
	this.date_de_naissance=date_de_naissance;
}
public String toString() {
	System.out.println("nom :"+this.nom +" \nprenom :"+this.prenom +" \n mail :"+this.adresse_mail + "\n adress "+this.adresse_postale  +" \n date_de_naissance"+ this.date_de_naissance);
	return "h";
}


public void setNom(String nom) {
	this.nom = nom;
}
public static void main(String[] args) {
	LocalDate mybirthday = LocalDate.of(2002, Month.OCTOBER, 16);
	Etudiant lolo=new Etudiant("lolo","lili","myadress","07003",mybirthday);
	lolo.toString();
	Etudiant toto=new Etudiant("lolo","lili","myadress","07003",mybirthday);
System.out.println(lolo.equals(toto));
	toto.toString();	
}
 
}
