public abstract class NaveCarga extends NaveEspacial {
    protected int capacidadCarga;

    @Override
    public void moverse() {
        // Sobrecarga del método moverse() para agregar la capacidad de usar un sistema de anclaje
        System.out.println("Cargando y descargando con capacidad " + capacidadCarga + " y usando el sistema de anclaje");
    }
}
