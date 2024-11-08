/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Tarjeta;

/**
 *
 * @author Andrea
 */
public class ClienteGUI extends javax.swing.JPanel {

    
    private Cliente cliente;
    TarjetaGUI tarjetaGui;
    /**
     * Constructor sin parametro, para agregar nuevos clientes.
     */
    public ClienteGUI() {
        initComponents();
        // esconde el boton hasta que el checkbox sea verdadero
        btnCrearTarjeta.setVisible(false);
        tarjetaCheckBox.setSelected(false);
        // instancia un panel con el formulario para crear nueva tarjeta
        tarjetaGui = new TarjetaGUI();
    }
    
    /** Sobrecarga
     * Constructor con parametro, para editar cliente.
     * @param cliente
     */
    public ClienteGUI(Cliente cliente) {
        initComponents();
// asigna el cliente que recibe como parametro a los campos del formulario
        this.cliente = cliente;
        nombreTextField.setText(cliente.getNombre());
        direccionTextField.setText(cliente.getDireccion());
        emailTextField.setText(cliente.getEmail());
        saldoTextField.setEnabled(false);
        saldoTextField.setText("" + cliente.getSaldo());
        celularTextField.setText("" + cliente.getCelular());
    // valida si el cliente tiene tarjeta
        if(cliente.getTarjeta()!= null ){
       // llama el constructor TarjetaGUI con la tarjeta del cliente para poder editarla
            tarjetaGui = new TarjetaGUI(cliente.getTarjeta());
       // marca el checkbox como verdadero
            tarjetaCheckBox.setSelected(true);
       // cambia el texto del boton crear tarjeta a editar tarjeta
             btnCrearTarjeta.setText("Editar Tarjeta");
       // Hace visible el boton para editar tarjeta
            btnCrearTarjeta.setVisible(true);
           
        }else 
     // llama el constructor TarjetaGUI sin parametro para crear nueva
            tarjetaGui = new TarjetaGUI();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        celularTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        saldoTextField = new javax.swing.JTextField();
        tarjetaCheckBox = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        btnCrearTarjeta = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre");

        jLabel2.setText("Dirección");

        jLabel6.setText("Celular");

        jLabel3.setText("Correo");

        jLabel4.setText("Saldo Inicial");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        saldoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoTextFieldActionPerformed(evt);
            }
        });

        tarjetaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaCheckBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Tarjeta de credito");

        btnCrearTarjeta.setText("Crear Tarjeta");
        btnCrearTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTarjetaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setText("Cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(direccionTextField)
                            .addComponent(celularTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(saldoTextField)
                            .addComponent(nombreTextField)
                            .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tarjetaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrearTarjeta))
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(saldoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(celularTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCrearTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tarjetaCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void saldoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoTextFieldActionPerformed

    /**
     * Evento al presionar boton de guardar.
     */
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(cliente == null){
            // llama el metodo agregar del controlador cliente con 
            // los valores que hay en los campos de texto del formulario
            try{
            // Llama el metodo validaciones declarado al final de esta clase.
                validaciones();
                ControladorCliente.agregar(
                    nombreTextField.getText(),
                    direccionTextField.getText(),
                    emailTextField.getText(),
                    Double.parseDouble(saldoTextField.getText()),
                    Long.parseLong(celularTextField.getText()),
                    tarjetaGui.getTarjeta());
             JOptionPane.showMessageDialog(this, "Cliente agregado, Puede agregar otro o Cerrar la ventana");
             limpiarFormulario();
            } catch(Exception exception){
            JOptionPane.showMessageDialog(this, 
                    "Ocurrió un Error, Verifique los campos: "
                    + exception.getMessage());
            }
           
        }
        // si el cliente no era nullo es por que se entro en modo edición   
        else{
            try{
            // Llama el metodo validaciones declarado al final de esta clase.
                validaciones();
            // obtiene el id del client en el ArrayList
            int idClienteLista = ControladorCliente.buscar(cliente);
            // asigna los nuevos valores al cliente
            cliente.setNombre(nombreTextField.getText());
            cliente.setDireccion(direccionTextField.getText());
            cliente.setEmail(emailTextField.getText());
            cliente.setTarjeta(tarjetaGui.getTarjeta());
            cliente.setCelular(Long.parseLong(celularTextField.getText()));
            // llama el metodo editar del controlador clientes
            ControladorCliente.editar(idClienteLista, cliente);
            JOptionPane.showMessageDialog(this, "Cliente Editado, puede cierre la ventana");
            }catch(Exception exception){
            JOptionPane.showMessageDialog(this, "Ocurrió un Error, Verifique los campos");
            }

            
        }            
        
    }//GEN-LAST:event_btnGuardarActionPerformed
   
    /**
     * evento que se ejecuta cuando se chekea el checkbox de tarjeta
     * hace visible el boton para crear tarjeta
     */
    private void tarjetaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaCheckBoxActionPerformed
       btnCrearTarjeta.setVisible(true);
    }//GEN-LAST:event_tarjetaCheckBoxActionPerformed
    /**
     * Evento que se ejecuta cuando hace click en crear tarjeta
     * 
     */
    private void btnCrearTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTarjetaActionPerformed
        //crea una nueva ventana y le pasa como parametro el panel de tarjeta
        new Ventana(tarjetaGui);
        
    }//GEN-LAST:event_btnCrearTarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearTarjeta;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextField celularTextField;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField saldoTextField;
    private javax.swing.JCheckBox tarjetaCheckBox;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        this.cliente = null;
        nombreTextField.setText("");
        direccionTextField.setText("");
        emailTextField.setText("");
        saldoTextField.setText("");
        celularTextField.setText("");
        tarjetaCheckBox.setSelected(false);
        btnCrearTarjeta.setText("Crear Tarjeta");
        btnCrearTarjeta.setVisible(false);
    }

    private void validaciones() {
        // expresión regular para validar que la cadena solo contenga letras y espacios
        if (!nombreTextField.getText().matches("|^[a-zA-Z]+(\\s*[a-zA-Z]*)*[a-zA-Z]+$|"))
          throw new UnsupportedOperationException("Nombre invalido, solo se aceptan letras");   
        if(
                nombreTextField.getText().equals("") || 
                emailTextField.getText().equals("") || 
                direccionTextField.getText().equals("")
                )       
          throw new UnsupportedOperationException("Campo nombre, email y dirección son requeridos");

        
    }
}
