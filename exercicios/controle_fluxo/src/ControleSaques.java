import java.util.Scanner;

public class ControleSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

        for(int i=1; i<=limiteDiario; i++){
            double saque = scanner.nextDouble();

            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                // TODO: Atualizar o limite diário e imprimir a saída no formato dos exemplos.
                double saldoAtual = limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + saldoAtual + "\n Transacoes encerradas.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
        }
    }
