public abstract class NaveCombate extends NaveEspacial {
    protected String tipoArma;
    protected String sistemaDefensa;

    @Override
    public void atacar() {
        // Sobrecarga del método atacar() para agregar el uso de un arma secundaria
        System.out.println("Atacando con " + tipoArma + " y arma secundaria de láser");
    }
}