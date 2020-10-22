package com.etutotomasyonu.kullanici.ogrenci;

import com.etutotomasyonu.veritabani.VeritabaniIslemleri;
import com.etutotomasyonu.kullanici.KullaniciGirisi;
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
public class OgrenciIslemleri {

    private final Connection con = VeritabaniIslemleri.con;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Ogrenci girisYapanOgrenci;

    public OgrenciIslemleri() {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OgrenciBilgileri WHERE OgrenciNo = " + KullaniciGirisi.etutNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int ogrenciNo = result.getInt("OgrenciNo");
                int sinifKodu = result.getInt("SinifKodu");
                String ogrenciAd = result.getString("OgrenciAd");
                String ogrenciSoyad = result.getString("OgrenciSoyad");
                String dogumTarihi = result.getString("DogumTarihi");
                String ogrenciCinsiyet = result.getString("OgrenciCinsiyet");
                String ogrenciTelNo = result.getString("OgrenciTelNo");
                String veliAdSoyad = result.getString("VeliAdSoyad");
                String veliTelNo = result.getString("VeliTelNo");

                girisYapanOgrenci = new Ogrenci(tcNo, ogrenciNo, sinifKodu, ogrenciAd, ogrenciSoyad, dogumTarihi, ogrenciCinsiyet, ogrenciTelNo, veliAdSoyad, veliTelNo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Ogrenci> tumOgrencileriGetir() {
        ArrayList<Ogrenci> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OgrenciBilgileri ORDER BY OgrenciBilgileri.OgrenciAd ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int ogrenciNo = result.getInt("OgrenciNo");
                int sinifKodu = result.getInt("SinifKodu");
                String ogrenciAd = result.getString("OgrenciAd");
                String ogrenciSoyad = result.getString("OgrenciSoyad");
                String dogumTarihi = result.getString("DogumTarihi");
                String ogrenciCinsiyet = result.getString("OgrenciCinsiyet");
                String ogrenciTelNo = result.getString("OgrenciTelNo");
                String veliAdSoyad = result.getString("VeliAdSoyad");
                String veliTelNo = result.getString("VeliTelNo");
                list.add(new Ogrenci(tcNo, ogrenciNo, sinifKodu, ogrenciAd, ogrenciSoyad, dogumTarihi, ogrenciCinsiyet, ogrenciTelNo, veliAdSoyad, veliTelNo));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<Ogrenci> ogrencileriGetir(int sinifKodu) {
        ArrayList<Ogrenci> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OgrenciBilgileri WHERE SinifKodu = " + sinifKodu + " ORDER BY OgrenciBilgileri.OgrenciAd ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int ogrenciNo = result.getInt("OgrenciNo");
                String ogrenciAd = result.getString("OgrenciAd");
                String ogrenciSoyad = result.getString("OgrenciSoyad");
                String dogumTarihi = result.getString("DogumTarihi");
                String ogrenciCinsiyet = result.getString("OgrenciCinsiyet");
                String ogrenciTelNo = result.getString("OgrenciTelNo");
                String veliAdSoyad = result.getString("VeliAdSoyad");
                String veliTelNo = result.getString("VeliTelNo");
                list.add(new Ogrenci(tcNo, ogrenciNo, sinifKodu, ogrenciAd, ogrenciSoyad, dogumTarihi, ogrenciCinsiyet, ogrenciTelNo, veliAdSoyad, veliTelNo));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ekle(String tcNo, int no, int sinifKodu, String ad, String soyad, String dogumTarihi, String cinsiyet, String telefonNumarasi, String veliAdSoyad, String veliTelefonNumarasi) {
        String sorgu = "INSERT INTO OgrenciBilgileri (TCNo, OgrenciNo, SinifKodu, OgrenciAd, OgrenciSoyad, DogumTarihi, OgrenciCinsiyet, OgrenciTelNo, VeliAdSoyad, VeliTelNo) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcNo);
            preparedStatement.setInt(2, no);
            preparedStatement.setInt(3, sinifKodu);
            preparedStatement.setString(4, ad);
            preparedStatement.setString(5, soyad);
            preparedStatement.setString(6, dogumTarihi);
            preparedStatement.setString(7, cinsiyet);
            preparedStatement.setString(8, telefonNumarasi);
            preparedStatement.setString(9, veliAdSoyad);
            preparedStatement.setString(10, veliTelefonNumarasi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(String tcNo, int no, int sinifKodu, String ad, String soyad, String dogumTarihi, String cinsiyet, String telefonNumarasi, String veliAdSoyad, String veliTelefonNumarasi) {
        String sorgu;
        boolean kontrol = isOgrenciNo(no);

        if (kontrol) {
            sorgu = "UPDATE OgrenciBilgileri SET TCNo = ? , SinifKodu = ? , OgrenciAd = ? , OgrenciSoyad = ? , DogumTarihi = ? , OgrenciCinsiyet = ? , OgrenciTelNo = ? , VeliAdSoyad = ? , VeliTelNo = ? WHERE OgrenciNo = ?";
        } else {
            sorgu = "UPDATE OgrenciBilgileri SET OgrenciNo = ? , SinifKodu = ? , OgrenciAd = ? , OgrenciSoyad = ? , DogumTarihi = ? , OgrenciCinsiyet = ? , OgrenciTelNo = ? , VeliAdSoyad = ? , VeliTelNo = ? WHERE TCNo = ?";
        }

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(2, sinifKodu);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, dogumTarihi);
            preparedStatement.setString(6, cinsiyet);
            preparedStatement.setString(7, telefonNumarasi);
            preparedStatement.setString(8, veliAdSoyad);
            preparedStatement.setString(9, veliTelefonNumarasi);

            if (kontrol) {
                preparedStatement.setString(1, tcNo);
                preparedStatement.setInt(10, no);
            } else {
                preparedStatement.setString(10, tcNo);
                preparedStatement.setInt(1, no);
            }

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM OgrenciBilgileri WHERE OgrenciNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isOgrenciNo(int no) {
        try {
            String sorgu = "SELECT * FROM OgrenciBilgileri WHERE OgrenciNo = ?";
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur(int sinifKodu) {
        Random random = new Random();
        while (true) {
            String sayi = String.valueOf(1 + random.nextInt(998));
            if (sayi.length() == 2) {
                sayi = "0" + sayi;
            } else if (sayi.length() == 1) {
                sayi = "00" + sayi;
            }
            String sinifKod = String.valueOf(sinifKodu);
            int ogrenciNo = Integer.parseInt(sinifKod + sayi);
            if (isOgrenciNo(ogrenciNo) == false) {
                return ogrenciNo;
            }
        }
    }

    public boolean isOgrenci(String tcNo, int no, int sinifKodu, String ad, String soyad, String dogumTarihi, String cinsiyet, String telefonNumarasi, String veliAdSoyad, String veliTelefonNumarasi) {
        String sorgu = "SELECT * FROM OgrenciBilgileri WHERE TCNo = ?, OgrenciNo = ?,  SinifKodu = ?, OgrenciAd = ?, OgrenciSoyad = ?, DogumTarihi = ?, OgrenciCinsiyet = ?, OgrenciTelNo = ?, VeliAdSoyad = ?, VeliTelNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcNo);
            preparedStatement.setInt(2, no);
            preparedStatement.setInt(3, sinifKodu);
            preparedStatement.setString(4, ad);
            preparedStatement.setString(5, soyad);
            preparedStatement.setString(6, dogumTarihi);
            preparedStatement.setString(7, cinsiyet);
            preparedStatement.setString(8, telefonNumarasi);
            preparedStatement.setString(9, veliAdSoyad);
            preparedStatement.setString(10, veliTelefonNumarasi);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int sinifKoduBul(int ogrenciNo) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT SinifKodu FROM OgrenciBilgileri WHERE OgrenciNo = " + ogrenciNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int sinifKodu = result.getInt("SinifKodu");
                return sinifKodu;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }

    public int sinifSec(int no) {
        String ogrenciNo = String.valueOf(no);
        int sinifKodu = Integer.parseInt(ogrenciNo.substring(0, 5));
        switch (sinifKodu) {
            case 10001:
                return 1;
            case 10002:
                return 2;
            case 12003:
                return 3;
            case 11003:
                return 4;
            case 12004:
                return 5;
            case 11004:
                return 6;
        }
        return 0;
    }
}
