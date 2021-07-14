/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caro;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author 84985
 */
public class CAIRI extends javax.swing.JFrame {

    private boolean check = true;
    private ImageIcon icon;
    private int[][] list = new int[3][3];

    public CAIRI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(3, 3));

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn1.setIcon(icon);
            list[0][0] = 1;
            if (list[0][0] == 1 && list[1][1] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][0] == 1 && list[0][1] == 1 && list[0][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][0] == 1 && list[1][0] == 1 && list[2][0] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn1.setIcon(icon);
            list[0][0] = 2;
            if (list[0][0] == 2 && list[1][1] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][0] == 2 && list[0][1] == 2 && list[0][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][0] == 2 && list[1][0] == 2 && list[2][0] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn2.setIcon(icon);
            list[0][1] = 1;
            if (list[0][0] == 1 && list[0][1] == 1 && list[0][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][1] == 1 && list[1][1] == 1 && list[2][1] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn2.setIcon(icon);
            list[0][1] = 2;
            if (list[0][0] == 2 && list[0][1] == 2 && list[0][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][1] == 2 && list[1][1] == 2 && list[2][1] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn3.setIcon(icon);
            list[0][2] = 1;
            if (list[0][0] == 1 && list[0][1] == 1 && list[0][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][2] == 1 && list[1][2] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][2] == 1 && list[1][1] == 1 && list[2][0] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn3.setIcon(icon);
            list[0][2] = 2;

            if (list[0][0] == 2 && list[0][1] == 2 && list[0][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][2] == 2 && list[1][2] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][2] == 2 && list[1][1] == 2 && list[2][0] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn4.setIcon(icon);
            list[1][0] = 1;
            if (list[1][0] == 1 && list[1][1] == 1 && list[1][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }

            if (list[0][0] == 1 && list[1][0] == 1 && list[2][0] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn4.setIcon(icon);
            list[1][0] = 2;
            if (list[1][0] == 2 && list[1][1] == 2 && list[1][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][0] == 2 && list[1][0] == 2 && list[2][0] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn5.setIcon(icon);
            list[1][1] = 1;
            if (list[0][0] == 1 && list[1][1] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][1] == 1 && list[1][1] == 1 && list[2][1] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][2] == 1 && list[1][1] == 1 && list[2][0] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[1][0] == 1 && list[1][1] == 1 && list[1][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn5.setIcon(icon);
            list[1][1] = 2;
            if (list[0][0] == 2 && list[1][1] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][1] == 2 && list[1][1] == 2 && list[2][1] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][2] == 2 && list[1][1] == 2 && list[2][0] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[1][0] == 2 && list[1][1] == 2 && list[1][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn6.setIcon(icon);
            list[1][2] = 1;
            if (list[0][2] == 1 && list[1][2] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[1][0] == 1 && list[1][1] == 1 && list[1][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn6.setIcon(icon);
            list[1][2] = 2;
            if (list[0][2] == 2 && list[1][2] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[1][0] == 2 && list[1][1] == 2 && list[1][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn7.setIcon(icon);
            list[2][0] = 1;
            if (list[0][0] == 1 && list[1][0] == 1 && list[2][0] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[0][2] == 1 && list[1][1] == 1 && list[2][0] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            if (list[2][0] == 1 && list[2][1] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn7.setIcon(icon);
            list[2][0] = 2;
            if (list[0][0] == 2 && list[1][0] == 2 && list[2][0] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[0][2] == 2 && list[1][1] == 2 && list[2][0] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            if (list[2][0] == 2 && list[2][1] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn8.setIcon(icon);
            list[2][1] = 1;
      
            if (list[2][0] == 1 && list[2][1] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
               if (list[0][1] == 1 && list[1][1] == 1 && list[2][1] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn8.setIcon(icon);
            list[2][1] = 2;
             if (list[2][0] == 2 && list[2][1] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
               if (list[0][1] == 2 && list[1][1] == 2 && list[2][1] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (check == true) {
            this.icon = new ImageIcon("src/caro/X.png");
            btn9.setIcon(icon);
            list[2][2] = 1;
            if (list[0][0] == 1 && list[1][1] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
             if (list[2][0] == 1 && list[2][1] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
              if (list[0][2] == 1 && list[1][2] == 1 && list[2][2] == 1) {
                JOptionPane.showMessageDialog(this, "X chiến thắng");
                return;
            }
            check = false;
        } else {
            this.icon = new ImageIcon("src/caro/O.png");
            btn9.setIcon(icon);
            list[2][2] = 2;
            if (list[0][0] == 2 && list[1][1] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
               if (list[2][0] == 2 && list[2][1] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
              if (list[0][2] == 2 && list[1][2] == 2 && list[2][2] == 2) {
                JOptionPane.showMessageDialog(this, "O chiến thắng");
                return;
            }
            check = true;
        }
    }//GEN-LAST:event_btn9ActionPerformed

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
            java.util.logging.Logger.getLogger(CAIRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CAIRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CAIRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CAIRI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CAIRI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
