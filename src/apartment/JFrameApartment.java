package apartment;


import form.FormApartment;
import form.FormRoom;
import form.FormTenant;
import form.FormTenantRoom;
import formManagement.FormMainApartment;
import formManagement.FormRentApartment;
import javax.swing.JOptionPane;
import report.ReportNetIncome;
import report.ReportRentCondition;
import report.ReportRoom;

/**
 *
 * @author MARUT
 */
public class JFrameApartment extends javax.swing.JFrame {

 
    public JFrameApartment() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myDesktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuApartment = new javax.swing.JMenuItem();
        menuTenant = new javax.swing.JMenuItem();
        menuRoom = new javax.swing.JMenuItem();
        menuTenantRoom = new javax.swing.JMenuItem();
        menuExitForm = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuRentApartment = new javax.swing.JMenuItem();
        menuMainApartment = new javax.swing.JMenuItem();
        menuExitFormManagement = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuReportNetIncome = new javax.swing.JMenuItem();
        menuReportRoom = new javax.swing.JMenuItem();
        menuReportRentCondition = new javax.swing.JMenuItem();
        menuExitFormReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("โปรแกรมการจัดการอพาร์ทเมนท์");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(550, 150));

        myDesktop.setPreferredSize(new java.awt.Dimension(800, 700));

        javax.swing.GroupLayout myDesktopLayout = new javax.swing.GroupLayout(myDesktop);
        myDesktop.setLayout(myDesktopLayout);
        myDesktopLayout.setHorizontalGroup(
            myDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        myDesktopLayout.setVerticalGroup(
            myDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
        );

        jMenu1.setText("ระบบจัดการข้อมูลพื้นฐาน ");

        menuApartment.setText("ข้อมูลอพาร์ทเมนท์");
        menuApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuApartmentActionPerformed(evt);
            }
        });
        jMenu1.add(menuApartment);

        menuTenant.setText("ข้อมูลผู้เช่า");
        menuTenant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTenantActionPerformed(evt);
            }
        });
        jMenu1.add(menuTenant);

        menuRoom.setText("ข้อมูลห้องพัก");
        menuRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRoomActionPerformed(evt);
            }
        });
        jMenu1.add(menuRoom);

        menuTenantRoom.setText("ข้อมูลผู้เช่าห้องพัก");
        menuTenantRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTenantRoomActionPerformed(evt);
            }
        });
        jMenu1.add(menuTenantRoom);

        menuExitForm.setText("ออกจากโปรแกรม");
        menuExitForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitFormActionPerformed(evt);
            }
        });
        jMenu1.add(menuExitForm);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("ระบบการจัดการอพาร์ทเมนท์");

        menuRentApartment.setText("การเช่าอพาร์ทเมนท์");
        menuRentApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRentApartmentActionPerformed(evt);
            }
        });
        jMenu2.add(menuRentApartment);

        menuMainApartment.setText("การบำรุงรักษาอพาร์ทเมนท์");
        menuMainApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMainApartmentActionPerformed(evt);
            }
        });
        jMenu2.add(menuMainApartment);

        menuExitFormManagement.setText("ออกจากโปรแกรม");
        menuExitFormManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitFormManagementActionPerformed(evt);
            }
        });
        jMenu2.add(menuExitFormManagement);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("ระบบการแสดงรายงาน");

        menuReportNetIncome.setText("รายงานแสดงรายได้สุทธิ");
        menuReportNetIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportNetIncomeActionPerformed(evt);
            }
        });
        jMenu3.add(menuReportNetIncome);

        menuReportRoom.setText("รายงานแสดงข้อมูลห้องว่าง");
        menuReportRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportRoomActionPerformed(evt);
            }
        });
        jMenu3.add(menuReportRoom);

        menuReportRentCondition.setText("รายงานแสดงข้อมูลผู้เช่าตามเงื่อนไข");
        menuReportRentCondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReportRentConditionActionPerformed(evt);
            }
        });
        jMenu3.add(menuReportRentCondition);

        menuExitFormReport.setText("ออกจากโปรแกรม");
        menuExitFormReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitFormReportActionPerformed(evt);
            }
        });
        jMenu3.add(menuExitFormReport);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(myDesktop, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuApartmentActionPerformed
        FormApartment formApartment = new FormApartment();
        formApartment.setVisible(true);
        myDesktop.add(formApartment);
    }//GEN-LAST:event_menuApartmentActionPerformed

    private void menuTenantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTenantActionPerformed
        FormTenant formTenant = new FormTenant();
        formTenant.setVisible(true);
        myDesktop.add(formTenant);
    }//GEN-LAST:event_menuTenantActionPerformed

    private void menuRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRoomActionPerformed
        FormRoom formRoom = new FormRoom();
        formRoom.setVisible(true);
        myDesktop.add(formRoom);
    }//GEN-LAST:event_menuRoomActionPerformed

    private void menuTenantRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTenantRoomActionPerformed
        FormTenantRoom formTenantRoom = new FormTenantRoom();
        formTenantRoom.setVisible(true);
        myDesktop.add(formTenantRoom);
    }//GEN-LAST:event_menuTenantRoomActionPerformed

    private void menuRentApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRentApartmentActionPerformed
        FormRentApartment formRentApartment = new FormRentApartment();
        formRentApartment.setVisible(true);
        myDesktop.add(formRentApartment);
    }//GEN-LAST:event_menuRentApartmentActionPerformed

    private void menuMainApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMainApartmentActionPerformed
        FormMainApartment formMainApartment = new FormMainApartment();
        formMainApartment.setVisible(true);
        myDesktop.add(formMainApartment);
    }//GEN-LAST:event_menuMainApartmentActionPerformed

    private void menuReportNetIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportNetIncomeActionPerformed
        ReportNetIncome formReportNetIncome = new ReportNetIncome();
        formReportNetIncome.setVisible(true);
        myDesktop.add(formReportNetIncome);
    }//GEN-LAST:event_menuReportNetIncomeActionPerformed

    private void menuReportRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportRoomActionPerformed
        ReportRoom formReportRoom = new ReportRoom();
        formReportRoom.setVisible(true);
        myDesktop.add(formReportRoom);
    }//GEN-LAST:event_menuReportRoomActionPerformed

    private void menuReportRentConditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReportRentConditionActionPerformed
        ReportRentCondition formReportRentCondition = new ReportRentCondition();
        formReportRentCondition.setVisible(true);
        myDesktop.add(formReportRentCondition);
    }//GEN-LAST:event_menuReportRentConditionActionPerformed

    private void menuExitFormManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitFormManagementActionPerformed
        if(JOptionPane.showConfirmDialog(this,"ยืนยันการปิดโปรแกรม", "ยืนยัน",
        JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION)
         {System.exit(0);}
    }//GEN-LAST:event_menuExitFormManagementActionPerformed

    private void menuExitFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitFormActionPerformed
        if(JOptionPane.showConfirmDialog(this,"ยืนยันการปิดโปรแกรม", "ยืนยัน",
        JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION)
         {System.exit(0);}
    }//GEN-LAST:event_menuExitFormActionPerformed

    private void menuExitFormReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitFormReportActionPerformed
        if(JOptionPane.showConfirmDialog(this,"ยืนยันการปิดโปรแกรม", "ยืนยัน",
        JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_OPTION)
         {System.exit(0);}
    }//GEN-LAST:event_menuExitFormReportActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new JFrameApartment().setVisible(true);
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuApartment;
    private javax.swing.JMenuItem menuExitForm;
    private javax.swing.JMenuItem menuExitFormManagement;
    private javax.swing.JMenuItem menuExitFormReport;
    private javax.swing.JMenuItem menuMainApartment;
    private javax.swing.JMenuItem menuRentApartment;
    private javax.swing.JMenuItem menuReportNetIncome;
    private javax.swing.JMenuItem menuReportRentCondition;
    private javax.swing.JMenuItem menuReportRoom;
    private javax.swing.JMenuItem menuRoom;
    private javax.swing.JMenuItem menuTenant;
    private javax.swing.JMenuItem menuTenantRoom;
    private javax.swing.JDesktopPane myDesktop;
    // End of variables declaration//GEN-END:variables

    

    
}
