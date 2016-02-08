/**
 * 
 */
package com.utng.asociaciones;

import java.util.Date;
import java.util.List;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class ProveedorCalificado {
	/**
	 * Declaración de variables
	 */
	private Date FechaCalificacion;
	private int cal_ID;
	private int pr_ID;
	private List<Calificacion> calificaciones;	
	private Calificacion caificacion;

	/**
	 * Método constructor
	 */
	public ProveedorCalificado(List<Calificacion> calificaciones,Calificacion caificacion) {
		this.calificaciones = calificaciones;
		// TODO Auto-generated constructor stub
	}

}
