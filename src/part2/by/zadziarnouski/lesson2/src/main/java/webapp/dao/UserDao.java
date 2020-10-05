package webapp.dao;

import webapp.entity.User;

import java.sql.SQLException;

public interface UserDao {
    User findByUsername(String username) throws SQLException;
    User create(User user) throws SQLException;
    User update(User user) throws SQLException;
    void delete (User user) throws SQLException;
}
