package com.etutotomasyonu.kullanici;

import com.etutotomasyonu.EtutOtomasyonu;
import com.etutotomasyonu.veritabani.VeritabaniIslemleri;
import com.etutotomasyonu.kullanici.ogrenci.OgrenciEkran;
import com.etutotomasyonu.kullanici.ogretmen.OgretmenEkran;
import com.etutotomasyonu.kullanici.personel.PersonelEkran;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * @author agitrubardemir
 */
public class KullaniciGirisi extends javax.swing.JFrame {

    VeritabaniIslemleri veritabaniIslemleri = new VeritabaniIslemleri();

    public static String tcNo;
    public static String etutNo;

    int mouseX, mouseY;

    public KullaniciGirisi() {
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
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        geriGitPanel = new javax.swing.JPanel();
        geriGitButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        tcNoAlani = new javax.swing.JTextField();
        girisYapButton = new javax.swing.JButton();
        etutNoYazisi = new javax.swing.JLabel();
        tcNoYazisi = new javax.swing.JLabel();
        etutNoAlani = new javax.swing.JTextField();

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

        geriGitPanel.setBackground(new java.awt.Color(255, 183, 78));

        geriGitButton.setBackground(java.awt.Color.red);
        geriGitButton.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        geriGitButton.setForeground(new java.awt.Color(255, 255, 255));
        geriGitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        geriGitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/back.png"))); // NOI18N
        geriGitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        geriGitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                geriGitButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout geriGitPanelLayout = new javax.swing.GroupLayout(geriGitPanel);
        geriGitPanel.setLayout(geriGitPanelLayout);
        geriGitPanelLayout.setHorizontalGroup(
            geriGitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geriGitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(geriGitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        geriGitPanelLayout.setVerticalGroup(
            geriGitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, geriGitPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(geriGitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout bannerPanelLayout = new javax.swing.GroupLayout(bannerPanel);
        bannerPanel.setLayout(bannerPanelLayout);
        bannerPanelLayout.setHorizontalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addComponent(geriGitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logo)
                .addGap(95, 95, 95)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(geriGitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(logo)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        tcNoAlani.setBackground(new java.awt.Color(255, 255, 255));
        tcNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        tcNoAlani.setForeground(new java.awt.Color(70, 90, 101));
        tcNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcNoAlani.setToolTipText("Lütfen TC Kimlik Numaranızı giriniz.");
        tcNoAlani.setCaretColor(new java.awt.Color(255, 183, 78));
        tcNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        tcNoAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcNoAlaniKeyTyped(evt);
            }
        });

        girisYapButton.setBackground(new java.awt.Color(255, 183, 78));
        girisYapButton.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        girisYapButton.setForeground(new java.awt.Color(255, 255, 255));
        girisYapButton.setText("GİRİŞ YAP");
        girisYapButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        girisYapButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButtonActionPerformed(evt);
            }
        });

        etutNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        etutNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        etutNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etutNoYazisi.setText("Etüt No : ");
        etutNoYazisi.setToolTipText("Öğrenciyseniz; Öğrenci Numaranızı, Öğretmenseniz; Öğretmen Numaranızı, Peronelseniz; Personel Numaranızı giriniz.");

        tcNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        tcNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        tcNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoYazisi.setText("TC No : ");
        tcNoYazisi.setToolTipText("Lütfen TC Kimlik Numaranızı giriniz.");

        etutNoAlani.setBackground(new java.awt.Color(255, 255, 255));
        etutNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        etutNoAlani.setForeground(new java.awt.Color(70, 90, 101));
        etutNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        etutNoAlani.setToolTipText("Öğrenciyseniz; Öğrenci Numaranızı, Öğretmenseniz; Öğretmen Numaranızı, Peronelseniz; Personel Numaranızı giriniz.");
        etutNoAlani.setCaretColor(new java.awt.Color(255, 183, 78));
        etutNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        etutNoAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                etutNoAlaniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(tcNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(girisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(etutNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etutNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcNoYazisi))
                .addGap(18, 18, 18)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etutNoYazisi)
                    .addComponent(etutNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(girisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout anaPanelLayout = new javax.swing.GroupLayout(anaPanel);
        anaPanel.setLayout(anaPanelLayout);
        anaPanelLayout.setHorizontalGroup(
            anaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bannerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void geriGitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_geriGitButtonMouseClicked
        EtutOtomasyonu anaEkran = new EtutOtomasyonu();
        anaEkran.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_geriGitButtonMouseClicked

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
        if (tcNoAlani.getText().length() >= 11 || (c == KeyEvent.VK_SPACE) || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_tcNoAlaniKeyTyped

    private void etutNoAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_etutNoAlaniKeyTyped
        char c = evt.getKeyChar();
        if (etutNoAlani.getText().length() >= 8 ||  (c == KeyEvent.VK_SPACE) || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_etutNoAlaniKeyTyped

    private void girisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButtonActionPerformed
        boolean giris = veritabaniIslemleri.girisYap(tcNoAlani.getText(), etutNoAlani.getText());

        if (giris) {
            int kontrol = EtutOtomasyonu.kontrolSayisi;

            switch (kontrol) {
                case 1:
                    OgrenciEkran ogrenciEkran = new OgrenciEkran();
                    ogrenciEkran.setVisible(true);
                    break;
                case 2:
                    OgretmenEkran ogretmenEkran = new OgretmenEkran();
                    ogretmenEkran.setVisible(true);
                    break;
                case 3:
                    PersonelEkran personelEkran = new PersonelEkran();
                    personelEkran.setVisible(true);
                    break;
            }
            tcNo = tcNoAlani.getText();
            etutNo = etutNoAlani.getText();
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Lütfen TC'nizi ve Etüt Numaranızı Kontrol Ediniz.", "Uyarı!", JOptionPane.INFORMATION_MESSAGE);
            tcNoAlani.setText("");
            etutNoAlani.setText("");
        }
    }//GEN-LAST:event_girisYapButtonActionPerformed

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
    private javax.swing.JTextField etutNoAlani;
    private javax.swing.JLabel etutNoYazisi;
    private javax.swing.JLabel geriGitButton;
    private javax.swing.JPanel geriGitPanel;
    private javax.swing.JButton girisYapButton;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    // End of variables declaration//GEN-END:variables
}
