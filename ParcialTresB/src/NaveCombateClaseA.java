public class NaveCombateClaseA extends NaveCombate {
    public NaveCombateClaseA() {
        tipoNave = "Nave de combate Clase A";
        sistemaPropulsion = "Cohetes";
        tipoArma = "Láser";
        sistemaDefensa = "Escudos defensivos avanzados";
        capacidad = 2;
        tripulacion = 4;
    }

    @Override
    public void atacar() {
        // Sobrecarga del método atacar() para aumentar la potencia de fuego
        System.out.println("Atacando con potencia máxima...");
    }

	@Override
	public void moverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String getTipoNave() {
		// TODO Auto-generated method stub
		return null;
	}
}
