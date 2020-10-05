package webapp.service;

import webapp.dao.UserDao;
import webapp.entity.User;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User findByUsername(String username)  {
        try {
            return userDao.findByUsername(username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User create(User user) {
        try {
            return userDao.create(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User update(User user) {
        try {
            return userDao.update(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void delete(User user) {
        try {
            userDao.delete(user);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
