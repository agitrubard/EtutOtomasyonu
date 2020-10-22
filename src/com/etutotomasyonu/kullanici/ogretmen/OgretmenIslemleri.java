package com.etutotomasyonu.kullanici.ogretmen;

import com.etutotomasyonu.veritabani.VeritabaniIslemleri;
import com.etutotomasyonu.kullanici.KullaniciGirisi;
import com.etutotomasyonu.kullanici.ogrenci.OgrenciIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author agitrubardemir
 */
public class OgretmenIslemleri {

    private Connection con = VeritabaniIslemleri.con;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Ogretmen girisYapanOgretmen;

    public OgretmenIslemleri() {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OgretmenBilgileri WHERE OgretmenNo = " + KullaniciGirisi.etutNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int no = result.getInt("OgretmenNo");
                int dersKodu = result.getInt("OgretmenDersKodu");
                String ad = result.getString("OgretmenAd");
                String soyad = result.getString("OgretmenSoyad");
                String cinsiyet = result.getString("OgretmenCinsiyet");
                String telefonNumarasi = result.getString("OgretmenTelNo");

                girisYapanOgretmen = new Ogretmen(tcNo, no, dersKodu, ad, soyad, cinsiyet, telefonNumarasi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Ogretmen> tumOgretmenleriGetir() {
        ArrayList<Ogretmen> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OgretmenBilgileri ORDER BY OgretmenBilgileri.OgretmenAd ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int no = result.getInt("OgretmenNo");
                int dersKodu = result.getInt("OgretmenDersKodu");
                String ad = result.getString("OgretmenAd");
                String soyad = result.getString("OgretmenSoyad");
                String cinsiyet = result.getString("OgretmenCinsiyet");
                String telefonNumarasi = result.getString("OgretmenTelNo");

                list.add(new Ogretmen(tcNo, no, dersKodu, ad, soyad, cinsiyet, telefonNumarasi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ekle(String tcNo, int no, int dersKodu, String ad, String soyad, String cinsiyet, String telefonNumarasi) {
        String sorgu = "INSERT INTO OgretmenBilgileri (TCNo, OgretmenNo, OgretmenDersKodu, OgretmenAd, OgretmenSoyad, OgretmenCinsiyet, OgretmenTelNo) VALUES (?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcNo);
            preparedStatement.setInt(2, no);
            preparedStatement.setInt(3, dersKodu);
            preparedStatement.setString(4, ad);
            preparedStatement.setString(5, soyad);
            preparedStatement.setString(6, cinsiyet);
            preparedStatement.setString(7, telefonNumarasi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(String tcNo, int no, int dersKodu, String ad, String soyad, String cinsiyet, String telefonNumarasi) {
        String sorgu;
        boolean kontrol = isOgretmenNo(no);
        
        if (kontrol) {
            sorgu = "UPDATE OgretmenBilgileri SET TCNo = ? , OgretmenDersKodu = ? , OgretmenAd = ? , OgretmenSoyad = ? , OgretmenCinsiyet = ? , OgretmenTelNo = ? WHERE OgretmenNo = ?";
        } else {
            sorgu = "UPDATE OgretmenBilgileri SET OgretmenNo = ? , OgretmenDersKodu = ? , OgretmenAd = ? , OgretmenSoyad = ? , OgretmenCinsiyet = ? , OgretmenTelNo = ? WHERE TCNo = ?";
        }

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(2, dersKodu);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, cinsiyet);
            preparedStatement.setString(6, telefonNumarasi);

            if (kontrol) {
                preparedStatement.setString(1, tcNo);
                preparedStatement.setInt(7, no);
            } else {
                preparedStatement.setString(7, tcNo);
                preparedStatement.setInt(1, no);
            }

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void telefonNumarasiGuncelle(String no, String telefonNumarasi) {
        String sorgu = "UPDATE OgretmenBilgileri SET OgretmenTelNo = ? WHERE OgretmenNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, telefonNumarasi);
            preparedStatement.setString(2, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM OgretmenBilgileri WHERE OgretmenNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isOgretmenNo(int no) {
        try {
            String sorgu = "SELECT * FROM OgretmenBilgileri WHERE OgretmenNo = ?";
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur(int dersKodu) {
        Random random = new Random();
        while (true) {
            String sayi = String.valueOf(1 + random.nextInt(998));
            if (sayi.length() == 2) {
                sayi = "0" + sayi;
            } else if (sayi.length() == 1) {
                sayi = "00" + sayi;
            }
            int no = Integer.parseInt(3 + String.valueOf(dersKodu) + sayi);
            if (isOgretmenNo(no) == false) {
                return no;
            }
        }
    }

    public String ogretmenAdiBul(String no) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OgretmenBilgileri WHERE OgretmenNo = " + no;

            ResultSet result = statement.executeQuery(sorgu);
            String ad;
            String soyad;
            while (result.next()) {
                ad = result.getString("OgretmenAd");
                soyad = result.getString("OgretmenSoyad");
                return ad + " " + soyad;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OgretmenIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public int dersKoduBul(int no) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT OgretmenDersKodu FROM OgretmenBilgileri WHERE OgretmenNo = " + no;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int dersKodu = result.getInt("DersKodu");
                return dersKodu;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }

    public int dersSec(String ogretmenNo) {
        int dersKodu = Integer.parseInt(ogretmenNo.substring(1, 5));
        switch (dersKodu) {
            case 5001:
                return 1;
            case 5002:
                return 2;
            case 5003:
                return 3;
            case 5004:
                return 4;
            case 5005:
                return 5;
            case 5006:
                return 6;
            case 5007:
                return 7;
            case 5008:
                return 8;
            case 5009:
                return 9;
            case 7001:
                return 10;
            case 7002:
                return 11;
            case 7003:
                return 12;
            case 7004:
                return 13;
            case 7005:
                return 14;
            case 7007:
                return 15;
            case 7008:
                return 16;
            case 7009:
                return 17;
        }
        return 0;
    }
}
