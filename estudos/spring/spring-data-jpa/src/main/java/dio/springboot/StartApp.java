package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.springboot.model.User;
import dio.springboot.repository.UserRepository;

@Component //componente gerenciado pelo springframework
public class StartApp implements CommandLineRunner{
    @AutoWired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception{
        User user = new User();
        user.setName("Giovana");
        user.setUsername("gigi");
        user.setPassword("dio1234");

        repository.save(user);

        for(User u : repository.findAll()){ //p ter certeza de que o usuário foi salvo
            System.out.println(u);
        }
    }
}
