public abstract class Conta implements IConta{
    public static final int agencia_padrao = 1;
    private static int sequencial = 1;
    //com "protected" as filhas conseguem acessar, seja atributo ou método
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected  Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.agencia_padrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }
    @Override
    public void sacar(double valor){
        saldo -= valor;
    }
    @Override
    public void depositar(double valor){
        saldo += valor;
    }
    @Override
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor); //sacando o valor
        contaDestino.depositar(valor); //transferindo p outra conta
    }

    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
