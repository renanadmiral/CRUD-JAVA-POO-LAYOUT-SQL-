
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

public class ViewJTable extends javax.swing.JFrame {
    public ViewJTable() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTUsuarios.getModel();
        jTUsuarios.setRowSorter(new TableRowSorter(modelo));
        
        lerTabela();
    }
    
    public void lerTabela() {

        DefaultTableModel modelo = (DefaultTableModel) jTUsuarios.getModel();
        modelo.setNumRows(0);
        
        UsuarioDAO dao = new UsuarioDAO();

        for (Usuario u : dao.read()) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getLogin(),
            });
        }
    }
    
    public void lerTabelaPorNome(String nome) {

        DefaultTableModel modelo = (DefaultTableModel) jTUsuarios.getModel();
        modelo.setNumRows(0);
        
        UsuarioDAO dao = new UsuarioDAO();

        for (Usuario u : dao.readForNome(nome)) {

            modelo.addRow(new Object[]{
                u.getId(),
                u.getNome(),
                u.getLogin(),
            });
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTUsuarios = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jBtnCadastro = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnAtualizar = new javax.swing.JButton();
        txtBuscaNome = new javax.swing.JTextField();
        jBtnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "LOGIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTUsuariosMouseClicked(evt);
            }
        });
        jTUsuarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTUsuariosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTUsuarios);
        if (jTUsuarios.getColumnModel().getColumnCount() > 0) {
            jTUsuarios.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTUsuarios.getColumnModel().getColumn(0).setMaxWidth(70);
            jTUsuarios.getColumnModel().getColumn(2).setPreferredWidth(130);
        }

        jLabel1.setText("Nome");

        jLabel2.setText("Login");

        jLabel3.setText("Senha");

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        jBtnCadastro.setText("Cadastrar");
        jBtnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastroActionPerformed(evt);
            }
        });

        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnAtualizar.setText("Atualizar");
        jBtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAtualizarActionPerformed(evt);
            }
        });

        txtBuscaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaNomeActionPerformed(evt);
            }
        });

        jBtnBuscar.setText("Buscar");
        jBtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnCadastro)
                                .addGap(27, 27, 27)
                                .addComponent(jBtnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jBtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtBuscaNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnBuscar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 39, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastro)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnAtualizar)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnBuscar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

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
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jBtnCadastroActionPerformed(java.awt.event.ActionEvent evt) {                                             
        Usuario u = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        
        u.setNome(txtNome.getText());
        u.setLogin(txtLogin.getText());
        u.setSenha(new String(txtSenha.getPassword()));
        dao.create(u);

        txtNome.setText("");
        txtLogin.setText("");
        txtSenha.setText("");

        lerTabela();
    }                                            

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (jTUsuarios.getSelectedRow() != -1) {

            Usuario u = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            u.setId((int) jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 0));

            dao.delete(u);

            txtNome.setText("");
            txtLogin.setText("");
            txtSenha.setText("");

            lerTabela();
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir.");
        }
    }                                           

    private void jTUsuariosMouseClicked(java.awt.event.MouseEvent evt) {                                        
        if (jTUsuarios.getSelectedRow() != -1) {

            txtNome.setText(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 1).toString());
            txtLogin.setText(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 2).toString());
        }
    }                                       

    private void jTUsuariosKeyReleased(java.awt.event.KeyEvent evt) {                                       
        if (jTUsuarios.getSelectedRow() != -1) {

            txtNome.setText(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 1).toString());
            txtLogin.setText(jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 2).toString());
        }
    }                                      

    private void jBtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (jTUsuarios.getSelectedRow() != -1) {
            Usuario p = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();

            p.setNome(txtNome.getText());
            p.setLogin(txtLogin.getText());
            p.setId((int) jTUsuarios.getValueAt(jTUsuarios.getSelectedRow(), 0));
            dao.update(p);

            txtNome.setText("");
            txtLogin.setText("");
            txtSenha.setText("");

            lerTabela();
        }
    }                                             

    private void jBtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        lerTabelaPorNome(txtBuscaNome.getText());      
    }                                          

    private void txtBuscaNomeActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
    }                                        

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewJTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewJTable().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton jBtnAtualizar;
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnCadastro;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTUsuarios;
    private javax.swing.JTextField txtBuscaNome;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration                   
}
