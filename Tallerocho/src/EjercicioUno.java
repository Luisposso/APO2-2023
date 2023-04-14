
public class EjercicioUno {
	
	private int numSides;
    private boolean regular;

    // Constructor por defecto
    public EjercicioUno() {
    }

    // Constructor con parámetros
    public EjercicioUno(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Métodos captadores
    public int getNumSides() {
        return numSides;
    }

    public boolean isRegular() {
        return regular;
    }

    // Métodos establecedores
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }
}

