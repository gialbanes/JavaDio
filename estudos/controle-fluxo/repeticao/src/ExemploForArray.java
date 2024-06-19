public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x=0; x<alunos.length; x++){ //enquanto x for menor que o tamaho de alunos
            System.out.println("O aluno no indíce x=" + x + " é " + alunos[x]);
        }
    }
}
