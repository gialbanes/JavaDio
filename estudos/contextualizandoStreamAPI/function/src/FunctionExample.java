import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    /**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizada para transformar, ou mapear os elementos do Stream em outros valores, ou tipos.
 */

    public static void main(String[] args) {
        //criando lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //usando a function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //usando a funcao para dobrar todos os numeros no Stream e armazena-los em outra lista
        // a partir do stream chama o map, para mapear um valor p outro valor
        List<Integer> numerosDobrados = numeros.stream()
            .map(dobrar)
            .collect(Collectors.toList());
    }
}
