package Formularios;

import Clases.GestorArchivos;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ProductoSoftware extends javax.swing.JFrame {

    static Object[] objetoFilas = new Object[4];
    GestorArchivos miGestor = new GestorArchivos();
    static DefaultTableModel miTabla = new DefaultTableModel();
    private int fila;
    
    
    public ProductoSoftware(){
        initComponents();
        configurarTabla();
        cargarArchivo();
    }

    
    
    private void configurarTabla(){
         
        miTabla.addColumn("Producto");
        miTabla.addColumn("Cantidad Disponible");
        miTabla.addColumn("Detalles");
        miTabla.addColumn("Precio");
        TablaProductos.setModel(miTabla); 
    }
    
    private void cargarArchivo(){
        
        miTabla.setNumRows(0);
        miTabla.setColumnCount(0);
        configurarTabla();
        miGestor.TablaArchivo(4,"Mercaderia.txt", miTabla);
        TablaProductos.setModel(miTabla);            
    } 
    
    
    private void cargarTabla(){
        try{
            objetoFilas[0] = txtNombre.getText();
            objetoFilas[1] = txtUDisponibles.getText();    
            objetoFilas[2] = txtDetalles.getText();
            objetoFilas[3] = txtPrecio.getText();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane, ex.toString()); 
        }
    } 

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        panelCompra = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDetalles = new javax.swing.JTextField();
        txtUDisponibles = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCompra.setBackground(new java.awt.Color(102, 153, 255));
        panelCompra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Software", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        panelCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaProductos.setBackground(new java.awt.Color(102, 153, 255));
        TablaProductos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TablaProductos.setForeground(new java.awt.Color(255, 255, 255));
        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        panelCompra.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 532, 955, 310));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Nombre:");
        panelCompra.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 84, 27));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Precio:");
        panelCompra.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Detalles:");
        panelCompra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("U.Disponibles:");
        panelCompra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panelCompra.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 180, -1));

        txtDetalles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetallesActionPerformed(evt);
            }
        });
        panelCompra.add(txtDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 392, 780, 122));

        txtUDisponibles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUDisponiblesActionPerformed(evt);
            }
        });
        panelCompra.add(txtUDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 90, -1));

        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        panelCompra.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 90, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAgregar.setText("Agregar Productos");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        panelCompra.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBorrar.setText("Borrar Productos");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        panelCompra.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 201, 28));

        getContentPane().add(panelCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1300, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        miTabla.removeRow(fila);
        TablaProductos.setModel(miTabla);
        miGestor.EscribirEnArchivo("Mercaderia.txt", miTabla);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        cargarTabla();
        miTabla.addRow(objetoFilas);
        TablaProductos.setModel(miTabla);

        miGestor.EscribirEnArchivo("Mercaderia.txt", miTabla);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtUDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUDisponiblesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUDisponiblesActionPerformed

    private void txtDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetallesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetallesActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        fila = TablaProductos.rowAtPoint(evt.getPoint());
        seleccionarRegistro();
    }//GEN-LAST:event_TablaProductosMouseClicked
   
    private void seleccionarRegistro(){
        
        txtNombre.setText(String.valueOf(TablaProductos.getValueAt(fila, 0)));
        txtUDisponibles.setText((String.valueOf(TablaProductos.getValueAt(fila, 1))));
        txtDetalles.setText((String.valueOf(TablaProductos.getValueAt(fila, 2)))); 
        txtPrecio.setText((String.valueOf(TablaProductos.getValueAt(fila, 3))));
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ProductoSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoSoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoSoftware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JTextField txtDetalles;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtUDisponibles;
    // End of variables declaration//GEN-END:variables
}
