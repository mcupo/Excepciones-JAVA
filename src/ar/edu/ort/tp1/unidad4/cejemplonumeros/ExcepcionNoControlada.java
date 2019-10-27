package ar.edu.ort.tp1.unidad4.cejemplonumeros;

import java.util.Scanner;

/**
 * 
 * Si no ingreso un número, el programa arrojará un error en tiempo de ejecución, indicando que se produjo una excepción:
 * Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
 *	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
 *	at java.lang.Integer.parseInt(Integer.java:580)
 *	at java.lang.Integer.parseInt(Integer.java:615)
 *	at ar.edu.ort.parte1.ExcepcionNoControlada.pedirNumeroEntero(ExcepcionNoControlada.java:22)
 *	at ar.edu.ort.parte1.ExcepcionNoControlada.main(ExcepcionNoControlada.java:15)
 *
 */
public class ExcepcionNoControlada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = pedirNumeroEntero(scanner);
		System.out.println("El numero cargado es " + numero);
	}

	private static int pedirNumeroEntero(Scanner scanner) {
		int valorNumerico = 0;
		System.out.print("Ingresa un numero entero: ");
		valorNumerico = Integer.parseInt(scanner.nextLine());
		return valorNumerico;
	}	
}