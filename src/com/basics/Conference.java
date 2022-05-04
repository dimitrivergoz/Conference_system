package com.basics;

import java.util.*;

public class Conference {
	
	public static final ArrayList<Session> lstcpt_session = new ArrayList<Session>();
	
	// Attributs
	private ArrayList<Session> sessions;
	private String nom;
	private String lieu;
	private int annee;
	// Constructeur
	public Conference(String nom, String lieu, int annee){ // TO DO 
		super();
		this.nom = nom;
		this.lieu = lieu;
		this.annee = annee;
	}
	// Ajouter Session
	public void addSession(Session sess){ // TO DO 
		lstcpt_session.add(sess);
	}
	// Retourner une session i
	public Session getUneSession(int i){ // TO DO 
		return lstcpt_session.get(i);
	}
	// Reourner la cha�ne contenant tout le programme d'une conf�rence
	public String toString(){	
		System.out.println("La Conf�rence \""+nom+"\" se d�roulera en "+annee+" � "+lieu+" \n "+lstcpt_session.get(0)); // TO DO 
		return "";
	}
}