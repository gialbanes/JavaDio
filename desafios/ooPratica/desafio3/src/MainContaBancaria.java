import java.util.Scanner;

public class MainContaBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Criar uma nova conta bancária com o saldo inicial
        double saldoInicial = scanner.nextDouble();
        ContaBancaria conta = new ContaBancaria(saldoInicial);

        // Lê a Entrada com o valor do deposito e aciona o método "depositar"
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        // Lê a Entrada com o valor do saque e aciona o método "sacar"
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}

class ContaBancaria{
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valorDeposito) {
        // TODO: Incrementar o saldo com o valor e imprimir "Deposito feito."
        System.out.println("Deposito feito.");
        saldo += valorDeposito;
        imprimirSaldo();
    }

    public void sacar(double valorSaque) {
        // TODO: Verificar se o saldo é suficiente considerando o valor:
        if(valorSaque > saldo){
          System.out.println("Saldo insuficiente. Saque nao realizado.");
        } else {
          System.out.println("Saque feito.");
          saldo -= valorSaque;
        }
        imprimirSaldo();
    }
    
    private void imprimirSaldo() {
        System.out.printf("Saldo atual: %.1f\n", this.saldo);
    }

}