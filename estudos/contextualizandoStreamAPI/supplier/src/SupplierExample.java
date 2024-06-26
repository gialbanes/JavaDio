import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExample {
    /**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
    public static void main(String[] args) {
        //usar o supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!"; //não recebe argumento, mas retorna um resultado do mesmo tipo

        //usar o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao) //chamei o método generate da interface stream, o qual recebe o supplier
            .limit(5)
            .collect(Collectors.toList()); //colocar as saudacoes dentro de uma lista, o método recebe um coletor

            //imprimir as saudações geradas
            listaSaudacoes.forEach(s -> System.out.println(s)); //o forEach recebe um consumer

            //estou gerando as frases e chamando o supplier, determinando que eu quero 5 frases e que essas frases sejam armazenadas em uma lista
    }
}
