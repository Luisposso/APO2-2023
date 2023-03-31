	import java.util.InputMismatchException;
	import java.util.Scanner;
public class Ejerciciocuatro {
	

	public class Ejercicocuatro {

		public void main(String[] args) {
			// a.Error de sintaxis
			int numero=2.
		    int numerol=3.
			
			//b. Error logico
			int tres=3;
			int cuatro=4;
			if(tres>cuatro){
			System.out.println("El tres es menor que el cuatro");
			}else {
				System.out.println("tres es mayor que cuatro");
			}
			
		}
		// c. Una exepcion.
		   Scanner teclado = new Scanner(System.in);
	       int numl;
	       try{
	           System.out.print("Ingrese un valor:");
	           numl = teclado.nextInt();
	           int cuadrado = numl * numl;
	           System.out.print("El cuadrado de " + numl + " es " + cuadrado);
	       } catch (InputMismatchException ex) {
	           System.out.println("Debe ingresar obligatoriamente un número entero.");
	       }
		
	}
	}
}
