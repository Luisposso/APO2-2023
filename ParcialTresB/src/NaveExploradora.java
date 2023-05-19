public abstract class NaveExploradora extends NaveEspacial {
    protected String sistemaSensores;

    @Override
    public void moverse() {
        // Sobrecarga del método moverse() para agregar el uso de un sistema de salto
        System.out.println("Explorando con sensores " + sistemaSensores + " y usando el sistema de salto");
    }
}