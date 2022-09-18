/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyProject;

import MyProject.AddOrderForm;
import MyProject.Item;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EditOrderForm_Coffee extends javax.swing.JFrame {
DefaultTableModel model;
    public EditOrderForm_Coffee() {
        initComponents();
        for(Item i:AddOrderForm.orderlist){
        cboitemname.addItem(i.getItemName());
        }
        model=new DefaultTableModel();
        Object [] col=new Object[] {"ID","Item Name","Price","Quantity"};
        model.setColumnIdentifiers(col);
        tblitem.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnremove = new javax.swing.JButton();
        btnshow = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblitem = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnupdateqty = new javax.swing.JButton();
        spnupdateqty = new javax.swing.JSpinner();
        jButton4 = new javax.swing.JButton();
        cboitemname = new javax.swing.JComboBox<>();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Item Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Remove Order Form");

        btnremove.setText("Remove");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnshow.setText("Show");
        btnshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowActionPerformed(evt);
            }
        });

        tblitem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblitem);

        jLabel3.setText("Upate Quantity");

        btnupdateqty.setText("Update Qty");
        btnupdateqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateqtyActionPerformed(evt);
            }
        });

        spnupdateqty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        jButton4.setText("Back Order Form");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        cboitemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboitemnameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnupdateqty, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnshow, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdateqty))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboitemname, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26)))))
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spnupdateqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnshow)
                    .addComponent(btnremove)
                    .addComponent(btnupdateqty))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
       String itemname=cboitemname.getSelectedItem().toString();
       for(Item i:AddOrderForm.orderlist){
       if(i.getItemName().equals(itemname))
       {
           AddOrderForm.orderlist.remove(i);
           JOptionPane.showMessageDialog(this, "Remove Successfully");
           break;
       }     
       }
       cboitemname.removeAllItems();
       for(Item i:AddOrderForm.orderlist){
       cboitemname.addItem(i.getItemName());
       }
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowActionPerformed
    model.setRowCount(0);
        for(Item i:AddOrderForm.orderlist){
    Object row[]=new Object[]{i.getId(),i.getItemName(),i.getPrice(),i.getQty()
    };
    model.addRow(row);
    }
    }//GEN-LAST:event_btnshowActionPerformed

    private void btnupdateqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateqtyActionPerformed
        String IName=cboitemname.getSelectedItem().toString();
        int Updateqty=(int)spnupdateqty.getValue();
        int price=0;
        
        for(Item i:AddOrderForm.coffee){
        if(i.getItemName().equals(IName)){
        price=i.getPrice();
        break;
        }
        }
        
        for(Item i:AddOrderForm.bread){
        if(i.getItemName().equals(IName)){
        price=i.getPrice();
        break;
        }
        }
        for(Item i:AddOrderForm.cake){
        if(i.getItemName().equals(IName)){
        price=i.getPrice();
        break;
        }
        }
        for(Item i:AddOrderForm.donut){
        if(i.getItemName().equals(IName)){
        price=i.getPrice();
        break;
        }
        }
        
        for(Item i:AddOrderForm.orderlist){
        if(i.getItemName().equals(IName)){
            i.setQty(Updateqty);
            i.setPrice(Updateqty*price);   
            JOptionPane.showMessageDialog(this, "Update Successfully");
            break;
        }
        }
    }//GEN-LAST:event_btnupdateqtyActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AddOrderForm of=new AddOrderForm();
        of.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cboitemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboitemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboitemnameActionPerformed

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
            java.util.logging.Logger.getLogger(EditOrderForm_Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditOrderForm_Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditOrderForm_Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditOrderForm_Coffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditOrderForm_Coffee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnshow;
    private javax.swing.JButton btnupdateqty;
    private javax.swing.JComboBox<String> cboitemname;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnupdateqty;
    private javax.swing.JTable tblitem;
    // End of variables declaration//GEN-END:variables
}
