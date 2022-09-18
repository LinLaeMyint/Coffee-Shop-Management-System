package MyProject;

import MyProject.Item;
import java.util.ArrayList;
public class CoffeeAndBakeryMenu extends javax.swing.JFrame {
   static ArrayList<Item> bread;
   static ArrayList<Item> cake;
   static ArrayList<Item> donut; 
   static ArrayList<Item> coffee;
   static ArrayList<Item> orderlist;
   public CoffeeAndBakeryMenu() {
        initComponents();
        
        Item it1=new Item("C100","Latte",3500,50);
        Item it2=new Item("C101","Expresso",4000,60);
        Item it3=new Item("C102","Black Coffee",3500,50);
        Item it4=new Item("C103","Cappuccino",4000,60);
        Item it5=new Item("C104","Macchiato",4000,50);
        Item it6=new Item("C105","Americano", 4500,60);
        Item it7=new Item("C106","Decaf",3500,50);
        coffee=new ArrayList<Item>();
        orderlist=new ArrayList <Item>();
        coffee.add(it1);
        coffee.add(it2);
        coffee.add(it3);
        coffee.add(it4);
        coffee.add(it5);
        coffee.add(it6);
        coffee.add(it7);
        for(Item i:coffee)
        {
            txtcoffee.append(i.toString()+"\n");
            //cboitemname.addItem(i.getItemName());  
        }
        
        Item it8=new Item("B200","Baguette",2000,50);
        Item it9=new Item("B201","Breadstick", 4000,60);
        Item it10=new Item("B202","Brioche", 3500,70);
        Item it11=new Item("B203","Challah",3000,50);
        Item it12=new Item("B204","Ciabatta", 4000,30);
        Item it13=new Item("B205","Cornbread",  5500,30);
        Item it14=new Item("B206","Focaccia", 4500,30);
        bread=new ArrayList<Item>();
        orderlist=new ArrayList <Item>();
        bread.add(it8);
        bread.add(it9);
        bread.add(it10);
        bread.add(it11);
        bread.add(it12);
        bread.add(it13);
        bread.add(it14);
        for(Item i:bread)
        {
            txtbread.append(i.toString()+"\n");
            //cboitemname.addItem(i.getItemName());  
        }
        
        Item it15=new Item("CK300","Chocolate Sponge Cake",2000,50);
        Item it16=new Item("CK301","Red Velvet Cake", 4000,60);
        Item it17=new Item("CK302","Angel Food Cake", 3500,70);
        Item it18=new Item("CK303","Baked Flourless Cake",3000,50);
        Item it19=new Item("CK304","Peach CoffeeCake", 4000,30);
        Item it20=new Item("CK305","Baked Flourless Cake",  5500,30);
        Item it21=new Item("CK306","Orange Chiffon Cake", 4500,30);
        cake=new ArrayList<Item>();
        orderlist=new ArrayList <Item>();
        cake.add(it15);
        cake.add(it16);
        cake.add(it17);
        cake.add(it18);
        cake.add(it19);
        cake.add(it20);
        cake.add(it21);
        for(Item i:cake)
        {
            txtcake.append(i.toString()+"\n");
            //cboitemname.addItem(i.getItemName());  
        }
        Item it22=new Item("D400","Strawberry Frosted",2000,50);
        Item it23=new Item("D401","Chocolate Frosted", 4000,60);
        Item it24=new Item("D402","Jelly Doughnut", 3500,70);
        Item it25=new Item("D403","Blueberry Doughnut",3000,50);
        Item it26=new Item("D404","Cream-Filled Doughnut", 4000,30);
        Item it27=new Item("D405","Chocolate Cake Doughnut",  5500,30);
        Item it28=new Item("D406","Cinnamon Twist Doughnu", 4500,30);
        donut=new ArrayList<Item>();
        orderlist=new ArrayList <Item>();
        donut.add(it22);
        donut.add(it23);
        donut.add(it24);
        donut.add(it25);
        donut.add(it26);
        donut.add(it27);
        donut.add(it28);
        for(Item i:donut)
        {
            txtdonut.append(i.toString()+"\n");
            //cboitemname.addItem(i.getItemName());  
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnaddorder = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtbread = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtcoffee = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtdonut = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtcake = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COFFEE MENU");

        btnaddorder.setText("Add Order");
        btnaddorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddorderActionPerformed(evt);
            }
        });

        txtbread.setEditable(false);
        txtbread.setColumns(20);
        txtbread.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtbread.setRows(5);
        jScrollPane6.setViewportView(txtbread);

        txtcoffee.setEditable(false);
        txtcoffee.setColumns(20);
        txtcoffee.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtcoffee.setRows(5);
        jScrollPane7.setViewportView(txtcoffee);

        txtdonut.setEditable(false);
        txtdonut.setColumns(20);
        txtdonut.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtdonut.setRows(5);
        jScrollPane8.setViewportView(txtdonut);

        txtcake.setEditable(false);
        txtcake.setColumns(20);
        txtcake.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        txtcake.setRows(5);
        jScrollPane9.setViewportView(txtcake);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaddorder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnaddorder)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddorderActionPerformed
        AddOrderForm of=new AddOrderForm();
        of.setVisible(true);
    }//GEN-LAST:event_btnaddorderActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoffeeAndBakeryMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea txtbread;
    private javax.swing.JTextArea txtcake;
    private javax.swing.JTextArea txtcoffee;
    private javax.swing.JTextArea txtdonut;
    // End of variables declaration//GEN-END:variables
}
