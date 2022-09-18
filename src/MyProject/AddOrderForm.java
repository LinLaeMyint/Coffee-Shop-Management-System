package MyProject;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AddOrderForm extends javax.swing.JFrame {
     static ArrayList<Item> bread;
   static ArrayList<Item> cake;
   static ArrayList<Item> donut;
    static ArrayList<Item> coffee;
    static ArrayList<Item> orderlist;
    String id;
    String item;
    int price;
    int qty;
    String size;
    String extra;
    DefaultTableModel model;
    public AddOrderForm() {
        initComponents();
        model=new DefaultTableModel();
        Object[] col=new Object[] {"Name","Ingredience","Size","Price","Quantity","Total"};
        model.setColumnIdentifiers(col);
        tblshoworderitem.setModel(model);
        
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
            cbocoffeename.addItem(i.getItemName());  
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
            cbobakeryname.addItem(i.getItemName());  
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
            cbobakeryname.addItem(i.getItemName());  
        }
        Item it22=new Item("D400","Strawberry Frosted",2000,50);
        Item it23=new Item("D401","Chocolate Frosted", 4000,60);
        Item it24=new Item("D402","Jelly Doughnut", 3500,70);
        Item it25=new Item("D403","Blueberry Doughnut",3000,50);
        Item it26=new Item("D404","Cream-Filled Doughnut", 4000,30);
        Item it27=new Item("D405","Chocolate Cake Doughnut",  5500,30);
        Item it28=new Item("D406","Cinnamon Twist Doughnut", 4500,30);
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
            cbobakeryname.addItem(i.getItemName());  
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        cbocoffeename = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        spnqtycoffee = new javax.swing.JSpinner();
        btnsavecoffee = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbolarge = new javax.swing.JRadioButton();
        rbosmall = new javax.swing.JRadioButton();
        rbomedium = new javax.swing.JRadioButton();
        btncalculatepricecoffee = new javax.swing.JButton();
        txtpricecoffee = new javax.swing.JTextField();
        btnresetcoffee = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblshoworderitem = new javax.swing.JTable();
        txttotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnremoveorder = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbobakeryname = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        spnqtybakery = new javax.swing.JSpinner();
        btncalculatepricebakery = new javax.swing.JButton();
        txtpricebakery = new javax.swing.JTextField();
        btnsavebakery = new javax.swing.JButton();
        btnresetbakery = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rboex1 = new javax.swing.JRadioButton();
        rboex2 = new javax.swing.JRadioButton();
        rboex3 = new javax.swing.JRadioButton();
        rboex4 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rboSsizebakery = new javax.swing.JRadioButton();
        rbomsizebakery = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rbocheese = new javax.swing.JRadioButton();
        rbohoney = new javax.swing.JRadioButton();
        rbobutter = new javax.swing.JRadioButton();
        rbomolasses = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cbodonateitem = new javax.swing.JComboBox<>();
        spndonateqty = new javax.swing.JSpinner();
        btndonate = new javax.swing.JButton();
        btnshoworders = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btncalculate = new javax.swing.JButton();
        txtpayment = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbocoffeename.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Choose Coffee:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Choose Quantity: ");

        spnqtycoffee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        spnqtycoffee.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        btnsavecoffee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnsavecoffee.setText("Save");
        btnsavecoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavecoffeeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Extra Ingredience:");

        buttonGroup1.add(rbolarge);
        rbolarge.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbolarge.setText("Large ");

        buttonGroup1.add(rbosmall);
        rbosmall.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbosmall.setText("Small");

        buttonGroup1.add(rbomedium);
        rbomedium.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbomedium.setText("Medium");

        btncalculatepricecoffee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btncalculatepricecoffee.setText("Calculate Price");
        btncalculatepricecoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculatepricecoffeeActionPerformed(evt);
            }
        });

        txtpricecoffee.setEditable(false);
        txtpricecoffee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        btnresetcoffee.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnresetcoffee.setText("Reset");
        btnresetcoffee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetcoffeeActionPerformed(evt);
            }
        });

        tblshoworderitem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tblshoworderitem.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblshoworderitem);

        txttotal.setEditable(false);
        txttotal.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("AMOUNT");

        btnremoveorder.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnremoveorder.setText("Remove Order");
        btnremoveorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveorderActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setText("Choose Bakery:");

        cbobakeryname.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel10.setText("Choose Quantity: ");

        spnqtybakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        spnqtybakery.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        btncalculatepricebakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btncalculatepricebakery.setText("Calculate Price");
        btncalculatepricebakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculatepricebakeryActionPerformed(evt);
            }
        });

        txtpricebakery.setEditable(false);
        txtpricebakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        btnsavebakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnsavebakery.setText("Save");
        btnsavebakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsavebakeryActionPerformed(evt);
            }
        });

        btnresetbakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnresetbakery.setText("Reset");
        btnresetbakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetbakeryActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel9.setText("Choose Size:");

        buttonGroup2.add(rboex1);
        rboex1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rboex1.setText("Cinnamon");

        buttonGroup2.add(rboex2);
        rboex2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rboex2.setText("Cocoa Powder");

        buttonGroup2.add(rboex3);
        rboex3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rboex3.setText("Butter");

        buttonGroup2.add(rboex4);
        rboex4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rboex4.setText(" Maple Syrup");

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel11.setText("Choose Size:");

        buttonGroup3.add(rboSsizebakery);
        rboSsizebakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rboSsizebakery.setText("Small");

        buttonGroup3.add(rbomsizebakery);
        rbomsizebakery.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbomsizebakery.setText("Medium");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel12.setText("Extra Ingredience:");

        buttonGroup4.add(rbocheese);
        rbocheese.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbocheese.setText("Cheese");

        buttonGroup4.add(rbohoney);
        rbohoney.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbohoney.setText("Honey");

        buttonGroup4.add(rbobutter);
        rbobutter.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbobutter.setText("Butter");

        buttonGroup4.add(rbomolasses);
        rbomolasses.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        rbomolasses.setText("Molasses");

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel13.setText("Choose to Donate: ");

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel14.setText("Choose Quantity: ");

        cbodonateitem.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        spndonateqty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        spndonateqty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 50, 1));

        btndonate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btndonate.setText("Donate");
        btndonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndonateActionPerformed(evt);
            }
        });

        btnshoworders.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btnshoworders.setText("Show Order");
        btnshoworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowordersActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));

        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("ORDER INFORMATION SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(515, 515, 515)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel16.setText("PAYMENT");

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel17.setText("BALANCE");

        btncalculate.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        btncalculate.setText("CALCULATE");
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });

        txtpayment.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        txtbalance.setEditable(false);
        txtbalance.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btncalculatepricecoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpricecoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbocoffeename, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spnqtycoffee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(rbosmall, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbomedium, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbolarge, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rboex3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(rboex4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rboex1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rboex2, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnresetcoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsavecoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnqtybakery, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbobakeryname, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnresetbakery, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnsavebakery, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rbocheese, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rbohoney, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rbobutter, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rbomolasses, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(rboSsizebakery, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rbomsizebakery, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btncalculatepricebakery, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtpricebakery, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbodonateitem, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(spndonateqty, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnshoworders)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btndonate, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btncalculate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnremoveorder, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(128, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(jLabel9)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbocoffeename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(cbobakeryname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnqtycoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(spnqtybakery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbolarge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbomedium)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbosmall)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(rboex1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rboex2)
                                .addGap(4, 4, 4)
                                .addComponent(rboex3)
                                .addGap(0, 0, 0)
                                .addComponent(rboex4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(rboSsizebakery))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbomsizebakery)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(rbocheese))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbohoney)
                                .addGap(4, 4, 4)
                                .addComponent(rbobutter)
                                .addGap(0, 0, 0)
                                .addComponent(rbomolasses))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtpayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncalculatepricecoffee, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpricecoffee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncalculatepricebakery)
                            .addComponent(txtpricebakery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsavebakery)
                            .addComponent(btnresetbakery)
                            .addComponent(btnsavecoffee)
                            .addComponent(btnresetcoffee)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(cbodonateitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(spndonateqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncalculate))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btndonate)
                            .addComponent(btnshoworders)
                            .addComponent(btnremoveorder))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(182, 182, 182)
                    .addComponent(jLabel9)
                    .addContainerGap(388, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncalculatepricecoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculatepricecoffeeActionPerformed
       item=cbocoffeename.getSelectedItem().toString();
        qty=(int) spnqtycoffee.getValue();
         price = 0;
         if(rbosmall.isSelected()==true){
        for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }

         }
         else if(rbomedium.isSelected()==true){
         for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }       
         }
         else
         {
         for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (3*qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }
         }
         
         if(rboex1.isSelected()==true){
         for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }
         }
         else if(rboex2.isSelected()==true){
         for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }
         }
         if(rboex3.isSelected()==true){
         for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }
         }
         if(rboex4.isSelected()==true){
         for(Item i:coffee){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricecoffee.setText(Integer.toString(price));
        }
         }
    }//GEN-LAST:event_btncalculatepricecoffeeActionPerformed

    private void btnsavecoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavecoffeeActionPerformed
    
        cbocoffeename.getSelectedItem();
       
        if(rbolarge.isSelected() == true){
            size="Large";
            txtpricecoffee.getText();

        }
        else if(rbomedium.isSelected() == true){
            size="Medium";
            txtpricecoffee.getText();

        }
        else if(rbosmall.isSelected() == true){
            size="Small";
            txtpricecoffee.getText();

        }
        
        if(rboex1.isSelected() == true){
            extra="Cinnamon";
            txtpricecoffee.getText();

        }
        else if(rboex2.isSelected() == true){
            extra="Cocoa Powder";
            txtpricecoffee.getText();

        }
        else if(rboex3.isSelected() == true){
            extra="Butter";
            txtpricecoffee.getText();

        }
        else if(rboex4.isSelected() == true){
            extra="Maple Syrup";
            txtpricecoffee.getText();

        }
        
        int qty=Integer.parseInt(spnqtycoffee.getValue().toString());
        int total=qty*price;
        
        model=(DefaultTableModel)tblshoworderitem.getModel();
        
        model.addRow(new Object[]
        {
            
            item,
            extra,
            size,
            price,
            qty,
            total
        });
        
        int sum=0;
        for(int a=0; a<tblshoworderitem.getRowCount(); a++){
        sum = sum + Integer.parseInt(tblshoworderitem.getValueAt(a, 5).toString());
        }
        
        txttotal.setText(Integer.toString(sum));
       
        Item Order=new Item(item,extra,size,price,qty);
       orderlist.add(Order);
        JOptionPane.showMessageDialog(this, "Order Successfully"); 
        
//         for(Item i: coffee){
//             if( i.getItemName().equals(item)){
//                 int upqty =i.getQty()-qty;
//                 i.setQty(upqty);
//             }
//          }
//        
//         txtcoffee.setText("");
//         for( Item i : coffee)
//            txtcoffee.append(i.toString()+ "\n" );
    }//GEN-LAST:event_btnsavecoffeeActionPerformed

    private void btnresetcoffeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetcoffeeActionPerformed
       cbocoffeename.setSelectedIndex(0);
       spnqtycoffee.setValue(1);
       txtpricecoffee.setText("");
       rbosmall.isSelected();
       
    }//GEN-LAST:event_btnresetcoffeeActionPerformed

    private void btnremoveorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveorderActionPerformed
       model.removeRow(tblshoworderitem.getSelectedRow());
       
       int sum=0;
       for(int a=0; a<tblshoworderitem.getRowCount(); a++){
        sum = sum + Integer.parseInt(tblshoworderitem.getValueAt(a, 4).toString());
        }
        
        txttotal.setText(Integer.toString(sum));
    }//GEN-LAST:event_btnremoveorderActionPerformed

    private void btncalculatepricebakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculatepricebakeryActionPerformed
        item=cbobakeryname.getSelectedItem().toString();
        qty=(int) spnqtybakery.getValue();
        price = 0;

        if(rboSsizebakery.isSelected()==true){
        for(Item i:bread){
        if(i.getItemName().equals(item))
            price=(int) (qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }

         }
         else if(rbomsizebakery.isSelected()==true){
         for(Item i:bread){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }       
         }
         
         
         if(rboSsizebakery.isSelected()==true)
         {
         for(Item i:cake){
        if(i.getItemName().equals(item))
            price=(int) (qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbomsizebakery.isSelected()==true)
         {
         for(Item i:cake){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         
         
         
         if(rboSsizebakery.isSelected()==true)
         {
         for(Item i:donut){
        if(i.getItemName().equals(item))
            price=(int) (qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbomsizebakery.isSelected()==true)
         {
         for(Item i:donut){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         
         
         //cheese
         if(rbocheese.isSelected()==true){
         for(Item i:bread){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbocheese.isSelected()==true){
         for(Item i:cake){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbocheese.isSelected()==true){
         for(Item i:donut){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         
         
         //honey
         if(rbohoney.isSelected()==true){
         for(Item i:bread){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbohoney.isSelected()==true){
         for(Item i:cake){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbohoney.isSelected()==true){
         for(Item i:donut){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         
         
         //butter
         if(rbobutter.isSelected()==true){
         for(Item i:bread){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbobutter.isSelected()==true){
         for(Item i:cake){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbobutter.isSelected()==true){
         for(Item i:donut){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         
         
         //molasses
         if(rbomolasses.isSelected()==true){
         for(Item i:bread){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbomolasses.isSelected()==true){
         for(Item i:cake){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
         else if(rbomolasses.isSelected()==true){
         for(Item i:donut){
        if(i.getItemName().equals(item))
            price=(int) (2*qty*i.getPrice());
        txtpricebakery.setText(Integer.toString(price));
        }
         }
    }//GEN-LAST:event_btncalculatepricebakeryActionPerformed

    private void btnsavebakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsavebakeryActionPerformed

        cbobakeryname.getSelectedItem();
        if(rboSsizebakery.isSelected() == true){
            size="Small";
            txtpricebakery.getText();

        }
        else if(rbomsizebakery.isSelected() == true){
            size="Medium";
            txtpricebakery.getText();

        }
        
        if(rbocheese.isSelected() == true){
            extra="Cheese";
            txtpricebakery.getText();

        }
        else if(rbohoney.isSelected() == true){
            extra="Honey";
            txtpricebakery.getText();

        }
        else if(rbobutter.isSelected() == true){
            extra="Butter";
            txtpricebakery.getText();

        }
        else if(rbomolasses.isSelected() == true){
            extra="Maple Syrup";
            txtpricebakery.getText();

        }
        
        int qty=Integer.parseInt(spnqtybakery.getValue().toString());
        int total=qty*price;

        model=(DefaultTableModel)tblshoworderitem.getModel();

        model.addRow(new Object[]
            {

                item,
                extra,
                size,
                price,
                qty,
                total
            });

            int sum=0;
            for(int a=0; a<tblshoworderitem.getRowCount(); a++){
                sum = sum + Integer.parseInt(tblshoworderitem.getValueAt(a, 5).toString());
            }

            txttotal.setText(Integer.toString(sum));
            
            Item Order=new Item(item,extra,size,price,qty);
            orderlist.add(Order);
            JOptionPane.showMessageDialog(this, "Order Successfully");

            //         for(Item i: coffee){
                //             if( i.getItemName().equals(item)){
                    //                 int upqty =i.getQty()-qty;
                    //                 i.setQty(upqty);
                    //             }
                //          }
            //
            //         txtcoffee.setText("");
            //         for( Item i : coffee)
            //            txtcoffee.append(i.toString()+ "\n" );
    }//GEN-LAST:event_btnsavebakeryActionPerformed

    private void btnresetbakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetbakeryActionPerformed
        cbobakeryname.setSelectedIndex(0);
        spnqtybakery.setValue(1);
        txtpricebakery.setText("");

    }//GEN-LAST:event_btnresetbakeryActionPerformed

    private void btnshowordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowordersActionPerformed
        for(Item i:orderlist){
        cbodonateitem.addItem(i.getItemName());
        }
    }//GEN-LAST:event_btnshowordersActionPerformed

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        int tot=Integer.parseInt(txttotal.getText());
        int pay=Integer.parseInt(txtpayment.getText());
        
        int bal=pay-tot;
        txtbalance.setText(String.valueOf(bal));
    }//GEN-LAST:event_btncalculateActionPerformed

    private void btndonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndonateActionPerformed
        int ans=JOptionPane.showConfirmDialog(this, "Would You like to donate?", item, JOptionPane.YES_NO_CANCEL_OPTION);
        if(ans==0){
        JOptionPane.showMessageDialog(this, "Thanks For Your Donation!");
        }
        Donation d=new Donation();
        d.setVisible(true);
    }//GEN-LAST:event_btndonateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOrderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncalculate;
    private javax.swing.JButton btncalculatepricebakery;
    private javax.swing.JButton btncalculatepricecoffee;
    private javax.swing.JButton btndonate;
    private javax.swing.JButton btnremoveorder;
    private javax.swing.JButton btnresetbakery;
    private javax.swing.JButton btnresetcoffee;
    private javax.swing.JButton btnsavebakery;
    private javax.swing.JButton btnsavecoffee;
    private javax.swing.JButton btnshoworders;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    public javax.swing.JComboBox<String> cbobakeryname;
    public javax.swing.JComboBox<String> cbocoffeename;
    private javax.swing.JComboBox<String> cbodonateitem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rboSsizebakery;
    private javax.swing.JRadioButton rbobutter;
    private javax.swing.JRadioButton rbocheese;
    private javax.swing.JRadioButton rboex1;
    private javax.swing.JRadioButton rboex2;
    private javax.swing.JRadioButton rboex3;
    private javax.swing.JRadioButton rboex4;
    private javax.swing.JRadioButton rbohoney;
    private javax.swing.JRadioButton rbolarge;
    private javax.swing.JRadioButton rbomedium;
    private javax.swing.JRadioButton rbomolasses;
    private javax.swing.JRadioButton rbomsizebakery;
    private javax.swing.JRadioButton rbosmall;
    private javax.swing.JSpinner spndonateqty;
    private javax.swing.JSpinner spnqtybakery;
    private javax.swing.JSpinner spnqtycoffee;
    private javax.swing.JTable tblshoworderitem;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txtpricebakery;
    private javax.swing.JTextField txtpricecoffee;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
