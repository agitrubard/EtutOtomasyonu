package com.etutotomasyonu.kullanici.personel;

import com.etutotomasyonu.kullanici.dersprogrami.DersProgramEkrani;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author agitrubardemir
 */
public class PersonelEkran extends javax.swing.JFrame {

    int mouseX, mouseY;

    public PersonelEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anaPanel = new javax.swing.JPanel();
        bannerPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        personelYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        ogrenciBilgileriButton = new javax.swing.JLabel();
        ogrenciBilgileriYazisi = new javax.swing.JLabel();
        ogretmenBilgileriButton = new javax.swing.JLabel();
        ogretmenBilgileriYazisi = new javax.swing.JLabel();
        kisiselBilgilerButton = new javax.swing.JLabel();
        kisiselBilgilerYazisi = new javax.swing.JLabel();
        dersProgramiPanel = new javax.swing.JPanel();
        dersProgramiButton = new javax.swing.JLabel();
        personelBilgileriButton = new javax.swing.JLabel();
        personelBilgileriYazisi = new javax.swing.JLabel();

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

        personelYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        personelYazisi.setForeground(new java.awt.Color(255, 255, 255));
        personelYazisi.setText("PERSONEL");

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
                .addComponent(personelYazisi)
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
                        .addComponent(personelYazisi)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        ogrenciBilgileriButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogrenciBilgileriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/OgrenciBilgileri.png"))); // NOI18N
        ogrenciBilgileriButton.setToolTipText("Öğrenci İşlemlerini gerçekleştirmek ve Öğrenci Bilgilerini görüntülemek için buraya tıklayınız.");
        ogrenciBilgileriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ogrenciBilgileriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenciBilgileriButtonMouseClicked(evt);
            }
        });

        ogrenciBilgileriYazisi.setBackground(new java.awt.Color(255, 255, 255));
        ogrenciBilgileriYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        ogrenciBilgileriYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogrenciBilgileriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogrenciBilgileriYazisi.setText("ÖĞRENCİ BİLGİLERİ");
        ogrenciBilgileriYazisi.setToolTipText("Öğrenci İşlemlerini gerçekleştirmek ve Öğrenci Bilgilerini görüntülemek için üstteki butona tıklayınız.");

        ogretmenBilgileriButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogretmenBilgileriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/OgretmenBilgileri.png"))); // NOI18N
        ogretmenBilgileriButton.setToolTipText("Öğretmen İşlemlerini gerçekleştirmek ve Öğretmen Bilgilerini görüntülemek için buraya tıklayınız.");
        ogretmenBilgileriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ogretmenBilgileriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogretmenBilgileriButtonMouseClicked(evt);
            }
        });

        ogretmenBilgileriYazisi.setBackground(new java.awt.Color(255, 255, 255));
        ogretmenBilgileriYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        ogretmenBilgileriYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogretmenBilgileriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogretmenBilgileriYazisi.setText("ÖĞRETMEN BİLGİLERİ");
        ogretmenBilgileriYazisi.setToolTipText("Öğretmen İşlemlerini gerçekleştirmek ve Öğretmen Bilgilerini görüntülemek için üstteki butona tıklayınız.");

        kisiselBilgilerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselBilgilerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/KisiselBilgiler.png"))); // NOI18N
        kisiselBilgilerButton.setToolTipText("Kişisel Bilgilerinizi görüntülemek için buraya tıklayınız.");
        kisiselBilgilerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kisiselBilgilerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kisiselBilgilerButtonMouseClicked(evt);
            }
        });

        kisiselBilgilerYazisi.setBackground(new java.awt.Color(255, 255, 255));
        kisiselBilgilerYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        kisiselBilgilerYazisi.setForeground(new java.awt.Color(255, 183, 78));
        kisiselBilgilerYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselBilgilerYazisi.setText("KİŞİSEL BİLGİLER");
        kisiselBilgilerYazisi.setToolTipText("Kişisel Bilgilerinizi görüntülemek için üstteki butona tıklayınız.");

        dersProgramiPanel.setBackground(new java.awt.Color(255, 183, 78));
        dersProgramiPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dersProgramiButton.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        dersProgramiButton.setForeground(new java.awt.Color(255, 255, 255));
        dersProgramiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dersProgramiButton.setText("DERS PROGRAMI");
        dersProgramiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dersProgramiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dersProgramiButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dersProgramiPanelLayout = new javax.swing.GroupLayout(dersProgramiPanel);
        dersProgramiPanel.setLayout(dersProgramiPanelLayout);
        dersProgramiPanelLayout.setHorizontalGroup(
            dersProgramiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dersProgramiPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dersProgramiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dersProgramiPanelLayout.setVerticalGroup(
            dersProgramiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dersProgramiPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dersProgramiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        personelBilgileriButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personelBilgileriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/PersonelBilgileri.png"))); // NOI18N
        personelBilgileriButton.setToolTipText("Personel İşlemlerini gerçekleştirmek ve Personel Bilgilerini görüntülemek için buraya tıklayınız.");
        personelBilgileriButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personelBilgileriButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personelBilgileriButtonMouseClicked(evt);
            }
        });

        personelBilgileriYazisi.setBackground(new java.awt.Color(255, 255, 255));
        personelBilgileriYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        personelBilgileriYazisi.setForeground(new java.awt.Color(255, 183, 78));
        personelBilgileriYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personelBilgileriYazisi.setText("PERSONEL BİLGİLERİ");
        personelBilgileriYazisi.setToolTipText("Personel İşlemlerini gerçekleştirmek ve Personel Bilgilerini görüntülemek için üstteki butona tıklayınız.");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(ogrenciBilgileriButton)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ogrenciBilgileriYazisi)
                        .addGap(18, 18, 18)))
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ogretmenBilgileriYazisi)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(ogretmenBilgileriButton)))
                .addGap(18, 18, 18)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(personelBilgileriButton))
                    .addComponent(personelBilgileriYazisi))
                .addGap(29, 29, 29)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kisiselBilgilerYazisi)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(kisiselBilgilerButton)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dersProgramiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(285, 285, 285))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(ogrenciBilgileriButton)
                .addGap(105, 105, 105))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ogretmenBilgileriButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogretmenBilgileriYazisi)
                            .addComponent(ogrenciBilgileriYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(personelBilgileriButton)
                                .addGroup(actionPanelLayout.createSequentialGroup()
                                    .addGap(164, 164, 164)
                                    .addComponent(personelBilgileriYazisi)))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(kisiselBilgilerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(kisiselBilgilerYazisi)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dersProgramiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        System.exit(0);
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

    private void ogrenciBilgileriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenciBilgileriButtonMouseClicked
        OgrenciBilgileriEkran ogrenciBilgileriEkran = new OgrenciBilgileriEkran();
        ogrenciBilgileriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ogrenciBilgileriButtonMouseClicked

    private void ogretmenBilgileriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogretmenBilgileriButtonMouseClicked
        OgretmenBilgileriEkran ogretmenBilgileriEkran = new OgretmenBilgileriEkran();
        ogretmenBilgileriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ogretmenBilgileriButtonMouseClicked

    private void personelBilgileriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personelBilgileriButtonMouseClicked
        PersonelBilgileriEkran personelBilgileriEkran = new PersonelBilgileriEkran();
        personelBilgileriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_personelBilgileriButtonMouseClicked

    private void kisiselBilgilerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kisiselBilgilerButtonMouseClicked
        KisiselBilgilerEkran kisiselBilgilerEkran = new KisiselBilgilerEkran();
        kisiselBilgilerEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kisiselBilgilerButtonMouseClicked

    private void dersProgramiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dersProgramiButtonMouseClicked
        DersProgramEkrani dersProgramEkrani = new DersProgramEkrani();
        dersProgramEkrani.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_dersProgramiButtonMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonelEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new PersonelEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel anaPanel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JLabel dersProgramiButton;
    private javax.swing.JPanel dersProgramiPanel;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel kisiselBilgilerButton;
    private javax.swing.JLabel kisiselBilgilerYazisi;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ogrenciBilgileriButton;
    private javax.swing.JLabel ogrenciBilgileriYazisi;
    private javax.swing.JLabel ogretmenBilgileriButton;
    private javax.swing.JLabel ogretmenBilgileriYazisi;
    private javax.swing.JLabel personelBilgileriButton;
    private javax.swing.JLabel personelBilgileriYazisi;
    private javax.swing.JLabel personelYazisi;
    // End of variables declaration//GEN-END:variables
}
