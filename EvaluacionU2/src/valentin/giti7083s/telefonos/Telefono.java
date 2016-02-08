/**
 * 
 */
package valentin.giti7083s.telefonos;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public interface Telefono {
	/**
	 * 
	 * @param numero
	 * @return numero
	 */
	public int marcarNumero(Numero numero);
	
	/**
	 * 
	 * @return llamada en proceso
	 */
	public boolean llamadaEnProceso();

}
