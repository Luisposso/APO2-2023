import java.util.Scanner;

public class Ejerciciouno {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Inserta un numero");
	 int age = scan.nextInt();
	   String message = age > 7 ? "false" : "true";
	 
       System.out.println(message);
	
}
	
}
