import java.util.Scanner;

public class Mainap {
  public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int op;
	System.out.println("Puntos Taller 6");
	System.out.println("---------------");
	System.out.println("Ejercicio uno,dos,tres y cuatro");
	System.out.println("Ejercicio Siete");
	System.out.println("Ejercicio Ocho");
	System.out.println("Ejercicio Nueve");
	op = scanner.nextInt();
	switch(op) {
	case 1:
		new Ejerciciounodostrescuatro();
		break;
	case 2:
		new Ejerciciosiete();
		break;
	case 3:
		new EjercicioOcho();
		break;
	case 4:
		new Ejercicionueve();
		break;
	
	
	}
	
}
}
