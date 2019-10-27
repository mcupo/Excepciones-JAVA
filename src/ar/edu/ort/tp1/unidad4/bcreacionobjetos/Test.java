package ar.edu.ort.tp1.unidad4.bcreacionobjetos;

public class Test {
	
	public static void main(String[] args) {
		PersonaConExcepcionesV2 unaPersona = null;
		
	    try {
	        unaPersona = new PersonaConExcepcionesV2("Juan", 1984, 2018);
	    } catch (RuntimeException re) {
	        System.out.println(re.getMessage());
	    } finally {
	    	//Si falla mostraria "Los datos de la persona son null"
	        System.out.println("Los datos de la persona son " + unaPersona);
	    }
	}
}