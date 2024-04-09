package ejerciciosJava;

import java.util.Scanner;

public class mesEstaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de mes (1-12): ");
        int mes = scanner.nextInt();

        scanner.close();

        String nombreMes;
        String estacion;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Mes inválido";
                break;
        }

        switch (mes) {
            case 1:
            case 2:
            case 3:
                estacion = "Verano";
                break;
            case 4:
            case 5:
            case 6:
                estacion = "Otoño";
                break;
            case 7:
            case 8:
            case 9:
                estacion = "Invierno";
                break;
            case 10:
            case 11:
            case 12:
                estacion = "Primavera";
                break;
            default:
                estacion = "Estación inválida";
                break;
        }

        System.out.println("El mes de " + nombreMes + " pertenece a la estación: " + estacion);
	}

}
