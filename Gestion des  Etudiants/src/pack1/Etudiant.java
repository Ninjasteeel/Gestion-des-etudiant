package pack1;


public class Etudiant  {
private int id ;
private double note;
private String nom;
public Etudiant(int i,String n){ id=i;nom=n;note=10;}
public String toString() {return nom+":"+note;}
public boolean equals(Object o) {if( ! (o instanceof Etudiant) )  return false;
return ((Etudiant)o).id==this.id ;
}
	
	
	
	
	
	
	
	
}