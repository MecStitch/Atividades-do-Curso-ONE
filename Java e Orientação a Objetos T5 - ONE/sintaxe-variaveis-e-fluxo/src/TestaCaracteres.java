
public class TestaCaracteres {

	public static void main(String[] args) {
		
		char letra = 'a';
		System.out.println(letra);
		
		char valor = 65;            //COMPILA!
		System.out.println(valor);
		
		//valor = valor + 1;         NÃO COMPILA!
		
		valor = (char) (valor + 1);         //COMPILA!
		System.out.println(valor);
		
		String palavra = "Alura cursos online de Tecnologia";
		System.out.println(palavra);
		
		palavra = palavra + 2020;
		System.out.println(palavra);
	}
}
