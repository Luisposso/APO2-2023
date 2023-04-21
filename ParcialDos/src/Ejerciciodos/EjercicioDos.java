package Ejerciciodos;
import java.util.Random;

	public class EjercicioDos {

	   private String nombre;
	   private  int edad;
	   private String DNI;
	   private char sexo;
	   private double peso;
	   private double altura;
	   private static final char SEXO_DEFECTO = 'H';
	   private static final int PESO_IDEAL_MIN = 20;
	   private static final int PESO_IDEAL_MAX = 25;
	   private static final int SOBREPESO = 25;
	   private static final int DNI_LENGTH = 8;
	    
	    // Constructor 
	    public EjercicioDos() {
	        this.nombre = "";
	        this.edad = 0;
	        this.DNI = generaDNI();
	        this.sexo = SEXO_DEFECTO;
	        this.peso = 0;
	        this.altura = 0;
	    }
	    
	    // Constructor con nombre, edad y sexo, el resto por defecto
	    public EjercicioDos(String nombre, int edad, char sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.DNI = generaDNI();
	        this.sexo = comprobarSexo(sexo);
	        this.peso = 0;
	        this.altura = 0;
	    }
	    
	    // Constructor con todos los atributos como parámetros
	    public EjercicioDos(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.DNI = DNI;
	        this.sexo = comprobarSexo(sexo);
	        this.peso = peso;
	        this.altura = altura;
	    }
	    
	    
	    public int calcularIMC() {
	        double imc = peso / (altura * altura);
	        if (imc < PESO_IDEAL_MIN) {
	            return -1;
	        } else if (imc >= PESO_IDEAL_MIN && imc <= PESO_IDEAL_MAX) {
	            return 0;
	        } else {
	            return 1;
	        }
	    }
	    
	    public boolean esMayorDeEdad() {
	        return edad >= 18;
	    }
	    
	    public String toString() {
	        return "Nombre: " + nombre + "\n" +
	                "Edad: " + edad + "\n" +
	                "DNI: " + DNI + "\n" +
	                "Sexo: " + sexo + "\n" +
	                "Peso: " + peso + "\n" +
	                "Altura: " + altura;
	    }
	    
	   
	    private char comprobarSexo(char sexo) {
	        if (sexo == 'H' || sexo == 'M') {
	            return sexo;
	        } else {
	            return SEXO_DEFECTO;
	        }
	    }
	    
	    private String generaDNI() {
	        String letras = "hoalamsdjeifeifeifoeofeof";
	        StringBuilder dniBuilder = new StringBuilder();
	        Random random = new Random();
	        for (int i = 0; i < DNI_LENGTH; i++) {
	            dniBuilder.append(random.nextInt(10));
	        }
	        dniBuilder.append(letras.charAt(Integer.parseInt(dniBuilder.toString()) % 23));
	        return dniBuilder.toString();
	    }
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    public void setSexo(char sexo) {
	        this.sexo = sexo;
	    }

	    public void setPeso(double peso) {
	        this.peso = peso;
	    }

	    public void setAltura(double altura) {
	        this.altura = altura;
	    }

	}
