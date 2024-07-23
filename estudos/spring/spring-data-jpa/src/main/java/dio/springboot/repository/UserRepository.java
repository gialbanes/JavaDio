package dio.springboot.repository;

import dio.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository; //apresenta uma cadeia de métodos

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
