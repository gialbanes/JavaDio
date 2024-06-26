import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    /**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

    public static void main(String[] args) {
        //criar lista de números inteiros
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);

        //usando o BinaryOperator com expressão lambda para somar dois números inteiros
        //por mais que receba dois argumentos, basta informar só uma vez
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        //usar o BinaryOperator para somar todos os números no Stream 
        int resultado = numeros.stream()
        //conforme os elementos vão passando, cada um vai somando ao 0 até terminar o laço do stream
            .reduce(0, somar); //identity: representa como se fosse uma varável temporária

            //se eu não soubesse implementar o BInaryOperator
            /*
             .reduce(identity:0, new BinaryOperator<Integer> (){
             @Override
             public INteger apply(Integer n1, Integer n2){
             return n1 + n2;
             }
             });
             */

            //se eu não soubesse implementar o BinaryOperator e quisesse colocar lambda
            /*
             .reduce(identity:0, (n1, n2) -> n1 + n2);
             */
        //imprimir o resultado da soma
        System.out.println("A soma do números é: " + resultado);
    }
}
