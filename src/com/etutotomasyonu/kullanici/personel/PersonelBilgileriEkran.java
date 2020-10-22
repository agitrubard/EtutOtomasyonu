package com.etutotomasyonu.kullanici.personel;

import com.etutotomasyonu.DersIslemleri;
import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
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
public class PersonelBilgileriEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    DersIslemleri dersIslemleri = new DersIslemleri();
    SinifIslemleri sinifIslemleri = new SinifIslemleri();
    KisiselBilgilerIslemleri kisiselBilgilerIslemleri = new KisiselBilgilerIslemleri();
    PersonelIslemleri personelIslemleri = new PersonelIslemleri();

    int mouseX, mouseY;

    public PersonelBilgileriEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        this.model = (DefaultTableModel) personelTablosu.getModel();
        personelGoruntule();
    }

    public void personelGoruntule() {
        model.setRowCount(0);

        ArrayList<Personel> personeller = new ArrayList<Personel>();
        int personelSayisi = 0;

        personeller = personelIslemleri.tumPersonelleriGetir();

        if (personeller != null) {
            for (Personel personel : personeller) {
                String tcNo = personel.getTcNo();

                int no = personel.getNo();

                String adSoyad = personel.getAd() + " " + personel.getSoyad();

                String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumu(personel.getCinsiyet());

                String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonustur(personel.getTelefonNumarasi());

                Object[] eklenecek = {tcNo, no, adSoyad, cinsiyet, telefonNumarasi};

                model.addRow(eklenecek);
                personelSayisi++;
            }
            personelSayisiYazisi.setText("Toplam Personel Sayısı : " + personelSayisi);
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
        personelBilgileriYazisi = new javax.swing.JLabel();
        kapamaPanel = new javax.swing.JPanel();
        kapamaButton = new javax.swing.JLabel();
        actionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personelTablosu = new javax.swing.JTable();
        tcNoYazisi = new javax.swing.JLabel();
        personelNoYazisi = new javax.swing.JLabel();
        adYazisi = new javax.swing.JLabel();
        adAlani = new javax.swing.JTextField();
        personelNoAlani = new javax.swing.JTextField();
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
        araAlani = new javax.swing.JTextField();
        personelAraYazisi = new javax.swing.JLabel();
        araSeparator = new javax.swing.JSeparator();
        mesajYazisi1 = new javax.swing.JLabel();
        ogretmenSayisi = new javax.swing.JLabel();
        mesajYazisi = new javax.swing.JLabel();
        personelSayisiYazisi = new javax.swing.JLabel();

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

        personelBilgileriYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        personelBilgileriYazisi.setForeground(new java.awt.Color(255, 255, 255));
        personelBilgileriYazisi.setText("PERSONEL BİLGİLERİ");

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
                .addComponent(personelBilgileriYazisi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bannerPanelLayout.setVerticalGroup(
            bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addGroup(bannerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(logo))
                    .addGroup(bannerPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(personelBilgileriYazisi)))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(bannerPanelLayout.createSequentialGroup()
                .addComponent(kapamaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        personelTablosu.setBackground(new java.awt.Color(255, 255, 255));
        personelTablosu.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        personelTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TC No", "Personel No", "Adı Soyadı", "Cinsiyet", "Telefon Numarası"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        personelTablosu.setRowHeight(20);
        personelTablosu.setSelectionBackground(new java.awt.Color(255, 183, 78));
        personelTablosu.setSelectionForeground(new java.awt.Color(70, 90, 101));
        personelTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                personelTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(personelTablosu);
        if (personelTablosu.getColumnModel().getColumnCount() > 0) {
            personelTablosu.getColumnModel().getColumn(0).setResizable(false);
            personelTablosu.getColumnModel().getColumn(1).setResizable(false);
            personelTablosu.getColumnModel().getColumn(1).setPreferredWidth(-100);
            personelTablosu.getColumnModel().getColumn(2).setResizable(false);
            personelTablosu.getColumnModel().getColumn(2).setPreferredWidth(100);
            personelTablosu.getColumnModel().getColumn(3).setResizable(false);
            personelTablosu.getColumnModel().getColumn(3).setPreferredWidth(-300);
            personelTablosu.getColumnModel().getColumn(4).setResizable(false);
            personelTablosu.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        tcNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        tcNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        tcNoYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tcNoYazisi.setText("TC No : ");

        personelNoYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        personelNoYazisi.setForeground(new java.awt.Color(255, 183, 78));
        personelNoYazisi.setText("Personel No : ");
        personelNoYazisi.setToolTipText("Personel Numarasını yandaki Personel No Oluştur butonuna tıklayarak oluşturabilirsiniz.");

        adYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        adYazisi.setForeground(new java.awt.Color(255, 183, 78));
        adYazisi.setText("Ad : ");

        adAlani.setBackground(new java.awt.Color(70, 90, 101));
        adAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        adAlani.setForeground(new java.awt.Color(255, 255, 255));
        adAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        adAlani.setToolTipText("");
        adAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        adAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        adAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        adAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adAlaniKeyTyped(evt);
            }
        });

        personelNoAlani.setEditable(false);
        personelNoAlani.setBackground(new java.awt.Color(70, 90, 101));
        personelNoAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        personelNoAlani.setForeground(new java.awt.Color(255, 255, 255));
        personelNoAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        personelNoAlani.setToolTipText("Personel Numarasını yandaki Personel No Oluştur butonuna tıklayarak oluşturabilirsiniz. ");
        personelNoAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        personelNoAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        personelNoAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        personelNoAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

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
        soyadAlani.setToolTipText("");
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
        olusturButton.setText("PERSONEL NO OLUŞTUR");
        olusturButton.setToolTipText("Personel Numarası oluşturmak için buraya tıklayınız.");
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
        cinsiyetSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Personelin Cinsiyetini Seçiniz --", "Kadın", "Erkek" }));
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

        araAlani.setBackground(new java.awt.Color(255, 255, 255));
        araAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        araAlani.setForeground(new java.awt.Color(70, 90, 101));
        araAlani.setToolTipText("Aramak istediğiniz personelin bilgisini giriniz.");
        araAlani.setBorder(null);
        araAlani.setCaretColor(new java.awt.Color(255, 183, 78));
        araAlani.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        araAlani.setSelectionColor(new java.awt.Color(255, 183, 78));
        araAlani.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                araAlaniKeyReleased(evt);
            }
        });

        personelAraYazisi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        personelAraYazisi.setForeground(new java.awt.Color(70, 90, 101));
        personelAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        personelAraYazisi.setText("Personel Ara : ");
        personelAraYazisi.setToolTipText("Aşağıya aramak istediğiniz personelin bilgisini giriniz.");

        araSeparator.setBackground(new java.awt.Color(70, 90, 101));
        araSeparator.setForeground(new java.awt.Color(70, 90, 101));
        araSeparator.setToolTipText("18,30,49");

        mesajYazisi1.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        mesajYazisi1.setForeground(new java.awt.Color(0, 0, 0));

        ogretmenSayisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        ogretmenSayisi.setForeground(new java.awt.Color(70, 90, 101));
        ogretmenSayisi.setText("Toplam Öğretmen Sayısı : ");

        mesajYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        personelSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        personelSayisiYazisi.setForeground(new java.awt.Color(70, 90, 101));
        personelSayisiYazisi.setText("Toplam Personel Sayısı : ");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addGap(0, 102, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actionPanelLayout.createSequentialGroup()
                        .addComponent(soyadYazisi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(personelNoYazisi))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tcNoYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tcNoAlani)
                            .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefonNoYazisi)
                            .addComponent(cinsiyetYazisi))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinsiyetSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(personelNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(personelAraYazisi))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(personelSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(actionPanelLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(mesajYazisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ogretmenSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tcNoYazisi)
                                    .addComponent(tcNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adYazisi)
                                    .addComponent(adAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cinsiyetSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cinsiyetYazisi))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(telefonNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonNoYazisi))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyadAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(personelNoYazisi)
                            .addComponent(soyadYazisi)
                            .addComponent(personelNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(olusturButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(personelAraYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personelSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(actionPanelLayout.createSequentialGroup()
                    .addGap(319, 319, 319)
                    .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mesajYazisi1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ogretmenSayisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(310, Short.MAX_VALUE)))
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
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE))
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

    private void bannerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPanelMouseClicked
        tcNoAlani.setText("");
        adAlani.setText("");
        soyadAlani.setText("");
        cinsiyetSecimi.setSelectedIndex(0);
        telefonNumarasiAlani.setText("");
        personelNoAlani.setText("");
    }//GEN-LAST:event_bannerPanelMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        personelTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void araAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araAlaniKeyReleased
        String ara = araAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_araAlaniKeyReleased

    private void personelTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_personelTablosuMouseClicked
        mesajYazisi.setText("");

        int selectedRow = personelTablosu.getSelectedRow();

        String tcNo = model.getValueAt(selectedRow, 0).toString();
        tcNoAlani.setText(tcNo);

        String no = model.getValueAt(selectedRow, 1).toString();
        personelNoAlani.setText(no);

        String adSoyad = model.getValueAt(selectedRow, 2).toString();
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

        String cinsiyet = model.getValueAt(selectedRow, 3).toString();
        cinsiyetSecimi.setSelectedIndex(KisiselBilgilerIslemleri.cinsiyetSec(cinsiyet));

        String telefonNumarasi = model.getValueAt(selectedRow, 4).toString();
        telefonNumarasiAlani.setText(telefonNumarasi);
    }//GEN-LAST:event_personelTablosuMouseClicked

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

        if (personelNoAlani.getText().equals("")) {
            no = 0;
        } else {
            no = Integer.parseInt(personelNoAlani.getText());
        }

        if (personelIslemleri.isPersonelNo(no)) {
            mesajYazisi.setText("Bu Personel Sistemde Zaten Kayıtlı Olduğundan Yeni Bir Personel No Oluşturamazsınız!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            int personelNo = personelIslemleri.noOlustur();
            personelNoAlani.setText(String.valueOf(personelNo));
        }
    }//GEN-LAST:event_olusturButtonActionPerformed

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        if (tcNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personelin TC'sini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (tcNoAlani.getText().length() != 11) {
            mesajYazisi.setText("Lütfen Personelin TC'sini Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personelin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personelin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (cinsiyetSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Personelin Cinsiyetini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (personelNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personel No Oluşturun!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String tcNo = tcNoAlani.getText().trim();
            int no = Integer.parseInt(personelNoAlani.getText());
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText().trim();
            String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuSQL(cinsiyetSecimi.getSelectedIndex());
            String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());

            if (personelIslemleri.isPersonelNo(no) == false) {
                personelIslemleri.ekle(tcNo, no, ad, soyad, cinsiyet, telefonNumarasi);

                personelGoruntule();

                mesajYazisi.setText(ad + " " + soyad + " Adlı Personel Başarıyla Eklendi.");
                mesajYazisi.setForeground(new Color(0, 226, 0));

                tcNoAlani.setText("");
                adAlani.setText("");
                soyadAlani.setText("");
                cinsiyetSecimi.setSelectedIndex(0);
                telefonNumarasiAlani.setText("");
                personelNoAlani.setText("");
            } else {
                mesajYazisi.setText(ad + " " + soyad + " Adlı Personel Sistemde Zaten Kayıtlı!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = personelTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Personel Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Bilgileri Güncellenecek Bir Personel Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        }
        if (tcNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personelin TC'sini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (tcNoAlani.getText().length() != 11) {
            mesajYazisi.setText("Lütfen Personelin TC'sini Eksiksiz Girdiğinizden Emin Olunuz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (adAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personelin Adını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (soyadAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personelin Soyadını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (cinsiyetSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Personelin Cinsiyetini Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (personelNoAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Personel No Oluşturun!");
            mesajYazisi.setForeground(Color.RED);
        } else if (KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText()).equals("")) {
            mesajYazisi.setText("Lütfen Telefon Numarasını Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {
            String tcNo = tcNoAlani.getText().trim();
            int no = Integer.parseInt(personelNoAlani.getText());
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText().trim();
            String cinsiyet = KisiselBilgilerIslemleri.cinsiyetIsimDonusumuSQL(cinsiyetSecimi.getSelectedIndex());
            String telefonNumarasi = KisiselBilgilerIslemleri.telefonNumarasiDonusturSQL(telefonNumarasiAlani.getText());

            personelIslemleri.guncelle(tcNo, no, ad, soyad, cinsiyet, telefonNumarasi);

            personelGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Personel Bilgileri Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            tcNoAlani.setText("");
            adAlani.setText("");
            soyadAlani.setText("");
            cinsiyetSecimi.setSelectedIndex(0);
            telefonNumarasiAlani.setText("");
            personelNoAlani.setText("");
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = personelTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Personel Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Personel Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            String ad = adAlani.getText();
            String soyad = soyadAlani.getText();
            int no = Integer.parseInt(personelNoAlani.getText());

            personelIslemleri.sil(no);

            personelGoruntule();

            mesajYazisi.setText(ad + " " + soyad + " Adlı Personel Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            tcNoAlani.setText("");
            adAlani.setText("");
            soyadAlani.setText("");
            cinsiyetSecimi.setSelectedIndex(0);
            telefonNumarasiAlani.setText("");
            personelNoAlani.setText("");
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
            java.util.logging.Logger.getLogger(PersonelBilgileriEkran.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new PersonelBilgileriEkran().setVisible(true);
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
    private javax.swing.JButton ekleButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel mesajYazisi1;
    private javax.swing.JLabel ogretmenSayisi;
    private javax.swing.JButton olusturButton;
    private javax.swing.JLabel personelAraYazisi;
    private javax.swing.JLabel personelBilgileriYazisi;
    private javax.swing.JTextField personelNoAlani;
    private javax.swing.JLabel personelNoYazisi;
    private javax.swing.JLabel personelSayisiYazisi;
    private javax.swing.JTable personelTablosu;
    private javax.swing.JButton silButton;
    private javax.swing.JTextField soyadAlani;
    private javax.swing.JLabel soyadYazisi;
    private javax.swing.JTextField tcNoAlani;
    private javax.swing.JLabel tcNoYazisi;
    private javax.swing.JLabel telefonNoYazisi;
    private javax.swing.JFormattedTextField telefonNumarasiAlani;
    // End of variables declaration//GEN-END:variables
}
