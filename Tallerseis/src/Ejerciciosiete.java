import java.util.Scanner;

public class Ejerciciosiete {

	Ejerciciosiete() {
		
		
		Scanner sc= new Scanner (System.in);
		
		int []resultados = new int[5];
		
		for(int i = 0; i< 5; i++){
			System.out.println("Introduzca el resultado de la prueba" + (i+1) + ": ");
			resultados[i] = sc.nextInt();
			
		}
		int suma = 0;
		 for(int i = 0; i<5; i++) {
			 suma += resultados[i];
			 
		 }
		 double promedio = (double)suma / 5;
		 
		 System.out.println("El promedio del resultado  de la prueba es: "+ promedio);
	}
	
}
