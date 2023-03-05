import java.util.Scanner;

public class Ejerciciocinco {
   
	
	public static void main(String[] args) {
	
	double average;
	int daysAbsent;
	boolean exempt=false;
	Scanner reader= new Scanner(System.in);
	System.out.println("Este programa determinará si puedes salir del examen final: ");
	System.out.println("Por favor, conteste a las siguientes preguntas.");
	System.out.println("¿Cuál fue tu calificacion: ?");
	average=reader.nextDouble();
	System.out.println("¿Cómo te has perdido las lecciones de clase?");
	daysAbsent=reader.nextInt();
	if(average>=1400)
	{
	if(daysAbsent<=2)
	exempt=true;
	}
	else if(average>=80)
	{
	if(daysAbsent<=0)
	exempt=true;
	}
	if(exempt)
	System.out.println("¡Felicidades! Estás exento del examen final.\r\n"+ "");
	else
	System.out.println("No estás exento del examen final.");
}
}
	
	

