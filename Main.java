import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    Graphics graf;
    Classcanva Lista[];
    int qtd=0, time=50;
    int MargLf, MargTp, WX, HY;
    Color color;
    Thread mover;
    boolean activar=false;
    static final int EspX = 750, EspY = 350;
    
    public Main() {
        initComponents();
        setTitle("CanvaMTec  M-Technology(MTec)");
        setLocationRelativeTo(null);
        setBackground(Color.WHITE);
        //setExtendedState(MAXIMIZED_BOTH);//MOSTRAR TELA MAXIMIZADA
        //setResizable(false);
        
        qtd=0;
        Lista = new Classcanva[5];
        graf = PanelTela.getGraphics(); 
        PanelTela.paintComponents(graf);
        
        mover = new Thread(new Runnable(){   
            @Override
            public void run(){
                while(true){
                    if(activar){
                        for(int i=0;i<qtd;i++){     
                            Random RX = new Random();
                            Random RY = new Random();    
                            int x = RX.nextInt(700);
                            int y = RY.nextInt(300);
                            Lista[i].posX=x;
                            Lista[i].posY=y;
                            Lista[i].pintar(graf);
                            //g.fillRect(x, y, WX, HY);
                        } 
                    } 
                    try{
                        Thread.sleep(time); 
                        if(activar){
                            PanelTela.repaint();
                        }Thread.sleep(time); 
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error in to try animate");
                    }
                }
            }    
        });
        mover.start();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFundo = new javax.swing.JPanel();
        PanelTela = new javax.swing.JPanel();
        Clean = new javax.swing.JButton();
        animate = new javax.swing.JButton();
        ButtonCores = new javax.swing.JButton();
        ComboBoxObjectos = new javax.swing.JComboBox<>();
        addObj = new javax.swing.JButton();
        CBoxSpeed = new javax.swing.JComboBox<>();
        CBModo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        width = new javax.swing.JTextField();
        MarginTop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        MarginLeft = new javax.swing.JTextField();
        height = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFundo.setBackground(new java.awt.Color(204, 204, 204));
        PanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelTela.setBackground(new java.awt.Color(255, 255, 255));
        PanelTela.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout PanelTelaLayout = new javax.swing.GroupLayout(PanelTela);
        PanelTela.setLayout(PanelTelaLayout);
        PanelTelaLayout.setHorizontalGroup(
            PanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1038, Short.MAX_VALUE)
        );
        PanelTelaLayout.setVerticalGroup(
            PanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );

        PanelFundo.add(PanelTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1042, 389));

        Clean.setBackground(new java.awt.Color(51, 153, 255));
        Clean.setText("Clean");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });
        PanelFundo.add(Clean, new org.netbeans.lib.awtextra.AbsoluteConstraints(509, 487, 84, 40));

        animate.setBackground(new java.awt.Color(51, 153, 255));
        animate.setText("animate");
        animate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animateActionPerformed(evt);
            }
        });
        PanelFundo.add(animate, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 427, -1, 40));

        ButtonCores.setBackground(new java.awt.Color(51, 153, 255));
        ButtonCores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/color.png"))); // NOI18N
        ButtonCores.setText("Colors");
        ButtonCores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCoresActionPerformed(evt);
            }
        });
        PanelFundo.add(ButtonCores, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 487, 123, 40));

        ComboBoxObjectos.setBackground(new java.awt.Color(51, 153, 255));
        ComboBoxObjectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Object", "add Rect", "add FilRect", "add Oval", "add FillOval", "add Line" }));
        ComboBoxObjectos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        ComboBoxObjectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxObjectosActionPerformed(evt);
            }
        });
        PanelFundo.add(ComboBoxObjectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 427, 124, 40));

        addObj.setBackground(new java.awt.Color(51, 153, 255));
        addObj.setText("Add");
        addObj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addObjActionPerformed(evt);
            }
        });
        PanelFundo.add(addObj, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 427, 84, 40));

        CBoxSpeed.setBackground(new java.awt.Color(51, 153, 255));
        CBoxSpeed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Speed", "minimum", "medium", "maximum" }));
        CBoxSpeed.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CBoxSpeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxSpeedActionPerformed(evt);
            }
        });
        PanelFundo.add(CBoxSpeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 487, 172, 40));

        CBModo.setBackground(new java.awt.Color(51, 153, 255));
        CBModo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modo light", "Modo dark" }));
        CBModo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        CBModo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBModoActionPerformed(evt);
            }
        });
        PanelFundo.add(CBModo, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 427, 95, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 204, 204)));
        PanelFundo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Choose magin and dimensions object", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP));

        width.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        width.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        width.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthActionPerformed(evt);
            }
        });

        MarginTop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MarginTop.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("MarginTop:");

        MarginLeft.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MarginLeft.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        height.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        height.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("MarginLeft:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Height:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Width:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MarginLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MarginTop, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MarginLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(width, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(MarginTop, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(height, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelFundo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 427, 318, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoM.png"))); // NOI18N
        PanelFundo.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 423, 109, 104));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 1120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        PanelTela.repaint();    //Limpar tela1
        PanelTela.removeAll();
        MarginLeft.setText("");
        MarginTop.setText("");
        width.setText("");
        height.setText("");
        activar=false;
    }//GEN-LAST:event_CleanActionPerformed

    private void animateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animateActionPerformed
        activar=true;
    }//GEN-LAST:event_animateActionPerformed

    private void ButtonCoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCoresActionPerformed
        // TODO add your handling code here:
        try{
            if(evt.getSource()==ButtonCores){
                JColorChooser Cor = new JColorChooser();
                color = JColorChooser.showDialog(null, "Please choose a color", null);
                graf.setColor(color);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_ButtonCoresActionPerformed

    private void ComboBoxObjectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxObjectosActionPerformed

    }//GEN-LAST:event_ComboBoxObjectosActionPerformed

    private void addObjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addObjActionPerformed
        try{
            MargLf = Integer.parseInt(MarginLeft.getText());
            MargTp = Integer.parseInt(MarginTop.getText());
            WX = Integer.parseInt(width.getText());
            HY = Integer.parseInt(height.getText());

            if(ComboBoxObjectos.getSelectedItem().equals("add Rect")){
                //Adicionar rectangulo...
                try{
                    Lista[qtd++]=new Classcanva();
                    Lista[qtd-1].posX=MargLf;
                    Lista[qtd-1].posY=MargTp;
                    Lista[qtd-1].largura=WX;
                    Lista[qtd-1].Comprimento=HY;
                    Lista[qtd-1].tipo="Rect";
                    Lista[qtd-1].pintar(graf);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else if(ComboBoxObjectos.getSelectedItem().equals("add FilRect")){
                //adicionar rectangulo preenchido...
                try{
                    Lista[qtd++]=new Classcanva();
                    Lista[qtd-1].posX=MargLf;
                    Lista[qtd-1].posY=MargTp;
                    Lista[qtd-1].largura=WX;
                    Lista[qtd-1].Comprimento=HY;
                    Lista[qtd-1].tipo="FRect";
                    Lista[qtd-1].pintar(graf);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else if(ComboBoxObjectos.getSelectedItem().equals("add Oval")){
                //adicionar um Oval vazio
                try{
                    Lista[qtd++]=new Classcanva();
                    Lista[qtd-1].posX=MargLf;
                    Lista[qtd-1].posY=MargTp;
                    Lista[qtd-1].largura=WX;
                    Lista[qtd-1].Comprimento=HY;
                    Lista[qtd-1].tipo="Oval";
                    Lista[qtd-1].pintar(graf);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }

            }
            else if(ComboBoxObjectos.getSelectedItem().equals("add FillOval")){
                //adicionar um Oval preenchido
                try{
                    Lista[qtd++]=new Classcanva();
                    Lista[qtd-1].posX=MargLf;
                    Lista[qtd-1].posY=MargTp;
                    Lista[qtd-1].largura=WX;
                    Lista[qtd-1].Comprimento=HY;
                    Lista[qtd-1].tipo="FOval";
                    Lista[qtd-1].pintar(graf);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else if(ComboBoxObjectos.getSelectedItem().equals("add Line")){
                //adicionar um Linha...
                try{
                    Lista[qtd++]=new Classcanva();
                    Lista[qtd-1].posX=MargLf;
                    Lista[qtd-1].posY=MargTp;
                    Lista[qtd-1].largura=WX;
                    Lista[qtd-1].Comprimento=HY;
                    Lista[qtd-1].tipo="Line";
                    Lista[qtd-1].pintar(graf);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            MarginLeft.setText("");
            MarginTop.setText("");
            width.setText("");
            height.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fill out the positions and dimensions");
        }
    }//GEN-LAST:event_addObjActionPerformed

    private void CBoxSpeedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxSpeedActionPerformed
        // TODO add your handling code here:
        if(CBoxSpeed.getSelectedItem().equals("minimum")){
            time=100;
        }
        else if(CBoxSpeed.getSelectedItem().equals("medium")){
            time=50;
        }
        else if(CBoxSpeed.getSelectedItem().equals("maximum")){
            time=10;
        }
    }//GEN-LAST:event_CBoxSpeedActionPerformed

    private void CBModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBModoActionPerformed
        //Modo escuro e modo claro do aplicativo canvas.......................
        /*String ModoFundo = (String)CBModo.getSelectedItem();
        if("Modo light".equals(ModoFundo)){
            PanelFundo.setBackground(Color.LIGHT_GRAY);
        }else if("Modo dark".equals(ModoFundo)){
            PanelFundo.setBackground(Color.BLACK);
        }*/
        if(CBModo.getSelectedItem().equals("Modo light")){
            PanelFundo.setBackground(Color.LIGHT_GRAY);
            //PanelFundo.setBackground(Color.getHSBColor(240,240,240));
        }
        else if(CBModo.getSelectedItem().equals("Modo dark")){
            PanelFundo.setBackground(Color.DARK_GRAY);
        }
    }//GEN-LAST:event_CBModoActionPerformed

    private void widthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthActionPerformed

    }//GEN-LAST:event_widthActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCores;
    private javax.swing.JComboBox<String> CBModo;
    private javax.swing.JComboBox<String> CBoxSpeed;
    private javax.swing.JButton Clean;
    private javax.swing.JComboBox<String> ComboBoxObjectos;
    private javax.swing.JTextField MarginLeft;
    private javax.swing.JTextField MarginTop;
    private javax.swing.JPanel PanelFundo;
    private javax.swing.JPanel PanelTela;
    private javax.swing.JButton addObj;
    private javax.swing.JButton animate;
    private javax.swing.JTextField height;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField width;
    // End of variables declaration//GEN-END:variables
}
