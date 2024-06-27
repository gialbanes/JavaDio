import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class MediaMaioresQueCInco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
        .filter(n -> n > 5)
        .mapToDouble(Integer::doubleValue) //converte para o tipo primitivo int, pois o método sum so aceita streams de tipo primitivo
        .average(); // faz a média

        System.out.println("A média dos números maiores que 5 é: " + media);

    }
}
