package traore.Exercice_4_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author traore-mousso
 * Création de la classe Personnels implémentant la classe InterfacePersonnels
 *
 */

public final class Personnels implements InterfacePersonnels{
	/**
	 * parametre obligatoire
	 */
	private final String nom;
	private final String prenom;
	private final int Id;//new
	
	/**
	 * parametre optionel
	 */
	private final LocalDate dateDeNaissance;
	private final ArrayList<Integer> numTel;
	
	
	/**
	 * Classe Builder
	 * @author traore-mousso
	 *
	 */
	
	public static class Builder{
		/**
		 * parametre obligatoire
		 */
		private final String nom;
		private final String prenom;
		private final int Id;//new
		/**
		 * parametre optionel
		 */
		private LocalDate dateDeNaissance;
		private ArrayList<Integer> numTel;
		
		
		/**
		 * Constructeur de la classe builder
		 * @param nom
		 * @param prenom
		 * @param Id
		 */
		public Builder(String nom, String prenom, int Id) {
			this.nom=nom;
			this.prenom=prenom;
			this.Id=Id;
			
		}
		
		/**
		 * Méthode dateDeNaissance
		 * @param anne
		 * @param mois
		 * @param jour
		 * @return
		 */
		public Builder dateDeNaissance(int anne,int mois,int jour) {
			this.dateDeNaissance= LocalDate.of(anne, mois, jour);
			return this;
			
		}
		
		/**
		 * Méthode numTel
		 * @param numTel
		 * @return
		 */
		public Builder numTel(int numTel) {
			this.numTel.add(numTel);
			return this;
	}

		public Personnels build() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public Personnels build() {
		return new Personnels(this);
		
	}
	
	


private Personnels(Personnels personnels) {
	//Obligatoire
	this.nom=personnels.nom;
	this.prenom=personnels.prenom;
	this.Id=personnels.Id;//new
	//optionel
	this.dateDeNaissance=personnels.dateDeNaissance;
	this.numTel=personnels.numTel;
	
}
/**
 * Affichage des informations du personnel
 */
public void print() {
	// TODO Auto-generated method stub
	System.out.println("l'identifiant du personnel :"+this.Id+" "+this.nom+" "+this.prenom);
}



public String toString(){
	  String str = "\t je suis un Personnel ID ==>> " + this.Id;
	  return str;
}



	}
