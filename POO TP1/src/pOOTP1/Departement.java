package pOOTP1;

import java.util.ArrayList;

public class Departement {
	String spicalite,adresse ;
	ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
public Departement(String spicalite, String adresse) {
		super();
		this.spicalite = spicalite;
		this.adresse = adresse;
	}



public String toString() {
	for(int i=0;i<this.etudiants.size();i++)
	System.out.println(this.etudiants.get(i).toString());
	return "h";
}

public void inscrire(Etudiant e)
{
	this.etudiants.add(e);
}
public void deinscrire(Etudiant e)
{
	this.etudiants.remove(e);
}
}
