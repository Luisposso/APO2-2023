import java.util.Scanner;

public class Ejerciciocuatro {
  
	public static void main(String[] args) {
		int op;
		double peso,planet,conver;
		 Scanner palabra = new Scanner(System.in);
		
        System.out.println("Introduzca su peso: ");
         peso= palabra.nextDouble();
        
		System.out.println("Seleccione un planeta del sistema solar:");
		System.out.println("----------------------------------------");
	    System.out.println("1. Mercurio");
	    System.out.println("*****************************************");
	    System.out.println("2. Venus");
	    System.out.println("*****************************************");
	    System.out.println("3. Marte");
	    System.out.println("*****************************************");
	    System.out.println("4. Júpiter");
	    System.out.println("*****************************************");
	    System.out.println("5. Saturno");
	    System.out.println("*****************************************");
	    System.out.println("6. Urano");
	    System.out.println("*****************************************");
	    System.out.println("7. Neptuno");
	    System.out.println("--------------------------------------------");
	    
	    System.out.println("Ingrese la opcion deseada: ");
	    op=palabra.nextInt();
	    
	    
	    String planeta = "";
	    if (op == 1) {
	        conver = 0.38;
	        planeta = "Mercurio";
	      } else if (op == 2) {
	        conver = 0.91;
	        planeta = "Venus";
	      } else if (op == 3) {
	        conver = 0.38;
	        planeta = "Marte";
	      } else if (op == 4) {
	        conver = 2.36;
	        planeta = "Júpiter";
	      } else if (op == 5) {
	        conver = 0.92;
	        planeta = "Saturno";
	      } else if (op == 6) {
	        conver = 0.89;
	        planeta = "Urano";
	      } else if (op == 7) {
	        conver = 1.13;
	        planeta = "Neptuno";
	      } else {
	        System.out.println("Opción inválida");
	        return;
	      }
	    planet=peso*conver;
	    System.out.printf("Your weight on %s is %.2f lbs.", planeta, planet);
}
}
