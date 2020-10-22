package com.etutotomasyonu.kullanici.personel;

import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

/**
 * @author agitrubardemir
 */
public class KisiselBilgilerEkran extends javax.swing.JFrame {

    PersonelIslemleri personelIslemleri = new PersonelIslemleri();

    int mouseX, mouseY;

    public KisiselBilgilerEkran() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        
        bilgileriGoruntule();
    }

    public void bilgileriGoruntule() {
        String tcNo = PersonelIslemleri.girisYapanPersonel.getTcNo();
        tcNoAlani.setText(tcNo);

        String ad = PersonelIslemleri.girisYapanPersonel.getAd();
        adAlani.setText(ad);

        String soyad = PersonelIslemleri.girisYapanPersonel.getSoyad();
        soyadAlani.setText(soyad);

        String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(PersonelIslemleri.girisYapanPersonel.getTelefonNumarasi());
        telefonNumarasiAlani.setText(telefonNumarasi);

        String personelNo = String.valueOf(PersonelIslemleri.girisYapanPersonel.getNo());
        personelNoAlani.setText(personelNo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anaPanel = new javax.swing.JPanel();
        bannerPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ogrenciYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        tcNoYazisi = new javax.swing.JLabel();
        tcNoAlani = new javax.swing.JTextField();
        personelNoAlani = new javax.swing.JTextField();
        personelNoYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        adYazisi = new javax.swing.JLabel();
        soyadAlani = new javax.swing.JTextField();
        soyadYazisi = new javax.swing.JLabel();
        odevKonusuYazisi10 = new javax.swing.JLabel();
        telefonNumarasiYazisi = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        guncelleButton = new javax.swing.JButton();
        mesajYazisi = new javax.swing.JLabel();
        telefonNumarasiAlani = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        anaPanel.setBackground(new java.awt.Color(255, 255, 255));

        bannerPanel.setBackground(new java.awt.Color(70, 90, 101));
        bannerPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bannerPanelMouseDragged(evt);
            }
        });
        bannerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bannerPanelMousePressed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/logokucuk.png"))); // NOI18N

        ogrenciYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        ogrenciYazisi.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciYazisi.setText("KİŞİSEL BİLGİLER");

        kapamaPanel.setBackground(java.awt.Color.red);

        kapamaButton.setBackground(java.awt.Color.red);
        kapamaButton.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        kapamaButton.setForeground(new java.awt.Color(255, 255, 255));
        kapamaButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kapamaButton.setText("X");
        kapamaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kapamaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kapamaButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kapamaPanelLayout = new javax.swing.GroupLayout(kapamaPanel);
        kapamaPanel.setLayout(kapamaPanelLayout);
        kapamaPanelLayout.setHorizontalGroup(
            kapamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kapamaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kapamaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        kapamaPanelLayout.setVerticalGroup(
            kapamaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kapamaPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(kapamaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bannerPanelLayout = new javax.swing.GroupLayout(bannerPanel);
        bannerPanel.setLayout(bannerPanelLayout);
        bannerPanelLayout.setHorizontalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ogrenciYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(logo))
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(ogrenciYazisi)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        tcNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        tcNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        tcNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoYazisi.setText("TC No : ");

        tcNoAlani.setEditable(false);
        tcNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        tcNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        tcNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        tcNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcNoAlani.setToolTipText("Kişisel Bilgilerinizi buradan değiştiremezsiniz, Personel Bilgileri bölümünden güncelleme işlemlerini gerçekleştirebilirsiniz.");
        tcNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tcNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        tcNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        tcNoAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcNoAlaniKeyTyped(evt);
            }
        });

        personelNoAlani.setEditable(false);
        personelNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        personelNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        personelNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        personelNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personelNoAlani.setToolTipText("Personel Numaranızı değiştiremezsiniz, Personel kaydı yapıldığı zaman sistem tarafından otomatik olarak oluşturulur.");
        personelNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        personelNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        personelNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        personelNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        personelNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        personelNoYazisi.setText("Personel No : ");

        adAlani.setEditable(false);
        adAlani.setBackground(new java.awt.Color(70, 90, 101));
        adAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        adAlani.setForeground(new java.awt.Color(255, 255, 255));
        adAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adAlani.setToolTipText("Kişisel Bilgilerinizi buradan değiştiremezsiniz, Personel Bilgileri bölümünden güncelleme işlemlerini gerçekleştirebilirsiniz.");
        adAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        adAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        adAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adAlaniKeyTyped(evt);
            }
        });

        adYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(255, 183, 78));
        adYazisi.setText("Ad : ");

        soyadAlani.setEditable(false);
        soyadAlani.setBackground(new java.awt.Color(70, 90, 101));
        soyadAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        soyadAlani.setForeground(new java.awt.Color(255, 255, 255));
        soyadAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soyadAlani.setToolTipText("Kişisel Bilgilerinizi buradan değiştiremezsiniz, Personel Bilgileri bölümünden güncelleme işlemlerini gerçekleştirebilirsiniz.");
        soyadAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        soyadAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        soyadAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        soyadAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                soyadAlaniKeyTyped(evt);
            }
        });

        soyadYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        soyadYazisi.setForeground(new java.awt.Color(255, 183, 78));
        soyadYazisi.setText("Soyad : ");

        odevKonusuYazisi10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        odevKonusuYazisi10.setForeground(new java.awt.Color(255, 183, 78));

        telefonNumarasiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        telefonNumarasiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        telefonNumarasiYazisi.setText("Telefon Numarası : ");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        guncelleButton.setBackground(new java.awt.Color(70, 90, 101));
        guncelleButton.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        guncelleButton.setForeground(new java.awt.Color(255, 255, 255));
        guncelleButton.setText("GÜNCELLE");
        guncelleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        guncelleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guncelleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncelleButtonActionPerformed(evt);
            }
        });

        mesajYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N

        telefonNumarasiAlani.setBackground(new java.awt.Color(70, 90, 101));
        telefonNumarasiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        telefonNumarasiAlani.setForeground(new java.awt.Color(255, 255, 255));
        try {
            telefonNumarasiAlani.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90 (###) ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonNumarasiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonNumarasiAlani.setToolTipText("");
        telefonNumarasiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        telefonNumarasiAlani.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telefonNumarasiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(odevKonusuYazisi10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefonNumarasiYazisi)
                            .addComponent(soyadYazisi)
                            .addComponent(adYazisi)
                            .addComponent(tcNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(adAlani, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tcNoAlani, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(soyadAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesajYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(personelNoYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personelNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(personelNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personelNoYazisi))
                        .addGap(61, 61, 61)
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcNoYazisi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adYazisi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soyadYazisi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telefonNumarasiYazisi)
                                    .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(123, 123, 123)))
                .addComponent(odevKonusuYazisi10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout anaPanelLayout = new javax.swing.GroupLayout(anaPanel);
        anaPanel.setLayout(anaPanelLayout);
        anaPanelLayout.setHorizontalGroup(
            anaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bannerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        anaPanelLayout.setVerticalGroup(
            anaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anaPanelLayout.createSequentialGroup()
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        PersonelEkran personelEkran = new PersonelEkran();
        personelEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kapamaButtonMouseClicked

    private void bannerPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_bannerPanelMousePressed

    private void bannerPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPanelMouseDragged
        int kordinatX = evt.getXOnScreen();
        int kordinatY = evt.getYOnScreen();

        this.setLocation(kordinatX - mouseX, kordinatY - mouseY);
    }//GEN-LAST:event_bannerPanelMouseDragged

    private void tcNoAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcNoAlaniKeyTyped
        char c = evt.getKeyChar();
        if (tcNoAlani.getText().length() >= 11 || (!Character.isDigit(c) || (c == KeyEvent.VK_SPACE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_tcNoAlaniKeyTyped

    private void adAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adAlaniKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_adAlaniKeyTyped

    private void soyadAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_soyadAlaniKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_soyadAlaniKeyTyped

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());

        if (telefonNumarasi.length() != 10) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            personelIslemleri.telefonNumarasiGuncelle(personelNoAlani.getText(), telefonNumarasi);
            
            mesajYazisi.setText("Telefon Numarası Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KisiselBilgilerEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new KisiselBilgilerEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JPanel anaPanel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel odevKonusuYazisi10;
    private javax.swing.JLabel ogrenciYazisi;
    private javax.swing.JTextField personelNoAlani;
    private javax.swing.JLabel personelNoYazisi;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    private javax.swing.JFormattedTextField telefonNumarasiAlani;
    private javax.swing.JLabel telefonNumarasiYazisi;
    // End of variables declaration//GEN-END:variables
}
