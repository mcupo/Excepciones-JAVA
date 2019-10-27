package ar.edu.ort.tp1.unidad4.emasejemplos;

public class PrueboExcepciones4 {

	public static void main(String[] args) {
		Empleado emp = null;
		try {
			emp = new Empleado("Pepe", -1);
			System.out.println("Empleado:" + emp.toString());
		} catch (Exception e) {// captura la excepcion
			System.out.println(e.getMessage());
		}
		System.out.println("Empleado no fue creado:");
	}
}