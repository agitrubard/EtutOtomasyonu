package com.etutotomasyonu;

import com.etutotomasyonu.veritabani.VeritabaniIslemleri;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author agitrubardemir
 */
public class DersIslemleri {

    private final Connection con = VeritabaniIslemleri.con;
    private Statement statement;

    public ArrayList<Dersler> dersleriGetir() {
        ArrayList<Dersler> list = new ArrayList<>();

        try {
            statement = con.createStatement();

            String sorgu = "SELECT * FROM Dersler";

            ResultSet result = statement.executeQuery(sorgu);

            while (result.next()) {
                int dersKodu = result.getInt("dersKodu");
                String dersAdi = result.getString("dersAdi");

                list.add(new Dersler(dersKodu, dersAdi));
            }
            return list;
        } catch (SQLException ex) {
            Logger.getLogger(DersIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public String dersAdiBul(int dersKodu) {
        try {
            statement = con.createStatement();

            String sorgu = "SELECT DersAdi FROM Dersler WHERE DersKodu = " + dersKodu;

            ResultSet result = statement.executeQuery(sorgu);

            String dersAdi;

            while (result.next()) {
                dersAdi = result.getString("DersAdi");
                return dersAdi;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DersIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    public int dersKoduBul(int dersSecimi) {
        switch (dersSecimi) {
            case 1:
                return 5001;
            case 2:
                return 5002;
            case 3:
                return 5003;
            case 4:
                return 5004;
            case 5:
                return 5005;
            case 6:
                return 5006;
            case 7:
                return 5007;
            case 8:
                return 5008;
            case 9:
                return 5009;
            case 10:
                return 7001;
            case 11:
                return 7002;
            case 12:
                return 7003;
            case 13:
                return 7004;
            case 14:
                return 7005;
            case 15:
                return 7007;
            case 16:
                return 7008;
            case 17:
                return 7009;
        }
        return 0;
    }

}
