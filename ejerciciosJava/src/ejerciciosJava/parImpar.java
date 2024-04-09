package ejerciciosJava;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero == 0) {
            System.out.println("El número ingresado es cero.");
        } else {
            if (numero % 2 == 0) {
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar.");
            }
        }
	}

}
