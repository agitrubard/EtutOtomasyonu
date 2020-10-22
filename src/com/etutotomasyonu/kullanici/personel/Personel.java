package com.etutotomasyonu.kullanici.personel;

/**
 * @author agitrubardemir
 */
public class Personel {

    private String tcNo;
    private int no;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String telefonNumarasi;

    public Personel(String tcNo, int no, String ad, String soyad, String cinsiyet, String telefonNumarasi) {
        this.tcNo = tcNo;
        this.no = no;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }
}
