package com.tests;
import java.util.ArrayList;

import com.basics.Conference;
import com.basics.Presentation;
import com.basics.Session;

public class TestPresentation{
	public static void main(String[] args) {
		Presentation p1 = new Presentation("Taha Ridene", "User modeling", 8, 8, "10 heures");
		Presentation p2 = new Presentation("Dimitri V", "Tableau", 7, 2, "5 heures");
		//Presentation p3 = new Presentation("L'autre Dimitri", "Tableau 2", 6, 3, "3 heures");
		//System.out.println(p1.toString());
		///////////////////////////////////////////////////////

		Session s1 = new Session("Mathématiques",8,8,Session.lstcpt);
		s1.addPresentation(p1);
		// System.out.println(s1.toString());	

		Conference c1 = new Conference("Le Nom", "7 rue du Poisson, 92200 PUTEAUX", 2022);
		c1.addSession(s1);
		System.out.println(c1.toString());
		
		
	}
}
