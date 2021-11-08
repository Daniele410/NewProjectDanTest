package miam;

public class Main {

	public static void main(String[] args) {
		Four petitFour = new Four();
		this.Capacite= capacite = 30;
		petitFour.puissance = 180;

		Four grandFour = new Four();
		grandFour.capacite = 55;
		grandFour.puissance = 260;

		Four petitGrandFour = new Four();
		
		petitGrandFour.capacite = petitFour.capacite + grandFour.capacite;
		petitGrandFour.puissance =petitFour.puissance+ grandFour.puissance;
		
		grandFour.soufflerie= null;
		
		Aliment cake = new Aliment();
		cake.nom = "cake aux fruits";
		cake.estCuit = false;
		cake.manger();
		System.out.println();
		grandFour.cuire(cake);
		System.out.println();
		cake.manger();
		
	
		
		
	}

}
