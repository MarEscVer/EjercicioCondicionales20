package unico;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/* Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas.
 * El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa
 * o chocolate. La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar
 * la tarta de chocolate, el programa debe preguntar además si el chocolate es negro o blanco;
 * la primera opción vale 14 euros y la segunda 15. Por último se pregunta si se añade nata y
 * si se personaliza con un nombre; la nata suma 2.50 y la escritura del nombre 2.75.
*/

		final int MANZANA = 18;
		final int FRESA = 16;
		final int CHOCOLATENEGRO = 14;
		final int CHOCOLATEBLANCO = 15;
		final double PRECIONATA = 2.50;
		final double PRECIONOMBRE = 2.75;
		
		int sabor;
		double precioSabor = 0;
		String conNata;
		String conNombre;
		String tipoChocolate = null;
		boolean valor = true;
		
		System.out.print("Elija un sabor (1 - manzana, 2 - fresa o 3 - chocolate): ");
		sabor = Integer.parseInt(teclado.nextLine());
		
		switch (sabor) {
			case 1:
				precioSabor = MANZANA;
				break;
			case 2:
				precioSabor = FRESA;
				break;
			case 3:
				System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
				tipoChocolate = teclado.nextLine();
				if (tipoChocolate.equalsIgnoreCase("negro")) {
					precioSabor = CHOCOLATENEGRO;
				} else {
					precioSabor = CHOCOLATEBLANCO;
				}
				break;
			default:
				valor = false;
		}
		
		System.out.print("¿Quiere nata? (si o no): ");
		conNata = teclado.nextLine();
		
		System.out.print("¿Quiere ponerle un nombre? (si o no): ");
		conNombre = teclado.nextLine();
		
		System.out.print("Tarta de " + sabor);
		if (sabor == 3) {
			System.out.print(" " + tipoChocolate);
			}
		System.out.println(": " + precioSabor + " €");
		
		if (conNata.equalsIgnoreCase("si")) {
			System.out.println("Con nata: " + PRECIONATA + " €");
		}
		
		if (conNombre.equalsIgnoreCase("si")) {
			System.out.println("Con nombre: " + PRECIONOMBRE + " €");
		}
		
		System.out.println("Total: " + (precioSabor + PRECIONATA + PRECIONOMBRE));
		
	}
}