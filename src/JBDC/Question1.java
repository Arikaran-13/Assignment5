package JBDC;
import java.sql.*;
public class Question1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

String url = "jdbc:mysql://localhost:3306/mydb";
String un = "root";
String pass = "123456";
String q = "select name from student_table where id = 1";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,un,pass);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(q);
       String name =   rs.getString("username");
       rs.next();
        System.out.println(name);
        st.close();
        con.close();



    }
}
