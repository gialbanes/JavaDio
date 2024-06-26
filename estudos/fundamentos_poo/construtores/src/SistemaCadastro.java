public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa giovana = new Pessoa("123", "Giovana");
		
		//definimos o endereço de giovana
		giovana.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do giovana ? a partir do construtor, por meio do fornecimento de valores de atributos que são importantes na criação do objeto; é importante usar só quando necessário; 
		
		//imprimindo o giovana sem o nome e cpf
		
		System.out.println(giovana.getNome() + "-" + giovana.getCpf());
	}
}
