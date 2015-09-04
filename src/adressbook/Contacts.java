package adressbook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Contacts extends javax.swing.JPanel {
    static public ArrayList<String> stringArray = new ArrayList<>();
    static String[] stringList;
    
    JFrame frame = new JFrame();
    
    public static void addContact(String name){
        list.clearSelection();
        stringArray.add(name);
        stringList = new String[stringList.length + 1];
        int nameLength;
        for(int i=0; i < stringArray.size(); i++){
            nameLength = stringArray.get(i).indexOf("-");
            if(nameLength > 0)
                stringList[i] = stringArray.get(i).substring(0, nameLength);
        }
        list.setListData(stringList);
    }
    
    public static void editContact(int index, String name){
        list.clearSelection();
        stringList = new String[stringList.length];
        int nameLength;
        for(int i=0; i < stringArray.size(); i++){
            nameLength = stringArray.get(i).indexOf("-");
            if(nameLength > 0)
                stringList[i] = stringArray.get(i).substring(0, nameLength);
        }
            list.setListData(stringList);
    }
    public Contacts() {
        initComponents();
        frame.setAlwaysOnTop(true);
        frame.setLocationRelativeTo(this);
        readTextFileLineByLine();
    }
    
    public static void readTextFileLineByLine() {
        FileReader in = null;
        //BufferedReader dozvoljava čitanje većeg "komada" datoteke odjednom.
        BufferedReader bin = null;
        try {
            File file = new File(".\\files\\base.txt");
            stringArray.clear();
            in = new FileReader(file);
            bin = new BufferedReader(in);
            String data;
            while ((data = bin.readLine()) != null) {
                stringArray.add(data);
            }
            list.clearSelection();
            if(stringArray.isEmpty()){
                stringList =new String[1];
                stringList[0] = "NO CONTACT FOUND!";
                list.setListData(stringList);
                list.setEnabled(false);
            }
            else{
                for(int i=0; i < stringArray.size(); i++)
                    if(stringArray.get(i).length() < 2)
                        stringArray.remove(i);
                stringList =new String[stringArray.size()];
                int nameLength;
                
                for(int i=0; i < stringArray.size(); i++){
                    nameLength = stringArray.get(i).indexOf("-");
                    if(stringArray.get(i).length() > 5){
                        stringList[i] = stringArray.get(i).substring(0, nameLength);
                    }
                }
                list.setListData(stringList);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        } finally {
            if (bin != null) {
                try {
                    bin.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
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
        String[] tempString;
        if(search.getText().isEmpty()){
        
        }
        else{
            String temp;
            for(int i=0; i < stringArray.size(); i++){
                temp = stringArray.get(i).toLowerCase();
                index = index2 = 0;
                nesto = true;
                if(temp.contains(search.getText().toLowerCase())){
                    nesto = true;
                }else
                    nesto = false;
                if(nesto)
                    tempArray.add(stringArray.get(i));
            }
            if(!tempArray.isEmpty()){
                int nameLength;
                tempString =new String[tempArray.size()];
                for(int i=0; i < tempArray.size(); i++){
                    nameLength = tempArray.get(i).indexOf("-");
                        if(nameLength > 0)
                            tempString[i] = tempArray.get(i).substring(0, nameLength);
                }
                list.setListData(tempString);
            }
            else
            {
                tempString =new String[1];
                tempString[0] = "NO CONTACT FOUND!";
                list.setListData(tempString);
                list.setEnabled(false);
            }
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
            for(int i=0; i< stringArray.size(); i++)
                if(stringArray.get(i).contains(list.getSelectedValue().toString())){
                    Person person = new Person(stringArray.get(i), i);
                    person.setVisible(true);
                    person.setEnabled(true);
                    person.setAlwaysOnTop(true);
                    person.setLocationRelativeTo(this);
                    break;
                }
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
