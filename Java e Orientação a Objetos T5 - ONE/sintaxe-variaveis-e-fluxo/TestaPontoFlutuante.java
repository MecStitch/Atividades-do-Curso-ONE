
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario = 1250.70;
		
		System.out.println("Meu salario é: " + salario);
		
		///////////////////////////////////
		
		int valor = 12.5;           //NÂO COMPILA.
		
		int valor2 = 0.0;          //NÃO COMPILA.
		
		double teste = 125.50;    //COMPILA.
		
		int valor3 = teste;      //NÃO COMPILA.
		
		///////////////////////////////////
		             //ERRADO
		               
		int divisao = 5 / 2;
		
		System.out.println(divisao);
		
		///////////////////////////////////
		             //CERTO
		
		double divisao = 5.0 / 2;
		
		System.out.println(divisao);
		
		
	}
}
