/**
 * 
 */
package com.utng.ayc;

import java.util.List;

/**
 * @author Valent�n Romero T�llez
 * @group GITI7083-S
 *
 */
public class Aplicacion {
	
	
	/**
	 * M�todo inicia
	 */
	public void inicia(){
		
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	

	/**
	 * M�todo constructor y dependencias de las clases
	 */
	public Aplicacion() {
		// TODO Auto-generated constructor stub
		Motor motor = new Motor();
		Coche coche = new Coche(null);
		Persona persona = new Persona(null);
	}

}
