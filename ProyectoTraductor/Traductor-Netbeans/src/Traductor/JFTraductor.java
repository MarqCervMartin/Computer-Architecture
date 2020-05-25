package Traductor;
import java.io.File;
import java.util.Arrays;
import javax.swing.*;

/**
 *
 * @author Martín, Royer
 */
public class JFTraductor extends javax.swing.JFrame {
    //Instancias de JFile Chooser, Archivo y clase MetodoEnsamblaje
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    MetodoEnsamblaje Ensamblaje = new MetodoEnsamblaje();
    
    
    /**
     * Creates new form JFEnsamblador
     */
    public JFTraductor() {
        initComponents();
        TxtAreaFuente.setLineWrap(true);
        TxtAreaFuente.setWrapStyleWord(true);
        TxtAreaObjeto.setLineWrap(true);
        TxtAreaObjeto.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAbrirF = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaFuente = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAreaObjeto = new javax.swing.JTextArea();
        BtnEnsamblar = new javax.swing.JButton();
        BtnDesensamblar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BntLimpiarF = new javax.swing.JButton();
        BtnLimpiarO = new javax.swing.JButton();
        BtnAbrirO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ensamblador");

        BtnAbrirF.setText("Abrir Archivo");
        BtnAbrirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirFActionPerformed(evt);
            }
        });

        TxtAreaFuente.setColumns(20);
        TxtAreaFuente.setRows(5);
        jScrollPane1.setViewportView(TxtAreaFuente);

        TxtAreaObjeto.setColumns(20);
        TxtAreaObjeto.setRows(5);
        jScrollPane2.setViewportView(TxtAreaObjeto);

        BtnEnsamblar.setLabel("Traducir");
        BtnEnsamblar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEnsamblarActionPerformed(evt);
            }
        });

        BtnDesensamblar.setText("Desensamblar");
        BtnDesensamblar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDesensamblarActionPerformed(evt);
            }
        });

        jLabel1.setText("Programa Fuente");

        jLabel2.setText("Programa Objeto");

        BntLimpiarF.setText("Limpiar");
        BntLimpiarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BntLimpiarFActionPerformed(evt);
            }
        });

        BtnLimpiarO.setText("Limpiar");
        BtnLimpiarO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarOActionPerformed(evt);
            }
        });

        BtnAbrirO.setText("Abrir Archivo");
        BtnAbrirO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAbrirOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(BntLimpiarF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAbrirF, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnLimpiarO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnAbrirO, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnEnsamblar)
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnDesensamblar)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(BtnEnsamblar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(BtnDesensamblar)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAbrirF)
                    .addComponent(BtnLimpiarO)
                    .addComponent(BntLimpiarF)
                    .addComponent(BtnAbrirO))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAbrirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirFActionPerformed
        // TODO add your handling code here:
        if(seleccionado.showDialog(this,"Abrir Programa Fuente") == JFileChooser.APPROVE_OPTION ){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead() ){
                if(archivo.getName().endsWith("asm")){
                    String contenido = Ensamblaje.AbrirTexto(archivo);
                    TxtAreaFuente.setText(contenido);
                }else{
                    JOptionPane.showMessageDialog(null, "Porfavor seleccione un archivo con código fuente");
                }
            }
        }
    }//GEN-LAST:event_BtnAbrirFActionPerformed

    private void BtnEnsamblarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnsamblarActionPerformed
        // TODO add your handling code here:
         if(seleccionado.showDialog(this,"Ensamblar Código Fuente") == JFileChooser.APPROVE_OPTION ){
            archivo = seleccionado.getSelectedFile();
            String contenido = TxtAreaFuente.getText();
            String[] arrSplit = contenido.split("\\n"); 
            contenido = "";
            for(int i=0;i<arrSplit.length;i++){
                contenido += Instruccion(arrSplit[i]);
            }
            
            String respuesta = Ensamblaje.EnsamblarTxt(archivo, contenido);
            if(respuesta !=null ){
                JOptionPane.showMessageDialog(null, respuesta);
                TxtAreaObjeto.setText(contenido);
            }else{
                JOptionPane.showMessageDialog(null, "Error al ensamblar");
            }
        }else{
                JOptionPane.showMessageDialog(null, "Se debe guardar en formato de texto (txt)");
         }
    }//GEN-LAST:event_BtnEnsamblarActionPerformed

    public String Instruccion(String conte){
        
        switch(conte){
            //BYTE-ORIENTED FILE REGISTER OPERATIONS
            //Generamos numeros entre 0-127 para los bits de registro
            case "ADDWF":
                return "00 0111 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "ANDWF":
                return "00 0101 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "CLRF":
                return "00 0001 1 "+generar7Bits()+"\n";
            case "CLRW":
                return "00 0001 0000 0000\n";
            case "COMF":
                return "00 1001 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "DECF":
                return "00 0011 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "DECFSZ":
                return "00 1011 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "INCF":
                return "00 1010 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "INCFSZ":
                return "00 1111 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "IORWF":
                return "00 0100 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "MOVF":
                return "00 1000 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "MOVWF":
                return "00 0000 1 "+generar7Bits()+"\n";
            case "NOP":
                return "00 0000 0000 0000\n";
            case "RLF":
                return "00 1101 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "RRF":
                return "00 1100 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "SUBWF":
                return "00 0010 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "SWAPF":
                return "00 1110 "+generar1Bit()+" "+generar7Bits()+"\n";
            case "XORWF":
                return "00 0110 "+generar1Bit()+" "+generar7Bits()+"\n";
            //BIT-ORIENTED FILE REGISTER OPERATIONS
            case "BCF":
                return "01 00bb bfff ffff\n";
            case "BSF":
                return "01 01bb bfff ffff\n";
            case "BTFSC":
                return "01 10bb bfff ffff\n";
            case "BTFSS":
                return "01 11bb bfff ffff\n";
            //LITERAL AND CONTROL OPERATIONS
            case "ADDLW":
                return "11 111x kkkk kkkk\n";
            case "ANDLW":
                return "11 1001 kkkk kkkk\n";
            case "CALL":
                return "10 0kkk kkkk kkkk\n";
            case "CLRWDT":
                return "00 0000 0110 0100\n";
            case "GOTO":
                return "10 1kkk kkkk kkkk\n";
            case "IORLW":
                return "11 1000 kkkk kkkk\n";
            case "MOVLW":
                return "11 00xx kkkk kkkk\n";
            case "RETFIE":
                return "00 0000 0000 1001\n";
            case "RETLW":
                return "11 01xx kkkk kkkk\n";
            case "RETURN":
                return "00 0000 0000 1000\n";
            case "SLEEP":
                return "00 0000 0110 0011\n";
            case "SUBLW":
                return "11 110x kkkk kkkk\n";
            case "XORLW":
                return "11 1010 kkkk kkkk\n";
            default:
                JOptionPane.showMessageDialog(null, "Instrucción no valida");

        }
        return null;
    }
    public String generar7Bits(){
        String sieteBits = "";
        int numero = (int) (Math.random() * 127) + 1;
        // completar los 7 bits   1  2   4    8   16  32  64
        if(numero <2){
            sieteBits = "0000001";
        }else{//2bits el mayor puede ser 3
            if(numero <4){
                sieteBits="00000"+Integer.toBinaryString(numero);
            }else{//3bits el mayor puede ser 7
                if(numero<8){
                    sieteBits="0000"+Integer.toBinaryString(numero);
                }else{//4bits el mayor es 15
                    if(numero<16){
                        sieteBits="000"+Integer.toBinaryString(numero);
                    }else{//5bits el mayor es 31
                        if(numero<32){
                            sieteBits="00"+Integer.toBinaryString(numero);
                        }else{//6bits el mayor es 63
                            if(numero<64){
                                sieteBits="0"+Integer.toBinaryString(numero);
                            }else{
                                    sieteBits=Integer.toBinaryString(numero);
                            }
                        }
                    }
                }
            }
        }
        
        return sieteBits;
    }
    public String generar1Bit(){
        boolean b = Math.random() < 0.5;
        if(b==true){
            return "1";
        }else{
            return "0";
        }
    }
    
   
    private void BtnDesensamblarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDesensamblarActionPerformed
        // TODO add your handling code here:
        if(seleccionado.showDialog(this,"Desensamblar Código Objeto") == JFileChooser.APPROVE_OPTION ){
            archivo = seleccionado.getSelectedFile();
            String contenido = TxtAreaObjeto.getText();
            //Aqui se convierte hexadecimal a decimal ascii
            
            //String hex = "75546f7272656e745c436f6d706c657465645c6e667375635f6f73745f62795f6d757374616e675c50656e64756c756d2d392c303030204d696c65732e6d7033006d7033006d7033004472756d202620426173730050656e64756c756d00496e2053696c69636f00496e2053696c69636f2a3b2a0050656e64756c756d0050656e64756c756d496e2053696c69636f303038004472756d2026204261737350656e64756c756d496e2053696c69636f30303800392c303030204d696c6573203c4d757374616e673e50656e64756c756d496e2053696c69636f3030380050656e64756c756d50656e64756c756d496e2053696c69636f303038004d50330000";
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < contenido.length(); i+=2) {
                String str = contenido.substring(i, i+2);
                output.append((char)Integer.parseInt(str, 16));
            }
            //System.out.println(output);
            
            contenido =String.valueOf(output);
            String respuesta = Ensamblaje.DesensamblarTxt(archivo, contenido);
            if(respuesta !=null ){
                JOptionPane.showMessageDialog(null, respuesta);
                
                
                
                
                
                
                
                
                
                contenido.replace("Ú", "");
                TxtAreaFuente.setText(contenido);
            }else{
                JOptionPane.showMessageDialog(null, "Error al Desensamblar");
            }
        }else{
                JOptionPane.showMessageDialog(null, "Se debe guardar en formato de texto (txt)");
         }
        
    }//GEN-LAST:event_BtnDesensamblarActionPerformed

    private void BntLimpiarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BntLimpiarFActionPerformed
        // TODO add your handling code here:
        TxtAreaFuente.setText("");
        
    }//GEN-LAST:event_BntLimpiarFActionPerformed

    private void BtnAbrirOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAbrirOActionPerformed
        // TODO add your handling code here:
        if(seleccionado.showDialog(this,"Abrir Código Objeto") == JFileChooser.APPROVE_OPTION ){
            archivo = seleccionado.getSelectedFile();
            if(archivo.canRead() ){
                if(archivo.getName().endsWith("txt")){
                    String contenido = Ensamblaje.AbrirTexto(archivo);
                    TxtAreaObjeto.setText(contenido);
                }else{
                    JOptionPane.showMessageDialog(null, "Porfavor seleccione un archivo con código objeto");
                }
            }
        }
    }//GEN-LAST:event_BtnAbrirOActionPerformed

    private void BtnLimpiarOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarOActionPerformed
        // TODO add your handling code here:
        TxtAreaObjeto.setText("");
    }//GEN-LAST:event_BtnLimpiarOActionPerformed

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
            java.util.logging.Logger.getLogger(JFTraductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTraductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTraductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTraductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTraductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BntLimpiarF;
    private javax.swing.JButton BtnAbrirF;
    private javax.swing.JButton BtnAbrirO;
    private javax.swing.JButton BtnDesensamblar;
    private javax.swing.JButton BtnEnsamblar;
    private javax.swing.JButton BtnLimpiarO;
    private javax.swing.JTextArea TxtAreaFuente;
    private javax.swing.JTextArea TxtAreaObjeto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
