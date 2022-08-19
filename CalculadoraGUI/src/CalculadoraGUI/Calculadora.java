package CalculadoraGUI;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calculadora extends javax.swing.JFrame {

    ScriptEngineManager sem = new ScriptEngineManager(); 
    ScriptEngine se = sem.getEngineByName("JavaScript"); 
    
    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
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
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnpor = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        bntCE = new javax.swing.JButton();
        btndiv = new javax.swing.JButton();
        btnsuma = new javax.swing.JButton();
        btnmulti = new javax.swing.JButton();
        btnresta = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnpunto = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        txtOperacion.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtResultado.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnpor.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnpor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnpor.setText("%");
        btnpor.setBorder(null);
        btnpor.setBorderPainted(false);
        btnpor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnpor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnpor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnporActionPerformed(evt);
            }
        });

        btnAC.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnAC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnAC.setText("AC");
        btnAC.setBorder(null);
        btnAC.setBorderPainted(false);
        btnAC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAC.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnAC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        bntCE.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        bntCE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        bntCE.setText("CE");
        bntCE.setBorder(null);
        bntCE.setBorderPainted(false);
        bntCE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntCE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        bntCE.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        bntCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntCEActionPerformed(evt);
            }
        });

        btndiv.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btndiv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btndiv.setText("/");
        btndiv.setBorder(null);
        btndiv.setBorderPainted(false);
        btndiv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndiv.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btndiv.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btndiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivActionPerformed(evt);
            }
        });

        btnsuma.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnsuma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnsuma.setText("+");
        btnsuma.setBorder(null);
        btnsuma.setBorderPainted(false);
        btnsuma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsuma.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnsuma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsumaActionPerformed(evt);
            }
        });

        btnmulti.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnmulti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnmulti.setText("X");
        btnmulti.setBorder(null);
        btnmulti.setBorderPainted(false);
        btnmulti.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnmulti.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnmulti.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmultiActionPerformed(evt);
            }
        });

        btnresta.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnresta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnresta.setText("-");
        btnresta.setBorder(null);
        btnresta.setBorderPainted(false);
        btnresta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnresta.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnresta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestaActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn7.setText("7");
        btn7.setBorder(null);
        btn7.setBorderPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn8.setText("8");
        btn8.setBorder(null);
        btn8.setBorderPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn9.setText("9");
        btn9.setBorder(null);
        btn9.setBorderPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn4.setText("4");
        btn4.setBorder(null);
        btn4.setBorderPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn1.setText("1");
        btn1.setBorder(null);
        btn1.setBorderPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn5.setText("5");
        btn5.setBorder(null);
        btn5.setBorderPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn6.setText("6");
        btn6.setBorder(null);
        btn6.setBorderPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnpunto.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnpunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btnpunto.setText(".");
        btnpunto.setBorder(null);
        btnpunto.setBorderPainted(false);
        btnpunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnpunto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btnpunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btnpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpuntoActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn2.setText("2");
        btn2.setBorder(null);
        btn2.setBorderPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn3.setText("3");
        btn3.setBorder(null);
        btn3.setBorderPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.fw.png"))); // NOI18N
        btn0.setText("0");
        btn0.setBorder(null);
        btn0.setBorderPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2_pressed.fw.png"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnigual.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btnigual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.png"))); // NOI18N
        btnigual.setText("=");
        btnigual.setBorder(null);
        btnigual.setBorderPainted(false);
        btnigual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnigual.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnigual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1_pressed.png"))); // NOI18N
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntCE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpor))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn7)
                                    .addComponent(btn6))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn0)
                                    .addComponent(btn3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpunto)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btn8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn9))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btn5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn4))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(btn2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn1))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnresta)
                    .addComponent(btnigual)
                    .addComponent(btnmulti)
                    .addComponent(btndiv)
                    .addComponent(btnsuma))
                .addGap(86, 86, 86))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(btnAC)
                    .addContainerGap(261, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpor)
                    .addComponent(bntCE)
                    .addComponent(btndiv))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmulti)
                    .addComponent(btn7)
                    .addComponent(btn8)
                    .addComponent(btn9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btn4)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1)
                            .addComponent(btn2)
                            .addComponent(btn3)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnresta)
                            .addComponent(btn5)
                            .addComponent(btn6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsuma)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpunto)
                    .addComponent(btn0)
                    .addComponent(btnigual))
                .addGap(21, 21, 21))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(btnAC)
                    .addContainerGap(257, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        txtOperacion.setText(""); 
        txtResultado.setText(""); 
    }//GEN-LAST:event_btnACActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        adNumber("7");
        btnigual.doClick(); 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        adNumber("8");
        btnigual.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        adNumber("9");
        btnigual.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        adNumber("6");
        btnigual.doClick();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        adNumber("5");
        btnigual.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        adNumber("4");
        btnigual.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        adNumber("3");
        btnigual.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       adNumber("2");
        btnigual.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        adNumber("1");
        btnigual.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        adNumber("0");
        btnigual.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpuntoActionPerformed
        adNumber(".");
        btnigual.doClick();
    }//GEN-LAST:event_btnpuntoActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
        try { 
            String resultado = se.eval(txtOperacion.getText()).toString(); 
            txtResultado.setText(resultado); 
        } catch (Exception e) { 
            btnAC.doClick(); txtResultado.setText("Error_calculo"); 
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnporActionPerformed
        adNumber("%");
    }//GEN-LAST:event_btnporActionPerformed

    private void btndivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivActionPerformed
        adNumber("/");
    }//GEN-LAST:event_btndivActionPerformed

    private void btnmultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmultiActionPerformed
        adNumber("*");
    }//GEN-LAST:event_btnmultiActionPerformed

    private void btnrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestaActionPerformed
        adNumber("-");
    }//GEN-LAST:event_btnrestaActionPerformed

    private void btnsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsumaActionPerformed
        adNumber("+");
    }//GEN-LAST:event_btnsumaActionPerformed

    private void bntCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCEActionPerformed
        String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length()-1); 
        txtOperacion.setText(texto); 
        btnigual.doClick(); 
    }//GEN-LAST:event_bntCEActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void adNumber(String digito){ 
        txtOperacion.setText(txtOperacion.getText()+digito); 
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntCE;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btndiv;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmulti;
    private javax.swing.JButton btnpor;
    private javax.swing.JButton btnpunto;
    private javax.swing.JButton btnresta;
    private javax.swing.JButton btnsuma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}