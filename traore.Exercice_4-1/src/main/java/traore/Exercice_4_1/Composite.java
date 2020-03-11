package traore.Exercice_4_1;

import java.util.ArrayList;

public class Composite implements InterfacePersonnels{
	
	public ArrayList <InterfacePersonnels> GroupePersonnels=new ArrayList<InterfacePersonnels>();
	private int IdGroupe;
	public void composite(int IdGroupe) {
		this.IdGroupe=IdGroupe;
	}


	public void print() {
		System.out.println("L'dentifiant du groupe est: "+this.IdGroupe);
		for (InterfacePersonnels Person: GroupePersonnels) {
			Person.print();
			
			
		}
		
		
	}
	public void add(Personnels Person) {
		this.GroupePersonnels.add(Person);
		
		
	}

	public void remove(Personnels Person) {
		this.GroupePersonnels.remove(Person);
		
	}
	public void Afficher(String message) {
		// TODO Auto-generated method stub
		
	}
}
