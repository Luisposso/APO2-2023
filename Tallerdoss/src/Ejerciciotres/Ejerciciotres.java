package Ejerciciotres;

import java.util.Scanner;

public class Ejerciciotres {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int personas=0;
		int result;
		
		
		System.out.print("Digite el numero de perssonas que se aputan al viaje: ");
		  personas = scanner.nextInt();
		 
		 
		if(personas<=45){
		System.out.println("Se utilizara un solo bus");
		
		}else {
			 result= personas-45;
			 System.out.println("Se utitilizara un autobus y ademas van "+result+ " personas en la furgoneta");
			
			
		scanner.close();
	}
}
}
