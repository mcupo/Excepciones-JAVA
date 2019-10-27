package ar.edu.ort.tp1.unidad4.cejemplonumeros;

import java.util.Scanner;

public class TestExcepcionEnNros {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = pedirNumeroEntero(scanner);
		System.out.println("El numero cargado es " + numero);
	}

	private static int pedirNumeroEntero(Scanner scanner) {
		int valorNumerico = 0;
		boolean hayError;
		do {
			//El primer bloque incluye todas las instrucciones de lo que queremos intentar hacer. 
			//Si algo falla dentro de ese bloque, el programa saltará automáticamente al catch, donde deben figurar una o más excepciones, 
			//y el tratamiento de éstas.
			try {
				System.out.print("Ingresa un numero entero: ");
				valorNumerico = Integer.parseInt(scanner.nextLine());
				hayError = false;
			//El bloque catch recibe un argumento con el tipo de la excepción que debe tratar. Puedo tener n cantidad de bloques catch
			} catch (NumberFormatException nfe) {
				System.out.println("Hubo un error en la carga del numero.");
				hayError = true;
			//El bloque finally no es obligatorio. Nos permite indicar que sigue a lo que intentamos hacer. 
			//Explicita qué sucederá sea cual fuere lo que haya pasado, tanto si hubo un error como si no lo hubo.
			} finally {
				//...
			}
		} while (hayError);
		return valorNumerico;
	}
}