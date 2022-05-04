package com.basics;
import java.util.*;
public class Session {
	
	public static final ArrayList<Presentation> lstcpt = new ArrayList<Presentation>();
	
	//Attributs
	public String specialite;
	private int jour;
	private int mois;
	private ArrayList<Presentation> presentations;
	//Constructeur 1
	public Session(String specialite, int jour, int mois){ 
		this.specialite = specialite;
		this.jour = jour;
		this.mois = mois;
	}
	
	//Constructeur 2
	public Session(String specialite , int jour, int mois, ArrayList<Presentation> presentations){
		this.specialite = specialite;
		this.jour = jour;
		this.mois = mois;
		this.presentations = presentations;
	}
	//Ajouter un objet présentation au vecteur
	public void addPresentation(Presentation present){ 
		lstcpt.add(present);
	}
	/*Retourner la chaîne d'affichage du contenu d'une session.*/
	
	public String toString() {
		if (presentations.size()==1) {
			System.out.println("Nous avons "+presentations.size()+" présentations.");
			for(int i = 0 ; i < presentations.size(); i++) {
				   System.out.println(i+1+": "+presentations.get(i));
			}
			return "";
		}
		else {
			System.out.println("Nous avons "+presentations.size()+" présentation.");
			for(int i = 0 ; i < presentations.size(); i++) {
				   System.out.println(i+1+": "+presentations.get(i));
			}
			return "";
		}
	}
}