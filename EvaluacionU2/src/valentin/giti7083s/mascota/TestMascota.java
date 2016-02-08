package valentin.giti7083s.mascota;

import java.util.Scanner;

/**
 * 
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */

public class TestMascota {
	/**
	 * M�todo test
	 */
	public void test(){
		Animal animal;
		double fig;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea la mascota deseada:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			animal = new Gato();
			break;
		case 2:
			animal = new Leon();
			break;
		case 3:
			animal = new Perro();
			break;
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TestMascota().test();
	}

}
