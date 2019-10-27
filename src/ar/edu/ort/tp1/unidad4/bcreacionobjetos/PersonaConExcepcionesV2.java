package ar.edu.ort.tp1.unidad4.bcreacionobjetos;

import java.util.Calendar;

public class PersonaConExcepcionesV2 {
	
    private static final int VALOR_AUN_VIVE = -9999;
    private String nombreCompleto;
    private int anioNacimiento;
    private int anioFallecimiento;
    private int anioActual;
 
    public PersonaConExcepcionesV2(String nombreCompleto, int anioNacimiento) {
        setAnioActual();
        setNombreCompleto(nombreCompleto);
        setAnioNacimiento(anioNacimiento);
        setAnioFallecimiento(VALOR_AUN_VIVE);
     }
    public PersonaConExcepcionesV2(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
        setAnioActual();
        setNombreCompleto(nombreCompleto);
        setAnioNacimiento(anioNacimiento);
        setAnioFallecimiento(anioFallecimiento);
    }
    private void setAnioActual() {
        anioActual = Calendar.getInstance().get(Calendar.YEAR);
    }
    private void setNombreCompleto(String nombreCompleto) {
        // se recibió un nombre completo para ponerle?
        if (nombreCompleto == null || nombreCompleto.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacio ni ser null");
        }
        this.nombreCompleto = nombreCompleto;
    }
    private void setAnioNacimiento(int anioNacimiento) {
        if (anioNacimiento > anioActual) {
            throw new IllegalArgumentException("El anio de nacimiento no puede estar en el futuro");
        }
        this.anioNacimiento = anioNacimiento;
    }
    public void setAnioFallecimiento(int anioFallecimiento) {
        if (anioFallecimiento != VALOR_AUN_VIVE) {
            if (anioFallecimiento > anioActual) {
                throw new IllegalArgumentException("El anio de fallecimiento no puede estar en el futuro");
            } else if (anioFallecimiento < anioNacimiento) {
                throw new IllegalArgumentException("No puede fallecer antes de nacer.");
            }
        }
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
        return "Persona [nombreCompleto=" + nombreCompleto +
            ", anioNacimiento=" + anioNacimiento +
            ", anioFallecimiento=" + anioFallecimiento + "]";
    }
}