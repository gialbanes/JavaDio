public abstract class Conta implements IConta{
    public static final int agencia_padrao = 1;
    private static int sequencial = 1;
    //com "protected" as filhas conseguem acessar, seja atributo ou método
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.agencia_padrao;
        this.numero = sequencial++;
    }
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo += valor;
    }
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
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }
}
