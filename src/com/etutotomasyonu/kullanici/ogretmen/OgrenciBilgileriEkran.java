package com.etutotomasyonu.kullanici.ogretmen;

import com.etutotomasyonu.DersIslemleri;
import com.etutotomasyonu.kullanici.ogrenci.*;
import com.etutotomasyonu.kullanici.SinifIslemleri;
import java.awt.Dimension;
import java.awt.Toolkit;
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
    DersIslemleri dersIslemleri = new DersIslemleri();
    SinifIslemleri sinifIslemleri = new SinifIslemleri();

    int mouseX, mouseY;

    public OgrenciBilgileriEkran() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w) / 2;
        int y = (dim.height - h) / 2;

        this.setLocation(x, y);
        
        model = (DefaultTableModel) ogrenciTablosu.getModel();
        ogrenciGoruntule();
    }

    public void ogrenciGoruntule() {
        model.setRowCount(0);

        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        int ogrenciSayisi = 0;

        ogrenciler = ogrenciIslemleri.tumOgrencileriGetir();

        if (ogrenciler != null) {
            for (Ogrenci ogrenci : ogrenciler) {
                String ogrenciAd = ogrenci.getAd() + " " + ogrenci.getSoyad();
                int sinifKodu = ogrenciIslemleri.sinifKoduBul(ogrenci.getNo());
                String sinif = sinifIslemleri.sinifAdiBul(sinifKodu);
                Object[] eklenecek = {ogrenci.getNo(), ogrenciAd, sinif};

                model.addRow(eklenecek);
                ogrenciSayisi++;
            }
            ogrenciSayisiYazisi.setText("Toplam Öğrenci Sayısı : " + ogrenciSayisi);
        }
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
        ogrenciTablosu = new javax.swing.JTable();
        ogrenciAraYazisi = new javax.swing.JLabel();
        araAlani = new javax.swing.JTextField();
        araSeparator = new javax.swing.JSeparator();
        ogrenciSayisiYazisi = new javax.swing.JLabel();

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
        ogrenciYazisi.setText("ÖĞRENCİ BİLGİLERİ");

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
                .addGap(25, 25, 25))
        );

        actionPanel.setBackground(new java.awt.Color(255, 255, 255));

        ogrenciTablosu.setBackground(new java.awt.Color(255, 255, 255));
        ogrenciTablosu.setFont(new java.awt.Font("SF Pro Display", 0, 14)); // NOI18N
        ogrenciTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Öğrenci No", "Öğrenci Adı", "Sınıf"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ogrenciTablosu.setToolTipText("Öğrenci Bilgilerine");
        ogrenciTablosu.setRowHeight(20);
        ogrenciTablosu.setSelectionBackground(new java.awt.Color(255, 183, 78));
        ogrenciTablosu.setSelectionForeground(new java.awt.Color(70, 90, 101));
        jScrollPane1.setViewportView(ogrenciTablosu);
        if (ogrenciTablosu.getColumnModel().getColumnCount() > 0) {
            ogrenciTablosu.getColumnModel().getColumn(0).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(1).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(1).setPreferredWidth(200);
            ogrenciTablosu.getColumnModel().getColumn(2).setResizable(false);
            ogrenciTablosu.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

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

        javax.swing.GroupLayout actionPanelLayout = new javax.swing.GroupLayout(actionPanel);
        actionPanel.setLayout(actionPanelLayout);
        actionPanelLayout.setHorizontalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionPanelLayout.createSequentialGroup()
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(araSeparator)
                            .addComponent(ogrenciAraYazisi)
                            .addComponent(araAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ogrenciSayisiYazisi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        actionPanelLayout.setVerticalGroup(
            actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actionPanelLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(ogrenciAraYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(actionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(actionPanelLayout.createSequentialGroup()
                        .addComponent(araAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(araSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ogrenciSayisiYazisi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(actionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(anaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);

        ogrenciTablosu.setRowSorter(rowSorter);

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
            new OgrenciBilgileriEkran().setVisible(true);
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
    private javax.swing.JLabel ogrenciAraYazisi;
    private javax.swing.JLabel ogrenciSayisiYazisi;
    private javax.swing.JTable ogrenciTablosu;
    private javax.swing.JLabel ogrenciYazisi;
    // End of variables declaration//GEN-END:variables
}
