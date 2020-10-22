package com.etutotomasyonu.kullanici.ogretmen;

import com.etutotomasyonu.kullanici.KisiselBilgilerIslemleri;
import com.etutotomasyonu.kullanici.OdevTakip;
import com.etutotomasyonu.kullanici.OdevTakipIslemleri;
import com.etutotomasyonu.kullanici.SinifIslemleri;
import com.etutotomasyonu.kullanici.ogrenci.OgrenciIslemleri;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author agitrubardemir
 */
public class OdevTakipEkran extends javax.swing.JFrame {

    DefaultTableModel model;
    OdevTakipIslemleri odevTakipIslemleri = new OdevTakipIslemleri();
    SinifIslemleri sinifIslemleri = new SinifIslemleri();
    OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();

    int mouseX, mouseY;

    public OdevTakipEkran() {
        initComponents();

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);

        model = (DefaultTableModel) odevTablosu.getModel();
        odevGoruntule();
        teslimTarihiAlani.setText(gununTarihi());
    }

    public void odevGoruntule() {
        model.setRowCount(0);

        ArrayList<OdevTakip> odevler = new ArrayList<>();
        int odevSayisi = 0;

        int ogretmenNo = OgretmenIslemleri.girisYapanOgretmen.getNo();

        odevler = odevTakipIslemleri.odevleriGetirOgretmen(ogretmenNo);

        if (odevler != null) {
            for (OdevTakip odev : odevler) {
                String verilisTarihi = KisiselBilgilerIslemleri.tarihDonusumu(odev.getVerilisTarihi());
                String teslimTarihi = KisiselBilgilerIslemleri.tarihDonusumu(odev.getTeslimTarihi());
                int sinifKodu = odevTakipIslemleri.sinifKoduBul(odev.getOdevID());
                String sinif = sinifIslemleri.sinifAdiBul(sinifKodu);

                Object[] eklenecek = {odev.getOdevID(), sinif, odev.getOdevKonusu(), verilisTarihi, teslimTarihi};

                model.addRow(eklenecek);
                odevSayisi++;
            }
            odevSayisiYazisi.setText("Verilen Ödev Sayısı : " + odevSayisi);
        }
    }

    private String gununTarihiSQL() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime ldt = LocalDateTime.now();
        return dtf.format(ldt);
    }

    private String gununTarihi() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime ldt = LocalDateTime.now();
        return dtf.format(ldt);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        odevTablosu = new javax.swing.JTable();
        sinifYazisi = new javax.swing.JLabel();
        odevKonusuYazisi = new javax.swing.JLabel();
        teslimTarihiYazisi = new javax.swing.JLabel();
        odevKonusuAlani = new javax.swing.JTextField();
        sinifSecimi = new javax.swing.JComboBox<>();
        ekleButton = new javax.swing.JButton();
        guncelleButton = new javax.swing.JButton();
        silButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        teslimTarihiAlani = new javax.swing.JFormattedTextField();
        araAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        odevAraYazisi = new javax.swing.JLabel();
        odevSayisiYazisi = new javax.swing.JLabel();
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

        ogrenciYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 36)); // NOI18N
        ogrenciYazisi.setForeground(new java.awt.Color(255, 255, 255));
        ogrenciYazisi.setText("ÖDEV TAKİP");

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
                .addGap(15, 15, 15)
                .addComponent(logo)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bannerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ogrenciYazisi)
                .addGap(24, 24, 24))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        odevTablosu.setBackground(new java.awt.Color(255, 255, 255));
        odevTablosu.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        odevTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ödev No", "Sınıf", "Ödev Konusu", "Veriliş Tarihi", "Teslim Tarihi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        odevTablosu.setRowHeight(20);
        odevTablosu.setSelectionBackground(new java.awt.Color(255, 183, 78));
        odevTablosu.setSelectionForeground(new java.awt.Color(70, 90, 101));
        odevTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odevTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(odevTablosu);
        if (odevTablosu.getColumnModel().getColumnCount() > 0) {
            odevTablosu.getColumnModel().getColumn(0).setResizable(false);
            odevTablosu.getColumnModel().getColumn(0).setPreferredWidth(120);
            odevTablosu.getColumnModel().getColumn(1).setResizable(false);
            odevTablosu.getColumnModel().getColumn(1).setPreferredWidth(280);
            odevTablosu.getColumnModel().getColumn(2).setResizable(false);
            odevTablosu.getColumnModel().getColumn(2).setPreferredWidth(1000);
            odevTablosu.getColumnModel().getColumn(3).setResizable(false);
            odevTablosu.getColumnModel().getColumn(3).setPreferredWidth(180);
            odevTablosu.getColumnModel().getColumn(4).setResizable(false);
            odevTablosu.getColumnModel().getColumn(4).setPreferredWidth(180);
        }

        sinifYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        sinifYazisi.setForeground(new java.awt.Color(255, 183, 78));
        sinifYazisi.setText("SINIF : ");

        odevKonusuYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        odevKonusuYazisi.setForeground(new java.awt.Color(255, 183, 78));
        odevKonusuYazisi.setText("ÖDEV KONUSU : ");

        teslimTarihiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 20)); // NOI18N
        teslimTarihiYazisi.setForeground(new java.awt.Color(255, 183, 78));
        teslimTarihiYazisi.setText("TESLİM TARİHİ : ");

        odevKonusuAlani.setBackground(new java.awt.Color(70, 90, 101));
        odevKonusuAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        odevKonusuAlani.setForeground(new java.awt.Color(255, 255, 255));
        odevKonusuAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        odevKonusuAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        odevKonusuAlani.setSelectionColor(new java.awt.Color(255, 183, 78));

        sinifSecimi.setBackground(new java.awt.Color(70, 90, 101));
        sinifSecimi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        sinifSecimi.setForeground(new java.awt.Color(255, 255, 255));
        sinifSecimi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Ödevin Verileceği Sınıfı Seçiniz ---", "1. SINIF", "2. SINIF", "3. SINIF - Sayısal", "3. SINIF - Eşit Ağırlık", "4. SINIF - Sayısal", "4. SINIF - Eşit Ağırlık" }));
        sinifSecimi.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        sinifSecimi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        teslimTarihiAlani.setBackground(new java.awt.Color(70, 90, 101));
        teslimTarihiAlani.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        teslimTarihiAlani.setForeground(new java.awt.Color(255, 255, 255));
        try {
            teslimTarihiAlani.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        teslimTarihiAlani.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        teslimTarihiAlani.setToolTipText("");
        teslimTarihiAlani.setCaretColor(new java.awt.Color(255, 255, 255));
        teslimTarihiAlani.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        teslimTarihiAlani.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N

        araAlani.setBackground(new java.awt.Color(255, 255, 255));
        araAlani.setFont(new java.awt.Font("SF Pro Rounded", 0, 18)); // NOI18N
        araAlani.setForeground(new java.awt.Color(70, 90, 101));
        araAlani.setToolTipText("Aramak istediğiniz ödevin bilgisini giriniz.");
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

        odevAraYazisi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        odevAraYazisi.setForeground(new java.awt.Color(70, 90, 101));
        odevAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        odevAraYazisi.setText("Ödev Ara : ");
        odevAraYazisi.setToolTipText("Aşağıya aramak istediğiniz ödevin bilgisini giriniz.");

        odevSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        odevSayisiYazisi.setForeground(new java.awt.Color(70, 90, 101));
        odevSayisiYazisi.setText("Verilen Ödev Sayısı : ");

        mesajYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        mesajYazisi.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(odevKonusuYazisi)
                                .addComponent(sinifYazisi))
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(teslimTarihiYazisi)))
                        .addGap(4, 4, 4)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(odevKonusuAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sinifSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teslimTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(odevAraYazisi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odevSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1))
                        .addContainerGap())))
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinifSecimi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinifYazisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odevKonusuAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odevKonusuYazisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teslimTarihiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teslimTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(odevAraYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guncelleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(silButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odevSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void bannerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bannerPanelMouseClicked
        sinifSecimi.setSelectedIndex(0);
        odevKonusuAlani.setText("");
        teslimTarihiAlani.setText(gununTarihi());
    }//GEN-LAST:event_bannerPanelMouseClicked

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        odevTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void araAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araAlaniKeyReleased
        String ara = araAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_araAlaniKeyReleased

    private void odevTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odevTablosuMouseClicked
        int selectedRow = odevTablosu.getSelectedRow();
        String sinifAdi = model.getValueAt(selectedRow, 1).toString();
        int sinifKodu = sinifIslemleri.sinifKoduBul(sinifAdi);
        sinifSecimi.setSelectedIndex(sinifIslemleri.sinifSec(sinifKodu));
        odevKonusuAlani.setText(model.getValueAt(selectedRow, 2).toString());
        teslimTarihiAlani.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_odevTablosuMouseClicked

    private void ekleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ekleButtonActionPerformed
        mesajYazisi.setText("");

        if (sinifSecimi.getSelectedIndex() == 0) {
            mesajYazisi.setText("Lütfen Bir Sınıf Seçiniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (odevKonusuAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Ödev Konusunu Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else if (teslimTarihiAlani.getText().trim().equals("")) {
            mesajYazisi.setText("Lütfen Teslim Tarihini Giriniz!");
            mesajYazisi.setForeground(Color.RED);
        } else {

            int sinifKodu = sinifIslemleri.sinifKoduSec(sinifSecimi.getSelectedIndex());
            int ogretmenNo = OgretmenIslemleri.girisYapanOgretmen.getNo();
            int dersKodu = OgretmenIslemleri.girisYapanOgretmen.getDersKodu();
            String odevKonusu = odevKonusuAlani.getText();
            String verilisTarihi = gununTarihiSQL();
            String geciciTeslimTarihi = teslimTarihiAlani.getText();
            String teslimTarihi = KisiselBilgilerIslemleri.tarihDonusumuSQL(geciciTeslimTarihi);

            odevTakipIslemleri.odevEkle(sinifKodu, ogretmenNo, dersKodu, odevKonusu, verilisTarihi, teslimTarihi);

            odevGoruntule();

            mesajYazisi.setText("Ödev Başarıyla Eklendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            sinifSecimi.setSelectedIndex(0);
            odevKonusuAlani.setText("");
            teslimTarihiAlani.setText(gununTarihi());
        }
    }//GEN-LAST:event_ekleButtonActionPerformed

    private void guncelleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncelleButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = odevTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Ödev Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Güncellenecek Bir Ödev Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            int sinifKodu = sinifIslemleri.sinifKoduSec(sinifSecimi.getSelectedIndex());
            int ogretmenNo = OgretmenIslemleri.girisYapanOgretmen.getNo();
            int dersKodu = OgretmenIslemleri.girisYapanOgretmen.getDersKodu();
            String odevKonusu = odevKonusuAlani.getText();
            String verilisTarihi = gununTarihiSQL();
            String geciciTeslimTarihi = teslimTarihiAlani.getText();
            String teslimTarihi = KisiselBilgilerIslemleri.tarihDonusumuSQL(geciciTeslimTarihi);

            int odevID = (int) model.getValueAt(selectedRow, 0);
            odevTakipIslemleri.odevGuncelle(odevID, sinifKodu, ogretmenNo, dersKodu, odevKonusu, verilisTarihi, teslimTarihi);

            odevGoruntule();

            mesajYazisi.setText("Ödev Başarıyla Güncellendi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            sinifSecimi.setSelectedIndex(0);
            odevKonusuAlani.setText("");
            teslimTarihiAlani.setText(gununTarihi());
        }
    }//GEN-LAST:event_guncelleButtonActionPerformed

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed
        mesajYazisi.setText("");

        int selectedRow = odevTablosu.getSelectedRow();

        if (selectedRow == -1) {
            if (model.getRowCount() == 0) {
                mesajYazisi.setText("Ödev Tablonuz Şu Anda Boş!");
                mesajYazisi.setForeground(Color.RED);
            } else {
                mesajYazisi.setText("Lütfen Silinecek Bir Ödev Seçiniz!");
                mesajYazisi.setForeground(Color.RED);
            }
        } else {
            int odevID = (int) model.getValueAt(selectedRow, 0);
            odevTakipIslemleri.odevSil(odevID);
            odevGoruntule();
            mesajYazisi.setText("Ödev Başarıyla Silindi.");
            mesajYazisi.setForeground(new Color(0, 226, 0));

            sinifSecimi.setSelectedIndex(0);
            odevKonusuAlani.setText("");
            teslimTarihiAlani.setText(gununTarihi());
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
            java.util.logging.Logger.getLogger(OdevTakipEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new OdevTakipEkran().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionPanel;
    private javax.swing.JPanel anaPanel;
    private javax.swing.JTextField araAlani;
    private javax.swing.JSeparator araSeparator;
    private javax.swing.JPanel bannerPanel;
    private javax.swing.JButton ekleButton;
    private javax.swing.JButton guncelleButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel mesajYazisi;
    private javax.swing.JLabel odevAraYazisi;
    private javax.swing.JTextField odevKonusuAlani;
    private javax.swing.JLabel odevKonusuYazisi;
    private javax.swing.JLabel odevSayisiYazisi;
    private javax.swing.JTable odevTablosu;
    private javax.swing.JLabel ogrenciYazisi;
    private javax.swing.JButton silButton;
    private javax.swing.JComboBox<String> sinifSecimi;
    private javax.swing.JLabel sinifYazisi;
    private javax.swing.JFormattedTextField teslimTarihiAlani;
    private javax.swing.JLabel teslimTarihiYazisi;
    // End of variables declaration//GEN-END:variables
}
