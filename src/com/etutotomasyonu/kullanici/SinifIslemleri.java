package com.etutotomasyonu.kullanici;

import com.etutotomasyonu.veritabani.VeritabaniIslemleri;
import com.etutotomasyonu.kullanici.ogrenci.OgrenciIslemleri;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author agitrubardemir
 */
 public class SinifIslemleri {

    private final Connection con = VeritabaniIslemleri.con;
    private Statement statement;

    public ArrayList<Sinif> siniflariGetir() {
        ArrayList<Sinif> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM Siniflar";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int sinifKodu = result.getInt("SinifKodu");
                String sinifAdi = result.getString("SinifAdi");
                list.add(new Sinif(sinifKodu, sinifAdi));
            }
            return list;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(SinifIslemleri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return null;
        }
    }

    public String sinifAdiBul(int sinifKodu) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT SinifAdi FROM Siniflar WHERE SinifKodu = " + sinifKodu;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                String sinifAdi = result.getString("SinifAdi");
                return sinifAdi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OgrenciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public int sinifKoduBul(String sinifAdi) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT SinifKodu FROM Siniflar WHERE SinifAdi = '" + sinifAdi + "'";

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

    public int sinifKoduSec(int sinifSecimi) {
        switch (sinifSecimi) {
            case 1:
                return 10001;
            case 2:
                return 10002;
            case 3:
                return 12003;
            case 4:
                return 11003;
            case 5:
                return 12004;
            case 6:
                return 11004;
        }
        return 0;
    }

    public int sinifSec(int sinifKodu) {
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
