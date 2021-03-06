/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.managment.system;

import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class AddPatient extends javax.swing.JFrame {

    /**
     * Creates new form AddPatient
     */
    public AddPatient() {
        initComponents();
        setLocation(550,300);
        lblclose.setText("");
        ImageIcon img=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\Hospital Managment System\\src\\Images\\close.jpg");
        Image myimg=img.getImage();
        Image newimg=myimg.getScaledInstance(lblclose.getWidth(),lblclose.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ic=new ImageIcon(newimg);
        lblclose.setIcon(ic);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        rbn = new javax.swing.JPanel();
        lblclose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtlname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        txtphoneno = new javax.swing.JTextField();
        txtbg = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        txtweight = new javax.swing.JTextField();
        txtheight = new javax.swing.JTextField();
        txtillnesstype = new javax.swing.JTextField();
        rbm = new javax.swing.JRadioButton();
        rbf = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        rby = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        rbn.setBackground(new java.awt.Color(255, 255, 255));
        rbn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 145, 98), 2));

        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Enter Patient Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("First Name");

        txtfname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtfname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));
        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnameKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Last Name");

        txtlname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtlname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));
        txtlname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtlnameKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Phone No");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Blood Group");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Age");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Gender");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Weight(kg)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Height(cm)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Illness Type");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Address");

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        txtaddress.setRows(5);
        txtaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(5, 141, 87)));
        jScrollPane1.setViewportView(txtaddress);

        txtphoneno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtphoneno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));
        txtphoneno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtphonenoKeyPressed(evt);
            }
        });

        txtbg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtbg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));

        txtage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtageKeyPressed(evt);
            }
        });

        txtweight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtweight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));
        txtweight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtweightKeyPressed(evt);
            }
        });

        txtheight.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtheight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));
        txtheight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtheightKeyPressed(evt);
            }
        });

        txtillnesstype.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtillnesstype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(7, 168, 116), 2));

        rbm.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbm);
        rbm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbm.setText("Male");

        rbf.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbf);
        rbf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rbf.setText("Female");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Vaccinated");

        rby.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rby);
        rby.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rby.setText("Yes");

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setText("No");

        jButton1.setBackground(new java.awt.Color(3, 149, 96));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(10, 152, 84), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rbnLayout = new javax.swing.GroupLayout(rbn);
        rbn.setLayout(rbnLayout);
        rbnLayout.setHorizontalGroup(
            rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbnLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rbnLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                                .addComponent(txtphoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                                .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rbnLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(rbm)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbf)
                                        .addGap(20, 20, 20))
                                    .addComponent(txtillnesstype, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtheight))
                                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rbnLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)))))
                        .addGap(18, 18, 18)
                        .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtbg, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(txtlname)
                                .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                                .addComponent(txtweight, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                            .addGroup(rbnLayout.createSequentialGroup()
                                .addComponent(rby)
                                .addGap(30, 30, 30)
                                .addComponent(jRadioButton4))))
                    .addGroup(rbnLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rbnLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))))
        );
        rbnLayout.setVerticalGroup(
            rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rbnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfname))
                    .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtlname, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
                .addGap(36, 36, 36)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtphoneno)
                    .addComponent(txtbg))
                .addGap(46, 46, 46)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtage)
                    .addComponent(rbm)
                    .addComponent(rbf))
                .addGap(57, 57, 57)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addComponent(txtweight)
                    .addComponent(txtheight))
                .addGap(52, 52, 52)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtillnesstype)
                    .addComponent(jLabel12)
                    .addComponent(rby)
                    .addComponent(jRadioButton4))
                .addGap(64, 64, 64)
                .addGroup(rbnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        // TODO add your handling code here:
        int res;
        res=JOptionPane.showConfirmDialog(null, "Do you want to close?","CONFIRM",JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION)
        {
            dispose();
        }
    }//GEN-LAST:event_lblcloseMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String path="jdbc:mysql://localhost:3306/hospital_managment_system";
        try{
            Connection con=DriverManager.getConnection(path,"root","root");
            Statement st=con.createStatement();
            char gen='M';
            if(rbf.isSelected())
            {
                gen='F';
            }
            int vs = 0;
            if(rby.isSelected())
            {
                vs=1;
            }
            if(txtphoneno.getText().length()==10)
            {
                String query="insert into patient(name,age,phoneno,gender,address,weight,height,illnesstype,vaccineation_status) values('"+txtfname.getText()+" "+txtlname.getText()+"',"+Integer.parseInt(txtage.getText())+",'"+txtphoneno.getText()+"','"+gen+"','"+txtaddress.getText()+"','"+Integer.parseInt(txtheight.getText())+"','"+Integer.parseInt(txtweight.getText())+"','"+txtillnesstype.getText()+"',"+vs+")";
                st.executeUpdate(query);
                int res;
                res=JOptionPane.showConfirmDialog(null, "Data added succesfully.Do you want to close?","CONFIRM",JOptionPane.YES_NO_OPTION);
                if(res==JOptionPane.YES_OPTION)
                {
                    dispose();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Phone no should be of 10 digits","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
        {
          txtfname.setEditable(true);
        }
        else
        {
            txtfname.setEditable(false);
        }
    }//GEN-LAST:event_txtfnameKeyPressed

    private void txtlnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtlnameKeyPressed
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
        {
          txtlname.setEditable(true);
        }
        else
        {
            txtlname.setEditable(false);
        }
    }//GEN-LAST:event_txtlnameKeyPressed

    private void txtphonenoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtphonenoKeyPressed
        // TODO add your handling code here:
         int len = txtphoneno.getText().length();
	char c = evt.getKeyChar();
	if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
		if(len<10){
			txtphoneno.setEditable(true);
		} else {
			txtphoneno.setEditable(false);
		}
	}
        else
        {
		if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
			txtphoneno.setEditable(true);
		} else {
			txtphoneno.setEditable(false);
		}
	}
        
    }//GEN-LAST:event_txtphonenoKeyPressed

    private void txtageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyPressed
        // TODO add your handling code here:
        int len = txtage.getText().length();
	char c = evt.getKeyChar();
	if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
		if(len<3){
			txtage.setEditable(true);
		} else {
			txtage.setEditable(false);
		}
	}
        else
        {
		if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
			txtage.setEditable(true);
		} else {
			txtage.setEditable(false);
		}
	}
    }//GEN-LAST:event_txtageKeyPressed

    private void txtheightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtheightKeyPressed
        // TODO add your handling code here:
        int len = txtheight.getText().length();
	char c = evt.getKeyChar();
	if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
		if(len<3){
			txtheight.setEditable(true);
		} else {
			txtheight.setEditable(false);
		}
	}
        else
        {
		if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
			txtheight.setEditable(true);
		} else {
			txtheight.setEditable(false);
		}
	}
    }//GEN-LAST:event_txtheightKeyPressed

    private void txtweightKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtweightKeyPressed
        // TODO add your handling code here:
        int len = txtweight.getText().length();
	char c = evt.getKeyChar();
	if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
		if(len<3){
			txtweight.setEditable(true);
		} else {
			txtweight.setEditable(false);
		}
	}
        else
        {
		if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
			txtweight.setEditable(true);
		} else {
			txtweight.setEditable(false);
		}
	}
    }//GEN-LAST:event_txtweightKeyPressed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblclose;
    private javax.swing.JRadioButton rbf;
    private javax.swing.JRadioButton rbm;
    private javax.swing.JPanel rbn;
    private javax.swing.JRadioButton rby;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtbg;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtheight;
    private javax.swing.JTextField txtillnesstype;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtphoneno;
    private javax.swing.JTextField txtweight;
    // End of variables declaration//GEN-END:variables
}
