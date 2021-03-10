package com.mycompany.mybikeprogram2020;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    //Declare a bicyle object 
    Bicycle myBike;
    
    //Declare variables to extract info from the form
    int gear;
    int speed;
    int cadence;
    
    
    //flag for form validation
    //form is assumed to be not properly completed 
    boolean formCompleted= false;
    
    //validate form method 
    public void validateForm()
    {
        //assume form not completed at start
        formCompleted = false;
        
        if (cadenceTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the cadence!", 
                    "Missing info",JOptionPane.INFORMATION_MESSAGE);
        }
        else  if (speedTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the speed!",
                    "Missing info",JOptionPane.INFORMATION_MESSAGE);
        }
        else  if (gearTxt.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the gear!",
                    "Missing info",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            //form is completed correctly
            formCompleted = true;
        }
        
    } //end validateForm method
    
    
    // Extract Form Details Method
    public void extractFormDetails()
    {
        cadence =  Integer.parseInt(cadenceTxt.getText());     
        speed = Integer.parseInt(speedTxt.getText());
        gear =  Integer.parseInt(gearTxt.getText());
        
    }
    
    
    public void displayBike() 
    {
        cadenceLbl.setText(Integer.toString(myBike.getCadence()));
        speedLbl.setText(Integer.toString(myBike.getSpeed()));
        gearLbl.setText(Integer.toString(myBike.getGear()));
    }
    
    

    /** Creates new form Main */
    public Main() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createWindow = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cadenceTxt = new javax.swing.JTextField();
        createBikeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        speedTxt = new javax.swing.JTextField();
        gearTxt = new javax.swing.JTextField();
        displayWindow = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cadenceLbl = new javax.swing.JLabel();
        speedLbl = new javax.swing.JLabel();
        gearLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        createBtn = new javax.swing.JButton();
        displayBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();

        createWindow.setTitle("Create Bike");
        createWindow.setBackground(new java.awt.Color(255, 255, 255));
        createWindow.setLocation(new java.awt.Point(500, 200));
        createWindow.setMinimumSize(new java.awt.Dimension(250, 350));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Create Bicycle:");

        jLabel2.setText("Cadence:");

        createBikeBtn.setText("Create Bike");
        createBikeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBikeBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Gear:");

        jLabel4.setText("Speed:");

        javax.swing.GroupLayout createWindowLayout = new javax.swing.GroupLayout(createWindow.getContentPane());
        createWindow.getContentPane().setLayout(createWindowLayout);
        createWindowLayout.setHorizontalGroup(
            createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createWindowLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createWindowLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(78, 78, 78)))
                    .addGroup(createWindowLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cadenceTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(speedTxt)
                    .addComponent(gearTxt))
                .addGap(40, 40, 40))
            .addGroup(createWindowLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(createBikeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        createWindowLayout.setVerticalGroup(
            createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createWindowLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cadenceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(createWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(createBikeBtn)
                .addGap(34, 34, 34))
        );

        displayWindow.setTitle("Display Bike");
        displayWindow.setLocation(new java.awt.Point(500, 200));
        displayWindow.setMinimumSize(new java.awt.Dimension(250, 350));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Display Bike Information:");

        jLabel6.setText("Cadence:");

        jLabel7.setText("Speed:");

        jLabel8.setText("Gear:");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cadenceLbl.setText("...");

        speedLbl.setText("...");

        gearLbl.setText("...");

        javax.swing.GroupLayout displayWindowLayout = new javax.swing.GroupLayout(displayWindow.getContentPane());
        displayWindow.getContentPane().setLayout(displayWindowLayout);
        displayWindowLayout.setHorizontalGroup(
            displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayWindowLayout.createSequentialGroup()
                .addGroup(displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(displayWindowLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5))
                    .addGroup(displayWindowLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(55, 55, 55)
                        .addGroup(displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gearLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(speedLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cadenceLbl))))
                    .addGroup(displayWindowLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        displayWindowLayout.setVerticalGroup(
            displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(displayWindowLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cadenceLbl))
                .addGap(30, 30, 30)
                .addGroup(displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(speedLbl))
                .addGap(34, 34, 34)
                .addGroup(displayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(gearLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bicycle App");

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titleLbl.setText("Menu:");

        createBtn.setText("Create a Bike");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        displayBtn.setText("Display the Bike");
        displayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit the Bike");

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(titleLbl)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(titleLbl)
                .addGap(17, 17, 17)
                .addComponent(createBtn)
                .addGap(27, 27, 27)
                .addComponent(displayBtn)
                .addGap(33, 33, 33)
                .addComponent(editBtn)
                .addGap(30, 30, 30)
                .addComponent(exitBtn)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // Close the application
        System.exit(0);
        
    }//GEN-LAST:event_exitBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        
        //Display the create bike window
        createWindow.setVisible(true);
        
    }//GEN-LAST:event_createBtnActionPerformed

    private void createBikeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBikeBtnActionPerformed
            
        // validate form to see if completed correctly
        validateForm();
        
        //if form is completed correctly 
        if (formCompleted) {
        
            // extract info from the form
            extractFormDetails(); 
            //create a bicycle 
            myBike = new Bicycle(cadence, speed, gear); 
            
            //Test display myBike
            System.out.println(myBike.toString());
            
            //Close the Create Bike Window 
            createWindow.setVisible(false);
             
        } //end if 
    }//GEN-LAST:event_createBikeBtnActionPerformed

    private void displayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayBtnActionPerformed
        // Show the DisplayWindow
        displayWindow.setVisible(true);
        
        //Show the bike info on the form
        displayBike();
        
    }//GEN-LAST:event_displayBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Close DisplayWindow
        displayWindow.setVisible(false);
        
            
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      //  java.awt.EventQueue.invokeLater(new Runnable() {
     //       public void run() {
                new Main().setVisible(true);
     //       }
      //  });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadenceLbl;
    private javax.swing.JTextField cadenceTxt;
    private javax.swing.JButton createBikeBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JFrame createWindow;
    private javax.swing.JButton displayBtn;
    private javax.swing.JFrame displayWindow;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel gearLbl;
    private javax.swing.JTextField gearTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel speedLbl;
    private javax.swing.JTextField speedTxt;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables

}
