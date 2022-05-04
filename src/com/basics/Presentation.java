package com.basics;

import java.util.ArrayList;

public class Presentation {
	//Attributs
	private String auteurs;
	private String titreArticle;
	private int mois;

	public int jour;
	private String heure;
	//Constructeur
	public Presentation(String auteurs, String titreArticle, int mois, int jour, String heure){
		this.auteurs = auteurs;
		this.titreArticle = titreArticle;
		this.mois = mois;
		this.jour = jour;
		this.heure = heure;
	}
	// Retourner une chaine comme l'exemple ci-dessous :
	//"Pr�sentation de l'article "User modeling" par Taha Ridene � 10 heures"
	public String toString() {
		String affichageMois = null;
		switch(mois){
	       case 1: 
	           affichageMois = "janvier";
	           break;
	       case 2:
	    	   affichageMois = "f�vrier";
	           break;
	       case 3:
	    	   affichageMois = "mars";
	           break;
	       case 4:
	    	   affichageMois = "avril";
	           break;
	       case 5:
	    	   affichageMois = "mai";
	           break;
	       case 6:
	    	   affichageMois = "juin";
	           break;
	       case 7:
	    	   affichageMois = "juillet";
	           break;
	       case 8:
	    	   affichageMois = "ao�t";
	           break;
	       case 9:
	    	   affichageMois = "septembre";
	           break;
	       case 10:
	    	   affichageMois = "octobre";
	           break;
	       case 11:
	    	   affichageMois = "novembre";
	           break;
	       case 12:
	    	   affichageMois = "decembre";
	           break;
	       default:
	           System.out.println("Choix incorrect");
	           break;
	   }
		
		String phrase = "Pr�sentation de l'article \""+titreArticle+"\" par "+auteurs+" le "+jour+" "+affichageMois+" � "+heure;
		return phrase;  
	}

}