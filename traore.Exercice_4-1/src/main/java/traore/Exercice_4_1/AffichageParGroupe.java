package traore.Exercice_4_1;

import java.util.ArrayList;


/**
 * classe AffichageParGroupe
 * @author traore-mousso
 *
 */
public class AffichageParGroupe {
	
public ArrayList<InterfacePersonnels> grp=new ArrayList<InterfacePersonnels>();
	
/**
 * Constructeur de la classe AffichageParGroupe  
 * @param root
 */
	public  AffichageParGroupe (InterfacePersonnels root) {
		this.grp.add(root);
	}
	
	/**
	 * Méthode groupIterator 
	 * @author traore-mousso
	 *
	 */
	private class groupIterator implements Iterator{
		int index=0;
		
		
		public groupIterator() {
			int verifier=0;
			while(verifier<grp.size()) {
				if(grp.get(verifier) instanceof Composite) {
					Composite test=(Composite)grp.get(verifier);
					int i=0;
					
					while(i<test.grpPerso.size()) {
						grp.add(test.grpPerso.get(i));
						i++;
					}
					
				
				}
				verifier++;
			}
		}
		
	
		/**
		 * verifirie s'il y'a des elements dans la liste
		 */
		public boolean HasNext() {
			if(index<grp.size())
				return true;
			return false;
		}

		public InterfacePersonnels Next() {
			if(this.HasNext()) {
				index++;
				return grp.get(index-1);
			}
				
			return null;
		}

		public boolean hasNext() {
			return false;
		}
		
		
		
	}
	
	public Iterator getIterator() {
		return new groupIterator();
		
	}
	
}
