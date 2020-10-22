package com.etutotomasyonu.kullanici.ogrenci;

import com.etutotomasyonu.kullanici.OdevTakip;
import com.etutotomasyonu.kullanici.OdevTakipIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
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
    }

    public void odevGoruntule() {
        model.setRowCount(0);

        ArrayList<OdevTakip> odevler = new ArrayList<>();
        int odevSayisi = 0;

        int sinifKodu = OgrenciIslemleri.girisYapanOgrenci.getSinifKodu();

        odevler = odevTakipIslemleri.odevleriGetirOgrenci(sinifKodu);

        if (odevler != null) {
            for (OdevTakip odev : odevler) {
                String tarih;
                tarih = odev.getVerilisTarihi();
                String verilisTarihi = tarihDonusumu(tarih);
                tarih = odev.getTeslimTarihi();
                String teslimTarihi = tarihDonusumu(tarih);
                Object[] eklenecek = {odev.getDersAdi(), odev.getOgretmenAdi(), odev.getOdevKonusu(), verilisTarihi, teslimTarihi};

                model.addRow(eklenecek);
                odevSayisi++;
            }
            odevSayisiYazisi.setText("Verilen Ödev Sayısı : " + odevSayisi);
        }
    }

    public String tarihDonusumu(String tarih) {
        String[] split = tarih.split("-");
        String yil = split[0];
        String ay = split[1];
        String gun = split[2];

        return gun + "/" + ay + "/" + yil;
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
        odevAraYazisi = new javax.swing.JLabel();
        araAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        odevTablosu = new javax.swing.JTable();
        odevSayisiYazisi = new javax.swing.JLabel();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 663, Short.MAX_VALUE)
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

        odevAraYazisi.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        odevAraYazisi.setForeground(new java.awt.Color(70, 90, 101));
        odevAraYazisi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        odevAraYazisi.setText("Ödev Ara : ");
        odevAraYazisi.setToolTipText("Aşağıya aramak istediğiniz ödevin bilgisini giriniz.");

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

        odevTablosu.setBackground(new java.awt.Color(255, 255, 255));
        odevTablosu.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        odevTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ders Adı", "Öğretmen Adı", "Ödev Konusu", "Veriliş Tarihi", "Teslim Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        odevTablosu.setRowHeight(20);
        odevTablosu.setSelectionBackground(new java.awt.Color(255, 183, 78));
        odevTablosu.setSelectionForeground(new java.awt.Color(70, 90, 101));
        jScrollPane1.setViewportView(odevTablosu);
        if (odevTablosu.getColumnModel().getColumnCount() > 0) {
            odevTablosu.getColumnModel().getColumn(0).setResizable(false);
            odevTablosu.getColumnModel().getColumn(0).setPreferredWidth(-100);
            odevTablosu.getColumnModel().getColumn(1).setResizable(false);
            odevTablosu.getColumnModel().getColumn(2).setResizable(false);
            odevTablosu.getColumnModel().getColumn(2).setPreferredWidth(300);
            odevTablosu.getColumnModel().getColumn(3).setResizable(false);
            odevTablosu.getColumnModel().getColumn(3).setPreferredWidth(0);
            odevTablosu.getColumnModel().getColumn(4).setResizable(false);
            odevTablosu.getColumnModel().getColumn(4).setPreferredWidth(0);
        }

        odevSayisiYazisi.setFont(new java.awt.Font("SF Pro Display", 1, 14)); // NOI18N
        odevSayisiYazisi.setForeground(new java.awt.Color(70, 90, 101));
        odevSayisiYazisi.setText("Verilen Ödev Sayısı : ");

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(odevAraYazisi)
                            .addGroup(actionPanelLayout.createSequentialGroup()
                                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(odevSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(odevAraYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(odevSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
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
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        odevTablosu.setRowSorter(rowSorter);

        rowSorter.setRowFilter(RowFilter.regexFilter(ara));
    }

    private void araAlaniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_araAlaniKeyReleased
        String ara = araAlani.getText();

        dinamikAra(ara);
    }//GEN-LAST:event_araAlaniKeyReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OgrenciEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kapamaButton;
    private javax.swing.JPanel kapamaPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel odevAraYazisi;
    private javax.swing.JLabel odevSayisiYazisi;
    private javax.swing.JTable odevTablosu;
    private javax.swing.JLabel ogrenciYazisi;
    // End of variables declaration//GEN-END:variables
}
