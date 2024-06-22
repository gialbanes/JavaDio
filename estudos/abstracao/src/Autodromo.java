public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("12345");
        //jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("6789");
        //x400.ligar();

        Veiculo coringa = z400;

        coringa.ligar(); // mantém o método correspondente mas não sabe como vai ser, ela depende do polimorfismo da classe a qual ela atende 
    }
}
