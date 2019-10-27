package ar.edu.ort.tp1.unidad4.acargadedatos;

import java.util.Scanner;

public class TestConMetodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = pedirNumeroEntero(scanner);
        System.out.println("El numero cargado es " + numero);
    }

    private static int pedirNumeroEntero(Scanner scanner) {
        int valorNumerico = 0;
        boolean hayError;
        do {
            try {
                System.out.print("Ingresa un numero entero: ");
                valorNumerico = Integer.parseInt(scanner.nextLine());
                hayError = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Hubo un error en la carga del numero.");
                hayError = true;
            }
        } while (hayError);
        return valorNumerico;
    }
}