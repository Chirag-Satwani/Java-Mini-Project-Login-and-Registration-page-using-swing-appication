/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testswingapplication24;

import java.awt.Color;

/**
 *
 * @author Hello
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        upperPanel = new javax.swing.JPanel();
        message1 = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        lowerPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        upperPanel.setBackground(new java.awt.Color(153, 0, 153));
        upperPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Upper Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 204, 153))); // NOI18N
        upperPanel.setToolTipText("This is upper panel");
        upperPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                upperPanelMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                upperPanelMouseDragged(evt);
            }
        });
        upperPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upperPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upperPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                upperPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                upperPanelMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upperPanelMouseClicked(evt);
            }
        });

        message1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message1.setForeground(new java.awt.Color(255, 255, 255));

        message2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        message2.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(message2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lowerPanel.setBackground(new java.awt.Color(0, 204, 153));
        lowerPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lower Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(153, 0, 153))); // NOI18N
        lowerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lowerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lowerPanelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout lowerPanelLayout = new javax.swing.GroupLayout(lowerPanel);
        lowerPanel.setLayout(lowerPanelLayout);
        lowerPanelLayout.setHorizontalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );
        lowerPanelLayout.setVerticalGroup(
            lowerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lowerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(upperPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lowerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upperPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseEntered
       upperPanel.setBackground(Color.RED);
       message1.setText("Mouse entered...");
    }//GEN-LAST:event_upperPanelMouseEntered

    private void upperPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseExited
        upperPanel.setBackground(Color.ORANGE);
         message1.setText("Mouse Exit");        // TODO add your handling code here:
    }//GEN-LAST:event_upperPanelMouseExited

    private void lowerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowerPanelMouseEntered
       lowerPanel.setBackground(Color.cyan);        // TODO add your handling code here:
    }//GEN-LAST:event_lowerPanelMouseEntered

    private void lowerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowerPanelMouseExited
       lowerPanel.setBackground(Color.PINK);  // TODO add your handling code here:
    }//GEN-LAST:event_lowerPanelMouseExited

    private void upperPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMousePressed
        message1.setText("Mouse pressed...");
    }//GEN-LAST:event_upperPanelMousePressed

    private void upperPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseReleased
 message1.setText("Mouse released...");        // TODO add your handling code here:
    }//GEN-LAST:event_upperPanelMouseReleased

    private void upperPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseClicked
 message1.setText("Mouse clicked...");        // TODO add your handling code here:
    }//GEN-LAST:event_upperPanelMouseClicked

    private void upperPanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseMoved
           message2.setText("Moving Mouse"+evt.getX()+","+evt.getY());        // TODO add your handling code here:
    }//GEN-LAST:event_upperPanelMouseMoved

    private void upperPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upperPanelMouseDragged
 message2.setText("Moving Drag "+evt.getX()+","+evt.getY());        // TODO add your handling code here:
    }//GEN-LAST:event_upperPanelMouseDragged

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel lowerPanel;
    private javax.swing.JLabel message1;
    private javax.swing.JLabel message2;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
}
