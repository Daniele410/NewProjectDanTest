package miam;

public class Four {
	private int puissance;
	private int capacite;

	private Resistance resistance;
	private Soufflerie soufflerie;

	public void cuire(Aliment aliment) {
		System.out.println("Je cuis un aliment: " + aliment.nom);
		System.out.println("avec ma capacit� de " + capacite + " litres");
		System.out.println("et ma puissance de " + puissance + " degr�s");
		aliment.estCuit = true;
	}

	private void mantenir() {

	}

	public int getPuissance() {
		return puissance;
	}

	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Resistance getResistance() {
		return resistance;
	}

	public void setResistance(Resistance resistance) {
		this.resistance = resistance;
	}

	public Soufflerie getSoufflerie() {
		return soufflerie;
	}

	public void setSoufflerie(Soufflerie soufflerie) {
		this.soufflerie = soufflerie;
	}
 
}
