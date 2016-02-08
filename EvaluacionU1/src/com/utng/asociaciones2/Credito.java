/**
 * 
 */
package com.utng.asociaciones2;

/**
 * @author Valentín Romero Téllez
 * @group GITI7083-S
 *
 */
public class Credito extends Pago{
	/**
	 * Declaración de variables
	 */
	private int numeroTdeCredito;
	private String tipo;
	private FechaDeExp fechaDeExp;
	private String nombre;
	
	/**
	 *
	 * @param total
	 * @return
	 */
	public static boolean hacerCargo(double total){
		return false;
	}
	

	/**
	 * Método constructor
	 */
	public Credito() {
		// TODO Auto-generated constructor stub
	}

}
