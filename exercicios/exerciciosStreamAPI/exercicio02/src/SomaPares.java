import java.util.Arrays;
import java.util.List;

public class SomaPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       int somaDosPares = numeros.stream()
       .filter(n -> n % 2 ==0) //está fazendo o filtro dos numeros pares
       .mapToInt(Integer::intValue) //converte para o tipo primitivo int, pois o método sum so aceita streams de tipo primitivo
       .sum(); //realiza a soma

       System.out.println("A soma dos númros pares é: " + somaDosPares);

    }
}
