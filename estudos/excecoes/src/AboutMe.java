import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        // quando da erro por uma excao, só da erro, o usuário não recebe uma instrução do que deve fazer. Então o tratamento de excao vem com a proposta de como tratar esses erros e informar o usuário

        //criando o objeto scanner

        //possíveis erros: não informar nome e sobrenome; a idade ter um dado nao numerico; a altura ter írgula e não ponto;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try{
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        } 
        catch(InputMismatchException e){ //o erro apresentado foi atribuido aqui para que seja tratado
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
