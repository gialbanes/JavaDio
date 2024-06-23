public abstract class Veiculo { //classe genérica, onde possui os atributos em comum de carro e moto 
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    public abstract void ligar(); // uma única finalidade com comportamentos diferentes em carro e moto 
}
