package CoffeeShopSystem_Admin;

import MyProject.Item;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class TodayMenu extends javax.swing.JFrame {
    static ArrayList<Item> coffee;
    public TodayMenu() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtitemname = new javax.swing.JTextField();
        btnaddcoffee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbreakfast = new javax.swing.JTextArea();
        btnremove = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtcoffee = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtsandwich = new javax.swing.JTextArea();
        btnaddbreakfast = new javax.swing.JButton();
        btnaddsandwich = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel1.setText("TODAY'S MENU");

        jLabel2.setText("Enter Item: ");

        btnaddcoffee.setText("Add");
        btnaddcoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcoffeeActionPerformed(evt);
            }
        });

        txtbreakfast.setColumns(20);
        txtbreakfast.setRows(5);
        jScrollPane1.setViewportView(txtbreakfast);

        btnremove.setText("Remove");

        btnedit.setText("Edit");

        txtcoffee.setColumns(20);
        txtcoffee.setRows(5);
        jScrollPane2.setViewportView(txtcoffee);

        txtsandwich.setColumns(20);
        txtsandwich.setRows(5);
        jScrollPane3.setViewportView(txtsandwich);

        btnaddbreakfast.setText("Add");
        btnaddbreakfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddbreakfastActionPerformed(evt);
            }
        });

        btnaddsandwich.setText("Add");
        btnaddsandwich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddsandwichActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnaddcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaddbreakfast, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddsandwich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtitemname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btnremove)
                    .addComponent(btnsave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaddcoffee)
                    .addComponent(btnaddbreakfast)
                    .addComponent(btnaddsandwich))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddcoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcoffeeActionPerformed
       for(Item i:coffee){
       String itemname =  txtitemname.getText();
       txtcoffee.append(itemname+"\n");
       }
    }//GEN-LAST:event_btnaddcoffeeActionPerformed

    private void btnaddbreakfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddbreakfastActionPerformed
       String itemname =  txtitemname.getText();
       txtbreakfast.append(itemname+"\n");
    }//GEN-LAST:event_btnaddbreakfastActionPerformed

    private void btnaddsandwichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddsandwichActionPerformed
       String itemname =  txtitemname.getText();
       txtsandwich.append(itemname+"\n");
    }//GEN-LAST:event_btnaddsandwichActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        txtcoffee.getText();
        txtbreakfast.getText();
        txtsandwich.getText();
        
    }//GEN-LAST:event_btnsaveActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TodayMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddbreakfast;
    private javax.swing.JButton btnaddcoffee;
    private javax.swing.JButton btnaddsandwich;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtbreakfast;
    private javax.swing.JTextArea txtcoffee;
    private javax.swing.JTextField txtitemname;
    private javax.swing.JTextArea txtsandwich;
    // End of variables declaration//GEN-END:variables

}
