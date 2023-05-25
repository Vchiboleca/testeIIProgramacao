package interfacegraficacontagemvotos;

import contagemvotos.Municipio;
import contagemvotos.ContagemVotos;
import javax.swing.JOptionPane;

/**
 *
 * @author Virgilio Chiboleca
 */
public class TelaMunicipio extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaMunicipio
     */
    public TelaMunicipio() {
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
        txtDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNrRecenceados = new javax.swing.JTextField();
        salvarMunicipio = new javax.swing.JButton();

        setClosable(true);
        setTitle("Registo de Municipios");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Registo de Munícipios");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Província");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Nº de Recenceados");

        salvarMunicipio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salvarMunicipio.setForeground(new java.awt.Color(51, 51, 51));
        salvarMunicipio.setText("Salvar");
        salvarMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarMunicipioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salvarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDescricao)
                                .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNrRecenceados, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNrRecenceados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(salvarMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        setBounds(0, 0, 821, 490);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarMunicipioActionPerformed
        // TODO add your handling code here:

        try {
            String descricao = txtDescricao.getText();
            String provincia = txtProvincia.getText();
            int nrDeRecenceados = Integer.parseInt(txtNrRecenceados.getText());
            ContagemVotos contagem = new ContagemVotos();
            contagem.registrarMunicipio(descricao, provincia, nrDeRecenceados);

            JOptionPane.showMessageDialog(null, "Municipio adicionado com Sucesso");

            txtDescricao.setText(null);
            txtProvincia.setText(null);
            txtNrRecenceados.setText(null);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Municipio nao adicionado");
            txtDescricao.setText(null);
            txtProvincia.setText(null);
            txtNrRecenceados.setText(null);
        }

    }//GEN-LAST:event_salvarMunicipioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton salvarMunicipio;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNrRecenceados;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables
}
