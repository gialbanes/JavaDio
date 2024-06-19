public class ExemploContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3) // faz a verificação e só muda o fluxo da interação naquele momento, e não parou todo o laço
                continue;
            
            System.out.println(numero);
            
        }
    }
}
