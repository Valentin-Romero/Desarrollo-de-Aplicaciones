/**
 * 
 */
package com.utng.asociaciones2;

import java.util.List;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Orden {
	/**
	 * Declaraci�n de variables
	 */
	private int hora;
	private String mesero;
	private Cliente cliente;	
	private List<Bebida> bebidas;
	private List<Platillo>platillos;
	private Pago pago;

	/**
	 * M�todo constructor
	 */
	public Orden(List<Bebida> bebidas, List<Platillo>platillos) {
		this.bebidas = bebidas;
		this.platillos = platillos;
		// TODO Auto-generated constructor stub
	}

}
