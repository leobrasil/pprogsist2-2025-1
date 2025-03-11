import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://db.eqyhoqnircqzeoxgyjqh.supabase.co:5432/postgres";
			String username="postgres";
			String password="9THDBPHcEP2ntL6R";
			Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM PROPRIETARIOS");

            while(rs.next()){
                System.out.println(rs.getString("ID"));
            }



    }
}
