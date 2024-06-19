import java.util.Scanner;

public class ValidacaoNumeroContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            String numeroConta = scanner.nextLine();
                verificarNumeroConta(numeroConta);// TODO: Chamar o método que veritica se o número da conta é valido
                System.out.println("Número de conta válido"); // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage()); // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            }finally {
                scanner.close(); // Fechar o scanner para evitar vazamentos de recursos
            }
        }
    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException{
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos."); // TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Numero de conta invalido. Digite exatamente 8 digitos."
        }
    }
}
