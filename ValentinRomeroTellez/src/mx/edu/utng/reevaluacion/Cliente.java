/**
 * 
 */
package mx.edu.utng.reevaluacion;

/**
 * 
 * @author Valent�n Romero T�llez
 * @date 04/03/2016
 * @group GITI7083-S
 *
 */

public class Cliente {

	public void usa(){
		IBanco banco = new IBanco() {
			
			@Override
			public void operacionesBancarias() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public void solicita(){
		ICredito credito = new ICredito() {
			
			@Override
			public void estadoCrediticio() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
	public void verifica(){
		AVerificador verificar = new AVerificador() {
			
			@Override
			void getCredito() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			void getBanco() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
