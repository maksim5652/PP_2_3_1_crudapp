package crud.service;

import crud.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    public void saveUser(User user);

    public User getUserById(Long id);

    public List<User> getAllUsers();

    public void updateUser(User updateUser);

    public void removeUserById(long id);
}
