package valentin.giti7083s.pelota;

import java.util.Scanner;

import valentin.giti7083s.figuras.Circulo;
import valentin.giti7083s.figuras.Cuadrado;
import valentin.giti7083s.figuras.Figura;

/**
 * 
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class TestPelota {
	private void test(){
		Rebotable objeto;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea el objeto que deseas:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			objeto = new Llanta();
			break;
		case 2:
			objeto = new PelotaFutbol();
			break;
		}
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		new TestPelota().test();
	}

}
