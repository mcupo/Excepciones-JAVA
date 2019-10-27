package ar.edu.ort.tp1.unidad4.acargadedatos;

import java.util.Scanner;

public class TestSinTratamiento {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Ingrese un numero");
		int numero = Integer.parseInt(input.nextLine());
		System.out.println("El Numero ingresado es: " + numero);
		input.close();
	}
}