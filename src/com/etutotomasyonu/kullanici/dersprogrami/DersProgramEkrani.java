package com.etutotomasyonu.kullanici.dersprogrami;

import com.etutotomasyonu.EtutOtomasyonu;
import com.etutotomasyonu.kullanici.ogrenci.OgrenciEkran;
import com.etutotomasyonu.kullanici.ogretmen.OgretmenEkran;
import com.etutotomasyonu.kullanici.personel.PersonelEkran;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author agitrubardemir
 */
public class DersProgramEkrani extends javax.swing.JFrame {

    OgrenciEkran ogrenciEkran = new OgrenciEkran();
    OgretmenEkran ogretmenEkran = new OgretmenEkran();
    PersonelEkran personelEkran = new PersonelEkran();

    int mouseX, mouseY;

    public DersProgramEkrani() {
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
        ogrenciYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        birinciSinifButton = new javax.swing.JLabel();
        ikinciSinifButton = new javax.swing.JLabel();
        ucuncuSinifEAButton = new javax.swing.JLabel();
        ucuncuSinifSAButton = new javax.swing.JLabel();
        dorduncuSinifEAButton = new javax.swing.JLabel();
        dorduncuSinifSAButton = new javax.swing.JLabel();

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
        ogrenciYazisi.setText("DERS PROGRAMLARI");

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

        birinciSinifButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/BirinciSinif.png"))); // NOI18N
        birinciSinifButton.setToolTipText("1. Sınıfların Ders Programını görüntülemek için buraya tıklayınız.");
        birinciSinifButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        birinciSinifButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                birinciSinifButtonMouseClicked(evt);
            }
        });

        ikinciSinifButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/IkinciSinif.png"))); // NOI18N
        ikinciSinifButton.setToolTipText("2. Sınıfların Ders Programını görüntülemek için buraya tıklayınız.");
        ikinciSinifButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ikinciSinifButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ikinciSinifButtonMouseClicked(evt);
            }
        });

        ucuncuSinifEAButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/UcuncuSinifEA.png"))); // NOI18N
        ucuncuSinifEAButton.setToolTipText("3. Sınıfların Ders Programını görüntülemek için buraya tıklayınız.");
        ucuncuSinifEAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ucuncuSinifEAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucuncuSinifEAButtonMouseClicked(evt);
            }
        });

        ucuncuSinifSAButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/UcuncuSinifSA.png"))); // NOI18N
        ucuncuSinifSAButton.setToolTipText("3. Sınıfların Ders Programını görüntülemek için buraya tıklayınız.");
        ucuncuSinifSAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ucuncuSinifSAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ucuncuSinifSAButtonMouseClicked(evt);
            }
        });

        dorduncuSinifEAButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/DorduncuSinifEA.png"))); // NOI18N
        dorduncuSinifEAButton.setToolTipText("4. Sınıfların Ders Programını görüntülemek için buraya tıklayınız.");
        dorduncuSinifEAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dorduncuSinifEAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dorduncuSinifEAButtonMouseClicked(evt);
            }
        });

        dorduncuSinifSAButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/DorduncuSinifSA.png"))); // NOI18N
        dorduncuSinifSAButton.setToolTipText("3. Sınıfların Ders Programını görüntülemek için buraya tıklayınız.");
        dorduncuSinifSAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dorduncuSinifSAButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dorduncuSinifSAButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(birinciSinifButton)
                .addGap(18, 18, 18)
                .addComponent(ikinciSinifButton)
                .addGap(18, 18, 18)
                .addComponent(ucuncuSinifEAButton)
                .addGap(18, 18, 18)
                .addComponent(ucuncuSinifSAButton)
                .addGap(18, 18, 18)
                .addComponent(dorduncuSinifEAButton)
                .addGap(18, 18, 18)
                .addComponent(dorduncuSinifSAButton)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ucuncuSinifSAButton)
                    .addComponent(ucuncuSinifEAButton)
                    .addComponent(dorduncuSinifEAButton)
                    .addComponent(dorduncuSinifSAButton)
                    .addComponent(ikinciSinifButton)
                    .addComponent(birinciSinifButton))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        int kontrol = EtutOtomasyonu.kontrolSayisi;

        switch (kontrol) {
            case 2:
                ogretmenEkran.setVisible(true);
                break;
            case 3:
                personelEkran.setVisible(true);
                break;
        }

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

    private void birinciSinifButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_birinciSinifButtonMouseClicked
        BirinciSinif birinciSinif = new BirinciSinif();
        birinciSinif.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_birinciSinifButtonMouseClicked

    private void ikinciSinifButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ikinciSinifButtonMouseClicked
        IkinciSinif ikinciSinif = new IkinciSinif();
        ikinciSinif.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ikinciSinifButtonMouseClicked

    private void ucuncuSinifEAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucuncuSinifEAButtonMouseClicked
        UcuncuSinifEA ucuncuSinifEA = new UcuncuSinifEA();
        ucuncuSinifEA.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ucuncuSinifEAButtonMouseClicked

    private void ucuncuSinifSAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ucuncuSinifSAButtonMouseClicked
        UcuncuSinifSA ucuncuSinifSA = new UcuncuSinifSA();
        ucuncuSinifSA.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_ucuncuSinifSAButtonMouseClicked

    private void dorduncuSinifEAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dorduncuSinifEAButtonMouseClicked
        DorduncuSinifEA dorduncuSinifEA = new DorduncuSinifEA();
        dorduncuSinifEA.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_dorduncuSinifEAButtonMouseClicked

    private void dorduncuSinifSAButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dorduncuSinifSAButtonMouseClicked
        DorduncuSinifSA dorduncuSinifSA = new DorduncuSinifSA();
        dorduncuSinifSA.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_dorduncuSinifSAButtonMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DersProgramEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new DersProgramEkrani().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel anaPanel;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JLabel birinciSinifButton;
    private javax.swing.JLabel dorduncuSinifEAButton;
    private javax.swing.JLabel dorduncuSinifSAButton;
    private javax.swing.JLabel ikinciSinifButton;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel ogrenciYazisi;
    private javax.swing.JLabel ucuncuSinifEAButton;
    private javax.swing.JLabel ucuncuSinifSAButton;
    // End of variables declaration//GEN-END:variables
}
