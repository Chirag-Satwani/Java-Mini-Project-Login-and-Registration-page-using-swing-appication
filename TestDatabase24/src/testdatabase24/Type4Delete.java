/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatabase24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hello
 */
public class Type4Delete {

    public static void main(String[] args) 
    {
        Connection con= null;
        Statement st=null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db24","root","root");
            System.out.println("'connected");
             
            st=con.createStatement();
            String query= "DELETE FROM emp where empid=105";
            int i=st.executeUpdate(query);
            if(i>0){
                System.out.println(i+"Record Deleted");
                
            }
            else{
                System.out.println("Record Deletion failed...");
            }
                 
                
                
             
            con.close();
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);       
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
    }
}
