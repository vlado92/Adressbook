package adressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Contacts extends javax.swing.JPanel {
    static ArrayList<String> stringArray = new ArrayList<>();
    static String[] stringList;
    String statament;
    String host = "jdbc:derby://localhost:1527/Adressbook";
    JFrame frame = new JFrame();
    Connection con;
    Statement command;
    
    public static void addContact(String name){
        list.clearSelection();
        stringArray.add(name);
        stringList = new String[stringList.length + 1];
        for(int i=0; i < stringArray.size(); i++)
                stringList[i] = stringArray.get(i);
            list.setListData(stringList);
    }
    public static void editContact(int index, String name){
        list.clearSelection();
        stringArray.set(index,name);
        stringList = new String[stringList.length];
        for(int i=0; i < stringArray.size(); i++)
                stringList[i] = stringArray.get(i);
            list.setListData(stringList);
    }
    public Contacts() {
        initComponents();
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(this);
        connectToDatabase();
        
        fillList(list);
    }
    private void connectToDatabase(){
            try {
                con = DriverManager.getConnection(host);
                frame.setVisible(true);
                JOptionPane.showMessageDialog(frame, "uspjesno vezanje za bazu");
                frame.setVisible(false);
                command = con.createStatement();
            }catch (SQLException ex) {
                frame.setVisible(true);
                JOptionPane.showMessageDialog(frame, "neuspjesno vezanje za bazu\n"+ ex.toString());
                frame.setVisible(false);
            }
    }
    private void fillList(javax.swing.JList list){
        list.clearSelection();
        statament = "SELECT * FROM Contact";
        try{
         ResultSet read = command.executeQuery(statament);
         while(read.next()){
             stringArray.add(""+read.getString("Name") + " " + read.getString("Surname"));
         }
        }catch(SQLException ex){
            frame.setVisible(true);
            JOptionPane.showMessageDialog(frame, "neuspjeh pri citanju iz baze\n" + ex.toString());
            frame.setVisible(false);
        }
        if(stringArray.isEmpty()){
            stringList =new String[1];
            stringList[0] = "NO CONTACT FOUND!";
            list.setListData(stringList);
            list.setEnabled(false);
        }
        else{
            stringList =new String[stringArray.size()];
            for(int i=0; i < stringArray.size(); i++)
                stringList[i] = stringArray.get(i);
            list.setListData(stringList);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        searchButton = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setName("Contacts"); // NOI18N

        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Search for Contact");

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchButton)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(resetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        list.clearSelection();
        list.setEnabled(true);
        boolean nesto = true;
        int index=0, index2 = 0;
        ArrayList<String> tempArray = new ArrayList<>();
        String[] temp;
        for(int i=0; i < stringArray.size(); i++){
            index = index2 = 0;
            nesto = true;
            if(stringArray.get(i).charAt(0) == search.getText().charAt(0)){
                for(int k=0; k<search.getText().length(); k++)
                    if(stringArray.get(i).charAt(k) == search.getText().charAt(k)){
                        nesto = true;
                        index2 = i;
                    }
                    else{
                        nesto = false;
                        break;
                    }
            }
            else
                continue;
            if(nesto)
                tempArray.add(stringArray.get(index2));
        }
        if(!tempArray.isEmpty())
        {
            temp =new String[tempArray.size()];
            for(int i=0; i < tempArray.size(); i++)
                temp[i] = tempArray.get(i);
            list.setListData(temp);
        }
        else
        {
             temp =new String[1];
             temp[0] = "NO CONTACT FOUND!";
            list.setListData(temp);
            list.setEnabled(false);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        list.setListData(stringList);
        if(!stringList[0].equals("NO CONTACT FOUND!"))
            list.setEnabled(true);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
        if(list.isEnabled())
        {
            int index = list.getAnchorSelectionIndex();
            Person person = new Person(index);
            person.setVisible(true);
            person.setEnabled(true);
            person.setAlwaysOnTop(true);
            person.setLocationRelativeTo(this);
            System.out.println(index);
        }
    }//GEN-LAST:event_listMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JList list;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField search;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
