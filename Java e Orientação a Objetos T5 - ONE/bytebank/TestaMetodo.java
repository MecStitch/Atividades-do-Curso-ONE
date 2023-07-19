
public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaMarcela = new Conta();
		contaMarcela.deposita(1000);
		
		if(contaMarcela.transfere(300, contaDoPaulo)){
			System.out.println("Transferencia com sucesso");
		}else {
			System.out.println("Não foi possivel fazer a transferencia");
		}
		
		
		System.out.println(contaMarcela.saldo);
		System.out.println(contaDoPaulo);
	}
}
