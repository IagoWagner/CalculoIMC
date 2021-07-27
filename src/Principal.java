
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        LBLAltura = new javax.swing.JLabel();
        LBLPeso = new javax.swing.JLabel();
        TXTPeso = new javax.swing.JTextField();
        TXTAltura = new javax.swing.JTextField();
        BTNCalcular = new javax.swing.JButton();
        LBLResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Painel.setBackground(new java.awt.Color(255, 51, 0));
        Painel.setBorder(new javax.swing.border.MatteBorder(null));
        Painel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        LBLAltura.setBackground(new java.awt.Color(255, 255, 255));
        LBLAltura.setText("Altura");

        LBLPeso.setText("Peso");

        TXTAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTAlturaActionPerformed(evt);
            }
        });

        BTNCalcular.setBackground(new java.awt.Color(255, 255, 255));
        BTNCalcular.setText("Calcular IMC");
        BTNCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCalcularActionPerformed(evt);
            }
        });

        LBLResultado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/imc.png"))); // NOI18N

        Resultado.setText("Resultado");

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(162, 162, 162))
            .addGroup(PainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTNCalcular))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelLayout.createSequentialGroup()
                        .addComponent(LBLAltura)
                        .addGap(18, 18, 18)
                        .addComponent(TXTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelLayout.createSequentialGroup()
                        .addComponent(LBLPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TXTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
            .addGroup(PainelLayout.createSequentialGroup()
                .addComponent(LBLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLAltura)
                    .addComponent(TXTAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLPeso)
                    .addComponent(TXTPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LBLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(BTNCalcular)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCalcularActionPerformed
        int peso;
        /** Tente **/      try{
            peso = Integer.parseInt(TXTPeso.getText());
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Forneça o peso","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        float altura;
        try{
            altura = (float)Integer.parseInt(TXTAltura.getText()) /100;;
            /** Capiture **/ } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Forneça a Altura ","Erro",JOptionPane.ERROR_MESSAGE);
            return;
        }
        float imc = peso / (altura * altura);
        
        double ideal = (72.7 * altura) -58; 

        LBLResultado.setText("IMC: "+ imc);
        
        System.out.print("O IMC é " + imc);
        
        
  
            if(imc <= 19.1) {
                
                
                Resultado.setText(" Você está abaixo do peso, Seu peso Ideal é: "+ideal+" Kg");
            }else if(imc > 19.1 && imc <= 25.8) {
                Resultado.setText(" Parabéns você está no seu peso ideal:"+ideal+" Kg");
            }else if(imc > 25.8 && imc <= 27.3 ) {
                    Resultado.setText(" Você está um pouco acima do peso: Seu peso Ideal é"+ideal+" Kg");
            }else if(imc > 27.3 && imc <= 32.3) {
                Resultado.setText(" Você está acima do peso, Peso ideal é:"+ideal+" Kg");
            }else {
                Resultado.setText(" Você está obeso :/  Peso Ideal é "+ideal+" Kg");
            }
            
        JOptionPane.showMessageDialog(null, "Seu IMC é:"+imc);
        System.out.print("O IMC é " + imc);

    }//GEN-LAST:event_BTNCalcularActionPerformed

    private void TXTAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTAlturaActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCalcular;
    private javax.swing.JLabel LBLAltura;
    private javax.swing.JLabel LBLPeso;
    private javax.swing.JLabel LBLResultado;
    private javax.swing.JPanel Painel;
    private javax.swing.JLabel Resultado;
    private javax.swing.JTextField TXTAltura;
    private javax.swing.JTextField TXTPeso;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
