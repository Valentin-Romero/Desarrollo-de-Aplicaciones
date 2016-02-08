/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class Orden {
	/**
	 * Declaración de variables
	 */
	private int hora;
	private String mesero;
	private Cliente cliente;	
	private List<Bebida> bebidas;
	private List<Platillo>platillos;
	private Pago pago;

	/**
	 * Método constructor
	 */
	public Orden(List<Bebida> bebidas, List<Platillo>platillos) {
		this.bebidas = bebidas;
		this.platillos = platillos;
		// TODO Auto-generated constructor stub
	}

}
