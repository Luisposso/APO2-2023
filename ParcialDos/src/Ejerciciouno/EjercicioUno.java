package Ejerciciouno;

	import java.util.Scanner;

	public class EjercicioUno {

  public static void main (String[]args) {
	  Scanner palabra = new Scanner (System.in);
	  
	  
	  System.out.println("Ingresa tu frase: ");
	  String frase = palabra.nextLine();
	  
	  char [] caract = new char[frase.length()];
       
	  for (int i = 0; i < frase.length(); i++) {
		  caract[i] = frase.charAt(i);
		   
	  }
	  
	  System.out.println("Los elemento de array de caracteres son: ");
	  for (char a : caract) {
		  System.out.println(a + " ");
	  }
	  
	  palabra.close();
  }
  }
  
	

