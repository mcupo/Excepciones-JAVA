package ar.edu.ort.tp1.unidad4.emasejemplos;

public class Empleado {
	private String nombre;
	private int anioAlta;

	public Empleado(String nombre, int anioAlta) throws Exception {
		this.nombre = nombre;
		if(anioAlta<0)
				throw new Exception("edad fuera de rango");
		else
			this.anioAlta = anioAlta;	
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioAlta() {
		return anioAlta;
	}

	public void setAnioAlta(int anioAlta) {
		this.anioAlta = anioAlta;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", anioAlta=" + anioAlta + "]";
	}
}