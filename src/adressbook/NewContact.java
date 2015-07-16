package adressbook;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewContact extends javax.swing.JPanel {

    public NewContact() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        givenName = new javax.swing.JLabel();
        familyName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        adress = new javax.swing.JLabel();
        givenNameText = new javax.swing.JTextField();
        familyNameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        phoneNumberText = new javax.swing.JTextField();
        adressText = new javax.swing.JTextField();
        confirm = new javax.swing.JButton();

        setName("New Contact"); // NOI18N

        givenName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        givenName.setText("Given Name");
        givenName.setToolTipText("");

        familyName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        familyName.setText("Family Name");

        phoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        phoneNumber.setText("Phone Number");

        email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        email.setText("Email");

        adress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        adress.setText("Adress");

        givenNameText.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        familyNameText.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        emailText.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        phoneNumberText.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        adressText.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(givenName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(familyName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(givenNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(familyNameText)
                    .addComponent(phoneNumberText)
                    .addComponent(emailText)
                    .addComponent(adressText)))
            .addComponent(confirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(givenName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(givenNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(familyName, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(familyNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(confirm))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
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
        }
        else
        {
            String name = givenNameText.getText();
            String surname = familyNameText.getText();
            String number = phoneNumberText.getText();
            String email = (emailText.getText().isEmpty())?("N/A"):(emailText.getText());
            String adress = (adressText.getText().isEmpty())?("N/A"):(adressText.getText());
            JOptionPane.showMessageDialog(frame, ""+name+" "+surname+", "+number
            +", " + email + ", "+adress);
            
        }
    }//GEN-LAST:event_confirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adress;
    private javax.swing.JTextField adressText;
    private javax.swing.JButton confirm;
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
