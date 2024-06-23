public class Carro {
    public void ligar(){
        confereCambio(); // os métodos existem, mas estão private e serão chamados somente quando necessário
        confereCombustivel();
        System.out.println("carro ligado");
    }
    private void confereCambio(){ // métodos encapsulados, são executados antes de ligar o carro dentro do método ligar 
        System.out.println("Conferindo cambio em P");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }
}
