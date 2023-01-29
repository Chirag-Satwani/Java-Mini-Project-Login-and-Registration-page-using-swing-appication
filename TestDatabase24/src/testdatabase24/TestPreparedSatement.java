/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdatabase24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Hello
 */
public class TestPreparedSatement {

    public static void main(String[] args) 
    {
        Connection con= null;
        PreparedStatement pst=null;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter id");
        int id=sc.nextInt();
        
        System.out.println("Enter Name:");
        String name=sc.next();
        
        System.out.println("Enter salary:");
        int salary=sc.nextInt();
        
        System.out.println("Enter city:");
        String city =sc.next();
        
        
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Loaded");
            
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db24","root","root");
            System.out.println("'connected");
             
            pst=con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?)");
            
           pst.setInt(1,id);
           pst.setString(2,name);
           pst.setInt(3,salary);
           pst.setString(4,city);
           
            int i=pst.executeUpdate();
            if(i>0){
                System.out.println(i+"Record inserted");
                
            }
            else{
                System.out.println("Record Insertion failed...");
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

    


    

