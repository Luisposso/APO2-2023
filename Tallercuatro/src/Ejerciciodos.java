
import java.util.Scanner;

public class Ejerciciodos {

	public static void main(String[] args) {
	

		
		try (Scanner T = new Scanner (System.in)) {
			System.out.println("Introduce dos numeros: ");
			   double a=T.nextDouble();
			   double b=T.nextDouble();
			   double z;
			   System.out.println("Escribe el operador aritmetico +,-,*,/,%: ");
			   char op=T.next().charAt(0);
			    
			   switch (op) {
			   case '+':z=a+b;
			   System.out.println("La suma de los numeros es: "+z);
			   break;
			   case '-':z=a-b;
			   System.out.println("La resta de los numeros es: "+z);
			   break;
			   case '*':z=a*b;
			   System.out.println("La multiplicacion de los numeros es: "+z);
			   break;
			   case '/':z=a/b;
			   System.out.println("La Division de los numeros es: "+z);
			   break;
			   case '%':z=a%b;
			   System.out.println("El porcentaje de los numeros es: "+z);
			   break;
			  default:System.out.println("Operador no existe");
			   }
		}
	 
	}	
}
