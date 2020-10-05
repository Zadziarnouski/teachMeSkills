package webapp.dao;

import webapp.dao.util.ConnectionPool;
import webapp.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Locale;


public class UserDaoImpl implements UserDao {
    @Override
    public User findByUsername(String username) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.INSTANCE.getConnection();
            PreparedStatement ps = null;
            try {
                ps = connection.prepareStatement("SELECT * from library.userdb where username= ?");
                ps.setString(1, username);
                ResultSet rs = ps.executeQuery();
                return CreateUser(rs);
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } finally {
            if (connection != null) {
                ConnectionPool.INSTANCE.returnConnection(connection);
            }
        }
    }

    private User CreateUser(ResultSet rs) throws SQLException {
        User user = new User();
        while (rs.next()) {
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setName(rs.getString("name"));
        }
        return user;
    }

    @Override
    public User create(User user) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.INSTANCE.getConnection();
            PreparedStatement ps = null;
            try {
                ps = connection.prepareStatement("INSERT INTO library.userdb (username, password, name) VALUES (?,?,?)");
                ps.setString(1, user.getUsername());
                ps.setString(2, user.getPassword());
                ps.setString(3, user.getName());
                ps.executeUpdate();
                User userNew = User.builder().username(user.getUsername()).password(user.getPassword()).name(user.getName()).build();
                return userNew;
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } finally {
            if (connection != null) {
                ConnectionPool.INSTANCE.returnConnection(connection);
            }
        }
    }

    @Override
    public User update(User user) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.INSTANCE.getConnection();
            PreparedStatement ps = null;
            try {
                connection = ConnectionPool.INSTANCE.getConnection();
                ps = connection.prepareStatement("UPDATE library.userdb SET password = ?, name = ? WHERE username = ?");
                ps.setString(1, user.getPassword());
                ps.setString(2, user.getName());
                ps.setString(3, user.getUsername());
                return user;
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } finally {
            if (connection != null) {
                ConnectionPool.INSTANCE.returnConnection(connection);
            }
        }
    }

    @Override
    public void delete(User user) throws SQLException {
        Connection connection = null;
        try {
            connection = ConnectionPool.INSTANCE.getConnection();
            PreparedStatement ps = null;
            try {
                connection = ConnectionPool.INSTANCE.getConnection();
                ps = connection.prepareStatement("DELETE FROM library.userdb WHERE username = ?");
                ps.setString(1, user.getUsername());
                ps.executeUpdate();
            } finally {
                if (ps != null) {
                    ps.close();
                }
            }
        } finally {
            if (connection != null) {
                ConnectionPool.INSTANCE.returnConnection(connection);
            }
        }
    }
}
