/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author XUÂN THÀNH
 */
public class User_management extends javax.swing.JFrame {
        private QLND ql;
    /**
     * Creates new form User_management
     */
    public User_management() {
        initComponents();
        
        setLocationRelativeTo(null);
        clearForm();
        this.ql = new QLND();
        this.ql.Add(new User("thanh", "12345", "Admin"));
        this.ql.Add(new User("maria", "123321", "User"));
        this.hienThiTable();
    }
    
     private void hienThiTable() {
        DefaultTableModel dtm = (DefaultTableModel) this.tblUserManagement.getModel();

        dtm.setRowCount(0);

        ArrayList<User> ds = this.ql.getList();
        for (int i = 0; i < ds.size(); i++) {
            User nd = (User) ds.get(i);

            Object[] rowData = new Object[]{
                nd.getUser(),
                nd.getPass(),
                nd.getRole()
            };

            dtm.addRow(rowData);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblUserManagement = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        lblPassword = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassWord = new javax.swing.JPasswordField();
        rdoUser = new javax.swing.JRadioButton();
        rdoAdmin = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        lblErrorUser = new javax.swing.JLabel();
        lblErrorPass = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserManagement = new javax.swing.JTable();
        cbbLanguage = new javax.swing.JComboBox<>();
        lblLanguage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        lblUserManagement.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lblUserManagement.setForeground(new java.awt.Color(255, 71, 46));
        lblUserManagement.setText("User Management");

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));

        lblPassword.setText("Password");

        lblUsername.setText("Username");

        lblRole.setText("Role");

        buttonGroup1.add(rdoUser);
        rdoUser.setSelected(true);
        rdoUser.setText("User");

        buttonGroup1.add(rdoAdmin);
        rdoAdmin.setText("Admin");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        lblErrorUser.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorUser.setForeground(new java.awt.Color(255, 51, 51));

        lblErrorPass.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblErrorPass.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(rdoUser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtUsername)
                                        .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(lblErrorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(rdoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(lblErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoUser)
                    .addComponent(rdoAdmin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset))
                .addGap(27, 27, 27))
        );

        jTabbedPane1.addTab("EDITTION", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        tblUserManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "PASSWORD", "ROLE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUserManagementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUserManagement);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("LIST", jPanel3);

        cbbLanguage.setBackground(new java.awt.Color(255, 255, 102));
        cbbLanguage.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        cbbLanguage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Tiếng việt" }));
        cbbLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLanguageActionPerformed(evt);
            }
        });

        lblLanguage.setText("Language:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLanguage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLanguageActionPerformed
        if(this.cbbLanguage.getSelectedItem().equals("Tiếng việt")){
            this.lblUsername.setText("Tên đăng nhập");
            this.lblPassword.setText("Mật khẩu");
            this.lblRole.setText("Vai trò");
            this.lblLanguage.setText("Ngôn ngữ");
            this.rdoAdmin.setText("Quản trị viên");
            this.rdoUser.setText("Người dùng");
            this.btnAdd.setText("Thêm");
            this.btnRemove.setText("Xóa");
            this.btnReset.setText("đặt lại");
            this.btnUpdate.setText("Cập nhập");
        }
        if(this.cbbLanguage.getSelectedItem().equals("English")){
            this.lblUsername.setText("Username");
            this.lblPassword.setText("Password");
            this.lblRole.setText("Role");
            this.lblLanguage.setText("Language");
            this.rdoAdmin.setText("Admin");
            this.rdoUser.setText("User");
            this.btnAdd.setText("Add");
            this.btnRemove.setText("Remove");
            this.btnReset.setText("Reset");
            this.btnUpdate.setText("Update");
        }
    }//GEN-LAST:event_cbbLanguageActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        checkForm();
       
        if(checkForm() == false){
            return;
        }
        
        String name = this.txtUsername.getText();
        String Pass = new String(this.txtPassWord.getPassword());
        String role;
        if(this.rdoAdmin.isSelected()==true){
            role = this.rdoAdmin.getText();
        }else{
            role = this.rdoUser.getText();
        }
        User nd = new User(name, Pass, role);
        this.ql.Add(nd);
        this.hienThiTable();
        JOptionPane.showMessageDialog(this, "Insert successfully");
        clearForm();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
         int viTri = this.tblUserManagement.getSelectedRow();
        if (viTri == -1) {
            this.lblErrorUser.setText("Không có bản ghi nào được chọn");
            return;
        }
        int xacNhan = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa bản ghi không?");

        if (xacNhan == JOptionPane.YES_OPTION) {

            this.ql.Remove(viTri);
            this.hienThiTable();
            JOptionPane.showMessageDialog(this, "Delete successfully");
            clearForm();
        } else if (xacNhan == JOptionPane.NO_OPTION) {
            return;
        } else if (xacNhan == JOptionPane.CANCEL_OPTION) {
            return;
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void tblUserManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUserManagementMouseClicked
        int index = this.tblUserManagement.getSelectedRow();
        if (index == -1) {
            return;
        }

        User nd = (User) this.ql.getList().get(index);
        this.txtUsername.setText(nd.getUser());

        this.txtPassWord.setText(nd.getPass());
        
        if (nd.getRole().equals("User")) {
            this.rdoUser.setSelected(true);
        } else {
            this.rdoAdmin.setSelected(true);
        }

    }//GEN-LAST:event_tblUserManagementMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       int viTri = this.tblUserManagement.getSelectedRow();
       if (viTri == -1) {
            this.lblErrorUser.setText("Không có bản ghi nào được chọn");
            return;
        }
       
       checkForm();
       
       if (checkForm() == false){
           return;
       }
       
        String name = this.txtUsername.getText();
        String Pass = new String(this.txtPassWord.getPassword());
        String role;
        if(this.rdoAdmin.isSelected()==true){
            role = this.rdoAdmin.getText();
        }else{
            role = this.rdoUser.getText();
        }
        User nd = new User(name, Pass, role);
        this.ql.Update(viTri, nd);
        this.hienThiTable();
        JOptionPane.showMessageDialog(this, "Update successfully");
        clearForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        clearForm();
    }//GEN-LAST:event_btnResetActionPerformed

    public void clearForm() {
        this.txtUsername.setText("");
        this.txtPassWord.setText("");
        this.rdoUser.setSelected(true);
    }
    public Boolean checkForm(){
        String user = this.txtUsername.getText();
        String Pass = new String (this.txtPassWord.getPassword());
        Boolean a = true;
        if(user.equals("")){
            this.lblErrorUser.setText("Không để trống Username!");
            a = false;
        }else{
            this.lblErrorUser.setText("");
        }
        if(Pass.equals("")){
            this.lblErrorPass.setText("Không để trống Password!");
            a = false;
        }else{
            this.lblErrorPass.setText("");
        }
        return a;
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
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbLanguage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblErrorPass;
    private javax.swing.JLabel lblErrorUser;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserManagement;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rdoAdmin;
    private javax.swing.JRadioButton rdoUser;
    private javax.swing.JTable tblUserManagement;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
