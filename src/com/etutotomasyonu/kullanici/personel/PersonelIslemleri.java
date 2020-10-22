package com.etutotomasyonu.kullanici.personel;

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
public class PersonelIslemleri {

    private Connection con = VeritabaniIslemleri.con;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    public static Personel girisYapanPersonel;

    public PersonelIslemleri() {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM PersonelBilgileri WHERE PersonelNo = " + KullaniciGirisi.etutNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int personelNo = result.getInt("PersonelNo");
                String personelAd = result.getString("PersonelAd");
                String personelSoyad = result.getString("PersonelSoyad");
                String personelCinsiyet = result.getString("PersonelCinsiyet");
                String personelTelNo = result.getString("PersonelTelNo");

                girisYapanPersonel = new Personel(tcNo, personelNo, personelAd, personelSoyad, personelCinsiyet, personelTelNo);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Personel> tumPersonelleriGetir() {
        ArrayList<Personel> list = new ArrayList<Personel>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM PersonelBilgileri ORDER BY PersonelBilgileri.PersonelAd ASC";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String tcNo = result.getString("TCNo");
                int no = result.getInt("PersonelNo");
                String ad = result.getString("PersonelAd");
                String soyad = result.getString("PersonelSoyad");
                String cinsiyet = result.getString("PersonelCinsiyet");
                String telefonNumarasi = result.getString("PersonelTelNo");

                list.add(new Personel(tcNo, no, ad, soyad, cinsiyet, telefonNumarasi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public void ekle(String tcNo, int no, String ad, String soyad, String cinsiyet, String telefonNumarasi) {
        String sorgu = "INSERT INTO PersonelBilgileri (TCNo, PersonelNo, PersonelAd, PersonelSoyad, PersonelCinsiyet, PersonelTelNo) VALUES (?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcNo);
            preparedStatement.setInt(2, no);
            preparedStatement.setString(3, ad);
            preparedStatement.setString(4, soyad);
            preparedStatement.setString(5, cinsiyet);
            preparedStatement.setString(6, telefonNumarasi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guncelle(String tcNo, int no, String ad, String soyad, String cinsiyet, String telefonNumarasi) {
        String sorgu = "UPDATE PersonelBilgileri SET TCNo = ? , PersonelAd = ? , PersonelSoyad = ? , PersonelCinsiyet = ? , PersonelTelNo = ? WHERE PersonelNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcNo);
            preparedStatement.setString(2, ad);
            preparedStatement.setString(3, soyad);
            preparedStatement.setString(4, cinsiyet);
            preparedStatement.setString(5, telefonNumarasi);
            preparedStatement.setInt(6, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void telefonNumarasiGuncelle(String no, String telefonNumarasi) {
        String sorgu = "UPDATE PersonelBilgileri SET PersonelTelNo = ? WHERE PersonelNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, telefonNumarasi);
            preparedStatement.setString(2, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void sil(int no) {
        String sorgu = "DELETE FROM PersonelBilgileri WHERE PersonelNo = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean isPersonelNo(int no) {
        try {
            String sorgu = "SELECT * FROM PersonelBilgileri WHERE PersonelNo = ?";
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, no);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(PersonelIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int noOlustur() {
        Random random = new Random();
        while (true) {
            String sayi = String.valueOf(1 + random.nextInt(98));
            if (sayi.length() == 1) {
                sayi = "0" + sayi;
            }
            
            int no = Integer.parseInt(99 + sayi);
            if (isPersonelNo(no) == false) {
                return no;
            }
        }
    }
}
