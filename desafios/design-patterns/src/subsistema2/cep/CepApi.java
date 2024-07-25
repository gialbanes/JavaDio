package subsistema2.cep;

public class CepApi {
        private static CepApi instancia = new CepApi(); //aqui a instancia já é

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String reuperarCidade(String cep){
        return "Cananeia";
    }

    public String reuperarEstado(String cep){
        return "SP";
    }
}
