/**
 * 
 */
package com.utng.asociaciones;

import java.util.List;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Articulo {
	/**
	 * Declaraci�n de variables
	 */
	private String art_ID;
	private String art_Descripcion;
	private int art_estado;
	private int art_tipo;
	private int art_cantidad;
	private double art_cantidadcritica;
	private double art_cantidaddoble;
	private List<Rubro>rubros;

	/**
	 * M�todo constructor 
	 */
	public Articulo(List<Rubro>rubros,Precios precios) {
		this.rubros = rubros;
		// TODO Auto-generated constructor stub
	}

}
