package adressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Person extends javax.swing.JFrame {
    String statament;
    String host = "jdbc:derby://localhost:1527/Adressbook";
    JFrame frame = new JFrame();
    Connection con;
    Statement command;
    static int personIndex;
    
    public Person(int index) {
        personIndex = index;
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Enable(false);
        connectToDatabase();
        fillData(personIndex);
        
    }
    void Enable(boolean enable){
        givenNameText.setEnabled(enable);
        familyNameText.setEnabled(enable);
        phoneNumberText.setEnabled(enable);
        adressText.setEnabled(enable);
        emailText.setEnabled(enable);
    }
    void connectToDatabase(){
        try {
                con = DriverManager.getConnection(host);
                command = con.createStatement();
            }catch (SQLException ex) {
                frame.setVisible(true);
                JOptionPane.showMessageDialog(frame, "neuspjesno vezanje za bazu\n"+ ex.toString());
                frame.setVisible(false);
            }
    }
    void fillData(int index){
        statament = "SELECT * FROM Contact WHERE ID = " + index ;
        try{
         ResultSet read = command.executeQuery(statament);
         while(read.next()){
             givenNameText.setText(read.getString("Name"));
             familyNameText.setText(read.getString("Surname"));
             phoneNumberText.setText(read.getString("Number"));
             emailText.setText(read.getString("Email"));
             adressText.setText(read.getString("adress"));
         }
        }catch(SQLException ex){
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "neuspjeh pri citanju iz baze\n" + ex.toString());
            frame.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        givenName = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        adress = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        familyName = new javax.swing.JLabel();
        familyNameText = new javax.swing.JTextField();
        givenNameText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        adressText = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        confirm1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setEnabled(false);

        givenName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        givenName.setText("Given Name");
        givenName.setToolTipText("");

        emailText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailText.setEnabled(false);

        adress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adress.setText("Adress");

        email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        email.setText("Email");

        phoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phoneNumber.setText("Phone Number");

        familyName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        familyName.setText("Family Name");

        familyNameText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        familyNameText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        familyNameText.setEnabled(false);

        givenNameText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        givenNameText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        givenNameText.setEnabled(false);

        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        phoneNumberText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        phoneNumberText.setEnabled(false);

        adressText.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        adressText.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        adressText.setEnabled(false);

        edit.setText("Edit Contact");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        confirm1.setText("Confrim Changes");
        confirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(givenName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(familyName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(phoneNumberText)
                        .addComponent(adressText)
                        .addComponent(emailText))
                    .addComponent(givenNameText)
                    .addComponent(familyNameText, javax.swing.GroupLayout.Alignment.LEADING)))
            .addGroup(layout.createSequentialGroup()
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirm1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(givenName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givenNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(familyName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(familyNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(confirm1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        Enable(true);
    }//GEN-LAST:event_editActionPerformed

    private void confirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm1ActionPerformed
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(this);
        if(givenNameText.getText().isEmpty()){
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Insert given name!");
            frame.setVisible(false);
            givenNameText.grabFocus();
        }
        else if(familyNameText.getText().isEmpty()){
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Insert given name!");
            frame.setVisible(false);
            familyNameText.grabFocus();
        }
        else if(phoneNumberText.getText().isEmpty())
        {
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Insert phone number!");
            frame.setVisible(false);
            phoneNumberText.grabFocus();
        }else if(!NewContact.parsable(phoneNumberText.getText())){
                frame.setVisible(true);
                JOptionPane.showMessageDialog(frame, "Wrong number format");
                frame.setVisible(false);
                phoneNumberText.setText("");
                phoneNumberText.grabFocus();
        }
        else{
            String name = givenNameText.getText();
            String surname = familyNameText.getText();
            String number = phoneNumberText.getText();
            String emailString = (emailText.getText().isEmpty())?("N/A"):(emailText.getText());
            String adressString = (adressText.getText().isEmpty())?("N/A"):(adressText.getText());
                
            String statament;
            String host = "jdbc:derby://localhost:1527/Adressbook";
            try {
                Connection con = DriverManager.getConnection(host);
                Statement command = con.createStatement();
            
                try{
                    statament = "UPDATE Contact " +
                            "SET Name = '"+name+"', SURNAME = '"+surname+"',"
                            +"number = '"+number+"', email = '"+emailString+"',"
                            +"adress = '"+adressString+"'" +
                            "WHERE ID = " + personIndex;
                    command.execute(statament);
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(frame, "Korisnik izmjenjen!");
                    frame.setVisible(false);
                    Contacts.editContact(personIndex, name + " " + surname);
                    Enable(false);
                }catch(SQLException ex){
                    frame.setVisible(true);
                    JOptionPane.showMessageDialog(frame, "neuspjeh pri unosenju u bazu\n" + ex.toString());
                    frame.setVisible(false);
                }
            }catch (SQLException ex) {
                frame.setVisible(true);
                JOptionPane.showMessageDialog(frame, "neuspjesno vezanje za bazu\n"+ ex.toString());
                frame.setVisible(false);
            }
        }
    }//GEN-LAST:event_confirm1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress;
    private javax.swing.JTextField adressText;
    private javax.swing.JButton confirm1;
    private javax.swing.JButton edit;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel familyName;
    private javax.swing.JTextField familyNameText;
    private javax.swing.JLabel givenName;
    private javax.swing.JTextField givenNameText;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberText;
    // End of variables declaration//GEN-END:variables
}
