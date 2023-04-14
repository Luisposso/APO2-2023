package Ejerciciosieteyocho;

import java.util.Scanner;


public class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int totalPoints = 0; // Puntos totales de las cartas
        int numCards = 0; // Número de cartas en la mano
        boolean anotherCard = true; // Bandera para determinar si el usuario quiere otra carta

        while (totalPoints < 21 && numCards < 5 && anotherCard) {
            // Generar una nueva carta aleatoria
            int suitNumber = (int)(Math.random()*4.0+1);
            int faceNumber = (int)(Math.random()*13.0+1);
            Card newCard = new Card(suitNumber, faceNumber);

            // Mostrar la nueva carta y los puntos totales
            System.out.println("Nueva carta: " + newCard);
            totalPoints += newCard.points;
            System.out.println("Puntos totales: " + totalPoints);

            numCards++; // Incrementar el número de cartas en la mano

            // Preguntar si el usuario quiere otra carta
            if (numCards < 5 && totalPoints < 21) {
                System.out.println("¿Desea otra carta? (Sí/No)");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("no")) {
                    anotherCard = false;
                }
            } else {
                anotherCard = false;
            }
        }

        scanner.close();
        System.out.println("Fin del juego.");
    }
}
