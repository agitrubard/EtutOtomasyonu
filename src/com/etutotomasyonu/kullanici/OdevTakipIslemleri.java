package com.etutotomasyonu.kullanici;

import com.etutotomasyonu.DersIslemleri;
import com.etutotomasyonu.veritabani.VeritabaniIslemleri;
import com.etutotomasyonu.kullanici.ogretmen.OgretmenIslemleri;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author agitrubardemir
 */
public class OdevTakipIslemleri {

    private final Connection con = VeritabaniIslemleri.con;
    private Statement statement;
    private PreparedStatement preparedStatement = null;
    OgretmenIslemleri ogretmenIslemleri = new OgretmenIslemleri();
    DersIslemleri dersIslemleri = new DersIslemleri();

    public void odevEkle(int sinifKodu, int ogretmenNo, int dersKodu, String odevKonusu, String verilisTarihi, String teslimTarihi) {
        String sorgu = "INSERT INTO OdevTakip (SinifKodu, OgretmenNo, DersKodu, OdevKonusu, VerilisTarihi, TeslimTarihi) VALUES (?,?,?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, sinifKodu);
            preparedStatement.setInt(2, ogretmenNo);
            preparedStatement.setInt(3, dersKodu);
            preparedStatement.setString(4, odevKonusu);
            preparedStatement.setString(5, verilisTarihi);
            preparedStatement.setString(6, teslimTarihi);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void odevGuncelle(int odevID, int sinifKodu, int ogretmenNo, int dersKodu, String odevKonusu, String verilisTarihi, String teslimTarihi) {
        String sorgu = "UPDATE OdevTakip SET SinifKodu = ? , OgretmenNo = ? , DersKodu = ? , OdevKonusu = ? , VerilisTarihi = ? , TeslimTarihi = ? WHERE OdevID = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, sinifKodu);
            preparedStatement.setInt(2, ogretmenNo);
            preparedStatement.setInt(3, dersKodu);
            preparedStatement.setString(4, odevKonusu);
            preparedStatement.setString(5, verilisTarihi);
            preparedStatement.setString(6, teslimTarihi);
            preparedStatement.setInt(7, odevID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void odevSil(int odevID) {
        String sorgu = "DELETE FROM OdevTakip WHERE OdevID = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);

            preparedStatement.setInt(1, odevID);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<OdevTakip> odevleriGetirOgrenci(int sinifKodu) {
        var list = new ArrayList<OdevTakip>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OdevTakip WHERE SinifKodu = " + sinifKodu;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int odevID = result.getInt("OdevID");
                String dersAdi = dersIslemleri.dersAdiBul(result.getInt("DersKodu"));
                String ogretmenAdi = ogretmenIslemleri.ogretmenAdiBul(result.getString("OgretmenNo"));
                String odevKonusu = result.getString("OdevKonusu");
                String verilisTarihi = result.getString("VerilisTarihi");
                String teslimTarihi = result.getString("TeslimTarihi");

                list.add(new OdevTakip(odevID, dersAdi, ogretmenAdi, odevKonusu, verilisTarihi, teslimTarihi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<OdevTakip> odevleriGetirOgretmen(int ogretmenNo) {
        ArrayList<OdevTakip> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OdevTakip WHERE OgretmenNo = " + ogretmenNo;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int odevID = result.getInt("OdevID");
                String dersAdi = dersIslemleri.dersAdiBul(result.getInt("DersKodu"));
                String ogretmenAdi = ogretmenIslemleri.ogretmenAdiBul(result.getString("OgretmenNo"));
                String odevKonusu = result.getString("OdevKonusu");
                String verilisTarihi = result.getString("VerilisTarihi");
                String teslimTarihi = result.getString("TeslimTarihi");

                list.add(new OdevTakip(odevID, dersAdi, ogretmenAdi, odevKonusu, verilisTarihi, teslimTarihi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public ArrayList<OdevTakip> tumOdevleriGetir() {
        ArrayList<OdevTakip> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM OdevTakip";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int odevID = result.getInt("OdevID");
                String dersAdi = dersIslemleri.dersAdiBul(result.getInt("DersKodu"));
                String ogretmenAdi = ogretmenIslemleri.ogretmenAdiBul(result.getString("OgretmenNo"));
                String odevKonusu = result.getString("OdevKonusu");
                String verilisTarihi = result.getString("VerilisTarihi");
                String teslimTarihi = result.getString("TeslimTarihi");

                list.add(new OdevTakip(odevID, dersAdi, ogretmenAdi, odevKonusu, verilisTarihi, teslimTarihi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int sinifKoduBul(int odevID) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT SinifKodu FROM OdevTakip WHERE OdevID = " + odevID;

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int sinifKodu = result.getInt("SinifKodu");
                return sinifKodu;
            }
        } catch (SQLException ex) {
            Logger.getLogger(OdevTakipIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }
}
