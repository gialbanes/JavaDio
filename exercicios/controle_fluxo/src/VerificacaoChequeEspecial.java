import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double saque = scanner.nextDouble();
        double limiteChequeEspecial = 500; // Define um limite para o cheque especial

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldoAtual) {
            System.out.println("Transacao realizada com sucesso."); // TODO: Imprimir "Transação realizada com sucesso."
        } else {
          double valorDisponivelComChequeEspecial = saldoAtual + limiteChequeEspecial;
            if(saque <= valorDisponivelComChequeEspecial){ // TODO: Verificar se o saque ultrapassa o limite do cheque especial
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial."); // Em caso positivo, imprimir "Transacao realizada com sucesso utilizando o cheque especial."
            } else{
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido."); // Caso contrário, imprimir "Transacao nao realizada. Limite do cheque especial excedido."
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
