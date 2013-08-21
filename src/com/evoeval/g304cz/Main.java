/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evoeval.g304cz;

import com.bhathigui.components.EasyTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import javax.swing.JFileChooser;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;

/**
 *
 * @author Bhathi
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        synAIBasicGen.getTextArea().setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane = new javax.swing.JTabbedPane();
        pnlAIb = new javax.swing.JPanel();
        tabAiBasic = new javax.swing.JTabbedPane();
        synAIBasicGen = new com.bhathigui.components.RSyntaxEmbedXMLComponent();
        synAIBasic = new com.bhathigui.components.RSyntaxEmbedXMLComponent();
        scrollAIBasic = new javax.swing.JScrollPane();
        treeAIBasic = new com.bhathigui.components.EasyTree();
        synJexl = new com.bhathigui.components.RSyntaxEmbedXMLComponent();
        sysLogPane = new com.bhathigui.components.SysLogPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuFile = new javax.swing.JMenu();
        jMenuItemOpenGenC = new javax.swing.JMenuItem();
        jMenuItemOpenAIB = new javax.swing.JMenuItem();
        jMenuItemOprnJexl = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSaveGenC = new javax.swing.JMenuItem();
        jMenuItemSaveAIB = new javax.swing.JMenuItem();
        jMenuItemSaveJexl = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItemClose = new javax.swing.JMenuItem();
        jMenuTools = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAIb.setLayout(new java.awt.BorderLayout());

        tabAiBasic.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tabAiBasic.addTab("XML Generator", synAIBasicGen);
        tabAiBasic.addTab("XML", synAIBasic);

        scrollAIBasic.setViewportView(treeAIBasic);

        tabAiBasic.addTab("Tree", scrollAIBasic);

        pnlAIb.add(tabAiBasic, java.awt.BorderLayout.CENTER);

        jTabbedPane.addTab("AIBasic.xml", pnlAIb);
        jTabbedPane.addTab("JexlScripts.xml", synJexl);
        jTabbedPane.addTab("Log", sysLogPane);

        jMenuFile.setText("File");

        jMenuItemOpenGenC.setText("Open AIBasic Generator Code");
        jMenuItemOpenGenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenGenCActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemOpenGenC);

        jMenuItemOpenAIB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemOpenAIB.setText("Open AIBasic.xml");
        jMenuItemOpenAIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOpenAIBActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemOpenAIB);

        jMenuItemOprnJexl.setText("Open JexlScripts.xml");
        jMenuItemOprnJexl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemOprnJexlActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemOprnJexl);
        jMenuFile.add(jSeparator1);

        jMenuItemSaveGenC.setText("Save AIBasic Generator Code");
        jMenuItemSaveGenC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveGenCActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemSaveGenC);

        jMenuItemSaveAIB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSaveAIB.setText("Save AIBasic.xml");
        jMenuItemSaveAIB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveAIBActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemSaveAIB);

        jMenuItemSaveJexl.setText("Save JexlScripts.xml");
        jMenuItemSaveJexl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaveJexlActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemSaveJexl);
        jMenuFile.add(jSeparator2);

        jMenuItemClose.setText("Close");
        jMenuItemClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCloseActionPerformed(evt);
            }
        });
        jMenuFile.add(jMenuItemClose);

        jMenuBar.add(jMenuFile);

        jMenuTools.setText("Tools");

        jMenuItem1.setText("Generate XML and Tree");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuTools.add(jMenuItem1);

        jMenuBar.add(jMenuTools);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemOpenGenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenGenCActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileInputStream stream = null;
            try {
                File file = chooser.getSelectedFile();
                stream = new FileInputStream(file); 
                this.synAIBasicGen.setText(stream);
            } catch (Exception ex) {
               sysLogPane.addToSystemLog(ex); 
            } finally {
                try {
                    if(stream!=null) stream.close();
                } catch (Exception ex) {
                    sysLogPane.addToSystemLog(ex);
                }
            }
            }
    }//GEN-LAST:event_jMenuItemOpenGenCActionPerformed

    private void jMenuItemOpenAIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOpenAIBActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileInputStream stream = null;
            try {
                File file = chooser.getSelectedFile();
                stream = new FileInputStream(file); 
                this.synAIBasic.setText(stream);
            } catch (Exception ex) {
               sysLogPane.addToSystemLog(ex); 
            } finally {
                try {
                    if(stream!=null) stream.close();
                } catch (Exception ex) {
                    sysLogPane.addToSystemLog(ex);
                }
            }
            }
    }//GEN-LAST:event_jMenuItemOpenAIBActionPerformed

    private void jMenuItemOprnJexlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemOprnJexlActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileInputStream stream = null;
            try {
                File file = chooser.getSelectedFile();
                stream = new FileInputStream(file); 
                this.synJexl.setText(stream);
                
            } catch (Exception ex) {
               sysLogPane.addToSystemLog(ex);     
            } finally {
                try {
                    if(stream!=null) stream.close();
                } catch (Exception ex) {
                    sysLogPane.addToSystemLog(ex);
                }
            }
            }
    }//GEN-LAST:event_jMenuItemOprnJexlActionPerformed

    private void jMenuItemSaveGenCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveGenCActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileOutputStream stream = null;
            PrintStream out = null;
            try {
                File file = chooser.getSelectedFile();
                stream = new FileOutputStream(file); 
                String text = this.synAIBasicGen.getTextArea().getText();
                out = new PrintStream(stream);
                out.print(text);
                
            } catch (Exception ex) {
                sysLogPane.addToSystemLog(ex);
            } finally {
                try {
                    if(stream!=null) stream.close();
                    if(out!=null) out.close();
                } catch (Exception ex) {
                   sysLogPane.addToSystemLog(ex);
                }
            }
         }
    }//GEN-LAST:event_jMenuItemSaveGenCActionPerformed

    private void jMenuItemSaveAIBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveAIBActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileOutputStream stream = null;
            PrintStream out = null;
            try {
                File file = chooser.getSelectedFile();
                stream = new FileOutputStream(file); 
                String text = this.synAIBasic.getTextArea().getText();
                out = new PrintStream(stream);
                out.print(text);
                
            } catch (Exception ex) {
                sysLogPane.addToSystemLog(ex);
            } finally {
                try {
                    if(stream!=null) stream.close();
                    if(out!=null) out.close();
                } catch (Exception ex) {
                   sysLogPane.addToSystemLog(ex);
                }
            }
         }
    }//GEN-LAST:event_jMenuItemSaveAIBActionPerformed

    private void jMenuItemSaveJexlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaveJexlActionPerformed
        JFileChooser chooser = new JFileChooser();
        int returnVal = chooser.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            FileOutputStream stream = null;
            PrintStream out = null;
            try {
                File file = chooser.getSelectedFile();
                stream = new FileOutputStream(file); 
                String text = this.synJexl.getTextArea().getText();
                out = new PrintStream(stream);
                out.print(text);
                
            } catch (Exception ex) {
                sysLogPane.addToSystemLog(ex);
            } finally {
                try {
                    if(stream!=null) stream.close();
                    if(out!=null) out.close();
                } catch (Exception ex) {
                   sysLogPane.addToSystemLog(ex);
                }
            }
         }
    }//GEN-LAST:event_jMenuItemSaveJexlActionPerformed

    private void jMenuItemCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCloseActionPerformed
        this.setVisible(false);
        this.dispose();
        System.gc();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemCloseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        StringWriter writer = new StringWriter();        
        XmlWriter xml = new XmlWriter(writer);
        EasyTree.SimpleTreeNode node;
        treeAIBasic.removeAll();
        try {
            xml = xml.element("AI");
            node = treeAIBasic.add("AI", EasyTree.ROUND_BLUE);
            String[] lines = synAIBasicGen.getTextArea().getText().split("\n");
            for(String line:lines){
                if(!line.isEmpty()){
                    String[] parts = line.trim().split("=");
                    if(parts[0].trim().equals("check")){
                        
                       node = node.child("check:"+parts[1].trim(), EasyTree.ROUND_GREEN);
                       xml = xml.element("check").attribute("variable", parts[1].trim());  
                       
                    }else if(parts[0].trim().equals("validate")){
                        
                        node = node.child("validate:"+parts[1].trim(), EasyTree.ROUND_ORANGE);
                        xml = xml.element("validate").attribute("value", parts[1].trim()); 
                        
                    }else if(parts[0].trim().equals("return")){
                        
                        node = node.child("return:"+line.replace(parts[0], "").replace("=", "").trim(), EasyTree.ROUND_RED);
                        xml = xml.element("return").attribute("out", line.replace(parts[0], "").replace("=", "").trim());
                        
                        xml.pop();
                        node = node.pop();
                        
                    }else if(parts[0].trim().equals("pop")){
                        
                        xml.pop();
                        node = node.pop();
                        
                    }
                }
            }
            xml.pop();
            synAIBasic.getTextArea().setText(writer.toString());
        } catch (Exception ex) {
           sysLogPane.addToSystemLog(ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuFile;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemClose;
    private javax.swing.JMenuItem jMenuItemOpenAIB;
    private javax.swing.JMenuItem jMenuItemOpenGenC;
    private javax.swing.JMenuItem jMenuItemOprnJexl;
    private javax.swing.JMenuItem jMenuItemSaveAIB;
    private javax.swing.JMenuItem jMenuItemSaveGenC;
    private javax.swing.JMenuItem jMenuItemSaveJexl;
    private javax.swing.JMenu jMenuTools;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane;
    private javax.swing.JPanel pnlAIb;
    private javax.swing.JScrollPane scrollAIBasic;
    private com.bhathigui.components.RSyntaxEmbedXMLComponent synAIBasic;
    private com.bhathigui.components.RSyntaxEmbedXMLComponent synAIBasicGen;
    private com.bhathigui.components.RSyntaxEmbedXMLComponent synJexl;
    private com.bhathigui.components.SysLogPane sysLogPane;
    private javax.swing.JTabbedPane tabAiBasic;
    private com.bhathigui.components.EasyTree treeAIBasic;
    // End of variables declaration//GEN-END:variables
}
