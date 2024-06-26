import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operação que aceita um argumento do tipo T(qualquer tipo) e
 * não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos
 * elementos do Stream sem modificar, ou
 * retornar um valor.
 */

public class ConsumerExample {
    public static void main(String[] args) {
        //criando uma lista de números inteiros 
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);

        //usando o consumer com expressão lambda(define a lógica do consumer) para IMPRIMIR números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if(numero%2 == 0){
                System.out.print(numero + " ");
            }
        };

        //usando o consumer para imprimir números pares do Stream
        // o foreach é o responsável por imprimir 
        //quando eu passo o consumer p dentro do forEach, o numero que está como argumento no lambda é suibtituido por cada elemento de dentro do list daqui
        // o forEach recebe o Consumer; itera sobre cada elemento da lista e aplica o Consumer fornecido a cada elemento.
        numeros.stream().filter(n ->  n % 2 == 0)
        .forEach(System.out::println);
    }
}
