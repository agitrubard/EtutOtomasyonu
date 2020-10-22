package com.etutotomasyonu.kullanici.personel;

import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
import com.etutotomasyonu.kullanici.ogrenci.*;
import com.etutotomasyonu.kullanici.SinifIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author agitrubardemir
 */
public class OgrenciBilgileriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();
    SinifIslemleri sinifIslemleri = new SinifIslemleri();
    KisiselBilgilerIslemleri kisiselBilgilerIslemleri = new KisiselBilgilerIslemleri();

    int mouseX, mouseY;

    public OgrenciBilgileriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        this.model = (DefaultTableModel) ogrenciTablosu.getModel();
        ogrenciGoruntule();
    }

    public void ogrenciGoruntule() {
        model.setRowCount(0);

        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        int ogrenciSayisi = 0;

        ogrenciler = ogrenciIslemleri.tumOgrencileriGetir();

        if (ogrenciler != null) {
            for (Ogrenci ogrenci : ogrenciler) {
                String tcNo = ogrenci.getTcNo();

                int no = ogrenci.getNo();

                int sinifKodu = ogrenciIslemleri.sinifKoduBul(ogrenci.getNo());
                String sinif = sinifIslemleri.sinifAdiBul(sinifKodu);

                String adSoyad = ogrenci.getAd() + " " + ogrenci.getSoyad();

                String dogumTarihi = KisiselBilgilerIslemleri.tarihDonusumu(ogrenci.getDogumTarihi());

                String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuOgrenci(ogrenci.getCinsiyet());

                String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(ogrenci.getTelefonNumarasi());

                String veliAdSoyad = ogrenci.getVeliAdSoyad();

                String veliTelefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(ogrenci.getVeliTelefonNumarasi());
                Object[] eklenecek = {tcNo, no, sinif, adSoyad, dogumTarihi, cinsiyet, telefonNumarasi, veliAdSoyad, veliTelefonNumarasi};

                model.addRow(eklenecek);
                ogrenciSayisi++;
            }
            ogrenciSayisiYazisi.setText("Toplam Öğrenci Sayısı : " + ogrenciSayisi);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        anaPanel = new javax.swing.JPanel();
        bannerPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ogrenciBilgileriYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogrenciTablosu = new javax.swing.JTable();
        tcNoYazisi = new javax.swing.JLabel();
        ogrenciNoYazisi = new javax.swing.JLabel();
        sinifYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        ogrenciNoAlani = new javax.swing.JTextField();
        tcNoAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        soyadYazisi = new javax.swing.JLabel();
        dogumTarihiYazisi = new javax.swing.JLabel();
        cinsiyetYazisi = new javax.swing.JLabel();
        telefonNoYazisi = new javax.swing.JLabel();
        veliAdAlani = new javax.swing.JTextField();
        veliAdYazisi = new javax.swing.JLabel();
        veliTelefonNoYazisi = new javax.swing.JLabel();
        sinifSecimi = new javax.swing.JComboBox<>();
        olusturButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cinsiyetSecimi = new javax.swing.JComboBox<>();
        dogumTarihiAlani = new javax.swing.JFormattedTextField();
        telefonNumarasiAlani = new javax.swing.JFormattedTextField();
        veliTelefonNumarasiAlani = new javax.swing.JFormattedTextField();
        ogrenciAraYazisi = new javax.swing.JLabel();
        araAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        ogrenciSayisiYazisi = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bannerPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bannerPanelMousePressed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/etutotomasyonu/icons/logokucuk.png"))); // NOI18N

        ogrenciBilgileriYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        ogrenciBilgileriYazisi.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciBilgileriYazisi.setText("ÖĞRENCİ BİLGİLERİ");

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
                .addComponent(ogrenciBilgileriYazisi)
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
                .addComponent(logo)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ogrenciBilgileriYazisi)
                .addGap(24, 24, 24))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        ogrenciTablosu.setBackground(new java.awt.Color(255, 255, 255));
        ogrenciTablosu.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogrenciTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC No", "Numarası", "Sınıfı", "Adı Soyadı", "Doğum Tarihi", "Cinsiyet", "Telefon Numarası", "Veli Adı ve Soyadı", "Veli Telefon Numarası"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogrenciTablosu.setRowHeight(20);
        ogrenciTablosu.setSelectionBackground(new java.awt.Color(255, 183, 78));
        ogrenciTablosu.setSelectionForeground(new java.awt.Color(70, 90, 101));
        ogrenciTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogrenciTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ogrenciTablosu);
        if (ogrenciTablosu.getColumnModel().getColumnCount() > 0) {
            ogrenciTablosu.getColumnModel().getColumn(0).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(0).setPreferredWidth(50);
            ogrenciTablosu.getColumnModel().getColumn(1).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(1).setPreferredWidth(20);
            ogrenciTablosu.getColumnModel().getColumn(2).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(2).setPreferredWidth(80);
            ogrenciTablosu.getColumnModel().getColumn(3).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(3).setPreferredWidth(110);
            ogrenciTablosu.getColumnModel().getColumn(4).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(4).setPreferredWidth(40);
            ogrenciTablosu.getColumnModel().getColumn(5).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(5).setPreferredWidth(-400);
            ogrenciTablosu.getColumnModel().getColumn(6).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(6).setPreferredWidth(80);
            ogrenciTablosu.getColumnModel().getColumn(7).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(8).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(8).setPreferredWidth(85);
        }

        tcNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        tcNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        tcNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoYazisi.setText("TC No : ");

        ogrenciNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        ogrenciNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogrenciNoYazisi.setText("Öğrenci No : ");
        ogrenciNoYazisi.setToolTipText("Öğrenci Numarasını yandaki Öğrenci No Oluştur butonuna tıklayarak oluşturabilirsiniz. ");

        sinifYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        sinifYazisi.setForeground(new java.awt.Color(255, 183, 78));
        sinifYazisi.setText("Sınıf : ");

        adYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(255, 183, 78));
        adYazisi.setText("Ad : ");

        adAlani.setBackground(new java.awt.Color(70, 90, 101));
        adAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        adAlani.setForeground(new java.awt.Color(255, 255, 255));
        adAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        adAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        adAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adAlaniKeyTyped(evt);
            }
        });

        ogrenciNoAlani.setEditable(false);
        ogrenciNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        ogrenciNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogrenciNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ogrenciNoAlani.setToolTipText("Öğrenci Numarasını yandaki Öğrenci No Oluştur butonuna tıklayarak oluşturabilirsiniz. ");
        ogrenciNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        ogrenciNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        ogrenciNoAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        ogrenciNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        tcNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        tcNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        tcNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        tcNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tcNoAlani.setToolTipText("");
        tcNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        tcNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        tcNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        tcNoAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tcNoAlaniKeyTyped(evt);
            }
        });

        soyadAlani.setBackground(new java.awt.Color(70, 90, 101));
        soyadAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        soyadAlani.setForeground(new java.awt.Color(255, 255, 255));
        soyadAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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

        dogumTarihiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        dogumTarihiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        dogumTarihiYazisi.setText("Doğum Tarihi : ");

        cinsiyetYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        cinsiyetYazisi.setForeground(new java.awt.Color(255, 183, 78));
        cinsiyetYazisi.setText("Cinsiyet : ");

        telefonNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        telefonNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        telefonNoYazisi.setText("Telefon Numarası : ");

        veliAdAlani.setBackground(new java.awt.Color(70, 90, 101));
        veliAdAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        veliAdAlani.setForeground(new java.awt.Color(255, 255, 255));
        veliAdAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        veliAdAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        veliAdAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        veliAdAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        veliAdAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                veliAdAlaniKeyTyped(evt);
            }
        });

        veliAdYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        veliAdYazisi.setForeground(new java.awt.Color(255, 183, 78));
        veliAdYazisi.setText("Veli Adı ve Soyadı : ");

        veliTelefonNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        veliTelefonNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        veliTelefonNoYazisi.setText("Veli Telefon Numarası : ");

        sinifSecimi.setBackground(new java.awt.Color(70, 90, 101));
        sinifSecimi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        sinifSecimi.setForeground(new java.awt.Color(255, 255, 255));
        sinifSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Öğrencinin Sınıfını Seçiniz ---", "1. SINIF", "2. SINIF", "3. SINIF - Sayısal", "3. SINIF - Eşit Ağırlık", "4. SINIF - Sayısal", "4. SINIF - Eşit Ağırlık" }));
        sinifSecimi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        sinifSecimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        olusturButton.setBackground(new java.awt.Color(70, 90, 101));
        olusturButton.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        olusturButton.setForeground(new java.awt.Color(255, 255, 255));
        olusturButton.setText("ÖĞRENCİ NO OLUŞTUR");
        olusturButton.setToolTipText("Öğrenci Numarası oluşturmak için buraya tıklayınız.");
        olusturButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        olusturButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olusturButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olusturButtonActionPerformed(evt);
            }
        });

        ekleButton.setBackground(new java.awt.Color(70, 90, 101));
        ekleButton.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        ekleButton.setForeground(new java.awt.Color(255, 255, 255));
        ekleButton.setText("EKLE");
        ekleButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        ekleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ekleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ekleButtonActionPerformed(evt);
            }
        });

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

        silButton.setBackground(new java.awt.Color(70, 90, 101));
        silButton.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        silButton.setForeground(new java.awt.Color(255, 255, 255));
        silButton.setText("SİL");
        silButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        silButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });

        jSeparator1.setFont(new java.awt.Font("SF Pro Display", 0, 18)); // NOI18N

        cinsiyetSecimi.setBackground(new java.awt.Color(70, 90, 101));
        cinsiyetSecimi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        cinsiyetSecimi.setForeground(new java.awt.Color(255, 255, 255));
        cinsiyetSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Öğrencinin Cinsiyetini Seçiniz --", "Kız", "Erkek" }));
        cinsiyetSecimi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cinsiyetSecimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        dogumTarihiAlani.setBackground(new java.awt.Color(70, 90, 101));
        dogumTarihiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        dogumTarihiAlani.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dogumTarihiAlani.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dogumTarihiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dogumTarihiAlani.setToolTipText("");
        dogumTarihiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        dogumTarihiAlani.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dogumTarihiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        dogumTarihiAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        dogumTarihiAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        telefonNumarasiAlani.setBackground(new java.awt.Color(70, 90, 101));
        telefonNumarasiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        telefonNumarasiAlani.setForeground(new java.awt.Color(255, 255, 255));
        try {
            telefonNumarasiAlani.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90 (###) ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefonNumarasiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonNumarasiAlani.setText("");
        telefonNumarasiAlani.setToolTipText("");
        telefonNumarasiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        telefonNumarasiAlani.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telefonNumarasiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N

        veliTelefonNumarasiAlani.setBackground(new java.awt.Color(70, 90, 101));
        veliTelefonNumarasiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        veliTelefonNumarasiAlani.setForeground(new java.awt.Color(255, 255, 255));
        try {
            veliTelefonNumarasiAlani.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+90 (###) ### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        veliTelefonNumarasiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        veliTelefonNumarasiAlani.setText("");
        veliTelefonNumarasiAlani.setToolTipText("");
        veliTelefonNumarasiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        veliTelefonNumarasiAlani.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        veliTelefonNumarasiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N

        ogrenciAraYazisi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogrenciAraYazisi.setForeground(new java.awt.Color(70, 90, 101));
        ogrenciAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ogrenciAraYazisi.setText("Öğrenci Ara : ");
        ogrenciAraYazisi.setToolTipText("Aşağıya aramak istediğiniz öğrencinin bilgisini giriniz.");

        araAlani.setBackground(new java.awt.Color(255, 255, 255));
        araAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        araAlani.setForeground(new java.awt.Color(70, 90, 101));
        araAlani.setToolTipText("Aramak istediğiniz öğrencinin bilgisini giriniz.");
        araAlani.setBorder(null);
        araAlani.setCaretColor(new java.awt.Color(255, 183, 78));
        araAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        araAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        araAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                araAlaniKeyReleased(evt);
            }
        });

        araSeparator.setBackground(new java.awt.Color(70, 90, 101));
        araSeparator.setForeground(new java.awt.Color(70, 90, 101));
        araSeparator.setToolTipText("18,30,49");

        ogrenciSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        ogrenciSayisiYazisi.setForeground(new java.awt.Color(70, 90, 101));
        ogrenciSayisiYazisi.setText("Toplam Öğrenci Sayısı : ");

        mesajYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(tcNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(adYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(soyadYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(dogumTarihiYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(dogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(cinsiyetYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(cinsiyetSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(sinifYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(sinifSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(ogrenciNoYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(ogrenciNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(telefonNoYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(veliAdYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(veliAdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(veliTelefonNoYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(veliTelefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogrenciAraYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 413, Short.MAX_VALUE)
                        .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ogrenciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(tcNoYazisi))
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(11, 11, 11)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(adYazisi)))
                                .addGap(14, 14, 14)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(soyadYazisi)))
                                .addGap(12, 12, 12)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(dogumTarihiYazisi)))
                                .addGap(12, 12, 12)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cinsiyetSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cinsiyetYazisi))))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(actionPanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(sinifYazisi))
                                            .addComponent(sinifSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(11, 11, 11)
                                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ogrenciNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(actionPanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(ogrenciNoYazisi))))
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(telefonNoYazisi)))
                                .addGap(12, 12, 12)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(veliAdAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(veliAdYazisi)))
                                .addGap(12, 12, 12)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(veliTelefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(actionPanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(veliTelefonNoYazisi)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ogrenciAraYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ogrenciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void bannerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPanelMouseClicked
        tcNoAlani.setText("");
        adAlani.setText("");
        soyadAlani.setText("");
        dogumTarihiAlani.setText("");
        cinsiyetSecimi.setSelectedIndex(0);
        ogrenciNoAlani.setText("");
        sinifSecimi.setSelectedIndex(0);
        telefonNumarasiAlani.setText("");
        veliAdAlani.setText("");
        veliTelefonNumarasiAlani.setText("");
    }//GEN-LAST:event_bannerPanelMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        ogrenciTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void araAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araAlaniKeyReleased
        String ara = araAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_araAlaniKeyReleased

    private void ogrenciTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogrenciTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = ogrenciTablosu.getSelectedRow();

        String tcNo = model.getValueAt(selectedRow, 0).toString();
        tcNoAlani.setText(tcNo);

        String no = model.getValueAt(selectedRow, 1).toString();
        ogrenciNoAlani.setText(no);

        String sinifAdi = model.getValueAt(selectedRow, 2).toString();
        int sinifKodu = sinifIslemleri.sinifKoduBul(sinifAdi);
        sinifSecimi.setSelectedIndex(sinifIslemleri.sinifSec(sinifKodu));

        String adSoyad = model.getValueAt(selectedRow, 3).toString();
        String[] dizi = adSoyad.split(" ");
        String ad;
        String soyad;
        if (dizi.length == 3) {
            ad = dizi[0] + " " + dizi[1];
            soyad = dizi[2];
        } else {
            ad = dizi[0];
            soyad = dizi[1];
        }
        adAlani.setText(ad);
        soyadAlani.setText(soyad);

        String dogumTarihi = model.getValueAt(selectedRow, 4).toString();
        dogumTarihiAlani.setText(dogumTarihi);

        String cinsiyet = model.getValueAt(selectedRow, 5).toString();
        cinsiyetSecimi.setSelectedIndex(KisiselBilgilerIslemleri.cinsiyetSec(cinsiyet));

        String telefonNumarasi = model.getValueAt(selectedRow, 6).toString();
        telefonNumarasiAlani.setText(telefonNumarasi);

        String veliAdSoyad = model.getValueAt(selectedRow, 7).toString();
        veliAdAlani.setText(veliAdSoyad);

        String veliTelefonNumarasi = model.getValueAt(selectedRow, 8).toString();
        veliTelefonNumarasiAlani.setText(veliTelefonNumarasi);
    }//GEN-LAST:event_ogrenciTablosuMouseClicked

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
        if (Character.isDigit(c) || (c == KeyEvent.VK_SPACE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_soyadAlaniKeyTyped

    private void veliAdAlaniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_veliAdAlaniKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_veliAdAlaniKeyTyped

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        mesajYazisi.setText("");
        int no;

        if (ogrenciNoAlani.getText().equals("")) {
            no = 0;
        } else {
            no = Integer.parseInt(ogrenciNoAlani.getText());
        }

        if (sinifSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Öğrenci No Oluşturmak İçin Lütfen Bir Sınıf Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            if (ogrenciIslemleri.isOgrenciNo(no) && (sinifSecimi.getSelectedIndex() == ogrenciIslemleri.sinifSec(no))) {
                mesajYazisi.setText("Bu Öğrenci Sistemde Zaten Kayıtlı Olduğundan Yeni Bir Öğrenci No Oluşturamazsınız!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("");
                int sinifKodu = sinifIslemleri.sinifKoduSec(sinifSecimi.getSelectedIndex());
                int ogrenciNo = ogrenciIslemleri.noOlustur(sinifKodu);
                ogrenciNoAlani.setText(String.valueOf(ogrenciNo));
            }
        }
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        String[] dizi = veliAdAlani.getText().split(" ");

        if (tcNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin TC'sini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (tcNoAlani.getText().length() != 11) {
            mesajYazisi.setText("Lütfen Öğrencinin TC'sini Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dogumTarihiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Doğum Tarihini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (cinsiyetSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğrencinin Cinsiyetini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (sinifSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğrencinin Sınıfını Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (ogrenciNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrenci No Oluşturun!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).length() != 10) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Telefon Numarasını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (veliAdAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Adını ve Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dizi.length != 2) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Adını ve Soyadını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(veliTelefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(veliTelefonNumarasiAlani.getText()).length() != 10) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Telefon Numarasını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (sinifSecimi.getSelectedIndex() != ogrenciIslemleri.sinifSec(Integer.parseInt(ogrenciNoAlani.getText()))) {
            mesajYazisi.setText("Seçtiğiniz Sınıf ve Öğrenci No Uyuşmadığından Öğrenci Eklenemiyor! Lütfen Yeni Bir Öğrenci No Oluşturunuz.");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String tcNo = tcNoAlani.getText().trim();
            int sinifKodu = sinifIslemleri.sinifKoduSec(sinifSecimi.getSelectedIndex());
            int no = Integer.parseInt(ogrenciNoAlani.getText());
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText().trim();
            String dogumTarihi = KisiselBilgilerIslemleri.tarihDonusumuSQL(dogumTarihiAlani.getText());
            String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuSQL(cinsiyetSecimi.getSelectedIndex());
            String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());
            String veliAdSoyad = veliAdAlani.getText();
            String veliTelefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(veliTelefonNumarasiAlani.getText());

            if (ogrenciIslemleri.isOgrenciNo(no) == false) {
                ogrenciIslemleri.ekle(tcNo, no, sinifKodu, ad, soyad, dogumTarihi, cinsiyet, telefonNumarasi, veliAdSoyad, veliTelefonNumarasi);

                ogrenciGoruntule();

                mesajYazisi.setText(ad + " " + soyad + " Adlı Öğrenci Başarıyla Eklendi.");
                mesajYazisi.setForeground(new Color(0, 226, 0));

                tcNoAlani.setText("");
                adAlani.setText("");
                soyadAlani.setText("");
                dogumTarihiAlani.setText("");
                cinsiyetSecimi.setSelectedIndex(0);
                ogrenciNoAlani.setText("");
                sinifSecimi.setSelectedIndex(0);
                telefonNumarasiAlani.setText("");
                veliAdAlani.setText("");
                veliTelefonNumarasiAlani.setText("");
            } else {
                mesajYazisi.setText(ad + " " + soyad + " Adlı Öğrenci Sistemde Zaten Kayıtlı!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = ogrenciTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Öğrenci Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Bilgileri Güncellenecek Bir Öğrenci Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        }

        String[] dizi = veliAdAlani.getText().split(" ");

        if (tcNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin TC'sini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (tcNoAlani.getText().length() != 11) {
            mesajYazisi.setText("Lütfen Öğrencinin TC'sini Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dogumTarihiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Doğum Tarihini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (cinsiyetSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğrencinin Cinsiyetini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (sinifSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğrencinin Sınıfını Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (ogrenciNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrenciye Öğrenci No Oluşturun veya Öğrenci No'yu Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (ogrenciNoAlani.getText().length() != 8) {
            mesajYazisi.setText("Lütfen Öğrenci No'yu Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).length() != 10) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Telefon Numarasını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (veliAdAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Adını ve Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dizi.length == 1) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Adını ve Soyadını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(veliTelefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(veliTelefonNumarasiAlani.getText()).length() != 10) {
            mesajYazisi.setText("Lütfen Öğrencinin Veli Telefon Numarasını Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (sinifSecimi.getSelectedIndex() != ogrenciIslemleri.sinifSec(Integer.parseInt(ogrenciNoAlani.getText()))) {
            mesajYazisi.setText("Seçtiğiniz Sınıf ve Öğrenci No Uyuşmadığından Öğrenci Bilgileri Güncellenemiyor! Lütfen Yeni Bir Öğrenci No Oluşturunuz.");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String tcNo = tcNoAlani.getText();
            int sinifKodu = sinifIslemleri.sinifKoduSec(sinifSecimi.getSelectedIndex());
            int no = Integer.parseInt(ogrenciNoAlani.getText());
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText().trim();
            String dogumTarihi = KisiselBilgilerIslemleri.tarihDonusumuSQL(dogumTarihiAlani.getText());
            String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuSQL(cinsiyetSecimi.getSelectedIndex());
            String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());
            String veliAdSoyad = veliAdAlani.getText();
            String veliTelefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(veliTelefonNumarasiAlani.getText());

            ogrenciIslemleri.guncelle(tcNo, no, sinifKodu, ad, soyad, dogumTarihi, cinsiyet, telefonNumarasi, veliAdSoyad, veliTelefonNumarasi);

            ogrenciGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Öğrencinin Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            tcNoAlani.setText("");
            adAlani.setText("");
            soyadAlani.setText("");
            dogumTarihiAlani.setText("");
            cinsiyetSecimi.setSelectedIndex(0);
            ogrenciNoAlani.setText("");
            sinifSecimi.setSelectedIndex(0);
            telefonNumarasiAlani.setText("");
            veliAdAlani.setText("");
            veliTelefonNumarasiAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = ogrenciTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Öğrenci Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Öğrenci Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            int no = Integer.parseInt(ogrenciNoAlani.getText());

            ogrenciIslemleri.sil(no);

            ogrenciGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Öğrenci Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            tcNoAlani.setText("");
            adAlani.setText("");
            soyadAlani.setText("");
            dogumTarihiAlani.setText("");
            cinsiyetSecimi.setSelectedIndex(0);
            ogrenciNoAlani.setText("");
            sinifSecimi.setSelectedIndex(0);
            telefonNumarasiAlani.setText("");
            veliAdAlani.setText("");
            veliTelefonNumarasiAlani.setText("");
        }
    }//GEN-LAST:event_silButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciBilgileriEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new OgrenciBilgileriEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JTextField adAlani;
    private javax.swing.JLabel adYazisi;
    private javax.swing.JPanel anaPanel;
    private javax.swing.JTextField araAlani;
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cinsiyetSecimi;
    private javax.swing.JLabel cinsiyetYazisi;
    private javax.swing.JFormattedTextField dogumTarihiAlani;
    private javax.swing.JLabel dogumTarihiYazisi;
    private javax.swing.JButton ekleButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel ogrenciAraYazisi;
    private javax.swing.JLabel ogrenciBilgileriYazisi;
    private javax.swing.JTextField ogrenciNoAlani;
    private javax.swing.JLabel ogrenciNoYazisi;
    private javax.swing.JLabel ogrenciSayisiYazisi;
    private javax.swing.JTable ogrenciTablosu;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton silButton;
    private javax.swing.JComboBox<String> sinifSecimi;
    private javax.swing.JLabel sinifYazisi;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    private javax.swing.JLabel telefonNoYazisi;
    private javax.swing.JFormattedTextField telefonNumarasiAlani;
    private javax.swing.JTextField veliAdAlani;
    private javax.swing.JLabel veliAdYazisi;
    private javax.swing.JLabel veliTelefonNoYazisi;
    private javax.swing.JFormattedTextField veliTelefonNumarasiAlani;
    // End of variables declaration//GEN-END:variables
}
