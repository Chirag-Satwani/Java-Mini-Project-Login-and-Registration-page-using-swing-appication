/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswingapplication24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hello
 */
public class Login extends javax.swing.JFrame 
{

    Connection con = null;
    Statement st = null;
    ResultSet rs= null;
    
    public Login() throws ClassNotFoundException, SQLException {
        initComponents();
        errorMessage.setVisible(false);
        errorMessage2.setVisible(false);
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded");
            
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/db24","root","root");
            System.out.println("connected");
            
            st=con.createStatement();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println("e");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        uPass = new javax.swing.JPasswordField();
        resetButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        registraionPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        registerId = new javax.swing.JTextField();
        registerName = new javax.swing.JTextField();
        registerPass = new javax.swing.JPasswordField();
        registerSalary = new javax.swing.JTextField();
        registerCity = new javax.swing.JTextField();
        registerResetButton = new javax.swing.JButton();
        registerSubmitButton = new javax.swing.JButton();
        errorMessage2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(0, 153, 153));
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(0, 102, 102)))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Username :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Password :");

        uName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });

        uPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        resetButton.setBackground(new java.awt.Color(153, 255, 255));
        resetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 51, 51));
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(153, 255, 255));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 51, 51));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        errorMessage.setBackground(new java.awt.Color(0, 153, 153));
        errorMessage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage.setText("username or password may incorrect");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uPass))))
                .addContainerGap())
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        registraionPanel.setBackground(new java.awt.Color(0, 102, 153));
        registraionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Register Here", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 153, 255))); // NOI18N

        exitButton.setBackground(new java.awt.Color(255, 255, 51));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(153, 0, 0));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("ID               :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Name         :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password  :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Salary        :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("City            :");

        registerId.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        registerName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        registerPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPassActionPerformed(evt);
            }
        });

        registerSalary.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        registerSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSalaryActionPerformed(evt);
            }
        });

        registerCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        registerResetButton.setBackground(new java.awt.Color(0, 153, 153));
        registerResetButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerResetButton.setForeground(new java.awt.Color(0, 0, 204));
        registerResetButton.setText("Reset");
        registerResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerResetButtonActionPerformed(evt);
            }
        });

        registerSubmitButton.setBackground(new java.awt.Color(0, 153, 153));
        registerSubmitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerSubmitButton.setForeground(new java.awt.Color(0, 0, 204));
        registerSubmitButton.setText("Register");
        registerSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerSubmitButtonActionPerformed(evt);
            }
        });

        errorMessage2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorMessage2.setForeground(new java.awt.Color(204, 0, 0));
        errorMessage2.setText("any of the field shall not be empty");

        javax.swing.GroupLayout registraionPanelLayout = new javax.swing.GroupLayout(registraionPanel);
        registraionPanel.setLayout(registraionPanelLayout);
        registraionPanelLayout.setHorizontalGroup(
            registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registraionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(registraionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(registraionPanelLayout.createSequentialGroup()
                        .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registerId)
                            .addComponent(registerName)
                            .addComponent(registerPass)
                            .addComponent(registerSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))
                    .addGroup(registraionPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registraionPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(registerResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerCity, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registraionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        registraionPanelLayout.setVerticalGroup(
            registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registraionPanelLayout.createSequentialGroup()
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registraionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registraionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerResetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(registerSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorMessage2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registraionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registraionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
uName.setText(""); 
uPass.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_resetButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       String username = uName.getText();
       char p[] = uPass.getPassword();
       String password = new String(p);
       String tablePassword= "";
       
       try
       {
           String query= "SELECT emppassword FROM emp  WHERE empname='"+username+"'";
           System.out.println("query="+query);
           rs= st.executeQuery(query);
           if(rs.next())
           {
             tablePassword=rs.getString(1);
             
           }
       } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        if(password.equals(tablePassword))
        {
            Home h1= new Home();
            h1.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            errorMessage.setVisible(true);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void registerPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerPassActionPerformed

    private void registerSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerSalaryActionPerformed

    private void registerResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerResetButtonActionPerformed
        registerId.setText("");
        registerName.setText("");
        registerPass.setText("");
        registerSalary.setText("");
        registerCity.setText("");
        errorMessage2.setText("");
    }//GEN-LAST:event_registerResetButtonActionPerformed

    private void registerSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerSubmitButtonActionPerformed
       char p[]= registerPass.getPassword();      //to check if an array is empty or not , use .length()==0 method
       String password2 =new String(p); 
       String id= registerId.getText();
       String name=registerName.getText();
       String salary = registerSalary.getText();
       String city=registerCity.getText();
       
       String tableid;
       boolean uniqueId=true;
       try
       {
           String query= "SELECT empid FROM emp";
           rs=st.executeQuery(query);
           
           
           
           
           
                                       //or in place of creating a loop . set emoid as primary key(that means it will contain only unique elements)
                                                           //     i.e.create query      ALTER TABLE emp
            while(rs.next())                                                     //     ADD PRIMARY KEY (empid)
           {                      
                                       // or you can create a query to "SELECT * FROM emp WHERE empid =id"   and drop in if else
             
             
               tableid=rs.getString(1);
               
               if(tableid.equals(id))
               {
                   errorMessage2.setText("Id should be Unique");
                   errorMessage2.setVisible(true);
                   uniqueId=false;
                   break;
               }
               
             
           }
           
       } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      
       
       
       
       
        
         if(registerId.getText().isEmpty()||registerName.getText().isEmpty()||password2.isEmpty()|| registerSalary.getText().isEmpty()||registerCity.getText().isEmpty())
        {
           errorMessage2.setVisible(true);
           
        }
        else
         {  if(uniqueId==true){
            try
            {
                String query= "INSERT INTO emp VALUES ('"+id+"','"+name+"','"+password2+"','"+salary+"','"+city+"')";
                int i=st.executeUpdate(query);         //kind of iterator
                
                if(i>0)
                {
                    errorMessage2.setText("registered Successfully");
                    errorMessage2.setVisible(true);
                }
                else
                {
                    errorMessage2.setText("Registration failed");
                    errorMessage2.setVisible(true);
                }
                
                
                
                
            } 
            
             catch (SQLException ex) {
               Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
         else{
             errorMessage2.setText("Id should be Unique");
             errorMessage2.setVisible(true);
         }
         
        }
        
    }//GEN-LAST:event_registerSubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Login().setVisible(true);
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel errorMessage2;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JTextField registerCity;
    private javax.swing.JTextField registerId;
    private javax.swing.JTextField registerName;
    private javax.swing.JPasswordField registerPass;
    private javax.swing.JButton registerResetButton;
    private javax.swing.JTextField registerSalary;
    private javax.swing.JButton registerSubmitButton;
    private javax.swing.JPanel registraionPanel;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField uName;
    private javax.swing.JPasswordField uPass;
    // End of variables declaration//GEN-END:variables
}
