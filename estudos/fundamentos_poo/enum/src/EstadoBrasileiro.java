// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
	SAO_PAULO ("SP","São Paulo", 10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
	PIAUI ("PI", "Piauí", 12),
	MARANHAO ("MA","Maranhão", 13) ; // determinou a sigla e o nome de cada objeto
	
	private String nome;
	private String sigla;
    private int ibge; // o enum vai precisar de um nome e uma sigla 
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) { // método construtor que exige que os objetos já iniciem com um valor 
		this.sigla = sigla;
		this.nome = nome;
        this.ibge = ibge;
	}
	public String getSigla() {  // retorna a sigla
		return sigla;
	}
	public String getNome() { // retorna o nome
		return nome;
	}
    public int getIbge() { // retorna o id ibge 
		return ibge;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase(); // o método pega o nome do estado e deixa tudo maiúsculo 
	}
	
}
