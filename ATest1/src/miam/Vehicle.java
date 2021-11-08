package miam;

public class Vehicle {
		String nom;
		boolean deplace;
	
		public void seDeplacer() {
		
		
		if(deplace) {
		System.out.println("Je suis " + nom + " et je me deplace");}
		else {
			System.out.println("Je suis " + nom + " je reste garè");
		}
		
	}
}
