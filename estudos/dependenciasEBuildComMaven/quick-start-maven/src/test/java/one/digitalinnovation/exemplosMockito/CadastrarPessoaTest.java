package one.digitalinnovation.exemplosMockito;

import static org.mockito.ArgumentMatchers.anyString;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    
    @Mock
    private ApiDosCorreios apiDosCorreios; //mockar a Api, posso configurar para q a dependencia se comporte da forma q eu quiser

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void lancarExceptionQuandoChamarApiDosCorreios(){
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenThrow(IllegalArgumentException.class);
        Assertions.assertThrows(IllegalArgumentException.class, () -> cadastrarPessoa.cadastrarPessoa("Giovana", "1234567", LocalDate.now(), "11990000"));
    }
    
    @Test
    void validarDadosDeCadastro(){
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("SP", "Cananeia", "Rua A", "Casa", "Rocio");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString())).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Giovana", "1234567", LocalDate.now(), "11990000");

        Assertions.assertEquals("Giovana", pessoa.getNome());
        Assertions.assertEquals("1234567", pessoa.getDocumento());
        Assertions.assertEquals("SP", pessoa.getEndereco().getUf());
        Assertions.assertEquals("Casa", pessoa.getEndereco().getComplemento());
    }
}
