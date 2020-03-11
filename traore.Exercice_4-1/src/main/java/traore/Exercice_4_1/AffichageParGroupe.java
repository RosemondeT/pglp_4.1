package traore.Exercice_4_1;

import java.util.ArrayList;

/*
 * Création de la classe AffichageParGroupe
 */
public class AffichageParGroupe {
	
	ArrayList<InterfacePersonnels>Arr=new ArrayList<InterfacePersonnels>();
	
	
	
	/*
	 * Création d'une classe GroupeIterator implémentant la classe Iterator
	 */
	private class GroupeIterator implements Iterator{
		int index;
		int verifie;
		
		public boolean hasNext() {
			if(index>=Arr.size()) {
				return false;
			}
			return true;
		}
		
		

		public InterfacePersonnels Next() {
			if(this.hasNext()) {
			return Arr.get(index++);}
		}
		
		/*
		 * Méthode GroupeIterator
		 */
		
		public void GroupeIterator(){
			int verifie=0;
			
			
			while (verifie<Arr.size()) {
				if (Arr.get(verifie) instanceof Composite)
				{
					for (InterfacePersonnels ip : ((Composite)Arr.get(verifie)).GroupePersonnels)
						{
							Arr.add(ip);
						}
					
				};
			} verifie++;
		}
		
		

	
	}
	/*
	 * Constructeur de la classe AffichageParGroupe
	 */
	AffichageParGroupe(InterfacePersonnels Root){
		Arr.add(Root);
	}

}
