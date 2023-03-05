import java.util.Scanner;

public class Ejerciciosiete {

	public static void main(String[] args) {
		
		
		double num,ancho,largo,altura,area;
		
		 Scanner palabra = new Scanner(System.in);
		
		System.out.println("Digite la altura de la habitacion: ");
		altura=palabra.nextDouble();
		
		System.out.println("Digite el largo de la habitacion: ");
		largo=palabra.nextDouble();
		
		System.out.println("Digite el ancho de la habitacion: ");
		ancho=palabra.nextDouble();
		
		area=(2*altura*largo)+(2*altura*ancho);
	
	}
	
	
	
}
