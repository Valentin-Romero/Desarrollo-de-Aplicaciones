/**
 * 
 */
package valentin.giti7083s.figura;
/**
 * 
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Circulo extends Figura{
	/**
	 * Declaraci�n de variables
	 */
	private Punto centro=null;
	private double radio;
	
	/**
	 * M�todo constructor
	 */
	public Circulo() {
		// TODO Auto-generated constructor stub
		System.out.println("area: " + calcularArea());
		System.out.println("perimetro " + calcularPerimetro());
	}

}
