package traore.Exercice_4_1;

import org.junit.Before;
import org.junit.Test;

public class PersonnelsTest {
	
	Personnels personne1;
	Personnels personne2;
	Personnels personne3;
	Personnels personne4;
	
	Composite groupe1;
	Composite groupe2;
	Composite groupe3;
	
	@Before
	  public void setup() {
		
		personne1= new Personnels
				.Builder("Baldé", "Abdoulaye", 1).build();
		
		personne2= new Personnels
				.Builder("Traoré", "Rose", 2).build();
		
		personne3= new Personnels
				.Builder("Ouédraogo", "Jean-Luc", 3).build();
		personne4= new Personnels
				.Builder("Touré", "Mariam", 4).build();
		
		
		
		groupe1 = new Composite(1);
		groupe2 = new Composite(2);
		groupe3 = new Composite(3);
		
		
	}

	@Test
	public void test() {
		
		groupe1.add(personne1);
		groupe2.add(groupe2);
		
		groupe2.add(groupe3);
		groupe2.add(personne3);
		
		groupe3.add(personne4);
		groupe3.add(personne2);
		
		//groupe1.print();
	}

}
