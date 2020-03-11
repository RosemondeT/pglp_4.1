package traore.Exercice_4_1;

import java.time.LocalDate;
import java.util.ArrayList;

/*
 * Création de la classe Personnels implémentant la classe InterfacePersonnels
 */
public final class Personnels implements InterfacePersonnels{
	private String Nom;
	private String Prenom;
	String Fonction;

	LocalDate DateDeNaissance;
	ArrayList<Integer>NumeroTel=new ArrayList<Integer>();

	/*
	 * Création de la classe Builder
	 */
	
	
public class Builder{
	
	/*
	 * Déclaration de variable
	 */
		/* parametre obligatoire*/
		private String Nom;
		private String Prenom;
		/* parametre optionnel*/
		
		LocalDate DateDeNaissance;
		ArrayList<Integer>NumeroTel=new ArrayList<Integer>();
		
		
		/*
		 * Creation du Constructeur de la classe Builder
		 */
		
		
	    public Builder(String Nom, String Prenom){
		this.Nom=Nom;
		this.Prenom=Prenom; }
			
	    
	    /*
	     * Création d'une méthode DateDeNaissance ayant trois paramètre
	     */
		public Builder DateDeNaissance(int annee, int mois, int jour) {
		this.DateDeNaissance=LocalDate.of(annee, mois, jour);
					return this;
					
		}
		
		
		/*
		 * Création d'une méthode NuméroTel ayant un paramètre
		 */
		
		public Builder NumeroTel(int NumeroTel) {
			this.NumeroTel.add(NumeroTel);
			return this;
			
		}
		
		
		/*
		 * Création d'une méthode Personnels buid()
		 */
		public Personnels build() {
			return new Personnels(this);
			
		}

}





/*
 * Création du constructeur de la classe Personnels
 */
	public Personnels(Builder builder) {
		this.Nom=builder.Nom;
		this.Prenom=builder.Prenom;
		this.DateDeNaissance=builder.DateDeNaissance;
		this.NumeroTel=builder.NumeroTel;
		
	}

	
	/*
	 * Redefinition de la méthode Print()
	 */
	public void print() {
		// TODO Auto-generated method stub
		
	}

	}
