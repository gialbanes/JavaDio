public class Carro extends Veiculo{ // classe especializada
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("carro ligado");
    }
    private void confereCambio(){
        System.out.println("conferindo cambio em P");
    }
    private void confereCombustivel(){
        System.out.println("conferindo combustivel");
    }
}
