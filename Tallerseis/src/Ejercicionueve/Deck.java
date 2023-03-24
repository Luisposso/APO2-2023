package Ejercicionueve;

import java.util.Random;

public class Deck {
	Card[] cardArray = new Card[52];
	int contar=0;

	Deck() { // constructor
		int suits = 4;
		int cardType = 13;
		int cardCount = 0;
		for (int i = 1; i <= suits; i++)
			for (int j = 1; j <= cardType; j++) {
				cardArray[cardCount] = new Card(i, j);
				cardCount++;
			}
	}

	public void print() {
		for (int i = 0; i < cardArray.length; i++)
			System.out.println(cardArray[i]);
	}

	public void mezclar() {
		//Un numero aleatorio
		Random r = new Random();
		Card cartica = new Card(0, 0);
		 for (int i=0; i<52; i++) {
			 int numal=r.nextInt(52);
			 cartica = cardArray[i];
			 cardArray[i]=cardArray[numal];
			 cardArray[numal]= cartica;
			 }
		
	}

	public Hand repartir () {
		Hand mano = new Hand();
		//agregar carta y enviar una que esta disponible en el mazo
		mano.agregarCarta(cardArray[contar]);
		contar++;
		mano.agregarCarta(cardArray[contar]);
		contar++;
		
		return mano;
	}
}