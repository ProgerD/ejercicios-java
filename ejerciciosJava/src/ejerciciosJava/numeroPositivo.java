package ejerciciosJava;

import java.util.Scanner;

public class numeroPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número: ");
		int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero == 0) {
            System.out.println("El número es cero.");
        } else {
            System.out.println("El número es negativo.");
        }
	}

}
