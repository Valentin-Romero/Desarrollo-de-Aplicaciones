/**
 * 
 */
package com.utng.asociaciones2;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Credito extends Pago{
	/**
	 * Declaraci�n de variables
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
	 * M�todo constructor
	 */
	public Credito() {
		// TODO Auto-generated constructor stub
	}

}
