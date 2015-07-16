package adressbook;

import java.awt.Component;
import java.util.ArrayList;

public class Contacts extends javax.swing.JPanel {
    ArrayList<String> strings = new ArrayList<>();
    String[] str;
    public Contacts() {
        initComponents();
        for(int i=0; i<25; i++){
            strings.add("Item " + i);
        }
        str = new String[strings.size()];
        for(int i=0; i<25; i++){
            str[i] = strings.get(i);
        }
        list.setListData(str);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        button = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();

        setName("Contacts"); // NOI18N

        jScrollPane1.setViewportView(list);

        button.setText("Search");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("Search for Contact");

        button1.setText("Reset");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
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
                .addComponent(button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(button1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        list.clearSelection();
        boolean nesto = true;
        int index=0, index2 = 0;
        ArrayList<String> tempArray = new ArrayList<>();
        String[] temp;
            for(int i=0; i < strings.size(); i++)
            {
                index = index2 = 0;
                nesto = true;
                for(int j=0; j<strings.get(i).length(); j++)
                    if(search.getText().length() == 1)
                    {
                        if(strings.get(i).charAt(j) == search.getText().charAt(0))
                        {
                            nesto = true;
                                index2 = i;
                        }
                        else{
                                nesto = false;
                                break;
                        }
                        
                    }
                    else if(strings.get(i).charAt(j) == search.getText().charAt(0))
                    {
                        for(int k=0; k<search.getText().length(); k++)
                            if(strings.get(i).charAt(k+j) == search.getText().charAt(k))
                            {
                                nesto = true;
                                index2 = i;
                            }
                            else
                            {
                                nesto = false;
                                break;
                            }
                    }
                if(nesto)
                    tempArray.add(strings.get(index2));
            }
            temp = new String[tempArray.size()];
            for(int i=0; i < tempArray.size(); i++)
                temp[i] = tempArray.get(i);
            list.setListData(temp);
    }//GEN-LAST:event_buttonActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        list.setListData(str);
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JButton button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList list;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
