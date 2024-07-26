package dio.spring.service;

import dio.spring.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}