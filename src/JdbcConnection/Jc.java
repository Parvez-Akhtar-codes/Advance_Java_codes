package JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jc {
    public static void main(String[] args) throws SQLException {
    //creating the connection
        String url = "jdbc:postgresql://localhost/test";
        Connection cn = null;

        int rollno =2;
        String name = "Zaid";
        int age = 20;
        String sql = "insert into student(rollno,name,age) " +"values(" +rollno+ ",'" +name+ "'," +age+ ")";

        try{
            cn = DriverManager.getConnection(url,"postgres","admin");
            Statement st = cn.createStatement();
            int m = st.executeUpdate(sql);
            if(m==1){
                System.out.println("Data insterted successfully : "+sql);

            }else {
                System.out.println("failed");
            }
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            cn.close();
        }

    }
}
