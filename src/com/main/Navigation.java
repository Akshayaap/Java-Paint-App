/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.IO.Input;
import com.IO.LabelListener;
import com.paint.Paint;
import com.statemachine.State;
import java.awt.GridLayout;
import java.awt.Label;
import javax.swing.JColorChooser;

/**
 *
 * @author Akshay
 */
public class Navigation extends javax.swing.JFrame {

    private final Paint paint;
    private final Display display;
    private final Input input;
    private int totalItems=0;

    /**
     * Creates new form Navigation
     * @param display
     * @param input
     * @param paint
     */
    public Navigation ( Display display , Input input , Paint paint ) {
        initComponents ();
        this.display = display;
        this.input = input;
        this.paint = paint;
        
        //this.colorSelecton=new ColorSelection("Select Color");
        
        this.itemListPanel.setLayout ( new GridLayout(0,1));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents //don't fucking touch it
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        editorPanel = new javax.swing.JPanel();
        btnLine = new javax.swing.JButton();
        btnCircle = new javax.swing.JButton();
        btnRect = new javax.swing.JButton();
        btnBrush = new javax.swing.JButton();
        lblShapeSelected = new javax.swing.JLabel();
        lblSelectShape = new javax.swing.JLabel();
        colorChoose = new javax.swing.JButton();
        lblColorInd = new javax.swing.JLabel();
        btnSetBackColor = new javax.swing.JButton();
        chkFill = new javax.swing.JCheckBox();
        slidBrushSize = new javax.swing.JSlider();
        lblBrushSize = new javax.swing.JLabel();
        btnClearSelect = new javax.swing.JButton();
        itemListPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setPreferredSize(new java.awt.Dimension(250, 600));
        setResizable(false);

        btnLine.setText("Line");
        btnLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLineActionPerformed(evt);
            }
        });

        btnCircle.setText("Circle");
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        btnRect.setText("Retangle");
        btnRect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectActionPerformed(evt);
            }
        });

        btnBrush.setText("Brush");
        btnBrush.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrushActionPerformed(evt);
            }
        });

        lblShapeSelected.setText("Selected");

        lblSelectShape.setText("Select Shape");

        colorChoose.setText("Select Color");
        colorChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChooseActionPerformed(evt);
            }
        });

        lblColorInd.setText("Selected Color");

        btnSetBackColor.setText("Set Background Color");
        btnSetBackColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetBackColorActionPerformed(evt);
            }
        });

        chkFill.setText("Fill");
        chkFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFillActionPerformed(evt);
            }
        });

        slidBrushSize.setMinimum(1);
        slidBrushSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slidBrushSizeStateChanged(evt);
            }
        });
        slidBrushSize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                slidBrushSizeMousePressed(evt);
            }
        });

        lblBrushSize.setText("Select Brush Size");

        btnClearSelect.setText("Clear Selection");
        btnClearSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editorPanelLayout = new javax.swing.GroupLayout(editorPanel);
        editorPanel.setLayout(editorPanelLayout);
        editorPanelLayout.setHorizontalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editorPanelLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(chkFill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSetBackColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(editorPanelLayout.createSequentialGroup()
                        .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editorPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblShapeSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editorPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblSelectShape, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblColorInd, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(colorChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(editorPanelLayout.createSequentialGroup()
                        .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRect, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLine, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBrush, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(editorPanelLayout.createSequentialGroup()
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBrushSize, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(slidBrushSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        editorPanelLayout.setVerticalGroup(
            editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editorPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectShape)
                    .addComponent(chkFill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(editorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLine)
                    .addComponent(btnClearSelect))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBrush)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblShapeSelected)
                .addGap(28, 28, 28)
                .addComponent(colorChoose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblColorInd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetBackColor)
                .addGap(18, 18, 18)
                .addComponent(lblBrushSize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(slidBrushSize, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Edit", editorPanel);

        javax.swing.GroupLayout itemListPanelLayout = new javax.swing.GroupLayout(itemListPanel);
        itemListPanel.setLayout(itemListPanelLayout);
        itemListPanelLayout.setHorizontalGroup(
            itemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 211, Short.MAX_VALUE)
        );
        itemListPanelLayout.setVerticalGroup(
            itemListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Shapes", itemListPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLineActionPerformed

        this.paint.shapeState = State.LINE_SELECTED;
        this.lblShapeSelected.setText ( "Line Selected" );
        Label lbl=new Label( totalItems+1+" Line");
        
        lbl.addMouseListener (new LabelListener(this.paint,this.totalItems));
        
        lbl.setSize ( 150,25);
        lbl.setVisible ( true);
        this.itemListPanel.add (lbl );
        this.paint.setSelected ( this.totalItems);
        this.totalItems++;
        this.itemListPanel.repaint ();
        
    }//GEN-LAST:event_btnLineActionPerformed

    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        this.paint.shapeState = State.CIRCLE_SELECTED;
        this.lblShapeSelected.setText ( "Cirle Selected" );
        Label lbl=new Label( totalItems+1+" Circle");
        
        lbl.addMouseListener (new LabelListener(this.paint,this.totalItems));
        
        lbl.setSize ( 150,25);
        lbl.setVisible ( true);
        this.itemListPanel.add (lbl );
        this.totalItems++;
        this.itemListPanel.repaint ();
    }//GEN-LAST:event_btnCircleActionPerformed

    private void btnRectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectActionPerformed
        this.paint.shapeState = State.RECT_SELECTED;
        this.lblShapeSelected.setText ( "Rectangle Selected" );
        Label lbl=new Label( totalItems+1+" Rectangle");
        
        lbl.addMouseListener (new LabelListener(this.paint,this.totalItems));
        
        lbl.setSize ( 150,25);
        lbl.setVisible ( true);
        this.itemListPanel.add (lbl );
        this.totalItems++;
        this.itemListPanel.repaint ();
       
         
    }//GEN-LAST:event_btnRectActionPerformed

    private void btnBrushActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrushActionPerformed
        this.paint.shapeState = State.BRUSH_SELETED;
        this.lblShapeSelected.setText ( "Brush Selected" );
        this.totalItems++;
    }//GEN-LAST:event_btnBrushActionPerformed

    private void colorChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChooseActionPerformed
        
         this.paint.currColor=JColorChooser.showDialog(null,"Select Color",this.paint.currColor);  
         this.lblColorInd.setBackground (this.paint.currColor );
         //this.setVisible ( true);
    }//GEN-LAST:event_colorChooseActionPerformed

    private void btnSetBackColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetBackColorActionPerformed
        this.paint.background=JColorChooser.showDialog ( null, "Select Background Color" , this.paint.background);
        this.display.render ();
        this.display.render();
    }//GEN-LAST:event_btnSetBackColorActionPerformed

    private void chkFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFillActionPerformed
        
        this.paint.fill=chkFill.isSelected ();
    }//GEN-LAST:event_chkFillActionPerformed

    private void slidBrushSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slidBrushSizeStateChanged
        int size=this.slidBrushSize.getValue ();
        System.out.println ("Navigation | slidBrushSizeStateChanged | "+size);
        this.paint.strokeSize=size;
    }//GEN-LAST:event_slidBrushSizeStateChanged

    private void slidBrushSizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slidBrushSizeMousePressed
       
    }//GEN-LAST:event_slidBrushSizeMousePressed

    private void btnClearSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSelectActionPerformed
        
        this.paint.shapeState=State.NONE_SELECTED;
        this.lblShapeSelected.setText ( "Nothing is Selected");
    }//GEN-LAST:event_btnClearSelectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrush;
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnClearSelect;
    private javax.swing.JButton btnLine;
    private javax.swing.JButton btnRect;
    private javax.swing.JButton btnSetBackColor;
    private javax.swing.JCheckBox chkFill;
    private javax.swing.JButton colorChoose;
    private javax.swing.JPanel editorPanel;
    private javax.swing.JPanel itemListPanel;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblBrushSize;
    private javax.swing.JLabel lblColorInd;
    private javax.swing.JLabel lblSelectShape;
    private javax.swing.JLabel lblShapeSelected;
    private javax.swing.JSlider slidBrushSize;
    // End of variables declaration//GEN-END:variables
}
