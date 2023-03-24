package Ejercicionueve;

public class Hand {

	Card[] cat = new Card[5];
	int cant=0;
	
	public void agregarCarta(Card cartal) {
		
		cat[cant] = cartal;
		cant++;
	}
	public void mostrarMazo() {
		for (int i=0; i<cant; i++) {
			System.out.print(cat[i] + " | ");
		}
	}
	
}
