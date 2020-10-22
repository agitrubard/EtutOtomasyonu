package com.etutotomasyonu;

import com.etutotomasyonu.kullanici.KullaniciGirisi;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author agitrubardemir
 */
public class EtutOtomasyonu extends javax.swing.JFrame {

    public static int kontrolSayisi;

    int mouseX, mouseY;

    public EtutOtomasyonu() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        
        kontrolSayisi = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anaPanel = new javax.swing.JPanel();
        bannerPanel = new javax.swing.JPanel();
        etutOtomasyonuYazisi = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        ogrenciGirisiButton = new javax.swing.JLabel();
        ogrenciGirisiYazisi = new javax.swing.JLabel();
        ogretmenGirisiButton = new javax.swing.JLabel();
        ogretmenGirisiYazisi = new javax.swing.JLabel();
        personelGirisiButton = new javax.swing.JLabel();
        personelGirisiYazisi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

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

        etutOtomasyonuYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 45)); // NOI18N
        etutOtomasyonuYazisi.setForeground(new java.awt.Color(255, 255, 255));
        etutOtomasyonuYazisi.setText("ETÜT OTOMASYONU");

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/logo.png"))); // NOI18N

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
                .addGap(51, 51, 51)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etutOtomasyonuYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(etutOtomasyonuYazisi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        ogrenciGirisiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogrenciGirisiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/OgrenciGirisi.png"))); // NOI18N
        ogrenciGirisiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ogrenciGirisiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenciGirisiButtonMouseClicked(evt);
            }
        });

        ogrenciGirisiYazisi.setBackground(new java.awt.Color(255, 255, 255));
        ogrenciGirisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        ogrenciGirisiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogrenciGirisiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogrenciGirisiYazisi.setText("ÖĞRENCİ GİRİŞİ");

        ogretmenGirisiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogretmenGirisiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/OgretmenGirisi.png"))); // NOI18N
        ogretmenGirisiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ogretmenGirisiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogretmenGirisiButtonMouseClicked(evt);
            }
        });

        ogretmenGirisiYazisi.setBackground(new java.awt.Color(255, 255, 255));
        ogretmenGirisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        ogretmenGirisiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogretmenGirisiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ogretmenGirisiYazisi.setText("ÖĞRETMEN GİRİŞİ");

        personelGirisiButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personelGirisiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/PersonelGirisi.png"))); // NOI18N
        personelGirisiButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        personelGirisiButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personelGirisiButtonMouseClicked(evt);
            }
        });

        personelGirisiYazisi.setBackground(new java.awt.Color(255, 255, 255));
        personelGirisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        personelGirisiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        personelGirisiYazisi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        personelGirisiYazisi.setText("PERSONEL GİRİŞİ");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ogrenciGirisiButton)
                    .addComponent(ogrenciGirisiYazisi))
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(ogretmenGirisiYazisi)
                        .addGap(55, 55, 55))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(ogretmenGirisiButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(personelGirisiYazisi)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addComponent(personelGirisiButton)
                        .addGap(6, 6, 6)))
                .addGap(60, 60, 60))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ogretmenGirisiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ogrenciGirisiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(personelGirisiButton))
                .addGap(18, 18, 18)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ogretmenGirisiYazisi)
                    .addComponent(personelGirisiYazisi)
                    .addComponent(ogrenciGirisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout anaPanelLayout = new javax.swing.GroupLayout(anaPanel);
        anaPanel.setLayout(anaPanelLayout);
        anaPanelLayout.setHorizontalGroup(
            anaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bannerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(anaPanelLayout.createSequentialGroup()
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            .addComponent(anaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void ogrenciGirisiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenciGirisiButtonMouseClicked
        KullaniciGirisi kullaniciGirisi = new KullaniciGirisi();
        kullaniciGirisi.setVisible(true);
        setVisible(false);

        kontrolSayisi = 1;
    }//GEN-LAST:event_ogrenciGirisiButtonMouseClicked

    private void ogretmenGirisiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogretmenGirisiButtonMouseClicked
        KullaniciGirisi kullaniciGirisi = new KullaniciGirisi();
        kullaniciGirisi.setVisible(true);
        setVisible(false);

        kontrolSayisi = 2;
    }//GEN-LAST:event_ogretmenGirisiButtonMouseClicked

    private void personelGirisiButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personelGirisiButtonMouseClicked
        KullaniciGirisi kullaniciGirisi = new KullaniciGirisi();
        kullaniciGirisi.setVisible(true);
        setVisible(false);

        kontrolSayisi = 3;
    }//GEN-LAST:event_personelGirisiButtonMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtutOtomasyonu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new EtutOtomasyonu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel anaPanel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JLabel etutOtomasyonuYazisi;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ogrenciGirisiButton;
    private javax.swing.JLabel ogrenciGirisiYazisi;
    private javax.swing.JLabel ogretmenGirisiButton;
    private javax.swing.JLabel ogretmenGirisiYazisi;
    private javax.swing.JLabel personelGirisiButton;
    private javax.swing.JLabel personelGirisiYazisi;
    // End of variables declaration//GEN-END:variables
}
