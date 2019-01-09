/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module1;
import employee.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dhiru
 */
public class emplogin extends javax.swing.JFrame {

    /**
     * Creates new form emplogin
     */
    public emplogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        empusername = new javax.swing.JTextField();
        emppassword = new javax.swing.JPasswordField();
        emplogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Login");
        setMaximumSize(new java.awt.Dimension(380, 320));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("Employee Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("Username");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        getContentPane().add(empusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 161, -1));
        getContentPane().add(emppassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 161, -1));

        emplogin.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        emplogin.setText("Login");
        emplogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emploginActionPerformed(evt);
            }
        });
        getContentPane().add(emplogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/module1/user_lock1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -30, 450, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emploginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emploginActionPerformed
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empmanagement?autoReconnect=true&useSSL=false","root","login");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emplogin");
            int flag =0;
            while(rs.next())
            {
                if(rs.getString(2).equals(empusername.getText())&& rs.getString(3).equals(emppassword.getText()));
                {
                    flag = 1;
                }
            }
            if(flag==1)
            {
                empdatabase field = new empdatabase();
                field.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Login credentials incorrect");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(emplogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_emploginActionPerformed

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
            java.util.logging.Logger.getLogger(emplogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emplogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emplogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emplogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emplogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton emplogin;
    private javax.swing.JPasswordField emppassword;
    private javax.swing.JTextField empusername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
