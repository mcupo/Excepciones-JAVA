package ar.edu.ort.tp1.unidad4.emasejemplos;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class PrueboExcepciones2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String texto = "";
		boolean ok=false;
		do {
			try {
				System.out.print("ingrese un texto:");
				texto = input.next("\\D+"); // En caso de error lanza NoSuchElementException
				ok=true;
			} 
			catch (NoSuchElementException e) {// captura la excepcion
				System.out.println("error debe ingresar caracteres entre A-Z.");
				input.nextLine();//limpia el buffer
			}
		}while (!ok);
		System.out.println("Texto ingresado:" + texto);
		input.close();
	}
}
