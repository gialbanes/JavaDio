package one.digitalinnovation.exemplosMockito;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class) //sempre incluir para usar o mockito
public class ListaTeste {
    
    @Mock
    private List<String> letras; //mockando a lista de letras

    @Test
    void adicionarItemNaLista(){
        Mockito.when(letras.get(0)).thenReturn("B"); //quando o mockito chamar o index 0 da lista, mostrar a letra B

        Assertions.assertEquals("B", letras.get(0)); //JUnit
    }
}
