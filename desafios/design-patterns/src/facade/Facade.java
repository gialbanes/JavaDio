package facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        //recuperando os dados
        String cidade = CepApi.getInstancia().reuperarCidade(cep);
        String estado = CepApi.getInstancia().reuperarEstado(cep);

        //gravando o cliente
        CrmService.gravaCliente(nome, cep, cidade, estado);
    }
}
