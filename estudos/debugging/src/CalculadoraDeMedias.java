

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos  = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for(String aluno : alunos) { //aqui a variável aluno está recebendo o valor de cada elemento do array
            System.out.printf("Nota do aluno %s: ", aluno); //pede a nota do aluno atual
            double nota = scanner.nextDouble();//le a entrada do usuário como double e armazena na variável nota
            soma += nota;
        }

        return soma / alunos.length;//retorna o numero de elementos no array
    }

}