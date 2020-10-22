package com.etutotomasyonu.kullanici.ogretmen;

import com.etutotomasyonu.DersIslemleri;
import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
import com.etutotomasyonu.kullanici.SinifIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author agitrubardemir
 */
public class KisiselBilgilerEkran extends javax.swing.JFrame {

    SinifIslemleri sinifIslemleri = new SinifIslemleri();
    DersIslemleri dersIslemleri = new DersIslemleri();
    KisiselBilgilerIslemleri kisiselBilgilerIslemleri = new KisiselBilgilerIslemleri();
    OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();

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
        String tcNo = OgretmenIslemleri.girisYapanOgretmen.getTcNo();
        tcNoAlani.setText(tcNo);

        String ad = OgretmenIslemleri.girisYapanOgretmen.getAd();
        adAlani.setText(ad);

        String soyad = OgretmenIslemleri.girisYapanOgretmen.getSoyad();
        soyadAlani.setText(soyad);

        String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(OgretmenIslemleri.girisYapanOgretmen.getTelefonNumarasi());
        telefonNumarasiAlani.setText(telefonNumarasi);

        String ogretmenNo = String.valueOf(OgretmenIslemleri.girisYapanOgretmen.getNo());
        ogretmenNoAlani.setText(ogretmenNo);

        int dersKodu = OgretmenIslemleri.girisYapanOgretmen.getDersKodu();
        String dersAdi = dersIslemleri.dersAdiBul(dersKodu);
        dersAdiAlani.setText(dersAdi);
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
        ogretmenNoAlani = new javax.swing.JTextField();
        ogretmenNoYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        adYazisi = new javax.swing.JLabel();
        soyadAlani = new javax.swing.JTextField();
        soyadYazisi = new javax.swing.JLabel();
        odevKonusuYazisi10 = new javax.swing.JLabel();
        telefonNoYazisi = new javax.swing.JLabel();
        dersAdiAlani = new javax.swing.JTextField();
        dersAdiYazisi = new javax.swing.JLabel();
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
                        .addGap(26, 26, 26)
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
        tcNoAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        tcNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tcNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        tcNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        ogretmenNoAlani.setEditable(false);
        ogretmenNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        ogretmenNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogretmenNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        ogretmenNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ogretmenNoAlani.setToolTipText("Öğretmen Numaranızı değiştiremezsiniz, sistem tarafından otomatik olarak oluşturulur.");
        ogretmenNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        ogretmenNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        ogretmenNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        ogretmenNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        ogretmenNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogretmenNoYazisi.setText("Öğretmen No : ");

        adAlani.setEditable(false);
        adAlani.setBackground(new java.awt.Color(70, 90, 101));
        adAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        adAlani.setForeground(new java.awt.Color(255, 255, 255));
        adAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        adAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        adAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        adYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(255, 183, 78));
        adYazisi.setText("Ad : ");

        soyadAlani.setEditable(false);
        soyadAlani.setBackground(new java.awt.Color(70, 90, 101));
        soyadAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        soyadAlani.setForeground(new java.awt.Color(255, 255, 255));
        soyadAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soyadAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        soyadAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        soyadAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        soyadAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        soyadYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        soyadYazisi.setForeground(new java.awt.Color(255, 183, 78));
        soyadYazisi.setText("Soyad : ");

        odevKonusuYazisi10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        odevKonusuYazisi10.setForeground(new java.awt.Color(255, 183, 78));

        telefonNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        telefonNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        telefonNoYazisi.setText("Telefon Numarası : ");

        dersAdiAlani.setEditable(false);
        dersAdiAlani.setBackground(new java.awt.Color(70, 90, 101));
        dersAdiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        dersAdiAlani.setForeground(new java.awt.Color(255, 255, 255));
        dersAdiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dersAdiAlani.setToolTipText("Kayıtlı olduğunuz ders adını değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        dersAdiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        dersAdiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        dersAdiAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        dersAdiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        dersAdiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        dersAdiYazisi.setText("Ders Adı : ");

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
        mesajYazisi.setForeground(new java.awt.Color(0, 226, 0));

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
                            .addComponent(telefonNoYazisi)
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
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addComponent(ogretmenNoYazisi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ogretmenNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(guncelleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(dersAdiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dersAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(mesajYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
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
                            .addComponent(telefonNoYazisi)
                            .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogretmenNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogretmenNoYazisi))
                        .addGap(12, 12, 12)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dersAdiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dersAdiYazisi))
                        .addGap(18, 18, 18)
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
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
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, Short.MAX_VALUE)
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
        OgretmenEkran ogretmenEkran = new OgretmenEkran();
        ogretmenEkran.setVisible(true);
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

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());

        if (telefonNumarasi.length() != 10) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            ogretmenIslemleri.telefonNumarasiGuncelle(ogretmenNoAlani.getText(), telefonNumarasi);

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
            java.util.logging.Logger.getLogger(KisiselBilgilerEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField dersAdiAlani;
    private javax.swing.JLabel dersAdiYazisi;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel odevKonusuYazisi10;
    private javax.swing.JLabel ogrenciYazisi;
    private javax.swing.JTextField ogretmenNoAlani;
    private javax.swing.JLabel ogretmenNoYazisi;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    private javax.swing.JLabel telefonNoYazisi;
    private javax.swing.JFormattedTextField telefonNumarasiAlani;
    // End of variables declaration//GEN-END:variables
}
