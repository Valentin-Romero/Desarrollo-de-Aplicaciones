package mx.edu.utng.reevaluacion;
/**
 * 
 * @author Valent�n Romero T�llez
 * @date 04/03/2016
 * @group GITI7083-S
 *
 */

public class Mexico extends AVerificador{

	@Override
	void getBanco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getCredito() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * M�todo crear para las dependencias a las clases
	 */
	public void crear(){
		BancoMexico bancoM = new BancoMexico();
		CreditoMexico creditoM = new CreditoMexico();
	}
}
