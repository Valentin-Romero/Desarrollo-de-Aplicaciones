/**
 * 
 */
package valentin.giti7083s.acciones;

import java.util.Scanner;

import valentin.giti7083s.figuras.Circulo;
import valentin.giti7083s.figuras.Cuadrado;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class TestAccion {
	/**
	 * M�todo test
	 */
	public void test(){
		AccionesHumano humano;
		AccionesSeresVivos accion;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea el ser humano deseado:");
		int seleccion = scanner.nextInt();
	
		switch (seleccion) {
		case 1:
			humano = new Humano();
			break;
		case 2:
			accion = new Animal();
			break;
		}
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TestAccion().test();
	}

}
