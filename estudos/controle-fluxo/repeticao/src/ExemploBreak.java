public class ExemploBreak {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3) // quando chega ao número 3, ele interrompe TODO o for
                break;
            
            System.out.println(numero);
            
        }
    }
}
