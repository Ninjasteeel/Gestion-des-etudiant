package pack1;
import java.util.ArrayList;
extends ArrayList<Etudiant>
public class ListEtudiant {
	public boolean add(Etudiant e) {
		if(this.contains(e)) {
			set(indexOf(e),e);return false;
		}
		else return super.add(e);
	}
}
