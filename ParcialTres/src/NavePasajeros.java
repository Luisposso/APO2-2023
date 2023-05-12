public abstract class NavePasajeros extends NaveEspacial implements ITeletransportable {
    protected int capacidadPasajeros;
    protected String sistemaConfort;

    @Override
    public void teletransportar() {
        System.out.println("Teletransportando pasajeros...");
    }
}
