package ar.edu.ort.tp1.unidad4.bcreacionobjetos;

import java.util.Calendar;

public class PersonaConExcepcionesV1 {
	
	private String nombreCompleto;
    private int anioNacimiento;
    private int anioFallecimiento;
	
	public PersonaConExcepcionesV1(String nombreCompleto, int anioNacimiento) {
	    this(nombreCompleto, anioNacimiento, -9999);
	}
	public PersonaConExcepcionesV1(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
	    //Validamos todo previo a la asignación, se recibió un nombre completo para ponerle?
	    if (nombreCompleto == null || nombreCompleto.isEmpty()) {
	        throw new IllegalArgumentException("El nombre no puede estar vacio ni ser null");
	    }
	    //Ahora validamos que los anios sean validos y coherentes.
	    int anioActual = Calendar.getInstance().get(Calendar.YEAR);
	    if (anioNacimiento > anioActual) {
	        throw new IllegalArgumentException("El anio de nacimiento no puede estar en el futuro");
	    } else if (anioFallecimiento != -9999) { // -9999 indica que vive
	        if (anioFallecimiento > anioActual) {
	            throw new IllegalArgumentException("El anio de fallecimiento no puede estar en el futuro");
	        } else if (anioFallecimiento < anioNacimiento) {
	            throw new IllegalArgumentException("No puede fallecer antes de nacer.");
	        }
	    }
	    this.nombreCompleto = nombreCompleto;
	    this.anioNacimiento = anioNacimiento;
	    this.anioFallecimiento = anioFallecimiento;
	}
	
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    public int getAnioFallecimiento() {
        return anioFallecimiento;
    }
    @Override
    public String toString() {
        return "Persona [nombreCompleto=" + nombreCompleto
                  + ", anioNacimiento=" + anioNacimiento
                  + ", anioFallecimiento=" + anioFallecimiento + "]";
    }
}