
package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.dao.UsuarioDAO;


public class ViewLogin extends javax.swing.JFrame {

   
    public ViewLogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jBtnEntrar = new javax.swing.JButton();
        jBtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 175));

        jLabel1.setText("Login");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel2.setText("Senha");

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        jBtnEntrar.setText("Entrar");
        jBtnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEntrarActionPerformed(evt);
            }
        });

        jBtnCadastrar.setText("Cadastrar");
        jBtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jBtnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jBtnCadastrar)
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCadastrar)
                    .addComponent(jBtnEntrar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        




    private void jBtnEntrarActionPerformed(java.awt.event.ActionEvent evt) {                                           

       UsuarioDAO dao = new UsuarioDAO();
       String senha = new String (txtSenha.getPassword());
       
        if(dao.checkLoginAdministrador(txtLogin.getText(), senha)){
            JOptionPane.showMessageDialog(null, "Logado como Administrador");
            ViewJTable a = new ViewJTable();
            a.setVisible(true);
            this.dispose();     
        }
        else if(dao.checkLogin(txtLogin.getText(), senha)){
         
            JOptionPane.showMessageDialog(null, "Logado com Sucesso!!");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }


    }                                          

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {                                    
        UsuarioDAO dao = new UsuarioDAO();
        String senha = new String (txtSenha.getPassword());
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) 
       
        if(dao.checkLoginAdministrador(txtLogin.getText(), senha)){
            JOptionPane.showMessageDialog(null, "Logado como Administrador");
            ViewJTable a = new ViewJTable();
            a.setVisible(true);
            this.dispose();     
        }
        else if(dao.checkLogin(txtLogin.getText(), senha)){
            JOptionPane.showMessageDialog(null, "Logado com Sucesso!!");
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Senha incorreta!");
        }

    }                                   

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {                                         
    }                                        

    private void jBtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        ViewCadastro tela = new ViewCadastro();
        tela.setVisible(true);
        this.dispose();
    }                                             

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

                       
    private javax.swing.JButton jBtnCadastrar;
    private javax.swing.JButton jBtnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
}
