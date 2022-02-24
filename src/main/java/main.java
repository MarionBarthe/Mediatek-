import java.sql.*;
import java.util.ArrayList;

public class main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        /*ArrayList<String> users= connect();
        for (int i=0; i<users.size(); i++){
           System.out.println(users.get(i));
       }*/
    }

    public static ArrayList<String> connect() throws SQLException, ClassNotFoundException {
        String url, user, password, req1;

        Class.forName("com.mysql.cj.jdbc.Driver");

        url = "jdbc:mysql://localhost:3306/Mediatek";
        user = "root";
        password = "1827Kaamelott?";
        Connection conn = DriverManager.getConnection(url, user, password);

        ArrayList<String> utilisateurs = new ArrayList<>();
        req1 = "SELECT `loginU` FROM utilisateur";
        Statement st1 = conn.createStatement();
        ResultSet RS1 = st1.executeQuery(req1);

        while(RS1.next()) {
            String login = RS1.getString(1);
            utilisateurs.add(login);
        }

        RS1.close();
        st1.close();

        return utilisateurs;
    }
}
