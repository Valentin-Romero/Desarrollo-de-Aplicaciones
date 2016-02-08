/**
 * 
 */
package valentin.giti7083s.animal;

import java.util.Scanner;

import valentin.giti7083s.figuras.Circulo;
import valentin.giti7083s.figuras.Cuadrado;
import valentin.giti7083s.figuras.Figura;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class TestAnimal {
	public void test(){
		Animal animal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea el animal deseado:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			animal = new Elefante();
			break;
		case 2:
			animal = new Leon();
			break;
		case 3:
			animal = new Pato();
			break;
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TestAnimal().test();
	}
}
