package JBDC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String un = "root";
            String pwd = "123456";
            String q = " insert into student_table values(2,'alex','pass')";

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, un, pwd);
            Statement st = con.createStatement();
            int rowsffected = st.executeUpdate(q);
            System.out.println(rowsffected);
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}