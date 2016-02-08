package valentin.giti7083s.futbol;

import java.util.Scanner;
/**
 * 
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */

public class TestFutbol {
	/**
	 * Método para la selección del animal
	 */
	public void test() {
		IntegranteSeleccionFutbol persona;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea el personal deseado:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			persona = new Entrenador();
			break;
		case 2:
			persona = new Futbolista();
			break;
		case 3:
			persona = new Masajista();
			break;
		}
	}
	
	public static void main(String[] args) {
		new TestFutbol().test();
	}

}
