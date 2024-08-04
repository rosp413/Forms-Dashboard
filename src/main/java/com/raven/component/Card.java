package com.raven.component;

import com.raven.model.Model_Card;
import com.raven.swing.Shadow;

public class Card extends Shadow {

    public Card() {
        initComponents();
        init();
    }
    
    public void setData(Model_Card data) {
        lbIcon.setIcon(data.getIcon());
        lbName.setText(data.getTitle());
        lbValues.setText(data.getValues());
    }
    
    private void init() {
        setRadius(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        shadow1 = new com.raven.swing.Shadow();
        shadow2 = new com.raven.swing.Shadow();
        shadow3 = new com.raven.swing.Shadow();
        lbIcon = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbValues = new javax.swing.JLabel();

        javax.swing.GroupLayout shadow1Layout = new javax.swing.GroupLayout(shadow1);
        shadow1.setLayout(shadow1Layout);
        shadow1Layout.setHorizontalGroup(
            shadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );
        shadow1Layout.setVerticalGroup(
            shadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
        );

        shadow3.setShadowType(com.raven.shadow.ShadowBorder.ShadowType.IN_SHADOW);

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout shadow3Layout = new javax.swing.GroupLayout(shadow3);
        shadow3.setLayout(shadow3Layout);
        shadow3Layout.setHorizontalGroup(
            shadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        shadow3Layout.setVerticalGroup(
            shadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
        );

        lbName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lbName.setForeground(new java.awt.Color(140, 110, 207));
        lbName.setText("Name");

        lbValues.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lbValues.setForeground(new java.awt.Color(140, 110, 207));
        lbValues.setText("Values");

        javax.swing.GroupLayout shadow2Layout = new javax.swing.GroupLayout(shadow2);
        shadow2.setLayout(shadow2Layout);
        shadow2Layout.setHorizontalGroup(
            shadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadow2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(shadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValues)
                    .addComponent(lbName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(shadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(shadow2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(shadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(181, Short.MAX_VALUE)))
        );
        shadow2Layout.setVerticalGroup(
            shadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shadow2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbValues)
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(shadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(shadow2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(shadow3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(shadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbValues;
    private com.raven.swing.Shadow shadow1;
    private com.raven.swing.Shadow shadow2;
    private com.raven.swing.Shadow shadow3;
    // End of variables declaration//GEN-END:variables
}
