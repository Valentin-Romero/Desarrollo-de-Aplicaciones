/**
 * 
 */
package valentin.giti7083s.figura;
/**
 * 
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class Circulo extends Figura{
	/**
	 * Declaración de variables
	 */
	private Punto centro=null;
	private double radio;
	
	/**
	 * Método constructor
	 */
	public Circulo() {
		// TODO Auto-generated constructor stub
		System.out.println("area: " + calcularArea());
		System.out.println("perimetro " + calcularPerimetro());
	}

}
