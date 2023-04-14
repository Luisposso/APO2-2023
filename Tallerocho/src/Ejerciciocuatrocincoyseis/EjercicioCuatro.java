package Ejerciciocuatrocincoyseis;

public class EjercicioCuatro {
	    private String nombre;
	    private int creditos;
	    private double promedioPonderado;
	    private double puntosCalidad;

	    // Constructor
	    public EjercicioCuatro (String nombre, int creditos, double promedioPonderado, double puntosCalidad) {
	        this.nombre = nombre;
	        this.creditos = creditos;
	        this.promedioPonderado = promedioPonderado;
	        this.puntosCalidad = puntosCalidad;
	    }

	    // Método para obtener el promedio ponderado actual
	    public double obtenerPromedioPonderado() {
	        return puntosCalidad / creditos;
	    }

	    // Método para actualizar los créditos, puntos de calidad y el GPA
	    public void actualizarCreditosYPuntosDeCalidad(int creditos, double puntosCalidad) {
	        this.creditos += creditos;
	        this.puntosCalidad += puntosCalidad;
	        this.promedioPonderado = puntosCalidad / this.creditos;
	    }

	    // Getters y Setters
	    public String getNombre() {
	        return nombre;
	    }

	    public int getCreditos() {
	        return creditos;
	    }

	    public double getPromedioPonderado() {
	        return promedioPonderado;
	    }

	    public double getPuntosCalidad() {
	        return puntosCalidad;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public void setCreditos(int creditos) {
	        this.creditos = creditos;
	    }

	    public void setPromedioPonderado(double promedioPonderado) {
	        this.promedioPonderado = promedioPonderado;
	    }

	    public void setPuntosCalidad(double puntosCalidad) {
	        this.puntosCalidad = puntosCalidad;
	    }
	
}

