package mx.edu.utng.reevaluacion;
/**
 * 
 * @author Valentín Romero Téllez
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
	 * Método crear para las dependencias a las clases
	 */
	public void crear(){
		BancoMexico bancoM = new BancoMexico();
		CreditoMexico creditoM = new CreditoMexico();
	}
}
