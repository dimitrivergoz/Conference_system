package com.tests;

import java.util.*;

import com.basics.*;

public class TestConference {
	public static void main(String[] args) {
	List<String> list_presentations = new ArrayList<String>();
	// ATTENTION : Pour les saisie au clavier, vous pouvez utiliser
	// la classe Scanner oubien la classe Saisie
	
	String nom = Saisie.lireChaine("Quel est le nom de la conférence? ");
	String lieu = Saisie.lireChaine("Dans quelle ville se trouvera "+nom+" ? ");
	int annee = Saisie.lireEntier("Quel est l'année où se déroulera "+nom+" ? ");
	Conference conf = new Conference(nom, lieu,annee);
	
	
	int nbrSess = 0;
	do{
		nbrSess = Saisie.lireEntier("Nombre de session : ");// Saisie au clavier faire du blindage
	} while (nbrSess <= 0);
	
	for (int i = 0; i< nbrSess ; i++){
		String thematique = Saisie.lireChaine("Indiquez la thématique : ");// Saisie au clavier
		int jour = 0;
		do{
			jour = Saisie.lireEntier("Indiquez le jour : ");// Saisie au clavier
		} while (jour >= 0 && jour>30);
		
		int mois;
		do{
			mois = Saisie.lireEntier("Indiquez le mois : ");// Saisie au clavier
		} while (mois >= 0 && mois>12);
		
		Session s = new Session(thematique, jour, mois,Session.lstcpt);
		int nbrPres = Saisie.lireEntier("Combien il y a-t-il d'articles : ");// Saisie au clavier faire du blindage
		for(int j = 0; j< nbrPres; j++){
			String titreArticle = Saisie.lireChaine("Indiquez le titre de l'article "+(j+1)+" : ");// Saisie au clavier
			String auteurs = Saisie.lireChaine("Indiquez le ou les auteurs de l'article "+(j+1)+" : ");// Saisie au clavier
			Presentation p = new Presentation(auteurs, titreArticle,mois,jour,""+(j+8)+ " heures" );
			s.addPresentation(p);
			list_presentations.add(p.toString());
		}
	conf.addSession(s);
	}
	/** Affichage */
	System.out.println(conf.toString());
	nom = nom.replaceAll("[^,;#\n]", "");
	nom = nom.replace("\"", "");
	System.out.print("Le lien vers "+nom+" est: ");
	Random random = new Random();
	int value = random.nextInt(999999999 + 1) + 1;
	System.out.print("https://"+nom+"-online.zoom.us/"+value);
	
	}
}