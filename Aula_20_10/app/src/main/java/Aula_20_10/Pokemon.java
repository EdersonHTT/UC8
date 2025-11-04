/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Aula_20_10;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author EDERSONDASILVASCHMID
 */
public class Pokemon extends javax.swing.JFrame {
    ArrayList<PokemonModel> pc = new ArrayList<>();   
    ArrayList<PokemonModel> bag = new ArrayList<>();
    DefaultTableModel modelPc = new DefaultTableModel();
    DefaultTableModel modelBag = new DefaultTableModel();

    public Pokemon() {
        initComponents();
        
        modelPc.addColumn("Name");        
        modelPc.addColumn("Type");
        modelPc.addColumn("Height");
        
        modelBag.addColumn("Name");        
        modelBag.addColumn("Type");
        modelBag.addColumn("Height");
        
        this.create();
        
        pcTable.setModel(modelPc);        
        bagTable.setModel(modelBag);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pcTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        bagTable = new javax.swing.JTable();
        pokemonLabel = new javax.swing.JLabel();
        computerLabel = new javax.swing.JLabel();
        bagLabel = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pcTable.setModel(new javax.swing.table.DefaultTableModel(
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
        pcTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pcTable);

        bagTable.setModel(new javax.swing.table.DefaultTableModel(
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
        bagTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bagTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(bagTable);

        pokemonLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pokemonLabel.setText("Selected Pokemon: ");

        computerLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        computerLabel.setText("PC");

        bagLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bagLabel.setText("Bag");

        btnRemove.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRemove.setText("Remove to the PC");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnAdd1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd1.setText("Add to the Bag");
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bagLabel)
                    .addComponent(computerLabel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pokemonLabel))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(computerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(pokemonLabel)
                        .addGap(63, 63, 63)
                        .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(bagLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        
        if (bag.size() != 6) {
            this.replaceTo(modelPc, pcTable, modelBag);
            return;
        } 
        
        JOptionPane.showMessageDialog(this, "The bag is full");
    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        this.replaceTo(modelBag, bagTable, modelPc);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void pcTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcTableMouseClicked
        int row = pcTable.getSelectedRow();
        
        String pokemonName = modelPc.getValueAt(row, 0).toString();

        pokemonLabel.setText("Selected Pokemon: " + pokemonName);
    }//GEN-LAST:event_pcTableMouseClicked

    private void bagTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bagTableMouseClicked
        int row = bagTable.getSelectedRow();
        
        String pokemonName = modelBag.getValueAt(row, 0).toString();

        pokemonLabel.setText("Selected Pokemon: " + pokemonName);
    }//GEN-LAST:event_bagTableMouseClicked

    private void create() {
        pc.add(new PokemonModel("Charmander", "Fire", 1.80));        
        pc.add(new PokemonModel("Pikachu", "Eletric", 1.20));
        pc.add(new PokemonModel("Bulbasaur", "Plant", 1.80));
        pc.add(new PokemonModel("Butterfree", "Fly", 1.80));
        pc.add(new PokemonModel("Blaziken", "Fighter", 1.80));
        pc.add(new PokemonModel("Iron Boulder", "Rock", 1.80));        
        pc.add(new PokemonModel("Weedle", "Insect", 1.80));
        pc.add(new PokemonModel("Goldengo", "Phanton", 1.80));
        pc.add(new PokemonModel("Wo-Chien", "Darck", 1.80));
        
        for (PokemonModel poke: pc) {
            modelPc.addRow(new Object[]{poke.getName(), poke.getType(), poke.getHeight()});                          
        }
    }
    
    private void replaceTo(DefaultTableModel model, JTable table, DefaultTableModel modelTake) {
        int row = table.getSelectedRow();
        
        String name = model.getValueAt(row, 0).toString();        
        String type = model.getValueAt(row, 1).toString();
        double height = (double) model.getValueAt(row, 2);
        
        modelTake.addRow(new Object[]{name, type, height});
        model.removeRow(row);
        
        boolean poke = pc.stream().anyMatch(item -> item.getName().equals(name));
        
        if (poke) {
            bag.add(pc.get(row));         
            pc.remove(row);

            return;
        } 
        pc.add(bag.get(row));         
        bag.remove(row);
        
    }
    
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
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pokemon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pokemon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bagLabel;
    private javax.swing.JTable bagTable;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel computerLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pcTable;
    private javax.swing.JLabel pokemonLabel;
    // End of variables declaration//GEN-END:variables
}
