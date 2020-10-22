package com.etutotomasyonu.kullanici.ogrenci;

import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
import com.etutotomasyonu.kullanici.SinifIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author agitrubardemir
 */
public class KisiselBilgilerEkran extends javax.swing.JFrame {

    SinifIslemleri sinifIslemleri = new SinifIslemleri();
    OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();

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
        String tcNo = OgrenciIslemleri.girisYapanOgrenci.getTcNo();
        tcNoAlani.setText(tcNo);

        String ad = OgrenciIslemleri.girisYapanOgrenci.getAd();
        adAlani.setText(ad);

        String soyad = OgrenciIslemleri.girisYapanOgrenci.getSoyad();
        soyadAlani.setText(soyad);

        String tarih = OgrenciIslemleri.girisYapanOgrenci.getDogumTarihi();
        String dogumTarihi = KisiselBilgilerIslemleri.tarihDonusumu(tarih);
        dogumTarihiAlani.setText(dogumTarihi);

        String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(OgrenciIslemleri.girisYapanOgrenci.getTelefonNumarasi());
        telefonNumarasiAlani.setText(telefonNumarasi);

        String ogrenciNo = String.valueOf(OgrenciIslemleri.girisYapanOgrenci.getNo());
        ogrenciNoAlani.setText(ogrenciNo);

        int sinifKodu = OgrenciIslemleri.girisYapanOgrenci.getSinifKodu();
        String sinif = sinifIslemleri.sinifAdiBul(sinifKodu);
        sinifAlani.setText(sinif);

        String veliAdSoyad = OgrenciIslemleri.girisYapanOgrenci.getVeliAdSoyad();
        veliAdSoyadAlani.setText(veliAdSoyad);

        String veliTelefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(OgrenciIslemleri.girisYapanOgrenci.getVeliTelefonNumarasi());
        veliTelefonNumarasiAlani.setText(veliTelefonNumarasi);
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
        ogrenciNoAlani = new javax.swing.JTextField();
        ogrenciNoYazisi = new javax.swing.JLabel();
        sinifAlani = new javax.swing.JTextField();
        sinifYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        adYazisi = new javax.swing.JLabel();
        soyadAlani = new javax.swing.JTextField();
        soyadYazisi = new javax.swing.JLabel();
        dogumTarihiAlani = new javax.swing.JTextField();
        dogumTarihiYazisi = new javax.swing.JLabel();
        odevKonusuYazisi10 = new javax.swing.JLabel();
        telefonNumarasiAlani = new javax.swing.JTextField();
        telefonNoYazisi = new javax.swing.JLabel();
        veliAdSoyadAlani = new javax.swing.JTextField();
        veliAdYazisi = new javax.swing.JLabel();
        veliNoYazisi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        veliTelefonNumarasiAlani = new javax.swing.JTextField();

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
        tcNoAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise lütfen Etüt Personeline başvurunuz.");
        tcNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tcNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        tcNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        ogrenciNoAlani.setEditable(false);
        ogrenciNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        ogrenciNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogrenciNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ogrenciNoAlani.setToolTipText("Öğrenci Numaranızı değiştiremezsiniz, sisteme kayıt edildiğinizde otomatik olarak oluşturulur.");
        ogrenciNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        ogrenciNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        ogrenciNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        ogrenciNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        ogrenciNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogrenciNoYazisi.setText("Öğrenci No : ");

        sinifAlani.setEditable(false);
        sinifAlani.setBackground(new java.awt.Color(70, 90, 101));
        sinifAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        sinifAlani.setForeground(new java.awt.Color(255, 255, 255));
        sinifAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sinifAlani.setToolTipText("Sınıf Bilginizi değiştiremezsiniz.");
        sinifAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        sinifAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        sinifAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        sinifYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        sinifYazisi.setForeground(new java.awt.Color(255, 183, 78));
        sinifYazisi.setText("Sınıf : ");

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
        soyadAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz bir yanlışlık var ise Etüt Personeline başvurunuz.");
        soyadAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        soyadAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        soyadAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        soyadYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        soyadYazisi.setForeground(new java.awt.Color(255, 183, 78));
        soyadYazisi.setText("Soyad : ");

        dogumTarihiAlani.setEditable(false);
        dogumTarihiAlani.setBackground(new java.awt.Color(70, 90, 101));
        dogumTarihiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        dogumTarihiAlani.setForeground(new java.awt.Color(255, 255, 255));
        dogumTarihiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dogumTarihiAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        dogumTarihiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        dogumTarihiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        dogumTarihiAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        dogumTarihiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        dogumTarihiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        dogumTarihiYazisi.setText("Doğum Tarihi : ");

        odevKonusuYazisi10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        odevKonusuYazisi10.setForeground(new java.awt.Color(255, 183, 78));

        telefonNumarasiAlani.setEditable(false);
        telefonNumarasiAlani.setBackground(new java.awt.Color(70, 90, 101));
        telefonNumarasiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        telefonNumarasiAlani.setForeground(new java.awt.Color(255, 255, 255));
        telefonNumarasiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonNumarasiAlani.setToolTipText("Kişisel Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        telefonNumarasiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        telefonNumarasiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        telefonNumarasiAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        telefonNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        telefonNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        telefonNoYazisi.setText("Telefon Numarası : ");

        veliAdSoyadAlani.setEditable(false);
        veliAdSoyadAlani.setBackground(new java.awt.Color(70, 90, 101));
        veliAdSoyadAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        veliAdSoyadAlani.setForeground(new java.awt.Color(255, 255, 255));
        veliAdSoyadAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        veliAdSoyadAlani.setToolTipText("Veli Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        veliAdSoyadAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        veliAdSoyadAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        veliAdSoyadAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        veliAdYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        veliAdYazisi.setForeground(new java.awt.Color(255, 183, 78));
        veliAdYazisi.setText("Veli Adı ve Soyadı : ");

        veliNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        veliNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        veliNoYazisi.setText("Veli Telefon Numarası : ");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        veliTelefonNumarasiAlani.setEditable(false);
        veliTelefonNumarasiAlani.setBackground(new java.awt.Color(70, 90, 101));
        veliTelefonNumarasiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        veliTelefonNumarasiAlani.setForeground(new java.awt.Color(255, 255, 255));
        veliTelefonNumarasiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        veliTelefonNumarasiAlani.setToolTipText("Veli Bilgilerinizi değiştiremezsiniz, bir yanlışlık var ise Etüt Personeline başvurunuz.");
        veliTelefonNumarasiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        veliTelefonNumarasiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        veliTelefonNumarasiAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(odevKonusuYazisi10)
                .addGap(27, 27, 27)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(telefonNoYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actionPanelLayout.createSequentialGroup()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(soyadYazisi)
                                            .addComponent(adYazisi)
                                            .addComponent(dogumTarihiYazisi)))
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(tcNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(soyadAlani, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adAlani, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tcNoAlani, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(ogrenciNoYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ogrenciNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(actionPanelLayout.createSequentialGroup()
                            .addComponent(sinifYazisi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sinifAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(veliAdYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veliAdSoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(veliNoYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(veliTelefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(126, 126, 126))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veliAdSoyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(veliAdYazisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(veliNoYazisi)
                    .addComponent(veliTelefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(239, 239, 239))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(odevKonusuYazisi10))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
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
                            .addComponent(dogumTarihiYazisi)
                            .addComponent(dogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonNoYazisi)
                            .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ogrenciNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrenciNoYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sinifYazisi)
                            .addComponent(sinifAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        javax.swing.GroupLayout anaPanelLayout = new javax.swing.GroupLayout(anaPanel);
        anaPanel.setLayout(anaPanelLayout);
        anaPanelLayout.setHorizontalGroup(
            anaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bannerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        anaPanelLayout.setVerticalGroup(
            anaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anaPanelLayout.createSequentialGroup()
                .addComponent(bannerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(anaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kapamaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kapamaButtonMouseClicked
        OgrenciEkran ogrenciEkran = new OgrenciEkran();
        ogrenciEkran.setVisible(true);
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
    private javax.swing.JTextField dogumTarihiAlani;
    private javax.swing.JLabel dogumTarihiYazisi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel odevKonusuYazisi10;
    private javax.swing.JTextField ogrenciNoAlani;
    private javax.swing.JLabel ogrenciNoYazisi;
    private javax.swing.JLabel ogrenciYazisi;
    private javax.swing.JTextField sinifAlani;
    private javax.swing.JLabel sinifYazisi;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    private javax.swing.JLabel telefonNoYazisi;
    private javax.swing.JTextField telefonNumarasiAlani;
    private javax.swing.JTextField veliAdSoyadAlani;
    private javax.swing.JLabel veliAdYazisi;
    private javax.swing.JLabel veliNoYazisi;
    private javax.swing.JTextField veliTelefonNumarasiAlani;
    // End of variables declaration//GEN-END:variables
}
