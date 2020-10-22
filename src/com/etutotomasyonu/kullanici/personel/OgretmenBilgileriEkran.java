package com.etutotomasyonu.kullanici.personel;

import com.etutotomasyonu.DersIslemleri;
import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
import com.etutotomasyonu.kullanici.ogretmen.Ogretmen;
import com.etutotomasyonu.kullanici.ogretmen.OgretmenIslemleri;
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
public class OgretmenBilgileriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
    DersIslemleri dersIslemleri = new DersIslemleri();
    KisiselBilgilerIslemleri kisiselBilgilerIslemleri = new KisiselBilgilerIslemleri();

    int mouseX, mouseY;

    public OgretmenBilgileriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        this.model = (DefaultTableModel) ogretmenTablosu.getModel();
        ogretmenGoruntule();
    }

    public void ogretmenGoruntule() {
        model.setRowCount(0);

        ArrayList<Ogretmen> ogretmenler = new ArrayList<Ogretmen>();
        int ogretmenSayisi = 0;

        ogretmenler = ogretmenIslemleri.tumOgretmenleriGetir();

        if (ogretmenler != null) {
            for (Ogretmen ogretmen : ogretmenler) {
                String tcNo = ogretmen.getTcNo();

                int no = ogretmen.getNo();

                String dersAdi = dersIslemleri.dersAdiBul(ogretmen.getDersKodu());

                String adSoyad = ogretmen.getAd() + " " + ogretmen.getSoyad();

                String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumu(ogretmen.getCinsiyet());

                String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(ogretmen.getTelefonNumarasi());

                Object[] eklenecek = {tcNo, no, dersAdi, adSoyad, cinsiyet, telefonNumarasi};

                model.addRow(eklenecek);
                ogretmenSayisi++;
            }
            ogretmenSayisiYazisi.setText("Toplam Öğretmen Sayısı : " + ogretmenSayisi);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        anaPanel = new javax.swing.JPanel();
        bannerPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        ogretmenBilgileriYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ogretmenTablosu = new javax.swing.JTable();
        tcNoYazisi = new javax.swing.JLabel();
        ogretmenNoYazisi = new javax.swing.JLabel();
        bransYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        ogretmenNoAlani = new javax.swing.JTextField();
        tcNoAlani = new javax.swing.JTextField();
        soyadAlani = new javax.swing.JTextField();
        soyadYazisi = new javax.swing.JLabel();
        cinsiyetYazisi = new javax.swing.JLabel();
        telefonNoYazisi = new javax.swing.JLabel();
        olusturButton = new javax.swing.JButton();
        ekleButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cinsiyetSecimi = new javax.swing.JComboBox<>();
        telefonNumarasiAlani = new javax.swing.JFormattedTextField();
        dersSecimi = new javax.swing.JComboBox<>();
        ogretmenAraYazisi = new javax.swing.JLabel();
        araAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        mesajYazisi = new javax.swing.JLabel();
        ogretmenSayisiYazisi = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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

        ogretmenBilgileriYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        ogretmenBilgileriYazisi.setForeground(new java.awt.Color(255, 255, 255));
        ogretmenBilgileriYazisi.setText("ÖĞRETMEN BİLGİLERİ");

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
                .addComponent(ogretmenBilgileriYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 488, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logo)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ogretmenBilgileriYazisi)
                .addGap(24, 24, 24))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        ogretmenTablosu.setBackground(new java.awt.Color(255, 255, 255));
        ogretmenTablosu.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogretmenTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC No", "Öğretmen No", "Ders Adı", "Adı Soyadı", "Cinsiyet", "Telefon Numarası"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogretmenTablosu.setRowHeight(20);
        ogretmenTablosu.setSelectionBackground(new java.awt.Color(255, 183, 78));
        ogretmenTablosu.setSelectionForeground(new java.awt.Color(70, 90, 101));
        ogretmenTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ogretmenTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ogretmenTablosu);
        if (ogretmenTablosu.getColumnModel().getColumnCount() > 0) {
            ogretmenTablosu.getColumnModel().getColumn(0).setResizable(false);
            ogretmenTablosu.getColumnModel().getColumn(1).setResizable(false);
            ogretmenTablosu.getColumnModel().getColumn(1).setPreferredWidth(-100);
            ogretmenTablosu.getColumnModel().getColumn(2).setResizable(false);
            ogretmenTablosu.getColumnModel().getColumn(3).setResizable(false);
            ogretmenTablosu.getColumnModel().getColumn(3).setPreferredWidth(100);
            ogretmenTablosu.getColumnModel().getColumn(4).setResizable(false);
            ogretmenTablosu.getColumnModel().getColumn(4).setPreferredWidth(-300);
            ogretmenTablosu.getColumnModel().getColumn(5).setResizable(false);
            ogretmenTablosu.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        tcNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        tcNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        tcNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoYazisi.setText("TC No : ");

        ogretmenNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        ogretmenNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        ogretmenNoYazisi.setText("Öğretmen No : ");
        ogretmenNoYazisi.setToolTipText("Öğretmen Numarasını yandaki Öğretmen No Oluştur butonuna tıklayarak oluşturabilirsiniz. ");

        bransYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        bransYazisi.setForeground(new java.awt.Color(255, 183, 78));
        bransYazisi.setText("Branş : ");

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

        ogretmenNoAlani.setEditable(false);
        ogretmenNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        ogretmenNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogretmenNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        ogretmenNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ogretmenNoAlani.setToolTipText("Öğretmen Numarasını yandaki Öğretmen No Oluştur butonuna tıklayarak oluşturabilirsiniz. ");
        ogretmenNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        ogretmenNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        ogretmenNoAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        ogretmenNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

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

        cinsiyetYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        cinsiyetYazisi.setForeground(new java.awt.Color(255, 183, 78));
        cinsiyetYazisi.setText("Cinsiyet : ");

        telefonNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        telefonNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        telefonNoYazisi.setText("Telefon Numarası : ");

        olusturButton.setBackground(new java.awt.Color(70, 90, 101));
        olusturButton.setFont(new java.awt.Font("SF Pro Display", 1, 16)); // NOI18N
        olusturButton.setForeground(new java.awt.Color(255, 255, 255));
        olusturButton.setText("ÖĞRETMEN NO OLUŞTUR");
        olusturButton.setToolTipText("Öğretmen Numarası oluşturmak için buraya tıklayınız.");
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
        cinsiyetSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Öğretmenin Cinsiyetini Seçiniz --", "Kadın", "Erkek" }));
        cinsiyetSecimi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        cinsiyetSecimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        dersSecimi.setBackground(new java.awt.Color(70, 90, 101));
        dersSecimi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        dersSecimi.setForeground(new java.awt.Color(255, 255, 255));
        dersSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Öğretmenin Branşını Seçiniz --", "TYT - Matematik", "TYT - Geometri", "TYT - Türkçe", "TYT - Tarih", "TYT - Coğrafya", "TYT - Felsefe", "TYT - Fizik", "TYT - Kimya", "TYT - Biyoloji", "AYT - Matematik", "AYT - Geometri", "AYT - Türk Dili ve Edebiyatı", "AYT - Tarih", "AYT - Coğrafya", "AYT - Fizik", "AYT - Kimya", "AYT - Biyoloji" }));
        dersSecimi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        dersSecimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ogretmenAraYazisi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogretmenAraYazisi.setForeground(new java.awt.Color(70, 90, 101));
        ogretmenAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        ogretmenAraYazisi.setText("Öğretmen Ara : ");
        ogretmenAraYazisi.setToolTipText("Aşağıya aramak istediğiniz öğretmenin bilgisini giriniz.");

        araAlani.setBackground(new java.awt.Color(255, 255, 255));
        araAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        araAlani.setForeground(new java.awt.Color(70, 90, 101));
        araAlani.setToolTipText("Aramak istediğiniz öğretmenin bilgisini giriniz.");
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

        mesajYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        ogretmenSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        ogretmenSayisiYazisi.setForeground(new java.awt.Color(70, 90, 101));
        ogretmenSayisiYazisi.setText("Toplam Öğretmen Sayısı : ");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ogretmenAraYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(tcNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)
                                .addComponent(bransYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(dersSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(adYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(ogretmenNoYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(ogretmenNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(soyadYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(cinsiyetYazisi)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinsiyetSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addComponent(telefonNoYazisi)
                                .addGap(12, 12, 12)
                                .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ogretmenSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dersSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tcNoYazisi)
                            .addComponent(bransYazisi))))
                .addGap(11, 11, 11)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(adYazisi))
                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ogretmenNoYazisi))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(ogretmenNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(soyadYazisi))
                    .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cinsiyetYazisi))
                    .addComponent(cinsiyetSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(telefonNoYazisi))
                    .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ogretmenAraYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ogretmenSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(anaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        cinsiyetSecimi.setSelectedIndex(0);
        telefonNumarasiAlani.setText("");
        dersSecimi.setSelectedIndex(0);
        ogretmenNoAlani.setText("");
    }//GEN-LAST:event_bannerPanelMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        ogretmenTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void araAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araAlaniKeyReleased
        String ara = araAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_araAlaniKeyReleased

    private void ogretmenTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ogretmenTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = ogretmenTablosu.getSelectedRow();

        String tcNo = model.getValueAt(selectedRow, 0).toString();
        tcNoAlani.setText(tcNo);

        String no = model.getValueAt(selectedRow, 1).toString();
        ogretmenNoAlani.setText(no);

        dersSecimi.setSelectedIndex(ogretmenIslemleri.dersSec(no));

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

        String cinsiyet = model.getValueAt(selectedRow, 4).toString();
        cinsiyetSecimi.setSelectedIndex(KisiselBilgilerIslemleri.cinsiyetSec(cinsiyet));

        String telefonNumarasi = model.getValueAt(selectedRow, 5).toString();
        telefonNumarasiAlani.setText(telefonNumarasi);
    }//GEN-LAST:event_ogretmenTablosuMouseClicked

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

    private void olusturButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olusturButtonActionPerformed
        mesajYazisi.setText("");

        int no;

        if (ogretmenNoAlani.getText().equals("")) {
            no = 0;
        } else {
            no = Integer.parseInt(ogretmenNoAlani.getText());
        }

        if (dersSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Öğretmen No Oluşturmak İçin Lütfen Bir Ders Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            if (ogretmenIslemleri.isOgretmenNo(no) && (dersSecimi.getSelectedIndex() == ogretmenIslemleri.dersSec(ogretmenNoAlani.getText()))) {
                mesajYazisi.setText("Bu Öğretmen Sistemde Zaten Kayıtlı Olduğundan Yeni Bir Öğretmen No Oluşturamazsınız!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                int dersKodu = dersIslemleri.dersKoduBul(dersSecimi.getSelectedIndex());
                int ogretmenNo = ogretmenIslemleri.noOlustur(dersKodu);
                ogretmenNoAlani.setText(String.valueOf(ogretmenNo));
            }
        }
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        if (tcNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmenin TC'sini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (tcNoAlani.getText().length() != 11) {
            mesajYazisi.setText("Lütfen Öğretmenin TC'sini Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmenin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmenin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (cinsiyetSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğretmenin Cinsiyetini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dersSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğretmenin Branşını Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (ogretmenNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmen No Oluşturun!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dersSecimi.getSelectedIndex() != ogretmenIslemleri.dersSec(ogretmenNoAlani.getText())) {
            mesajYazisi.setText("Seçtiğiniz Branş ve Öğretmen No Uyuşmadığından Öğretmen Eklenemiyor! Lütfen Yeni Bir Öğretmen No Oluşturunuz.");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String tcNo = tcNoAlani.getText().trim();
            int no = Integer.parseInt(ogretmenNoAlani.getText());
            int dersKodu = dersIslemleri.dersKoduBul(dersSecimi.getSelectedIndex());
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuSQL(cinsiyetSecimi.getSelectedIndex());
            String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());

            if (ogretmenIslemleri.isOgretmenNo(no) == false) {
                ogretmenIslemleri.ekle(tcNo, no, dersKodu, ad, soyad, cinsiyet, telefonNumarasi);

                ogretmenGoruntule();

                mesajYazisi.setText(ad + " " + soyad + " Adlı Öğretmen Başarıyla Eklendi.");
                mesajYazisi.setForeground(new Color(0, 226, 0));

                tcNoAlani.setText("");
                adAlani.setText("");
                soyadAlani.setText("");
                cinsiyetSecimi.setSelectedIndex(0);
                telefonNumarasiAlani.setText("");
                dersSecimi.setSelectedIndex(0);
                ogretmenNoAlani.setText("");
            } else {
                mesajYazisi.setText(ad + " " + soyad + " Adlı Öğretmen Sistemde Zaten Kayıtlı!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = ogretmenTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Öğretmen Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Bilgileri Güncellenecek Bir Öğretmen Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        }

        if (tcNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmenin TC'sini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (tcNoAlani.getText().length() != 11) {
            mesajYazisi.setText("Lütfen Öğretmenin TC'sini Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmenin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmenin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (cinsiyetSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğretmenin Cinsiyetini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dersSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Öğretmenin Branşını Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (ogretmenNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Öğretmen No Oluşturun!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (dersSecimi.getSelectedIndex() != ogretmenIslemleri.dersSec(ogretmenNoAlani.getText())) {
            mesajYazisi.setText("Seçtiğiniz Branş ve Öğretmen No Uyuşmadığından Öğretmen Bilgileri Güncellenemiyor! Lütfen Yeni Bir Öğretmen No Oluşturunuz.");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String tcNo = tcNoAlani.getText().trim();
            int no = Integer.parseInt(ogretmenNoAlani.getText());
            int dersKodu = dersIslemleri.dersKoduBul(dersSecimi.getSelectedIndex());
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuSQL(cinsiyetSecimi.getSelectedIndex());
            String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());

            ogretmenIslemleri.guncelle(tcNo, no, dersKodu, ad, soyad, cinsiyet, telefonNumarasi);

            ogretmenGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Öğretmenin Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            tcNoAlani.setText("");
            adAlani.setText("");
            soyadAlani.setText("");
            cinsiyetSecimi.setSelectedIndex(0);
            telefonNumarasiAlani.setText("");
            dersSecimi.setSelectedIndex(0);
            ogretmenNoAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = ogretmenTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Öğretmen Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Öğretmen Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            int no = Integer.parseInt(ogretmenNoAlani.getText());

            ogretmenIslemleri.sil(no);

            ogretmenGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Öğretmen Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            tcNoAlani.setText("");
            adAlani.setText("");
            soyadAlani.setText("");
            cinsiyetSecimi.setSelectedIndex(0);
            telefonNumarasiAlani.setText("");
            dersSecimi.setSelectedIndex(0);
            ogretmenNoAlani.setText("");
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
            java.util.logging.Logger.getLogger(OgretmenBilgileriEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new OgretmenBilgileriEkran().setVisible(true);
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
    private javax.swing.JLabel bransYazisi;
    private javax.swing.JComboBox<String> cinsiyetSecimi;
    private javax.swing.JLabel cinsiyetYazisi;
    private javax.swing.JComboBox<String> dersSecimi;
    private javax.swing.JButton ekleButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel ogretmenAraYazisi;
    private javax.swing.JLabel ogretmenBilgileriYazisi;
    private javax.swing.JTextField ogretmenNoAlani;
    private javax.swing.JLabel ogretmenNoYazisi;
    private javax.swing.JLabel ogretmenSayisiYazisi;
    private javax.swing.JTable ogretmenTablosu;
    private javax.swing.JButton olusturButton;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    private javax.swing.JLabel telefonNoYazisi;
    private javax.swing.JFormattedTextField telefonNumarasiAlani;
    // End of variables declaration//GEN-END:variables
}
