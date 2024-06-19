import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while(mesada > 0) {
            Double valorDoce = valorAleatorio(); // ele pega um doce com um valor aleatorio
            /* 
            if(valorDoce > mesada)
                valorDoce = mesada;*/

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce; // aqui ela foi tratada para ser falsa; quando a mesada se tornar negativa, menor que 0, ele para de executar;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");
        
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(2, 8); // ThreadLocalRandom.current().nextDouble: vai me dar os valores dos doces entre 2 e 8
    }
}
