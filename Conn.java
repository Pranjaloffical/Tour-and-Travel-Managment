
package tourandtravel;
import java.sql.*;
public class Conn {
    //public static void main(String[] args){
        Connection c;
        Statement s;
       public Conn(){
           try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               c=DriverManager.getConnection("jdbc:mysql:///shy?autoRecoonect=true&seSSL=false","root","pranjal");
               s=c.createStatement();
           }catch(Exception e){
               
           }
           
}
}
