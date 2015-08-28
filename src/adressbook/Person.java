package adressbook;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Person extends javax.swing.JFrame {
    JFrame frame = new JFrame();
    private int Index;
    
    public Person(String person, int index) {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Enable(false);
        Index = index;
        fillData(person);
        
    }
    void Enable(boolean enable){
        givenNameText.setEnabled(enable);
        familyNameText.setEnabled(enable);
        phoneNumberText.setEnabled(enable);
        adressText.setEnabled(enable);
        emailText.setEnabled(enable);
    }
    
    void fillData(String person){
        int tempIndex = person.indexOf(" ");
        String substring = person.substring(tempIndex+1);
        givenNameText.setText(person.substring(0, tempIndex));
        
        tempIndex = substring.indexOf("-");
        familyNameText.setText(substring.substring(0, tempIndex));
        
        substring = substring.substring(tempIndex+1);
        tempIndex = substring.indexOf("-");
        phoneNumberText.setText(substring.substring(0, tempIndex));
        
        substring = substring.substring(tempIndex+1);
        tempIndex = substring.indexOf(" ");
        emailText.setText(substring.substring(0, tempIndex));
        
        substring = substring.substring(tempIndex+1);
        tempIndex = substring.indexOf(";");
        adressText.setText(substring.substring(0, tempIndex));
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
            String contact = givenNameText.getText() + " " + familyNameText.getText()
                    + "-" + phoneNumberText.getText() + "-"
                    + ((emailText.getText().isEmpty()) ? ("N/A") : (emailText.getText()))
                    + " " + ((adressText.getText().isEmpty()) ? ("N/A") : (adressText.getText())) + ";";
            Contacts.stringArray.set(Index, contact);
            writeTextFileLineByLine();
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "Contact changed");
            frame.setVisible(false);
            Contacts.editContact(Index, givenNameText.getText() + " " + familyNameText.getText());
            this.dispose();
        }
    }//GEN-LAST:event_confirm1ActionPerformed
    public static void writeTextFileLineByLine() {
        
        FileWriter out = null;
        try {
            int dataInt;
            out = new FileWriter(".\\files\\base.txt");

            for (int i = 0; i < Contacts.stringArray.size(); i++) {
                for (int j = 0; j < Contacts.stringArray.get(i).length(); j++) {
                    out.write(Contacts.stringArray.get(i).charAt(j));
                }
                out.write("\n");
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }
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
