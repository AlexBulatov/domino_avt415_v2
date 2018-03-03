/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package romanow.domino;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author user
 */
public class TextFileldTable extends javax.swing.JFrame {
    int N=6, sz=30, x0=50;
    TextField tbl[]=new TextField[N*N];
    public TextFileldTable() {
        initComponents();
        this.setBounds(200, 100, 300, 300);
        for(int i=0;i<N;i++)
        for(int j=0;j<N;j++){
            final int k=i*N+j;          // Сохраняется по 1 экземпляру
            tbl[k]=new TextField();     // на каждый объект анонимного класса
            tbl[k].setBounds(x0+j*sz, x0+i*sz, sz, sz);
            tbl[k].setText(""+k);
            tbl[k].addActionListener(new ActionListener(){
                @Override               // Значение k - отдельно для каждого
                public void actionPerformed(ActionEvent e) {
                    int vv=Integer.parseInt(tbl[k].getText());
                    tbl[k].setText(""+(++vv));
                    }
                });  
            add(tbl[k]);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TextFileldTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TextFileldTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TextFileldTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TextFileldTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TextFileldTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}