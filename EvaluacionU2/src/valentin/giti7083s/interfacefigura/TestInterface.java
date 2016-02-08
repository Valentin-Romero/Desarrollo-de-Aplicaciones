/**
 * 
 */
package valentin.giti7083s.interfacefigura;

import java.util.Scanner;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class TestInterface {
	/**
	 * Método test para elegir el tipo de figura
	 */
	public void test() {
		Figura figura;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea la figura que deseas:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			figura = new Cuadrado();
			break;
		case 2:
			figura = new Circulo();
			break;
		case 3:
			figura = new Triangulo();
			break;
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TestInterface().test();
	}

}
