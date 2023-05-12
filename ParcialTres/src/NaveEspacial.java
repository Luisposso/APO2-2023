public abstract class NaveEspacial {
    protected String tipoNave;
    protected String sistemaPropulsion;
    protected int capacidad;
    protected int tripulacion;

    public abstract void moverse();
    public abstract void atacar();
}
