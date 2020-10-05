package webapp.service;

import webapp.entity.User;

import java.sql.SQLException;

public interface UserService {
    User findByUsername(String username);
    User create(User user);
    User update(User user);
    void delete (User user);
}
