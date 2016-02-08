/**
 * 
 */
package valentin.giti7083s.figuras;

import java.util.Scanner;

import giti7083s.valentin.animal.Gato;
import giti7083s.valentin.animal.Perro;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class TestFiguras {
	/**
	 * M�todo test
	 */
	public void test(){
		Figura figura;
		double fig;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea la figura para calcular el �rea:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			fig = new Circulo().area();
			break;
		case 2:
			fig = new Cuadrado().area();
			break;
		}
	}
	
	public static void main(String[] args) {
		new TestFiguras().test();
	}

}
