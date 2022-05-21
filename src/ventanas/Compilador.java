/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Font;
import java.io.File;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.event.UndoableEditEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;

/**
 *
 * @author Zambrano
 */
public class Compilador extends javax.swing.JFrame {
    private UndoManager undo = new UndoManager();

    public void manager() {
        Document doc = texto.getDocument();

        // Listen for undo and redo events
        doc.addUndoableEditListener((UndoableEditEvent evt) ->
        {
            undo.addEdit(evt.getEdit());
        });

        // Create an undo action and add it to the text component
        texto.getActionMap().put("Undo",
                new AbstractAction("Undo") {
            public void actionPerformed(ActionEvent evt) {
                try
                {
                    if (undo.canUndo())
                    {
                        undo.undo();
                    }
                } catch (CannotUndoException e)
                {
                }
            }
        });
        // Bind the redo action to ctl-Y
        texto.getInputMap().put(KeyStroke.getKeyStroke("control Y"), "Redo");
    }



    /**
     * Creates new form Principal
     */
    public Compilador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnCopiar = new javax.swing.JButton();
        btnCortar = new javax.swing.JButton();
        btnPegar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnDeshacer = new javax.swing.JButton();
        btnRehacer = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnRehacer1 = new javax.swing.JButton();
        vtnTexto = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensajes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jToolBar1.setBorder(new javax.swing.border.MatteBorder(null));
        jToolBar1.add(jSeparator4);

        btnNuevo.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/new.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevo.setFocusable(false);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNuevo);
        jToolBar1.add(jSeparator1);

        btnAbrir.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/open.png"))); // NOI18N
        btnAbrir.setText("Abrir");
        btnAbrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAbrir.setFocusable(false);
        btnAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAbrir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAbrir);

        btnGuardar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuardar);
        jToolBar1.add(jSeparator2);

        btnCopiar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/copy.png"))); // NOI18N
        btnCopiar.setText("Copiar");
        btnCopiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCopiar.setFocusable(false);
        btnCopiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCopiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCopiar);

        btnCortar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnCortar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/cut.png"))); // NOI18N
        btnCortar.setText("Cortar");
        btnCortar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCortar.setFocusable(false);
        btnCortar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCortar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCortarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCortar);

        btnPegar.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnPegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/paste.png"))); // NOI18N
        btnPegar.setText("Pegar");
        btnPegar.setToolTipText("");
        btnPegar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPegar.setFocusable(false);
        btnPegar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPegar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPegarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPegar);
        jToolBar1.add(jSeparator3);

        btnDeshacer.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnDeshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/undo.png"))); // NOI18N
        btnDeshacer.setText("Deshacer");
        btnDeshacer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeshacer.setFocusable(false);
        btnDeshacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeshacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeshacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeshacerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDeshacer);

        btnRehacer.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnRehacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/redo.png"))); // NOI18N
        btnRehacer.setText("Rehacer");
        btnRehacer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRehacer.setFocusable(false);
        btnRehacer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRehacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehacerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRehacer);
        jToolBar1.add(jSeparator5);

        btnRehacer1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        btnRehacer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/play.png"))); // NOI18N
        btnRehacer1.setText("RUN");
        btnRehacer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRehacer1.setFocusable(false);
        btnRehacer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRehacer1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRehacer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRehacer1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRehacer1);

        vtnTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vtnTextoKeyReleased(evt);
            }
        });

        txtMensajes.setEditable(false);
        txtMensajes.setColumns(20);
        txtMensajes.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txtMensajes.setRows(5);
        jScrollPane3.setViewportView(txtMensajes);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zimagenes/banner2.PNG"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vtnTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vtnTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
       
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        abrir();
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        texto.copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnCortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCortarActionPerformed
        texto.cut();
    }//GEN-LAST:event_btnCortarActionPerformed

    private void btnPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPegarActionPerformed
        texto.paste();
    }//GEN-LAST:event_btnPegarActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
        try
        {
            undo.undo();
        } catch (CannotUndoException e)
        {
        }
    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void btnRehacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehacerActionPerformed
        try
        {
            undo.redo();
        } catch (CannotRedoException e)
        {
        }
    }//GEN-LAST:event_btnRehacerActionPerformed

    private void vtnTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vtnTextoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_vtnTextoKeyReleased

    private void btnRehacer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRehacer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRehacer1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compilador().setVisible(true);
            }
        });
    }
    
    private JTextArea texto;
    //private TextLineNumber tln;
    public Font actualFont = new Font("Consolas", 0, 16);
    private boolean esNuevo = true;
    private boolean estaGuardado = true;
    private DefaultTableModel modelo;
    private JFileChooser seleccion;
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnCortar;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnPegar;
    private javax.swing.JButton btnRehacer;
    private javax.swing.JButton btnRehacer1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea txtMensajes;
    private javax.swing.JScrollPane vtnTexto;
    // End of variables declaration//GEN-END:variables
   
    private void actualizarFuente() {
        texto.setFont(actualFont);
        texto.updateUI();
        txtMensajes.setFont(actualFont);
        txtMensajes.updateUI();
    }

    private void cambiarFuente(Font nuevo) {
        this.actualFont = nuevo;
        actualizarFuente();
    }

    private void guardarComo() {
        if (seleccion.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION)
        {
            archivo = seleccion.getSelectedFile();
            if (archivo.getName().endsWith("pme"))
            {
                String Documento = texto.getText();
                String mensaje = guardararchivo(archivo, Documento);
                if (mensaje != null)
                {
                    JOptionPane.showMessageDialog(null, mensaje);
                    this.setTitle(archivo.getName());
                    esNuevo = false;
                } else
                {
                    JOptionPane.showMessageDialog(null, "Archivo no compatible");
                }
            } else
            {
                JOptionPane.showMessageDialog(null, "Extensión de archivo no valida");
            }
        }
    }

    private void guardar() {
        //if(seleccion.showDialog(null, "Guardar")==JFileChooser.APPROVE_OPTION){
        archivo = seleccion.getSelectedFile();
        if (archivo.getName().endsWith("pme"))
        {
            String Documento = texto.getText();
            String mensaje = guardararchivo(archivo, Documento);
            if (mensaje != null)
            {
                txtMensajes.setText(mensaje);

                this.setTitle(archivo.getName());
            } else
            {
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Extensión de archivo no válida");
        }
        //}
    }

    public String guardararchivo(File archivo, String documento) {
        String mensaje = null;
        try
        {
            salida = new FileOutputStream(archivo);
            byte[] bytxt = documento.getBytes();
            salida.write(bytxt);

            mensaje = "Archivo guardado";
        } catch (Exception e)
        {
        }
        return mensaje;
    }

    public String AbrirArchivo(File archivo) {
        String documento = "";
        try
        {
            entrada = new FileInputStream(archivo);
            int ascii;
            while ((ascii = entrada.read()) != -1)
            {
                char caracter = (char) ascii;
                documento += caracter;
            }
        } catch (Exception e)
        {
        }
        return documento;
    }

    public void abrir() {
        if (seleccion.showDialog(null, "Abrir") == JFileChooser.APPROVE_OPTION)
        {
            archivo = seleccion.getSelectedFile();
            if (archivo.canRead())
            {
                if (archivo.getName().endsWith("pme"))
                {
                    String documento = AbrirArchivo(archivo);
                    this.setTitle(archivo.getName());
                    texto.setText(documento);
                    esNuevo=false;
                } else
                {
                    JOptionPane.showMessageDialog(null, "Archivo no es compatible");
                }
            }
        }
    }
}
