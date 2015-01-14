/**
 * 
 */
/**
 * @author Julyfable
 *
 */
package test;
import java.sql.*;

public class test {

public static void main(String[] args){

           // ����������
           String driver = "com.mysql.jdbc.Driver";

           // URLָ��Ҫ���ʵ����ݿ���scutcs
           String url = "jdbc:mysql://127.0.0.1:3306/test";

           // MySQL����ʱ���û���
           String user = "root"; 
  
           // MySQL����ʱ������
           String password = "";

           try { 
            // ������������
            Class.forName(driver);

            // �������ݿ�
            Connection conn = DriverManager.getConnection(url, user, password);

            if(!conn.isClosed()) 
             System.out.println("Succeeded connecting to the Database!");

            // statement����ִ��SQL���
            Statement statement = conn.createStatement();

            // Ҫִ�е�SQL���
            String sql = "select * from test";

            // �����
            ResultSet rs = statement.executeQuery(sql);

            System.out.println("-----------------");
            System.out.println("ִ�н��������ʾ:");
            System.out.println("-----------------");
            System.out.println(" ����" + "\t" + "�Ա�");
            System.out.println("-----------------");

            String name = null;

            while(rs.next()) {
    
            
             name = rs.getString("name");
    
             // ����ʹ��ISO-8859-1�ַ�����name����Ϊ�ֽ����в�������洢�µ��ֽ������С�
             // Ȼ��ʹ��GB2312�ַ�������ָ�����ֽ�����
             name = new String(name.getBytes("ISO-8859-1"),"GB2312");

             // ������
             System.out.println(rs.getString("sex") + "\t" + name);
            }

            rs.close();
            conn.close();

           } catch(ClassNotFoundException e) {


            System.out.println("Sorry,can`t find the Driver!"); 
            e.printStackTrace();


           } catch(SQLException e) {


            e.printStackTrace();


           } catch(Exception e) {


            e.printStackTrace();


           } 
} 
}