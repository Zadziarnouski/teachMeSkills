package webapp.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public enum ConnectionPool {
    INSTANCE;

    private Connection[] connections = null;

    ConnectionPool() {
    }

    public Connection getConnection() throws SQLException {
        if (connections == null) {
            initializeDbConnection();
        }
        Connection conn = null;
        for (int i = 0; i < connections.length; i++) {
            if (connections[i] != null) {
                conn = connections[i];
                connections[i] = null;
                break;
            }
        }
        return conn;
    }

    public void returnConnection(Connection conn) {
        for (int i = 0; i < connections.length; i++) {
            if (connections[i] == null) {
                connections[i] = conn;
                return;
            }
        }
    }

    private void initializeDbConnection() throws SQLException {
        connections = new Connection[10];
        Properties properties = new Properties();
        properties.setProperty("db.user", "taras");
        properties.setProperty("db.password", "03081994Taras");
        properties.setProperty("db.url", "jdbc:mysql://localhost:3306/library?useUnicode=true&&serverTimezone=UTC&characterEncoding=UTF-8");
            while (hasFreeSlots()) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                Connection conn = DriverManager.getConnection(properties.getProperty("db.url"), properties.getProperty("db.user"), properties.getProperty("db.password"));
                returnConnection(conn);      
        }
    }

    private boolean hasFreeSlots() {
        boolean isFreeSlotAvailable = false;
        for (int i = 0; i < connections.length; i++) {
            if (connections[i] == null) {
                isFreeSlotAvailable = true;
                break;
            }
        }
        return isFreeSlotAvailable;
    }
}
