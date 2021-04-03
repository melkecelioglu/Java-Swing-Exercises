/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxdemo;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author melikekecelioglu
 */
public class MiniOddEvenGame extends javax.swing.JFrame {

    static int score = 0;
    static int count = 0;

    Random r = new Random();
    int randomNum;

    /**
     * Creates new form MiniOddEvenGame
     */
    public MiniOddEvenGame() {
        initComponents();
        randomNum = r.nextInt(100);
        lblNumber.setText(String.valueOf(randomNum));
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
        lblNumber = new javax.swing.JLabel();
        lblScore = new javax.swing.JLabel();
        btnOdd = new javax.swing.JButton();
        btnEven = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SCORE");

        lblScore.setBackground(new java.awt.Color(51, 204, 0));

        btnOdd.setText("ODD");
        btnOdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddActionPerformed(evt);
            }
        });

        btnEven.setText("EVEN");
        btnEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEven, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblScore, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOdd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEven, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblScore, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddActionPerformed
        // TODO add your handling code here:

        count = count + 1;
        int num = Integer.parseInt(lblNumber.getText());
        if (count == 10) {
            if (num % 2 == 0) {
                score++;
                lblScore.setText(String.valueOf(score));
                randomNum = r.nextInt(100);

            } else {
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));

            }
            JOptionPane.showMessageDialog(this, "Your score is: " + score + " /10");
            count = 0;
            score = 0;
            lblScore.setText(" ");
            randomNum = r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));

        } else {
            if (num % 2 != 0) {
                score++;
                lblScore.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            } else {
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            }
        }

    }//GEN-LAST:event_btnOddActionPerformed

    private void btnEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvenActionPerformed
        // TODO add your handling code here:

        count = count + 1;
        int num = Integer.parseInt(lblNumber.getText());
        if (count == 10) {
            if (num % 2 == 0) {
                score++;
                lblScore.setText(String.valueOf(score));
                randomNum = r.nextInt(100);

            } else {
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));

            }
            JOptionPane.showMessageDialog(this, "Your score is: " + score + " /10");
            count = 0;
            score = 0;
            lblScore.setText(" ");
            randomNum = r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));

        } else {
            if (num % 2 != 0) {

                lblScore.setText(String.valueOf(score));
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
            } else {
                randomNum = r.nextInt(100);
                lblNumber.setText(String.valueOf(randomNum));
                score++;
            }
        }

    }//GEN-LAST:event_btnEvenActionPerformed

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
            java.util.logging.Logger.getLogger(MiniOddEvenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniOddEvenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniOddEvenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniOddEvenGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MiniOddEvenGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEven;
    private javax.swing.JButton btnOdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblScore;
    // End of variables declaration//GEN-END:variables
}
