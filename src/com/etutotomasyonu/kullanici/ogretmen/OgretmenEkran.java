package com.etutotomasyonu.kullanici.ogretmen;

import com.etutotomasyonu.kullanici.dersprogrami.DersProgramEkrani;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author agitrubardemir
 */
public class OgretmenEkran extends javax.swing.JFrame {

    int mouseX, mouseY;

    public OgretmenEkran() {
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
        ogretmenYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        odevTakipButton = new javax.swing.JLabel();
        odevTakipYazisi = new javax.swing.JLabel();
        ogrenciBilgileriButton = new javax.swing.JLabel();
        ogrenciBilgileriYazisi = new javax.swing.JLabel();
        kisiselBilgilerButton = new javax.swing.JLabel();
        kisiselBilgilerYazisi = new javax.swing.JLabel();
        dersProgramiPanel = new javax.swing.JPanel();
        dersProgramiButton = new javax.swing.JLabel();

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

        ogretmenYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        ogretmenYazisi.setForeground(new java.awt.Color(255, 255, 255));
        ogretmenYazisi.setText("ÖĞRETMEN");

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
                .addComponent(ogretmenYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                        .addComponent(ogretmenYazisi)
                        .addGap(8, 8, 8)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));
        actionPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        odevTakipButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        odevTakipButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/OdevTakip.png"))); // NOI18N
        odevTakipButton.setToolTipText("Öğrencilerinize ödev vermek ve verdiğiniz ödevleri görüntülemek için buraya tıklayınız.");
        odevTakipButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        odevTakipButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odevTakipButtonMouseClicked(evt);
            }
        });

        odevTakipYazisi.setBackground(new java.awt.Color(255, 255, 255));
        odevTakipYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        odevTakipYazisi.setForeground(new java.awt.Color(255, 183, 78));
        odevTakipYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        odevTakipYazisi.setText("ÖDEV TAKİP");
        odevTakipYazisi.setToolTipText("Öğrencilerinize ödev vermek ve verdiğiniz ödevleri görüntülemek için üstteki butona tıklayınız.");

        ogrenciBilgileriButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogrenciBilgileriButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/OgrenciBilgileri.png"))); // NOI18N
        ogrenciBilgileriButton.setToolTipText("Öğrenci Bilgilerini görüntülemek için buraya tıklayınız.");
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
        ogrenciBilgileriYazisi.setToolTipText("Öğrenci Bilgilerini görüntülemek için üstteki butona tıklayınız.");

        kisiselBilgilerButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kisiselBilgilerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/KisiselBilgiler.png"))); // NOI18N
        kisiselBilgilerButton.setToolTipText("Kişisel Bilgileriniz görüntülemek için buraya tıklayınız.");
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
            .addComponent(dersProgramiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(dersProgramiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(199, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(odevTakipButton)
                    .addComponent(odevTakipYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(ogrenciBilgileriYazisi))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(ogrenciBilgileriButton)))
                .addGap(31, 31, 31)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kisiselBilgilerYazisi)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addComponent(kisiselBilgilerButton)
                        .addGap(6, 6, 6)))
                .addGap(64, 64, 64))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ogrenciBilgileriButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(odevTakipButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kisiselBilgilerButton))
                .addGap(18, 18, 18)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogrenciBilgileriYazisi)
                    .addComponent(kisiselBilgilerYazisi)
                    .addComponent(odevTakipYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(2, 2, 2)
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

    private void odevTakipButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odevTakipButtonMouseClicked
        OdevTakipEkran odevTakipEkran = new OdevTakipEkran();
        odevTakipEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_odevTakipButtonMouseClicked

    private void ogrenciBilgileriButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenciBilgileriButtonMouseClicked
        OgrenciBilgileriEkran ogrenciBilgileriEkran = new OgrenciBilgileriEkran();
        ogrenciBilgileriEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ogrenciBilgileriButtonMouseClicked

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
            java.util.logging.Logger.getLogger(OgretmenEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new OgretmenEkran().setVisible(true);
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
    private javax.swing.JLabel odevTakipButton;
    private javax.swing.JLabel odevTakipYazisi;
    private javax.swing.JLabel ogrenciBilgileriButton;
    private javax.swing.JLabel ogrenciBilgileriYazisi;
    private javax.swing.JLabel ogretmenYazisi;
    // End of variables declaration//GEN-END:variables
}
