package ar.edu.ort.tp1.unidad4.emasejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrueboExcepciones3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero=0;
		boolean ok=false;
		do {
			try {
				System.out.print("ingrese un numero entero:");
				numero = input.nextInt(); // En caso de error lanza InputMismatchException
				//double d = 2/0;
				ok=true;
			}
			catch (InputMismatchException e) {// captura la excepcion
				System.out.println("error debe ingresar un entero");
				input.nextLine();//limpia el buffer
			}
			catch (Exception e) {// captura la excepcion
				System.out.println("debe ingresar un entero (sale por excepcion generica)");
				input.nextLine();//limpia el buffer
			}
		}while (!ok);
		System.out.println("Numero ingresado:" + numero);
		input.close();
	}
}