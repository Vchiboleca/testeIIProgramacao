package interfacegraficacontagemvotos;

import contagemvotos.ContagemVotos;
import contagemvotos.Municipio;

/**
 *
 * @author Virgilio Chiboleca
 */
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        registro = new javax.swing.JMenu();
        telaMunicipio = new javax.swing.JMenuItem();
        telaCandidatos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        submenuVotar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        registro.setText("Registro");

        telaMunicipio.setText("Municipio");
        telaMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaMunicipioActionPerformed(evt);
            }
        });
        registro.add(telaMunicipio);

        telaCandidatos.setText("Candidatos");
        telaCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaCandidatosActionPerformed(evt);
            }
        });
        registro.add(telaCandidatos);

        jMenuBar1.add(registro);

        jMenu4.setText("Votacão");

        submenuVotar.setText("Votar");
        submenuVotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenuVotarActionPerformed(evt);
            }
        });
        jMenu4.add(submenuVotar);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("Relatórios");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void telaMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaMunicipioActionPerformed
        // TODO add your handling code here:
        TelaMunicipio municipio = new TelaMunicipio();
        municipio.setVisible(true);
        desktop.add(municipio);
    }//GEN-LAST:event_telaMunicipioActionPerformed

    private void telaCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaCandidatosActionPerformed
        // TODO add your handling code here:
       
        TelaCandidatos candidatos = new TelaCandidatos();
        candidatos.setVisible(true);
        desktop.add(candidatos);
    }//GEN-LAST:event_telaCandidatosActionPerformed

    private void submenuVotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenuVotarActionPerformed
        // TODO add your handling code here:
        ContagemVotos contagemVotos = new ContagemVotos();
        TelaVotar votar = new TelaVotar(contagemVotos);
        votar.setVisible(true);
        desktop.add(votar);
    }//GEN-LAST:event_submenuVotarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu registro;
    private javax.swing.JMenuItem submenuVotar;
    private javax.swing.JMenuItem telaCandidatos;
    private javax.swing.JMenuItem telaMunicipio;
    // End of variables declaration//GEN-END:variables
}
