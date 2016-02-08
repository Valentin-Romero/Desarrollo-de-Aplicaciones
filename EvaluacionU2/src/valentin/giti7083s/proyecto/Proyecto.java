/**
 * 
 */
package valentin.giti7083s.proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class Proyecto {
	/**
	 * Declaración de variables
	 */
	private String nombre;
	private String planificacion;
	private Date fechaInicio;
	private Date fechaFin;
	private String descripcion;
	private String estado;
	private List<Maquina> tieneAsignadas;
	private List<Presupuesto> tiene;

}
