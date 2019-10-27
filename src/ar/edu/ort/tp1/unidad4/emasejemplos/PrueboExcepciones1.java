package ar.edu.ort.tp1.unidad4.emasejemplos;

import java.util.Scanner;

public class PrueboExcepciones1 {
	public static void ingresoNumero(int i) throws NumberFormatException {
		if (i < 0||i>10)
			throw new NumberFormatException("valor fuera de rango");
		else
			System.out.println("valor correcto");
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese un numero entre 0 y 10:");
		int number = input.nextInt();
		try {
			ingresoNumero(number);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Numero ingresado:" + number);
			input.close();
		}
	}
}