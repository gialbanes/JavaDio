import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class VerificarMaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        OptionalInt maiorQue10 = numeros.stream()
        .filter(n -> n >10)
        .mapToInt(Integer::intValue)
        .findAny(); //verifica de algum numero é maior que 10

        if (maiorQue10.isPresent()) {
            System.out.println("Existem números maiores que 10 na lista");
        } else{
            System.out.println("Não existem números maiores que 10 na lista");
        }
    }
}
