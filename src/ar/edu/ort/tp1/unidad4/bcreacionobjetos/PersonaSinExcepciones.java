package ar.edu.ort.tp1.unidad4.bcreacionobjetos;

public class PersonaSinExcepciones {

	private String nombreCompleto;
    private int anioNacimiento;
    private int anioFallecimiento;

    public PersonaSinExcepciones(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
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