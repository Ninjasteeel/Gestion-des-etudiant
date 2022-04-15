package pack1;


public class Etudiant implements Comparable<Etudiant>  {
private int id ;
private double note;
private String nom;
public Etudiant(int i,String n){ id=i;nom=n;note=10;}
public String toString() {return nom+":"+note;}
public boolean equals(Object o) {if( ! (o instanceof Etudiant) )  return false;
return ((Etudiant)o).id==this.id ;
}
public int compareTo(Etudiant e) {if (note==e.note) return 0;if(note>e.note) return 1;else{return -1;}
}
public double getNote() {
	return note;
}
public void setNote(double note) {
	this.note = note;
}
	
	
	
	
	
	
	
}