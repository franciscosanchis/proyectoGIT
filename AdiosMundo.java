/*
 *@author Francisco Javier Sanchis Herrero
 */
import java.util.Scanner;
public class AdiosMundo {

	private static final double NUMERO_PI = 3.1416;
	public static void main (String[] args) {
		double radio;
		double base;
		double altura;
		double cateto1;
		double cateto2;


		Scanner input = new Scanner (System.in);
		System.out.print("\nDime el valor del `radio´ de un círculo: ");
		radio = input.nextDouble();
		input.nextLine();

		System.out.print("\nAhora dime el valor de la `base´ de un rectángulo: ");
		base = input.nextDouble();
		input.nextLine();

		System.out.print("\nNo olvides decirme también el valor de la `altura´ del rectángulo: ");
		altura = input.nextDouble();
		input.nextLine();


		System.out.printf("\nDe momento tenemos un círculo de perímetro %.2f y área %.2f y un rectángulo de área %.2f.\n", (2*NUMERO_PI)*radio, NUMERO_PI*(radio*radio), base*altura);
		//System.out.printf("\nDe momento tenemos un círculo de perímetro " + ((2*NUMERO_PI)*radio) + " y área " + (NUMERO_PI*(radio*radio)) + " y un rectángulo de área " + (base*altura));
		
		System.out.print("\nMe gusta el teorema de Pitágoras, dime el valor del `cateto 1´ : ");
		cateto1 = input.nextDouble();
		input.nextLine();

		System.out.print("\nY también del `cateto 2´ :");
		cateto2 = input.nextDouble();
		input.nextLine();

		double hipotenusaAlCuadrado = (cateto1*cateto1)+(cateto2*cateto2);
		double raiz = Math.sqrt(hipotenusaAlCuadrado);

		System.out.printf("\nVale, pues el valor de la hipotenusa al cuadrado es %.2f, por lo tanto el valor de la hipotenusa es %.2f", hipotenusaAlCuadrado, raiz);
		//System.out.printf("\nVale, pues el valor de la hipotenusa al cuadrado es " + ((cateto1*cateto1)+(cateto2*cateto2)), "por lo tanto el valor de la hipotenusa es ");
		input.nextLine();


			//Cuando utilizamos un nextInt este busca números enteros hasta que los encuentra, 
		//y si no los encuentra utiliza el INTRO para finalizar su camino, por tanto en los siguientes 
		//ingresos a teclados nos afectaría al código.
	}
}