package mx.edu.utng.reevaluacion;
/**
 * 
 * @author Valentín Romero Téllez
 * @date 04/03/2016
 * @group GITI7083-S
 *
 */

public class USA extends AVerificador{

	@Override
	void getBanco() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void getCredito() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * Método para las dependencias
	 */
	public void crear(){
		BancoUSA bancoU = new BancoUSA();
		CreditoUSA creditoU = new CreditoUSA();
	}

}
