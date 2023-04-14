package Ejerciciocuatrocincoyseis;

public class Ejerciciocuatrocincoyseis {
public static void main(String[] args) {
	EjercicioCuatro ejercicioCuatro = new EjercicioCuatro("marya jones",14,46, 0);
	EjercicioCuatro ejercicioCuatro1 = new EjercicioCuatro("jhon Stiner",60,173, 0);
	EjercicioCuatro ejercicioCuatro1i = new EjercicioCuatro("Ari Samala",31,69, 0);
	
	ejercicioCuatro1i.setCreditos(ejercicioCuatro1i.getCreditos()+13);
	ejercicioCuatro1i.setPuntosCalidad(ejercicioCuatro1i.getPuntosCalidad()+52);
}

}
