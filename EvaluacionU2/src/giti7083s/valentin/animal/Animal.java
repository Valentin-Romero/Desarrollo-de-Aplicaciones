/**
 * 
 */
package giti7083s.valentin.animal;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public abstract class Animal implements InterfaceAnimal{
	/**
	 * Declaración de variables
	 */
	public String nombre;
	
	/**
	 * Constructor
	 */
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método que define el tipo de animal
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
