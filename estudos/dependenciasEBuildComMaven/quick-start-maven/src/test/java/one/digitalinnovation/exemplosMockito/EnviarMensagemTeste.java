package one.digitalinnovation.exemplosMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnviarMensagemTeste {
    
    @Spy //referencia um obj real da classe; para conhecer o comportamento da classe
    private EnviarMensagem enviarMensagem;

    @Test
    void verificarComportamentodaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem); //verifica se não houve interação com essa classe
        
        Mensagem mensagem = new Mensagem("Hello World");
        enviarMensagem.adicionarMensagem(mensagem);

        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty()); //verifica se a lista está recebendo a mensagem que foi add
    }
}
