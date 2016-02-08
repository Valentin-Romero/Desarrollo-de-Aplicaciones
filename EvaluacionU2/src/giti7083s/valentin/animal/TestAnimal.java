package giti7083s.valentin.animal;

import java.util.Scanner;

import valentin.giti7083s.interfacefigura.Circulo;
import valentin.giti7083s.interfacefigura.Cuadrado;
import valentin.giti7083s.interfacefigura.Figura;
import valentin.giti7083s.interfacefigura.Triangulo;
/**
 * 
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class TestAnimal {
	/**
	 * M�todo para la selecci�n del animal
	 */
	public void test() {
		Animal animal;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea el animal que deseas:");
		int seleccion = scanner.nextInt();

		switch (seleccion) {
		case 1:
			animal = new Perro();
			break;
		case 2:
			animal = new Gato();
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
