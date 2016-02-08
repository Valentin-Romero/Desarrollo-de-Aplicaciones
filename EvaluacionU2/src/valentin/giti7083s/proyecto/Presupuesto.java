/**
 * 
 */
package valentin.giti7083s.proyecto;

import java.util.Date;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public abstract class Presupuesto implements IConsultarEstado {
	/**
	 * Declaración de varaibles
	 */
	private Date fecha;
	private String descripcion;
	private double importe;
	private String estado;

}
