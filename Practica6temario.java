/*
 *@author: Francisco Javier Sanchis Herrero
 */

import java.util.Scanner;
public class Practica6temario {

	public static final int OPCION1 = 1;
	public static final int OPCION2 = 2;
	public static final int OPCION3 = 3;
	public static final int OPCION4 = 4;
	public static final int OPCION5	= 5;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Introduce tu primer número (Recuerda, números enteros): ");
		int numero1 = input.nextInt();

		System.out.print("Introduce tu segundo número (Recuerda, números enteros: ");
		int numero2 = input.nextInt();

		System.out.println("Muy bien, ahora entre estas cuatro opciones, elige la que prefieras");
		System.out.println("Opción 1: Sumar ambos números");
		System.out.println("Opción 2: Restar ambos números");		
		System.out.println("Opción 3: Multriplicar ambos números");
		System.out.println("Opción 4: Dividir ambos números");
		System.out.println("Opción 5: Cancelar");
		int eleccion = input.nextInt();

		switch(eleccion) {
			case 1: 
					System.out.print("Resultado Opción 1: " + (numero1+numero2));
					break;

			case 2: System.out.print("Resultado Opción 2: " + (numero1-numero2));
					break;

			case 3: System.out.print("Resultado Opción 3: " + (numero1*numero2));
					break;

			case 4: System.out.print("Resultado Opción 4: " + (numero1/numero2));
					break;

			case 5: System.out.print("cancelado");
					break;
		}


	}
















}