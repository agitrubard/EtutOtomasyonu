package com.etutotomasyonu.kullanici;

/**
 * @author agitrubardemir
 */
public class OdevTakip {

    private int odevID;
    private String dersAdi;
    private String ogretmenAdi;
    private String odevKonusu;
    private String verilisTarihi;
    private String teslimTarihi;

    public OdevTakip(int odevID, String dersAdi, String ogretmenAdi, String odevKonusu, String verilisTarihi, String teslimTarihi) {
        this.odevID = odevID;
        this.dersAdi = dersAdi;
        this.ogretmenAdi = ogretmenAdi;
        this.odevKonusu = odevKonusu;
        this.verilisTarihi = verilisTarihi;
        this.teslimTarihi = teslimTarihi;
    }

    public int getOdevID() {
        return odevID;
    }

    public void setOdevID(int odevID) {
        this.odevID = odevID;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }

    public String getOdevKonusu() {
        return odevKonusu;
    }

    public void setOdevKonusu(String odevKonusu) {
        this.odevKonusu = odevKonusu;
    }

    public String getVerilisTarihi() {
        return verilisTarihi;
    }

    public void setVerilisTarihi(String verilisTarihi) {
        this.verilisTarihi = verilisTarihi;
    }

    public String getTeslimTarihi() {
        return teslimTarihi;
    }

    public void setTeslimTarihi(String teslimTarihi) {
        this.teslimTarihi = teslimTarihi;
    }
}
