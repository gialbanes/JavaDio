import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VerificacaoNumeroPositivo{
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, -10, 5, 4, 3);

        List<Integer> numerosPositivos = numeros.stream()
        .filter(n -> n > 0)
        .collect(Collectors.toList()); //faz uma nova lista

        System.out.println("Os números positivos da lista são: " + numerosPositivos);
    }
}