package traore.Exercice_4_1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @author traore-mousso
 * Classe Composite
 *
 */
public class Composite implements InterfacePersonnels{
	
	private int IDgrp;
	public ArrayList<InterfacePersonnels> grpPerso=new ArrayList<InterfacePersonnels>();
	
	public ArrayList<InterfacePersonnels> gettab(){
		return (ArrayList<InterfacePersonnels>) Collections.unmodifiableList(this.grpPerso);
		
	}
	
	/**
	 * Constructueur qui permet de donner un identifiant à un groupe
	 * @param IDgrp
	 */
	public Composite(int IDgrp) {
		this.IDgrp=IDgrp;
	}

	/**
	 * Affiche l'identifiant du groupe
	 */
	public void print() {
		System.out.println("le Id du groupe est : "+this.IDgrp);
		for(InterfacePersonnels perso : grpPerso) {
			perso.print();
		}
	}
	
	/**
	 * Ajoute un nouveau membre au groupe
	 * @param perso
	 */
	public void add(InterfacePersonnels perso) {
		this.grpPerso.add(perso);
	}
	
	/**
	 * Retire un membre du groupe
	 * @param perso
	 */
	
	public void remove(Personnels perso) {
		this.grpPerso.remove(perso);
	}
	
	public String toString(){
		  String str = "\t je suis un composite ID ==>> " + this.IDgrp;
		  return str;
	}

	
}
