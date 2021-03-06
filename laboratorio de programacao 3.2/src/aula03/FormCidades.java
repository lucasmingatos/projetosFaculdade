/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

public class FormCidades extends javax.swing.JFrame {

    //lista dinâmica
    private List<String> cidades;
    
    
    public FormCidades() {
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

        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCidade = new javax.swing.JList<>();
        cbxCidade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnInformacoes = new javax.swing.JScrollPane();
        txtInformacoes = new javax.swing.JTextArea();
        lblInformacoes = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCidade.setText("Cidade");

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        btnAdicionar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdicionar.setText("+");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lstCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lstCidade.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstCidadeMouseClicked(evt);
            }
        });
        lstCidade.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCidadeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCidade);

        cbxCidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cbxCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCidadeItemStateChanged(evt);
            }
        });
        cbxCidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxCidadeMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Lista de Cidades (JList = Listar)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Lista de Cidades (JComboBox)");

        txtInformacoes.setColumns(20);
        txtInformacoes.setRows(5);
        spnInformacoes.setViewportView(txtInformacoes);

        lblInformacoes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblInformacoes.setText("Informações");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblCidade)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAdicionar)))
                    .addComponent(jLabel3)
                    .addComponent(cbxCidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnInformacoes, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInformacoes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(lblInformacoes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spnInformacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed

        if(!txtCidade.getText().isEmpty()){

            //Adicionar a cidade ao JList
            DefaultListModel m1 = (DefaultListModel)lstCidade.getModel();
            m1.addElement(txtCidade.getText());
            lstCidade.setModel(m1);

            //Adicionar a cidade ao JCombo
            DefaultComboBoxModel m2 = (DefaultComboBoxModel)cbxCidade.getModel();
            m2.addElement(txtCidade.getText());
            cbxCidade.setModel(m2);

        }

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void lstCidadeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCidadeValueChanged
        
        
    }//GEN-LAST:event_lstCidadeValueChanged

    private void lstCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstCidadeMouseClicked
        //retornar a posição do elemento selecionado
        int pos = lstCidade.getSelectedIndex();
        
        if ( pos >= 0 ){
            
            //retornar o elemento selecionado
            DefaultListModel m = (DefaultListModel)
                    lstCidade.getModel();
            
            String elem = m.get(pos).toString();
            
            txtInformacoes.append("Pos.: " + pos + "\n");
            txtInformacoes.append("Elem.: " + elem + "\n\n");
        }
    }//GEN-LAST:event_lstCidadeMouseClicked

    private void cbxCidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxCidadeMouseClicked
        
    }//GEN-LAST:event_cbxCidadeMouseClicked

    private void cbxCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCidadeItemStateChanged
        //retornar a posição do elemento selecionado
        int pos = cbxCidade.getSelectedIndex();
        
        if ( pos >= 0 ){
            
            //retornar o elemento selecionado
            DefaultComboBoxModel m = (DefaultComboBoxModel)
                    cbxCidade.getModel();
            
            String elem = m.getElementAt(pos).toString();
            
            txtInformacoes.append("Pos.: " + pos + "\n");
            txtInformacoes.append("Elem.: " + elem + "\n\n");
        }
        
        
    }//GEN-LAST:event_cbxCidadeItemStateChanged

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
            java.util.logging.Logger.getLogger(FormCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JComboBox<String> cbxCidade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblInformacoes;
    private javax.swing.JList<String> lstCidade;
    private javax.swing.JScrollPane spnInformacoes;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextArea txtInformacoes;
    // End of variables declaration//GEN-END:variables


    private void configurarFormulario(){
        this.setTitle("Cidades");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        cidades = new ArrayList<>();
        cidades.add("Ribeirão Preto");
        cidades.add("São Paulo");
        cidades.add("Cravinhos");
        cidades.add("Sertãozinho");
        cidades.add("Campinas");
        carregarList();
        carregarCombo();
    }
    
    private void carregarList(){
        DefaultListModel m = new DefaultListModel();
        for(String cidade : cidades){
            m.addElement(cidade);
        }
        lstCidade.setModel(m);
    }
    
    private void carregarCombo(){
        DefaultComboBoxModel m = new DefaultComboBoxModel();
        for(String cidade : cidades){
            m.addElement(cidade);
        }
        cbxCidade.setModel(m);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
