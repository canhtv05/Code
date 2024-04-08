package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.model_CaSi;
import repo.repo_CaSi;

public class view_CaSi extends javax.swing.JFrame {

    private repo_CaSi repoCaSi = new repo_CaSi();
    //Tạo 1 list để lưu findAll
    private ArrayList<model_CaSi> list;

    public view_CaSi() {
        initComponents();
        this.loadTable();
        this.setLocationRelativeTo(null); // căn giữa jframe ra màn hình chính
    }

    public void loadTable() {
        DefaultTableModel model = (DefaultTableModel) tblCaSi.getModel();
        // Reset hàng trong model
        model.setRowCount(0);
        list = repoCaSi.findAll();

        for (model_CaSi cs : list) {
            Object[] rows = {
                cs.getId(),
                cs.getTenString(),
                cs.getQueQuanString(),
                cs.getTuoi(),
                cs.getGioiTinh() == 1 ? "Nam" : "Nữ"
            };
            model.addRow(rows);
        }
    }

    private void clear() {
        txtID.setText("");
        txtTen.setText("");
        txtTuoi.setText("");
        txtQueQuan.setText("");
        //Sét mặc định là chọn GT: Nam
        rdoNam.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaSi = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Tên ca sĩ");

        jLabel3.setText("Quê quán");

        jLabel4.setText("Tuổi");

        jLabel5.setText("Giới tính");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        tblCaSi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên", "Quê quán", "Tuổi", "Giới tính"
            }
        ));
        tblCaSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCaSiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCaSi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen)
                            .addComponent(txtQueQuan)
                            .addComponent(txtTuoi)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoNu)
                                .addGap(0, 76, Short.MAX_VALUE))
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnXoa))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLamMoi)
                            .addComponent(btnSua))
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem)
                    .addComponent(btnSua))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa)
                            .addComponent(btnLamMoi))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNam)
                        .addComponent(rdoNu)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int select = tblCaSi.getSelectedRow();
        if (select == -1) {
            // return về -1 nếu ko tìm thấy hàng
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 hàng để xóa.");
            return;
        }

        //Nâng cao 1 tý
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }
        // Bấm yes thì xóa còn no thì ko

        //Lấy giá trị id qua tbl cho an toàn
        //Lưu ý giá trị của cột table tính từ 0
        String idStr = tblCaSi.getValueAt(select, 0).toString();
        // Vì id là int nên phải convert
        int id = Integer.parseInt(idStr);
        this.repoCaSi.delete(id);
        this.loadTable();
        this.clear();
        JOptionPane.showMessageDialog(this, "Xóa thành công.");
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        this.clear();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        //Loại bỏ kí tự đầu cuối trim()
        String ten = txtTen.getText().trim();
        String queQuan = txtQueQuan.getText().trim();
        String tuoiStr = txtTuoi.getText().trim();

        int gt;
        if (rdoNam.isSelected()) {
            gt = 1;
        } else {
            gt = 0;
        }

        //Validate không được để trống
        if (ten.length() == 0 || queQuan.length() == 0 || tuoiStr.length() == 0 || (rdoNam.isSelected() == false && rdoNu.isSelected() == false)) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin.");
            return;
        }

        // trong trường hợp nếu tên là khóa chính , ta kiểm tra sự tồn tại của mã trong list
//        for (model_CaSi caSi : list) {
//            if (caSi.getTenString().equals(ten)) {
//                JOptionPane.showMessageDialog(this, "Đã tồn tại tên " + ten);
//                return;
//            }
//        }
        // ở đây tên k phải khoá chính nên tôi chỉ demo cách xử lý này thôi nên tạm thời xóa nó đi or comment lại
        //chuyển tuổi thành int
        // try catch bắt lỗi nhập chữ của tuổi      
        int tuoi;
        try {
            tuoi = Integer.parseInt(tuoiStr);
            if (tuoi < 0) {
                JOptionPane.showMessageDialog(this, "Tuổi phải > 0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải nhập số.");
            return;
        }

        //Vì id là tự tăng tên ta để 1 con số bất kì nên để 0 or -1
        model_CaSi cs = new model_CaSi(-1, tuoiStr, queQuan, tuoi, gt);
        this.repoCaSi.create(cs);
        this.loadTable();
        this.clear();
        JOptionPane.showMessageDialog(this, "Thêm thành công.");
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblCaSiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCaSiMouseClicked
        // TODO add your handling code here:
        int select = tblCaSi.getSelectedRow();
        if (select == -1) {
            return;
        }

        String id = tblCaSi.getValueAt(select, 0).toString();
        String ten = tblCaSi.getValueAt(select, 1).toString();
        String queQuan = tblCaSi.getValueAt(select, 2).toString();
        String tuoi = tblCaSi.getValueAt(select, 3).toString();
        String gt = tblCaSi.getValueAt(select, 4).toString();

        txtID.setText(id);
        txtTen.setText(ten);
        txtQueQuan.setText(queQuan);
        txtTuoi.setText(tuoi);
        if (gt.equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
    }//GEN-LAST:event_tblCaSiMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int select = tblCaSi.getSelectedRow();
        if (select == -1) {
            // return về -1 nếu ko tìm thấy hàng
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 hàng để cập nhật.");
            return;
        }
        // ấn ALT + SHIFT + F đề format code 
        //lấy id khóa chính từ tbl để cập nhật
        String idString = tblCaSi.getValueAt(select, 0).toString();
        //convert id thành int 
        int id = Integer.parseInt(idString);
        String ten = txtTen.getText().trim();
        String queQuan = txtQueQuan.getText().trim();
        String tuoiStr = txtTuoi.getText().trim();

        int gt;
        if (rdoNam.isSelected()) {
            gt = 1;
        } else {
            gt = 0;
        }
        
        if (ten.length() == 0 || queQuan.length() == 0 || tuoiStr.length() == 0 || (rdoNam.isSelected() == false && rdoNu.isSelected() == false)) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đủ thông tin.");
            return;
        }
        
        int tuoi;
        try {
            tuoi = Integer.parseInt(tuoiStr);
            if (tuoi < 0) {
                JOptionPane.showMessageDialog(this, "Tuổi phải > 0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải nhập số.");
            return;
        }

        //Vì id là tự tăng tên ta để 1 con số bất kì nên để 0 or -1
        model_CaSi cs = new model_CaSi(id, tuoiStr, queQuan, tuoi, gt);
        this.repoCaSi.update(cs);
        this.loadTable();
        this.clear();
        JOptionPane.showMessageDialog(this, "Sửa thành công.");
    }//GEN-LAST:event_btnSuaActionPerformed

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
            java.util.logging.Logger.getLogger(view_CaSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_CaSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_CaSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_CaSi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_CaSi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblCaSi;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
