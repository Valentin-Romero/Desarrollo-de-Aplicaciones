/**
 * 
 */
package giti7083s.valentin.animal;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public abstract class Animal implements InterfaceAnimal{
	/**
	 * Declaraci�n de variables
	 */
	public String nombre;
	
	/**
	 * Constructor
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * M�todo que define el tipo de animal
	 */
	public static void tipoAnimal(){
		
	}
	
	/**
	 * @return el nombre del animal
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre establece el nombre del animal
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
