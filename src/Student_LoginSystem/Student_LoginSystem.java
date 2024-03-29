/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student_LoginSystem;



import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marke
 */
public class Student_LoginSystem extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "Ilovemyfather1958";
    private static final String dataConn = "jdbc:mysql://localhost:3306/studentregistrationform";
    
    
    Connection sqlcon = null;
    PreparedStatement pst =null;
    ResultSet rs = null;
    
    int q, i, id, deleteItem;
    
    public Student_LoginSystem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    //=======================================Function==============================================================
    
    public void updateDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(dataConn,username,password);
            pst = sqlcon.prepareStatement("select * from registrationform");
            
            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            
            q=stData.getColumnCount();
            
            DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
            RecordTable.setRowCount(0);
            
            while(rs.next()){
                Vector columnData = new Vector();
                
                for(i=1; i<=q; i++){
                    
                    columnData.add(rs.getString("ID"));
                    columnData.add(rs.getString("StudentName"));
                    columnData.add(rs.getString("RegNumber"));
                    columnData.add(rs.getString("Faculty"));
                    columnData.add(rs.getString("Department"));
                }
                RecordTable.addRow(columnData);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    //======================================End Function===========================================================
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jbtnUpdate = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnPrint = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtxtStudentname = new javax.swing.JTextField();
        jtxtRegnumber = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtDepartment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtFaculty = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jPanel34 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 310));

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel10.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel10.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 310));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 310));

        jbtnUpdate.setBackground(java.awt.SystemColor.activeCaption);
        jbtnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 150, 40));

        jbtnSave.setBackground(java.awt.SystemColor.activeCaption);
        jbtnSave.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 40));

        jbtnReset.setBackground(java.awt.SystemColor.activeCaption);
        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 150, 40));

        jbtnPrint.setBackground(java.awt.SystemColor.activeCaption);
        jbtnPrint.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnPrint.setText("Print");
        jbtnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPrintActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, 40));

        jbtnExit.setBackground(java.awt.SystemColor.activeCaption);
        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 150, 40));

        jbtnDelete.setBackground(java.awt.SystemColor.activeCaption);
        jbtnDelete.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 190, 440));

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel18.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel24.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel22.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel18.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 310));

        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel26.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel28.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel26.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(95, 158, 160), 6));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel32.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel30.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 220, 310));

        jPanel26.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 310));

        jPanel18.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 220, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Student Name");
        jPanel18.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jtxtStudentname.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel18.add(jtxtStudentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 370, -1));

        jtxtRegnumber.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel18.add(jtxtRegnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 370, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Reg Number");
        jPanel18.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jtxtDepartment.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel18.add(jtxtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 370, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Department");
        jPanel18.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Faculty");
        jPanel18.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jtxtFaculty.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jPanel18.add(jtxtFaculty, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 370, -1));

        jTable.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        jTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "StudentName", "RegNumber", "Faculty", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable);

        jPanel18.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 550, 190));

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 590, 440));

        jPanel34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 42)); // NOI18N
        jLabel1.setText("STUDENT REGISTRATION FORM");
        jPanel34.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel1.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 760, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 820, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
        int SelectedRows = jTable.getSelectedRow();

        jtxtStudentname.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        jtxtRegnumber.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        jtxtFaculty.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        jtxtDepartment.setText(RecordTable.getValueAt(SelectedRows, 4).toString());

    }//GEN-LAST:event_jTableMouseClicked

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
        int SelectedRows = jTable.getSelectedRow();

        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            deleteItem = JOptionPane.showConfirmDialog(null, "Please confirm if you want to delete item",
                "Warning", JOptionPane.YES_NO_OPTION);

            if(deleteItem == JOptionPane.YES_OPTION){

                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlcon = DriverManager.getConnection(dataConn,username,password);
                pst = sqlcon.prepareStatement("delete from registrationform where id=?");

                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, " Record updated");
                updateDB();

                jtxtStudentname.setText("");
                jtxtStudentname.requestFocus();
                jtxtRegnumber.setText("");
                jtxtFaculty.setText("");
                jtxtDepartment.setText("");
            }
        }catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed

        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Please confirm if you want to exit", "STUDENT REGISTRATION FORM",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    {
        System.exit(0);
        }

    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPrintActionPerformed
        MessageFormat header = new MessageFormat("Printing in progress");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");

        try{
            jTable.print(JTable.PrintMode.NORMAL,header,footer);
        }catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found", e.getMessage());
        }
    }//GEN-LAST:event_jbtnPrintActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtStudentname.setText("");
        jtxtRegnumber.setText("");
        jtxtFaculty.setText("");
        jtxtDepartment.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(dataConn,username,password);
            pst = sqlcon.prepareStatement("insert into registrationform(StudentName,RegNumber,Faculty,Department)"
                + "values(?,?,?,?)");

            pst.setString(1, jtxtStudentname.getText());
            pst.setString(2, jtxtRegnumber.getText());
            pst.setString(3, jtxtFaculty.getText());
            pst.setString(4, jtxtDepartment.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            updateDB();
        }
        catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_jbtnSaveActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed

        DefaultTableModel RecordTable = (DefaultTableModel)jTable.getModel();
        int SelectedRows = jTable.getSelectedRow();

        try{
            id = Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlcon = DriverManager.getConnection(dataConn,username,password);
            pst = sqlcon.prepareStatement("update registrationform set StudentName=?,RegNumber=?,Faculty=?,"
                + "Department=? ");

            pst.setString(1, jtxtStudentname.getText());
            pst.setString(2, jtxtRegnumber.getText());
            pst.setString(3, jtxtFaculty.getText());
            pst.setString(4, jtxtDepartment.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record updated");
            updateDB();
        }
        catch(ClassNotFoundException ex){
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null,ex);
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed
private JFrame frame;
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
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_LoginSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_LoginSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnPrint;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextField jtxtDepartment;
    private javax.swing.JTextField jtxtFaculty;
    private javax.swing.JTextField jtxtRegnumber;
    private javax.swing.JTextField jtxtStudentname;
    // End of variables declaration//GEN-END:variables
}
