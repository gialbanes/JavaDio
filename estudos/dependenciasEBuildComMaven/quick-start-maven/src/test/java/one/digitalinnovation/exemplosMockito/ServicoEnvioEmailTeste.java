package one.digitalinnovation.exemplosMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicoEnvioEmailTeste {

    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    @Captor
    private ArgumentCaptor<Email> captor;

    @Test
    void validarDadosEviadosParaPlataforma(){
        String enderecoEmail = "usuarioteste.com.br";
        String mensagem = "Olá teste";
        boolean ehFormatoHTML = false;

        servico.enviaEmail(enderecoEmail, mensagem, ehFormatoHTML);

        Mockito.verify(plataforma).enviaEmail(captor.capture()); //mockito, verifica no mock (plataforma) se o email foi enviado e captura ele p mim

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
    
}
