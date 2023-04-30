package form;

import apartment.MyConnect;
import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MARUT
 */
public class FormApartment extends javax.swing.JInternalFrame {
    private Connection conn = MyConnect.getConnection();
    private DefaultTableModel modelApartment;
        
    public FormApartment() {
        initComponents();
        modelApartment = (DefaultTableModel)tableApart.getModel();
    }
    public void showData() {
        try {
//clear data
        int totalRow = tableApart.getRowCount() - 1;
        while (totalRow > - 1) {
            modelApartment.removeRow(totalRow);
            totalRow--;
        }
// add record
        String search = txtSearchApart.getText();
        String sql = " SELECT * FROM tb_apartment";
        + " WHERE " 
        + " apart_name LIKE ('%" + search + "%' ) "
        + " OR apart_address LIKE ('%" + search + "%') "
        + " OR apart_phone LIKE ('%" + search + "%')"
        + " OR build_year LIKE ('%" + search + "%')"
        + " OR begin_rate LIKE ('%" + search + "%') ";
        
        ResultSet rs = conn.createStatement().executeQuery(sql);
        int row = 0;
        while (rs.next()) {
        modelApartment.addRow(new Object[0]);
        modelApartment.setValueAt(rs.getInt("apart_no"), row, 0);
        modelApartment.setValueAt(rs.getString("apart_name"), row, 1);
        modelApartment.setValueAt(rs.getString("apart_address"), row, 2);
        modelApartment.setValueAt(rs.getString("apart_phone"), row, 3);
        modelApartment.setValueAt(rs.getString("build_year"), row, 4);
        modelApartment.setValueAt(rs.getString("begin_rate"), row, 5);
        row++;
        }
        tableApart.setModel(modelApartment);
       } catch (Exception e) {
           e.printStackTrace();
        }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApartNo = new javax.swing.JTextField();
        txtApartName = new javax.swing.JTextField();
        txtApartAddress = new javax.swing.JTextField();
        txtApartPhone = new javax.swing.JTextField();
        txtBuildYear = new javax.swing.JTextField();
        txtBeginRate = new javax.swing.JTextField();
        cmdSaveApart = new javax.swing.JButton();
        cmdUpdateApart = new javax.swing.JButton();
        cmdDeleteApart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableApart = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSearchApart = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("อพาร์ทเมนท์");
        setPreferredSize(new java.awt.Dimension(684, 650));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("เลขที่อพาร์ทเมนท์");

        jLabel2.setText("ชื่ออพาร์ทเมนท์");

        jLabel3.setText("ที่อยู่");

        jLabel4.setText("เบอร์โทรศัพท์");

        jLabel5.setText("ปีที่สร้าง");

        jLabel6.setText("ราคาค่าห้องเริ่มต้น");

        txtApartNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartNoActionPerformed(evt);
            }
        });

        txtBeginRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBeginRateActionPerformed(evt);
            }
        });

        cmdSaveApart.setText("บันทึก");
        cmdSaveApart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSaveApartActionPerformed(evt);
            }
        });

        cmdUpdateApart.setText("แก้ไข");
        cmdUpdateApart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdUpdateApartActionPerformed(evt);
            }
        });

        cmdDeleteApart.setText("ลบ");
        cmdDeleteApart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeleteApartActionPerformed(evt);
            }
        });

        tableApart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "เลขที่", "ชื่ออาร์ทเมนท์", "ที่อยู่", "เบอร์โทร", "ปีที่สร้าง", "ราคาเริ่มต้น"
            }
        ));
        tableApart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableApartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableApart);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ค้นหาข้อมูล"));
        jPanel1.setToolTipText("");

        txtSearchApart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchApartKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtSearchApart, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearchApart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtApartNo)
                                    .addComponent(txtApartName)
                                    .addComponent(txtApartAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                                    .addComponent(txtApartPhone)
                                    .addComponent(txtBuildYear)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmdSaveApart)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdUpdateApart)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmdDeleteApart)
                                        .addGap(0, 58, Short.MAX_VALUE))
                                    .addComponent(txtBeginRate))))
                        .addGap(40, 40, 40)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtApartNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtApartName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApartAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApartPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBuildYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtBeginRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdSaveApart)
                    .addComponent(cmdUpdateApart)
                    .addComponent(cmdDeleteApart))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApartNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApartNoActionPerformed

    private void txtBeginRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBeginRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBeginRateActionPerformed

    private void cmdSaveApartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSaveApartActionPerformed
        try { 
            String sql = ""
                 +"INSERT INTO tb_apartment(apart_no,apart_name,apart_address,apart_phone,build_year,begin_rate )"
                  + "Value ( ?,?,?,?,?,?)";
        PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, txtApartNo.getText());
		pre.setString(2, txtApartName.getText());
		pre.setString(3, txtApartAddress.getText());
		pre.setString(4, txtApartPhone.getText());
		pre.setString(5, txtBuildYear.getText());
		pre.setString(6, txtBeginRate.getText());
		if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "บันทึกรายการแล้ว", "ผลการบันทึกรายการ", JOptionPane.INFORMATION_MESSAGE);
                txtApartNo.setText("");
                txtApartName.setText("");
                txtApartAddress.setText("");
                txtApartPhone.setText("");
                txtBuildYear.setText("");
                txtBeginRate.setText("");        
                    showData();
                }
	}
        catch (Exception e){
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_cmdSaveApartActionPerformed

    private void cmdDeleteApartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeleteApartActionPerformed
        int index = tableApart.getSelectedRow();
        if (index != -1) {
            int pk = (Integer) tableApart.getValueAt(index, 0);
            String sql = "DELETE FROM tb_apartment where apart_no = " + pk;
            try {
                if (conn.createStatement().executeUpdate(sql) != -1) {
                JOptionPane.showMessageDialog(this, "ลบรายการแล้ว", "ผลการลบรายการ",
                JOptionPane.INFORMATION_MESSAGE);
                txtApartNo.setText("");
                txtApartName.setText("");
                txtApartAddress.setText("");
                txtApartPhone.setText("");
                txtBuildYear.setText("");
                txtBeginRate.setText("");
                showData(); }
                } catch (Exception e) {
            e.printStackTrace();}}
    }//GEN-LAST:event_cmdDeleteApartActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        showData();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tableApartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableApartMouseClicked
        int index = tableApart.getSelectedRow();
        txtApartNo.setText(tableApart.getValueAt(index, 0).toString());
        txtApartName.setText(tableApart.getValueAt(index, 1).toString());
        txtApartAddress.setText(tableApart.getValueAt(index, 2).toString());
        txtApartPhone.setText(tableApart.getValueAt(index, 3).toString());
        txtBuildYear.setText(tableApart.getValueAt(index, 4).toString());
        txtBeginRate.setText(tableApart.getValueAt(index, 5).toString());
    }//GEN-LAST:event_tableApartMouseClicked

    private void cmdUpdateApartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdUpdateApartActionPerformed
        int index = tableApart.getSelectedRow();
        if (index != -1) {
            int pk = (Integer) tableApart.getValueAt(index, 0);
            String sql = "UPDATE tb_apartment SET "
            + "apart_name = ?, "
            + "apart_address = ?, "
            + "apart_phone = ?,"
            + "build_year = ?,"
            + "begin_rate = ?"
            + "WHERE apart_no = "
            + pk;
            try {
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, txtApartName.getText());
                pre.setString(2, txtApartAddress.getText());
                pre.setString(3, txtApartPhone.getText());
                pre.setString(4, txtBuildYear.getText());
                pre.setString(5, txtBeginRate.getText());
                if (pre.executeUpdate() != -1) {
                }
                    JOptionPane.showMessageDialog(this, "แก้ไขรายการแล้ว", "ผลการบันทึกรายการ",
                    JOptionPane.INFORMATION_MESSAGE);
                    txtApartNo.setText("");
                    txtApartName.setText("");
                    txtApartAddress.setText("");
                    txtApartPhone.setText("");
                    txtBuildYear.setText("");
                    txtBeginRate.setText("");
                showData();
                    } catch (Exception e) {
                    e.printStackTrace();
                    }
        }

    }//GEN-LAST:event_cmdUpdateApartActionPerformed

    private void txtSearchApartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchApartKeyReleased
        String searchText = txtSearchApart.getText();
        try {
            if (!searchText.isEmpty()) {
        showData();
            }
            } catch (Exception e) {
        e.printStackTrace();
    }//GEN-LAST:event_txtSearchApartKeyReleased
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdDeleteApart;
    private javax.swing.JButton cmdSaveApart;
    private javax.swing.JButton cmdUpdateApart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableApart;
    private javax.swing.JTextField txtApartAddress;
    private javax.swing.JTextField txtApartName;
    private javax.swing.JTextField txtApartNo;
    private javax.swing.JTextField txtApartPhone;
    private javax.swing.JTextField txtBeginRate;
    private javax.swing.JTextField txtBuildYear;
    private javax.swing.JTextField txtSearchApart;
    // End of variables declaration//GEN-END:variables
}
