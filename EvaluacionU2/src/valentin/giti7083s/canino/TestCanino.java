/**
 * 
 */
package valentin.giti7083s.canino;

import java.util.Scanner;

import valentin.giti7083s.figuras.Circulo;
import valentin.giti7083s.figuras.Cuadrado;
import valentin.giti7083s.figuras.Figura;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class TestCanino {
	/**
	 * Método test
	 */
	public void test(){
		Animal animal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Información del animal:");

		animal = new Perro();

	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TestCanino().test();
	}

}
