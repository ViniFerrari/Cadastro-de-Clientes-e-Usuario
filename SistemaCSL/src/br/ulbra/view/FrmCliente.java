/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.entity.Cliente;
import br.ulbra.entity.Usuario;
import br.ulbra.model.dao.ClienteDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s.lucas
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    public FrmCliente() {
        initComponents();
        setLocationRelativeTo(null);
        readTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnsalvar = new javax.swing.JButton();
        btnexcluir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        tbusuario = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        btnvoltar = new javax.swing.JButton();
        xtrg = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Logradouro = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtcep = new javax.swing.JTextField();
        Cidade = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnbuscar = new javax.swing.JButton();
        txtpesquisar = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtbairro = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        txtrg = new javax.swing.JTextField();
        txtcidade = new javax.swing.JTextField();
        txtlogradouro = new javax.swing.JTextField();
        txtnumero = new javax.swing.JTextField();
        txtuf = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnvoltar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_new-24_103173.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 4, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("CADASTRO DE CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 138, -1, -1));

        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 192, -1, -1));

        btnsalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_save_1608823.png"))); // NOI18N
        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 262, 229, -1));

        btnexcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnexcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_ic_delete_48px_352303.png"))); // NOI18N
        btnexcluir.setText("Excluir");
        btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcluirActionPerformed(evt);
            }
        });
        jPanel1.add(btnexcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 305, 229, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 389, 741, 10));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Cel", "Email", "CPF", "RG", "Logradouro", "Número", "Bairro", "CEP", "Cidade", "UF", "Telefone"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tbusuario.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(4).setMinWidth(0);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(4).setMaxWidth(0);
            tabela.getColumnModel().getColumn(5).setMinWidth(0);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(5).setMaxWidth(0);
            tabela.getColumnModel().getColumn(6).setMinWidth(0);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(6).setMaxWidth(0);
            tabela.getColumnModel().getColumn(7).setMinWidth(0);
            tabela.getColumnModel().getColumn(7).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(7).setMaxWidth(0);
            tabela.getColumnModel().getColumn(8).setMinWidth(0);
            tabela.getColumnModel().getColumn(8).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(8).setMaxWidth(0);
            tabela.getColumnModel().getColumn(9).setMinWidth(0);
            tabela.getColumnModel().getColumn(9).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(9).setMaxWidth(0);
            tabela.getColumnModel().getColumn(10).setMinWidth(0);
            tabela.getColumnModel().getColumn(10).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(10).setMaxWidth(0);
            tabela.getColumnModel().getColumn(11).setMinWidth(0);
            tabela.getColumnModel().getColumn(11).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(11).setMaxWidth(0);
            tabela.getColumnModel().getColumn(12).setMinWidth(0);
            tabela.getColumnModel().getColumn(12).setPreferredWidth(0);
            tabela.getColumnModel().getColumn(12).setMaxWidth(0);
        }

        jPanel1.add(tbusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 741, 120));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 573, 741, 10));

        btnvoltar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnvoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_broom_stick_3_896656.png"))); // NOI18N
        btnvoltar.setText("Limpar");
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 741, -1));

        xtrg.setText("RG:");
        jPanel1.add(xtrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 265, -1, -1));

        txtcpf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 224, 170, -1));

        jLabel6.setText("CPF:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 229, -1, -1));

        Logradouro.setText("Logradouro:");
        jPanel1.add(Logradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel8.setText("Número:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 353, -1, -1));

        jLabel9.setText("Bairro");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 185, -1, -1));

        jLabel10.setText("CEP:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 226, -1, -1));

        txtcep.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtcep, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 221, 188, -1));

        Cidade.setText("Cidade:");
        jPanel1.add(Cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 267, -1, -1));

        jLabel12.setText("UF:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 312, -1, -1));

        jLabel13.setText("Celular:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 352, -1, -1));

        jLabel15.setText("Email:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 226, -1, -1));

        txtemail.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtemail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 221, 183, -1));

        jLabel16.setText("Telefone:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 185, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 163, 741, 10));

        btnbuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_Rounded-10_2024633.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 405, 364, -1));

        txtpesquisar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtpesquisar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtpesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 406, 359, -1));

        txtnome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 180, 170, -1));

        txtbairro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtbairro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 180, 188, -1));

        txttelefone.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 180, 165, -1));

        txtrg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtrg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 262, 170, -1));

        txtcidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 262, 187, -1));

        txtlogradouro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtlogradouro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtlogradouro, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 305, 142, -1));

        txtnumero.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 348, 168, -1));

        txtuf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtuf.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtuf, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 303, 187, -1));

        txtcelular.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 347, 187, -1));

        txtId.setText("jTextField1");
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 47, 0, -1));

        btnvoltar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnvoltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/if_back-left-arrow-botton_2203523.png"))); // NOI18N
        btnvoltar1.setText("Voltar");
        btnvoltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnvoltar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 741, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 230, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed

        txtnome.setText("");
        txtbairro.setText("");
        txtcelular.setText("");
        txtcep.setText("");
        txtcidade.setText("");
        txtcpf.setText("");
        txtemail.setText("");
        txtlogradouro.setText("");
        txtnumero.setText("");
        txtrg.setText("");
        txttelefone.setText("");
        txtuf.setText("");

    }//GEN-LAST:event_btnvoltarActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed

        Cliente c = new Cliente();
        ClienteDAO cldao = new ClienteDAO();
        c.setBairroCli(txtbairro.getText());
        c.setCelularCli(txtcelular.getText());
        c.setCepCli(txtcep.getText());
        c.setCidadeCli(txtcidade.getText());
        c.setCpfCli(txtcpf.getText());
        c.setEmailCli(txtemail.getText());
        c.setFoneCli(txttelefone.getText());
        c.setLogradouro(txtnome.getText());
        c.setNomeCli(txtnome.getText());
        c.setNumCli(Integer.parseInt(txtnumero.getText()));
        c.setRgCli(txtrg.getText());
        c.setUfCli(txtuf.getText());
        cldao.create(c);

        txtnome.setText("");
        txtbairro.setText("");
        txtcelular.setText("");
        txtcep.setText("");
        txtcidade.setText("");
        txtcpf.setText("");
        txtemail.setText("");
        txtlogradouro.setText("");
        txtnumero.setText("");
        txtrg.setText("");
        txttelefone.setText("");
        txtuf.setText("");

        readTable();
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcluirActionPerformed

        if (tabela.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            ClienteDAO cldao = new ClienteDAO();

            c.setId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));

            cldao.delete(c);

            txtnome.setText("");
            txtbairro.setText("");
            txtcelular.setText("");
            txtcep.setText("");
            txtcidade.setText("");
            txtcpf.setText("");
            txtemail.setText("");
            txtlogradouro.setText("");
            txtnumero.setText("");
            txtrg.setText("");
            txttelefone.setText("");
            txtuf.setText("");

            readTable();

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um Usuario para excluir.");
        }

    }//GEN-LAST:event_btnexcluirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed

        readJTableForDesc(txtpesquisar.getText());

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

        if (tabela.getSelectedRow() != -1) {

            txtId.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());
            txtnome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
            txtcelular.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
            txtemail.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
            txtcpf.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
            txtrg.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
            txtlogradouro.setText(tabela.getValueAt(tabela.getSelectedRow(), 12).toString());
            txtnumero.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
            txtbairro.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
            txtcep.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
            txtcidade.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());
            txtuf.setText(tabela.getValueAt(tabela.getSelectedRow(), 10).toString());
            txttelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 11).toString());

        }

        // JOptionPane.showMessageDialog(null, "cpf:"+cpf);
    }//GEN-LAST:event_tabelaMouseClicked

    private void btnvoltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltar1ActionPerformed

        new ViewHome().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnvoltar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tabela.getSelectedRow() != -1) {

            Cliente c = new Cliente();
            ClienteDAO cldao = new ClienteDAO();

            c.setNomeCli(txtnome.getText());
            c.setCpfCli(txtcpf.getText());
            c.setRgCli(txtrg.getText());
            c.setLogradouro(txtlogradouro.getText());
            c.setNumCli(Integer.parseInt(txtnumero.getText()));
            c.setBairroCli(txtbairro.getText());
            c.setCepCli(txtcep.getText());
            c.setCidadeCli(txtcidade.getText());
            c.setUfCli(txtuf.getText());
            c.setCelularCli(txtcelular.getText());
            c.setFoneCli(txttelefone.getText());
            c.setEmailCli(txtemail.getText());
            c.setId((int) tabela.getValueAt(tabela.getSelectedRow(), 0));

            cldao.update(c);

            txtnome.setText("");
            txtbairro.setText("");
            txtcelular.setText("");
            txtcep.setText("");
            txtcidade.setText("");
            txtcpf.setText("");
            txtemail.setText("");
            txtlogradouro.setText("");
            txtnumero.setText("");
            txtrg.setText("");
            txttelefone.setText("");
            txtuf.setText("");

            readTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void readTable() {
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        ClienteDAO cldao = new ClienteDAO();
        for (Cliente c : cldao.read()) {
            modelo.addRow(new Object[]{
                c.getId(),
                c.getNomeCli(),
                c.getCelularCli(),
                c.getEmailCli(),
                c.getCpfCli(),
                c.getRgCli(),
                c.getNumCli(),
                c.getBairroCli(),
                c.getCepCli(),
                c.getCidadeCli(),
                c.getUfCli(),
                c.getFoneCli(),
                c.getLogradouro()});

        }
    }

    public void readJTableForDesc(String desc) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        ClienteDAO cldao = new ClienteDAO();

        for (Cliente c : cldao.readForDesc(desc)) {

            modelo.addRow(new Object[]{
                c.getId(),
                c.getNomeCli(),
                c.getCelularCli(),
                c.getEmailCli()});

        }

    }

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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cidade;
    private javax.swing.JLabel Logradouro;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnexcluir;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JButton btnvoltar;
    private javax.swing.JButton btnvoltar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabela;
    private javax.swing.JScrollPane tbusuario;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtbairro;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcep;
    private javax.swing.JTextField txtcidade;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogradouro;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpesquisar;
    private javax.swing.JTextField txtrg;
    private javax.swing.JTextField txttelefone;
    private javax.swing.JTextField txtuf;
    private javax.swing.JLabel xtrg;
    // End of variables declaration//GEN-END:variables
}