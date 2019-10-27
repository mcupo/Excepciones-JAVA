package ar.edu.ort.tp1.unidad4.acargadedatos;

import java.util.Scanner;

public class TestConTratamiento {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero = -1;
		try {
		   System.out.println("El numero vale " + numero);
		   System.out.print("ingrese un numero: ");
		   numero = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException nfe) {
		   System.out.println("Hubo un error en la carga del numero: " + nfe.getMessage());
		} finally {
		   System.out.println("El numero ahora vale " + numero);
		}
	}
}