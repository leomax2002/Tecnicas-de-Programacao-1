/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;
import Classes.*;
import static Telas.CadastroCliente.Clientes;
import static Telas.CadastroCliente.Chamados;
import java.awt.*;
import java.awt.event.ActionListener;
import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leoma
 */
public class CadastroChamado extends javax.swing.JFrame {

    /**
     * Creates new form CadastroChamado
     */
    
    String btn;
    int indexAux;
    public CadastroChamado() {
        initComponents();
        
       
       btnNovo.setEnabled(true);
       btnCancelar.setEnabled(false);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnPesquisar.setEnabled(true);
       
       txtData.setEnabled(false);
       txtDestino.setEnabled(false);
       txtHorarioPartida.setEnabled(false);
       txtHorarioRetorno.setEnabled(false);
       txtIdChamado.setEnabled(false);
       txtIdCliente.setEnabled(false);
       txtOrigem.setEnabled(false);
       txtQuilometragemFinal.setEnabled(false);
       txtQuilometragemInicial.setEnabled(false);
       btnCorrida.setEnabled(false);
       btnViagem.setEnabled(false);
       txtValorTotal.setEnabled(false);
       
       int n = txtIdCliente.getItemCount();
        boolean flag;
        for(int i = 0; i < Clientes.size();i++){
            flag = true;
            for(int j = 0; j < n;j++){
                   String aux = String.valueOf(txtIdCliente.getItemAt(j));
                   if(aux.equals(Clientes.get(i).toString())){
                       flag = false;
                       break;
                   }
               }
            if(flag){
               txtIdCliente.addItem(Clientes.get(i).toString());
                   }
       } 
    }
     
    public void carregarTabela2(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Id","Data","Tipo","Origem","Destino","Partida","Retorno","Km Inicial","Km Final","Valor Total", "Cliente"},0);
        
        for(int i = 0; i < Chamados.size(); i++){
            Object linha[] = new Object[]{Chamados.get(i).getId_chamado(),Chamados.get(i).getData(),Chamados.get(i).getTipo(),Chamados.get(i).getOrigem(),Chamados.get(i).getDestino(),Chamados.get(i).getHorario_partida(),Chamados.get(i).getHorario_retorno(),Chamados.get(i).getQuilometragem_inicial(),Chamados.get(i).getQuilometragem_final(), Chamados.get(i).getValor_total(), Chamados.get(i).getClt().getNome()};
            modelo.addRow(linha);        
        }
        Tabela2.setModel(modelo);
        
        Tabela2.getColumnModel().getColumn(0).setPreferredWidth(5);
        Tabela2.getColumnModel().getColumn(1).setPreferredWidth(50);
        Tabela2.getColumnModel().getColumn(2).setPreferredWidth(50);
        Tabela2.getColumnModel().getColumn(3).setPreferredWidth(50);
        Tabela2.getColumnModel().getColumn(4).setPreferredWidth(50);
        Tabela2.getColumnModel().getColumn(5).setPreferredWidth(50);
        Tabela2.getColumnModel().getColumn(6).setPreferredWidth(100);
        Tabela2.getColumnModel().getColumn(7).setPreferredWidth(100);
        Tabela2.getColumnModel().getColumn(8).setPreferredWidth(100);
        Tabela2.getColumnModel().getColumn(9).setPreferredWidth(100);
        Tabela2.getColumnModel().getColumn(10).setPreferredWidth(50);
        Tabela2.getColumnModel().getColumn(11).setPreferredWidth(50);
        
        
    }
    

    
    public void atualizarTxtId(){
           int n = txtIdCliente.getItemCount();
           boolean flag;
           for(int i = 0; i < Clientes.size();i++){
               flag = true;
               for(int j = 0; j < n;j++){
                   String aux = String.valueOf(txtIdCliente.getItemAt(j));
                   if(aux.equals(Clientes.get(i).toString())){
                       flag = false;
                       break;
                   }
                }
               
                if(flag){
                    txtIdCliente.addItem(Clientes.get(i).toString());
               }
       } 
    }
    
    public void excluirTxtId(Cliente clt){
        int n = txtIdCliente.getItemCount();
        for(int i = 0; i < n; i++){
            String aux = String.valueOf(txtIdCliente.getItemAt(i));
            if(aux.equals(clt.toString())){
                txtIdCliente.removeItem(aux);
            }
        }
    }
    
    public void adicionarTxtId(Cliente clt){
        txtIdCliente.addItem(clt.toString());

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbIdChamado = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        lbDestino = new javax.swing.JLabel();
        lbHorarioRetorno = new javax.swing.JLabel();
        lbHorarioPartida = new javax.swing.JLabel();
        lbTipo = new javax.swing.JLabel();
        lbOrigem = new javax.swing.JLabel();
        lbQuilometragemInicial = new javax.swing.JLabel();
        lbQuilometragemFinal = new javax.swing.JLabel();
        txtIdChamado = new javax.swing.JTextField();
        txtOrigem = new javax.swing.JTextField();
        txtDestino = new javax.swing.JTextField();
        txtHorarioPartida = new javax.swing.JTextField();
        txtHorarioRetorno = new javax.swing.JTextField();
        txtQuilometragemFinal = new javax.swing.JTextField();
        txtQuilometragemInicial = new javax.swing.JTextField();
        lbQuilometragemFinal1 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        Painel = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        btnRetornar = new javax.swing.JButton();
        lbIdCliente = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        btnViagem = new javax.swing.JRadioButton();
        btnCorrida = new javax.swing.JRadioButton();
        txtIdCliente = new javax.swing.JComboBox<>();
        lbTituloChamado = new javax.swing.JLabel();
        lbImgPrincChamado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbIdChamado.setText("ID do Chamado");

        lbData.setText("Data");

        lbDestino.setText("Destino");

        lbHorarioRetorno.setText("Horario de Retorno");

        lbHorarioPartida.setText("Horario de Partida");

        lbTipo.setText("Tipo");

        lbOrigem.setText("Origem");

        lbQuilometragemInicial.setText("Quilometragem Inicial");

        lbQuilometragemFinal.setText("Quilometragem Final");

        txtHorarioRetorno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorarioRetornoActionPerformed(evt);
            }
        });

        lbQuilometragemFinal1.setText("Valor Total");

        txtValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorTotalActionPerformed(evt);
            }
        });

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cadastrar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Novo.png"))); // NOI18N
        btnNovo.setText("Novo ");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        Tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}

            },
            new String [] {
                "Id Chamado", "Data", "Tipo", "Origem", "Destino", "Horário de Partida", "Horário de Retorno", "Quilometragem Inicial", "Quilometragem Final", "Valor Total", "Cliente"
            }

        ));
        Tabela2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela2MouseClicked(evt);
            }
        });
        Painel.setViewportView(Tabela2);

        btnRetornar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Retornar.png"))); // NOI18N
        btnRetornar.setText("Retornar");
        btnRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetornarActionPerformed(evt);
            }
        });

        lbIdCliente.setText("Cliente");

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnViagem.setText("Viagem");

        btnCorrida.setText("Corrida");
        btnCorrida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorridaActionPerformed(evt);
            }
        });

        lbTituloChamado.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 24)); // NOI18N
        lbTituloChamado.setText("Cadastro de Chamado");

        lbImgPrincChamado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PrincipalChamado.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTituloChamado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRetornar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbHorarioPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbData, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdChamado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHorarioRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuilometragemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbQuilometragemFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtData)
                                            .addComponent(txtIdChamado, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnOK))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCorrida)
                                        .addGap(30, 30, 30)
                                        .addComponent(btnViagem))
                                    .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHorarioPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHorarioRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuilometragemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQuilometragemFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbQuilometragemFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(lbImgPrincChamado))
                            .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetornar)
                    .addComponent(lbTituloChamado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbIdChamado)
                            .addComponent(txtIdChamado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbData)
                            .addComponent(btnOK)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCorrida)
                                .addComponent(btnViagem))
                            .addComponent(lbTipo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbOrigem)
                            .addComponent(txtOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbDestino)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHorarioPartida)
                            .addComponent(txtHorarioPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbHorarioRetorno)
                            .addComponent(txtHorarioRetorno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbQuilometragemInicial)
                            .addComponent(txtQuilometragemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lbImgPrincChamado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbQuilometragemFinal)
                    .addComponent(txtQuilometragemFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdCliente)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbQuilometragemFinal1)
                    .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar))
                .addGap(18, 18, 18)
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetornarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnRetornarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
       btn = "novo";
       atualizarTxtId();
       btnNovo.setEnabled(false);
       btnCancelar.setEnabled(true);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnPesquisar.setEnabled(false);
       
       txtData.setEnabled(true);
       txtDestino.setEnabled(true);
       txtHorarioPartida.setEnabled(true);
       txtHorarioRetorno.setEnabled(true);
       txtIdChamado.setEnabled(true);
       txtIdCliente.setEnabled(true);
       txtOrigem.setEnabled(true);
       txtQuilometragemFinal.setEnabled(true);
       txtQuilometragemInicial.setEnabled(true);
       btnCorrida.setEnabled(true);
       btnViagem.setEnabled(true);
       txtValorTotal.setEnabled(false);
       
       txtIdChamado.requestFocus();
       carregarTabela2();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
       txtData.setText("");
       txtDestino.setText("");
       txtHorarioPartida.setText("");
       txtHorarioRetorno.setText("");
       txtIdChamado.setText("");
       txtIdCliente.setSelectedIndex(0);
       txtOrigem.setText("");
       txtQuilometragemFinal.setText("");
       btnCorrida.setSelected(false);
       btnViagem.setSelected(false);
       txtQuilometragemInicial.setText("");

       txtValorTotal.setText("");
       
       btnNovo.setEnabled(true);
       btnCancelar.setEnabled(false);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnPesquisar.setEnabled(true);
       
       txtData.setEnabled(false);
       txtDestino.setEnabled(false);
       txtHorarioPartida.setEnabled(false);
       txtHorarioRetorno.setEnabled(false);
       txtIdChamado.setEnabled(false);
       txtIdCliente.setEnabled(false);
       txtOrigem.setEnabled(false);
       txtQuilometragemFinal.setEnabled(false);
       txtQuilometragemInicial.setEnabled(false);
       btnCorrida.setEnabled(false);
       btnViagem.setEnabled(false);
       txtValorTotal.setEnabled(false);
       carregarTabela2();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        boolean flagAux;
        try{
            Integer.parseInt(txtIdChamado.getText());
            Float.parseFloat(txtHorarioPartida.getText());
            Float.parseFloat(txtHorarioRetorno.getText());
            Double.parseDouble(txtQuilometragemInicial.getText());
            Double.parseDouble(txtQuilometragemFinal.getText());
            flagAux = true;
        }
        catch(NumberFormatException e){
            flagAux = false;
        }
        if(txtData.getText().equals("")||txtDestino.getText().equals("")||txtHorarioPartida.getText().equals("")||txtHorarioRetorno.getText().equals("")||txtIdChamado.getText().equals("")||txtIdCliente.getSelectedIndex() == -1||txtOrigem.getText().equals("")||txtQuilometragemFinal.getText().equals("")||(btnCorrida.isSelected() == false && btnViagem.isSelected() == false) ||(btnCorrida.isSelected() == true && btnViagem.isSelected() == true || !flagAux)){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos ou Campos Inválidos","Mensagem", JOptionPane.PLAIN_MESSAGE);
            txtIdChamado.requestFocus();
        }
        
        else{
            int idCham = Integer.parseInt(txtIdChamado.getText());
            String data = txtData.getText();
            String tipo = "";
            if(btnCorrida.isSelected()){
                tipo = "Corrida";
            }
            if(btnViagem.isSelected()){
                tipo = "Viagem";
            }
            String origem = txtOrigem.getText();
            String destino = txtDestino.getText();
            float partida = Float.parseFloat(txtHorarioPartida.getText());
            float retorno = Float.parseFloat(txtHorarioRetorno.getText());
            double inicial = Double.parseDouble(txtQuilometragemInicial.getText());
            double finale = Double.parseDouble(txtQuilometragemFinal.getText());
            double total = abs((finale-inicial)/2);
            String[] aux = String.valueOf(txtIdCliente.getSelectedItem()).split(" ");
            int aux2 = -1;
            for(int i = 0; i < Clientes.size(); i++){
                if(Integer.parseInt(aux[1]) == Clientes.get(i).getId()){
                    aux2 = i;
                    break;
                }
            }
            Cliente clt = Clientes.get(aux2);
            if(btn.equals("novo")){
                Chamado cham = new Chamado(idCham,data,tipo,origem,destino,partida,retorno,inicial,finale,total,clt);
                Chamados.add(cham);
                JOptionPane.showMessageDialog(null, "Chamado Realizado","Mensagem", JOptionPane.PLAIN_MESSAGE);
            }
            
            else if(btn.equals("editar")){
                int ind = Tabela2.getSelectedRow();
                if(ind != -1){
                
            
                    Chamados.get(ind).setId_chamado(idCham);
                    Chamados.get(ind).setData(data);
                    Chamados.get(ind).setTipo(tipo);
                    Chamados.get(ind).setOrigem(origem);
                    Chamados.get(ind).setDestino(destino);
                    Chamados.get(ind).setHorario_partida(partida);
                    Chamados.get(ind).setHorario_retorno(retorno);
                    Chamados.get(ind).setQuilometragem_inicial(inicial);
                    Chamados.get(ind).setQuilometragem_final(finale);
                    Chamados.get(ind).setValor_total(total);
                    Chamados.get(ind).setClt(clt);
            }
            else{
                    Chamados.get(indexAux).setId_chamado(idCham);
                    Chamados.get(indexAux).setData(data);
                    Chamados.get(indexAux).setTipo(tipo);
                    Chamados.get(indexAux).setOrigem(origem);
                    Chamados.get(indexAux).setDestino(destino);
                    Chamados.get(indexAux).setHorario_partida(partida);
                    Chamados.get(indexAux).setHorario_retorno(retorno);
                    Chamados.get(indexAux).setQuilometragem_inicial(inicial);
                    Chamados.get(indexAux).setQuilometragem_final(finale);
                    Chamados.get(indexAux).setValor_total(total);
                    Chamados.get(indexAux).setClt(clt);
                
                indexAux = -1;
            }
            }
            
            
            
            
       txtData.setText("");
       txtDestino.setText("");
       txtHorarioPartida.setText("");
       txtHorarioRetorno.setText("");
       txtIdChamado.setText("");
       txtIdCliente.setSelectedIndex(0);
       txtOrigem.setText("");
       txtQuilometragemFinal.setText("");
       btnCorrida.setSelected(false);
       btnViagem.setSelected(false);
       txtQuilometragemInicial.setText("");

       txtValorTotal.setText("");
       
       btnNovo.setEnabled(true);
       btnCancelar.setEnabled(false);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnPesquisar.setEnabled(true);
       
       txtData.setEnabled(false);
       txtDestino.setEnabled(false);
       txtHorarioPartida.setEnabled(false);
       txtHorarioRetorno.setEnabled(false);
       txtIdChamado.setEnabled(false);
       txtIdCliente.setEnabled(false);
       txtOrigem.setEnabled(false);
       txtQuilometragemFinal.setEnabled(false);
       txtQuilometragemInicial.setEnabled(false);
       btnCorrida.setEnabled(false);
       btnViagem.setEnabled(false);
       txtValorTotal.setEnabled(false);
        
        carregarTabela2();
            
            
        }
        
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed
 
    private void txtValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorTotalActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
       btn = "editar";
       atualizarTxtId();
       btnNovo.setEnabled(false);
       btnCancelar.setEnabled(true);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(false);
       btnSalvar.setEnabled(true);
       btnPesquisar.setEnabled(false);
       
       txtData.setEnabled(true);
       txtDestino.setEnabled(true);
       txtHorarioPartida.setEnabled(true);
       txtHorarioRetorno.setEnabled(true);
       txtIdChamado.setEnabled(true);
       txtIdCliente.setEnabled(true);
       txtOrigem.setEnabled(true);
       txtQuilometragemFinal.setEnabled(true);
       txtQuilometragemInicial.setEnabled(true);
       btnCorrida.setEnabled(true);
       btnViagem.setEnabled(true);
       txtValorTotal.setEnabled(false);
       
       txtIdChamado.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked
        // TODO add your handling code here:
        int i = Tabela2.getSelectedRow();
        
        if(i >= 0 && i < Chamados.size()){
            Chamado cham = Chamados.get(i);
            
            txtData.setText(cham.getData());
            txtDestino.setText(cham.getDestino());
            txtHorarioPartida.setText(String.valueOf(cham.getHorario_partida()));
            txtHorarioRetorno.setText(String.valueOf(cham.getHorario_retorno()));
            txtIdChamado.setText(String.valueOf(cham.getId_chamado()));
            txtOrigem.setText(cham.getOrigem());
            txtQuilometragemFinal.setText(String.valueOf(cham.getQuilometragem_final()));
            if(cham.getTipo().equals("Corrida")){
                btnCorrida.setSelected(true);
                btnViagem.setSelected(false);
            }
            
            if(cham.getTipo().equals("Viagem")){
                btnCorrida.setSelected(false);
                btnViagem.setSelected(true);
            }
                     
            
            txtQuilometragemInicial.setText(String.valueOf(cham.getQuilometragem_inicial()));
            txtValorTotal.setText(String.valueOf(cham.getValor_total()));
            
            int aux = txtIdCliente.getItemCount();
            String[] aux2;
            for(int j = 0; j < aux; j++){
                aux2 = String.valueOf(txtIdCliente.getItemAt(j)).split(" ");
                if(Integer.parseInt(aux2[1]) == cham.getClt().getId()){
                    txtIdCliente.setSelectedIndex(j);
                    break;
                }
            }

            
        }
        
        btnNovo.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEditar.setEnabled(true);
        btnExcluir.setEnabled(true);
        btnOK.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnPesquisar.setEnabled(true);
    }//GEN-LAST:event_Tabela2MouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        int i = Tabela2.getSelectedRow();
        
        if(i >= 0 && i < Clientes.size()){
            Chamados.remove(i);
        }
        else if(indexAux >= 0 && indexAux < Chamados.size()){
            Chamados.remove(indexAux);
            indexAux = -1;
        }
        
        
       txtData.setText("");
       txtDestino.setText("");
       txtHorarioPartida.setText("");
       txtHorarioRetorno.setText("");
       txtIdChamado.setText("");
       txtIdCliente.setSelectedIndex(0);
       txtOrigem.setText("");
       txtQuilometragemFinal.setText("");
       btnCorrida.setSelected(false);
       btnViagem.setSelected(false);
       txtQuilometragemInicial.setText("");

       txtValorTotal.setText("");
       
       btnNovo.setEnabled(true);
       btnCancelar.setEnabled(false);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(false);
       btnSalvar.setEnabled(false);
       btnPesquisar.setEnabled(true);
       
       txtData.setEnabled(false);
       txtDestino.setEnabled(false);
       txtHorarioPartida.setEnabled(false);
       txtHorarioRetorno.setEnabled(false);
       txtIdChamado.setEnabled(false);
       txtIdCliente.setEnabled(false);
       txtOrigem.setEnabled(false);
       txtQuilometragemFinal.setEnabled(false);
       txtQuilometragemInicial.setEnabled(false);
       btnCorrida.setEnabled(false);
       btnViagem.setEnabled(false);
       txtValorTotal.setEnabled(false);
        
       carregarTabela2();
        
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        if(Chamados.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há Chamados Realizados","Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
       txtData.setText("");
       txtDestino.setText("");
       txtHorarioPartida.setText("");
       txtHorarioRetorno.setText("");
       txtIdChamado.setText("");
       txtIdCliente.setSelectedIndex(0);
       txtOrigem.setText("");
       txtQuilometragemFinal.setText("");
       btnCorrida.setSelected(false);
       btnViagem.setSelected(false);
       txtQuilometragemInicial.setText("");

       txtValorTotal.setText("");
       
       btnNovo.setEnabled(false);
       btnCancelar.setEnabled(true);
       btnEditar.setEnabled(false);
       btnExcluir.setEnabled(false);
       btnOK.setEnabled(true);
       btnSalvar.setEnabled(false);
       btnPesquisar.setEnabled(false);
       
       txtData.setEnabled(true);
       txtDestino.setEnabled(false);
       txtHorarioPartida.setEnabled(false);
       txtHorarioRetorno.setEnabled(false);
       txtIdChamado.setEnabled(false);
       txtIdCliente.setEnabled(false);
       txtOrigem.setEnabled(false);
       txtQuilometragemFinal.setEnabled(false);
       txtQuilometragemInicial.setEnabled(false);
       btnCorrida.setEnabled(false);
       btnViagem.setEnabled(false);
       txtValorTotal.setEnabled(false);
       txtData.requestFocus(); 
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        Chamado cham;
        String idChamStr = "";
        String dataStr = "";
        String tipoStr = "";
        String origemStr = "";
        String destinoStr = "";
        String partidaStr = "";
        String retornoStr = "";
        String inicialStr = "";
        String finalStr = "";
        String totalStr = "";
        int clienteInt = 0;
        if(txtData.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe a Data do Chamado","Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{    
            String data = txtData.getText();
            
            for(int i = 0; i < Chamados.size(); i++){
                cham = Chamados.get(i);
                
                if(data.equals(cham.getData()) ){
                    indexAux = i;
                    idChamStr = String.valueOf(cham.getId_chamado());
                    dataStr = cham.getData();
                    tipoStr = cham.getTipo();
                    origemStr = cham.getOrigem();
                    destinoStr = cham.getDestino();
                    partidaStr = String.valueOf(cham.getHorario_partida());
                    retornoStr = String.valueOf(cham.getHorario_retorno());
                    inicialStr = String.valueOf(cham.getQuilometragem_inicial());
                    finalStr = String.valueOf(cham.getQuilometragem_final());
                    totalStr = String.valueOf(cham.getValor_total());
                    clienteInt = cham.getClt().getId();
                    
                }
            }
            if(dataStr.equals("")){
                JOptionPane.showMessageDialog(null, "Informe a Data do Chamado","Mensagem", JOptionPane.PLAIN_MESSAGE);
            }
            else{
                txtIdChamado.setText(idChamStr);
                txtData.setText(dataStr);
                if(tipoStr.equals("Corrida")){
                btnCorrida.setSelected(true);
                btnViagem.setSelected(false);
                }
            
                if(tipoStr.equals("Viagem")){
                btnCorrida.setSelected(false);
                btnViagem.setSelected(true);
                }
                txtOrigem.setText(origemStr);
                txtDestino.setText(destinoStr);
                txtHorarioPartida.setText(partidaStr);
                txtHorarioRetorno.setText(retornoStr);
                txtQuilometragemInicial.setText(inicialStr);
                txtQuilometragemFinal.setText(finalStr);
                txtValorTotal.setText(totalStr);
                
                int aux = txtIdCliente.getItemCount();
                String[] aux2;
                for(int j = 0; j < aux; j++){
                    aux2 = String.valueOf(txtIdCliente.getItemAt(j)).split(" ");
                    if(Integer.parseInt(aux2[1]) == clienteInt){
                        txtIdCliente.setSelectedIndex(j);
                        break;
                    }
                }
                
                btnNovo.setEnabled(false);
                btnCancelar.setEnabled(false);
                btnEditar.setEnabled(true);
                btnExcluir.setEnabled(true);
                btnOK.setEnabled(false);
                btnSalvar.setEnabled(false);
                btnPesquisar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCorridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorridaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorridaActionPerformed

    private void txtHorarioRetornoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorarioRetornoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorarioRetornoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroChamado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Painel;
    private javax.swing.JTable Tabela2;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JRadioButton btnCorrida;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRetornar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JRadioButton btnViagem;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDestino;
    private javax.swing.JLabel lbHorarioPartida;
    private javax.swing.JLabel lbHorarioRetorno;
    private javax.swing.JLabel lbIdChamado;
    private javax.swing.JLabel lbIdCliente;
    private javax.swing.JLabel lbImgPrincChamado;
    private javax.swing.JLabel lbOrigem;
    private javax.swing.JLabel lbQuilometragemFinal;
    private javax.swing.JLabel lbQuilometragemFinal1;
    private javax.swing.JLabel lbQuilometragemInicial;
    private javax.swing.JLabel lbTipo;
    private javax.swing.JLabel lbTituloChamado;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtHorarioPartida;
    private javax.swing.JTextField txtHorarioRetorno;
    private javax.swing.JTextField txtIdChamado;
    private javax.swing.JComboBox<String> txtIdCliente;
    private javax.swing.JTextField txtOrigem;
    private javax.swing.JTextField txtQuilometragemFinal;
    private javax.swing.JTextField txtQuilometragemInicial;
    private javax.swing.JTextField txtValorTotal;
    // End of variables declaration//GEN-END:variables
}
