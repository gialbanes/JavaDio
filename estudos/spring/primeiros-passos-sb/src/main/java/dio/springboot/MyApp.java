package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


// fazendo o seguinte: quando inicializar, cria o componente calculadora, que trá como dependência ouyro objeto calculadora e executa o método run; através do container tenho toda a cadeia de dependências;
@Component //esse componente terá o componente da calculadora 
public class MyApp implements CommandLineRunner{ 
    @Autowired // ao inicializar, ele percebe que o componente MyApp precisou injetar o componente calculadora atráves do autowired
    private Calculadora calculadora; //depende desse outro componente; não o instaciamos pois o spring boot é quem vai fazer isso;
    @Override
    public void run(String... args) throws Exception { 

		System.out.println("O resultado é " + calculadora.somar(2,7));
    }
}
