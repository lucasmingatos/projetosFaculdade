package aula05;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class FormCadastrarAluno extends javax.swing.JInternalFrame {

    
    public FormCadastrarAluno() {
        initComponents();
        configurarFormulario();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblCurso = new javax.swing.JLabel();
        cbxCurso = new javax.swing.JComboBox<>();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();

        lblCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblCodigo.setText("Código");

        txtCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N

        txtNome.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        lblCurso.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblCurso.setText("Curso");

        cbxCurso.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cbxCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCursoActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lblNome.setText("Nome");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(cbxCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCurso)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 198, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblCodigo)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnSalvar))
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblCodigo)
                    .addContainerGap(273, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Aluno a = new Aluno();
        a.setCodigo(Integer.parseInt(txtCodigo.getText()));
        a.setNome(txtNome.getText());
        a.setCurso(cbxCurso.getSelectedItem().toString());
        FormMDI.lista.add(a);

        JOptionPane.showMessageDialog(null, "Operação realizada com sucesso!");
        txtCodigo.setText("");
        txtNome.setText("");
        cbxCurso.setSelectedIndex(0);

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void cbxCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    
    private void configurarFormulario(){
        this.setTitle("Cadastrar Aluno");
        this.setResizable(false);
        this.setClosable(true);
        this.setMaximizable(false);
        this.setIconifiable(false);
        
        configurarCombo();
        
    }
    
    private void configurarCombo(){
        DefaultComboBoxModel m = new DefaultComboBoxModel (new Object[]{
            "Engenharia da computação", "Medicina", "Direito", "Fisioterapia"});
        
        cbxCurso.setModel(m);
    }
}
