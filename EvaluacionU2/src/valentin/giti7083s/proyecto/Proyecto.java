/**
 * 
 */
package valentin.giti7083s.proyecto;

import java.util.Date;
import java.util.List;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Proyecto {
	/**
	 * Declaraci�n de variables
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
