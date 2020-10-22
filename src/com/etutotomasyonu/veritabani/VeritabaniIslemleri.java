package com.etutotomasyonu.veritabani;

import com.etutotomasyonu.EtutOtomasyonu;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author agitrubardemir
 */
public class VeritabaniIslemleri {

    public static Connection con = null;
    private static PreparedStatement preparedStatement = null;

    public VeritabaniIslemleri() {
        String url = "jdbc:mysql://" + Veritabani.host + ":" + Veritabani.port + "/" + Veritabani.name;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver bulunamadı!");
        }
        try {
            con = DriverManager.getConnection(url, Veritabani.username, Veritabani.password);
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız!");
        }
    }

    public boolean girisYap(String tcNo, String etutNo) {
        int kontrol = EtutOtomasyonu.kontrolSayisi;
        String sorgu = "";

        switch (kontrol) {
            case 1:
                sorgu = "SELECT * FROM OgrenciBilgileri WHERE TCNo = ? AND OgrenciNo = ?";
                break;
            case 2:
                sorgu = "SELECT * FROM OgretmenBilgileri WHERE TCNo = ? AND OgretmenNo = ?";
                break;
            case 3:
                sorgu = "SELECT * FROM PersonelBilgileri WHERE TCNo = ? AND PersonelNo = ?";
                break;
        }

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, tcNo);
            preparedStatement.setString(2, etutNo);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean kontrolet(String etutNo) {
        int kontrol = 1;
        String sorgu = "";

        switch (kontrol) {
            case 1:
                sorgu = "SELECT * FROM OgrenciBilgileri WHERE OgrenciNo = ?";
                break;
            case 2:
                sorgu = "SELECT * FROM OgretmenBilgileri WHERE TCNo = ? AND OgretmenNo = ?";
                break;
            case 3:
                sorgu = "SELECT * FROM PersonelBilgileri WHERE TCNo = ? AND PersonelNo = ?";
                break;
        }

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setString(1, etutNo);

            ResultSet result = preparedStatement.executeQuery();

            return result.next();
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
