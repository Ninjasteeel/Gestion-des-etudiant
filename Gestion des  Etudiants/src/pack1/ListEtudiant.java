package pack1;
import java.util.ArrayList;

public class ListEtudiant extends ArrayList<Etudiant> {
	public boolean add(Etudiant e) {
		if(this.contains(e)) {
			set(indexOf(e),e);return false;
		}
		else return super.add(e);
	}
}
