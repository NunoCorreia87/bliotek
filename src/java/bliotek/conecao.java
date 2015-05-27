package bliotek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @version 1.0
 */
public class conecao {

    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            createConnection();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Database connection closed");
        } catch (Exception ignored) {

        }
    }

    private static void createConnection() {
        try {
            String userName = "hr";
            String password = "hr";
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established");
        } catch (Exception e) {
            System.err.println("Cannot connect to database server");
            try {
                connection.close();
            } catch (Exception ignored) {

            }
            System.exit(1);
        }
    }

    public static boolean convertCharToBoolean(String returnedChar) {
        if (returnedChar.equals("y")) {
            return true;
        }
        return false;
    }

    public static String convertBooleanToString(boolean bool) {
        if (bool) {
            return "y";
        } else {
            return "n";
        }
    }

    public static Timestamp utilDateToSqlTimeStamp(java.util.Date uDate) {
        if(uDate == null){
            return null;
        }
        return new Timestamp(uDate.getTime());
    }

    public static Date sqlDateToutilDate(Timestamp sDate) {
        if(sDate == null){
            return null;
        }
        return new Date(sDate.getTime());
    }
}

