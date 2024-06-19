public class ExemploForEach {
    public static void main(String[] args) {
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        // elacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção

        for (String aluno : alunos) { // : a cada interação de aluno, o aluno do indíce atual vai obter um novo valor
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
