package crud.service;

import crud.dao.UserDao;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }


    @Override
    public User getUserById(Long id) {
        return userDao.getById(id);
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Override
    @Transactional
    public void updateUser(User updateUser) {
        userDao.updateUser(updateUser);

    }


    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }
}
