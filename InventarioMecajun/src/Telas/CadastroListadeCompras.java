/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author leoma
 */
public class CadastroListadeCompras extends javax.swing.JFrame {

    /**
     * Creates new form CadastroEstoque
     */
    public CadastroListadeCompras() {
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

        Background = new javax.swing.JPanel();
        EspaçoTxt = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTabela = new javax.swing.JTable();
        btnProcurar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        Selecionar = new javax.swing.JPanel();
        lblItemDesejado = new javax.swing.JLabel();
        txtItemDesejado = new javax.swing.JTextField();
        lblTag = new javax.swing.JLabel();
        cbProjeto = new javax.swing.JComboBox<>();
        spTag = new javax.swing.JScrollPane();
        lstTag = new javax.swing.JList<>();
        lblProjeto = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuOpcoes = new javax.swing.JMenu();
        mnRetPrinc = new javax.swing.JMenuItem();
        mnCdItem = new javax.swing.JMenuItem();
        mnLstCompras = new javax.swing.JMenuItem();
        mnEmprestimo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setSize(new java.awt.Dimension(1280, 720));

        Background.setBackground(new java.awt.Color(89, 89, 94));
        Background.setPreferredSize(new java.awt.Dimension(1280, 720));

        EspaçoTxt.setBackground(new java.awt.Color(204, 204, 204));
        EspaçoTxt.setAlignmentX(0.0F);
        EspaçoTxt.setAlignmentY(0.0F);
        EspaçoTxt.setPreferredSize(new java.awt.Dimension(1200, 450));

        jScrollPane1.setBorder(null);

        lstTabela.setBackground(new java.awt.Color(204, 204, 204));
        lstTabela.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lstTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
                {null, null, null, null,null,null},
            },
            new String [] {
                "Nome", "Descrição", "Quantidade", "Datasheet", "Projeto", "Tags"
            }
        ));
        lstTabela.setPreferredSize(new java.awt.Dimension(1200, 450));
        jScrollPane1.setViewportView(lstTabela);

        javax.swing.GroupLayout EspaçoTxtLayout = new javax.swing.GroupLayout(EspaçoTxt);
        EspaçoTxt.setLayout(EspaçoTxtLayout);
        EspaçoTxtLayout.setHorizontalGroup(
            EspaçoTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        EspaçoTxtLayout.setVerticalGroup(
            EspaçoTxtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspaçoTxtLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnProcurar.setText("Procurar");

        btnRemover.setText("Remover");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");

        lblTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo BRANCA (1).png"))); // NOI18N
        lblTitulo.setAlignmentX(0.5F);

        Selecionar.setBackground(new java.awt.Color(121, 121, 134));
        Selecionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Selecionar.setPreferredSize(new java.awt.Dimension(1205, 110));

        lblItemDesejado.setBackground(new java.awt.Color(121, 121, 134));
        lblItemDesejado.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblItemDesejado.setText("Item Desejado");

        txtItemDesejado.setBackground(new java.awt.Color(204, 204, 204));
        txtItemDesejado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtItemDesejado.setPreferredSize(new java.awt.Dimension(200, 90));

        lblTag.setBackground(new java.awt.Color(121, 121, 134));
        lblTag.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTag.setText("Tag");
        lblTag.setPreferredSize(new java.awt.Dimension(30, 19));

        cbProjeto.setBackground(new java.awt.Color(204, 204, 204));
        cbProjeto.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cbProjeto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbProjeto.setSelectedIndex(-1);

        lstTag.setBackground(new java.awt.Color(204, 204, 204));
        lstTag.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lstTag.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lstTag.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstTag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lstTag.setPreferredSize(new java.awt.Dimension(200, 90));
        spTag.setViewportView(lstTag);

        lblProjeto.setBackground(new java.awt.Color(121, 121, 134));
        lblProjeto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblProjeto.setText("Projeto");

        javax.swing.GroupLayout SelecionarLayout = new javax.swing.GroupLayout(Selecionar);
        Selecionar.setLayout(SelecionarLayout);
        SelecionarLayout.setHorizontalGroup(
            SelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelecionarLayout.createSequentialGroup()
                .addComponent(lblItemDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtItemDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTag, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTag, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        SelecionarLayout.setVerticalGroup(
            SelecionarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblItemDesejado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblTag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblProjeto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(SelecionarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(txtItemDesejado, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
            .addComponent(spTag, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(485, 485, 485)
                                .addComponent(lblTitulo))
                            .addComponent(EspaçoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(btnProcurar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(Selecionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcurar)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover)
                    .addComponent(btnLimpar))
                .addGap(32, 32, 32)
                .addComponent(EspaçoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(Background, java.awt.BorderLayout.CENTER);

        Menu.setBackground(new java.awt.Color(89, 89, 94));

        MenuOpcoes.setText("Opções");

        mnRetPrinc.setText("Tela Principal");
        mnRetPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRetPrincActionPerformed(evt);
            }
        });
        MenuOpcoes.add(mnRetPrinc);

        mnCdItem.setText("Cadastrar Item");
        MenuOpcoes.add(mnCdItem);

        mnLstCompras.setText("Lista de Compras");
        MenuOpcoes.add(mnLstCompras);

        mnEmprestimo.setText("Empréstimo");
        MenuOpcoes.add(mnEmprestimo);

        Menu.add(MenuOpcoes);

        setJMenuBar(Menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void mnRetPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRetPrincActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnRetPrincActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroListadeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroListadeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroListadeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroListadeCompras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroListadeCompras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel EspaçoTxt;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuOpcoes;
    private javax.swing.JPanel Selecionar;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnProcurar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbProjeto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemDesejado;
    private javax.swing.JLabel lblProjeto;
    private javax.swing.JLabel lblTag;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable lstTabela;
    private javax.swing.JList<String> lstTag;
    private javax.swing.JMenuItem mnCdItem;
    private javax.swing.JMenuItem mnEmprestimo;
    private javax.swing.JMenuItem mnLstCompras;
    private javax.swing.JMenuItem mnRetPrinc;
    private javax.swing.JScrollPane spTag;
    private javax.swing.JTextField txtItemDesejado;
    // End of variables declaration//GEN-END:variables
}