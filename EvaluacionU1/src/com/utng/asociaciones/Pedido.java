/**
 * 
 */
package com.utng.asociaciones;

import java.util.Date;
import java.util.List;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Pedido {
	/**
	 * Declaraci�n de variables
	 */
	private double pe_id;
	private Date pe_fechapedido;
	private Date pe_fechanecesidad;
	private Date pe_fechaprogramada;
	private Date pe_fechaentrega;
	private int pe_estado;
	private List<Articulo> articulos;
	

	/**
	 * M�todo constructor
	 */
	public Pedido(List<Articulo> articulos) {
		this.articulos = articulos;
		// TODO Auto-generated constructor stub
	}

}
