package com.etutotomasyonu.kullanici.ogrenci;

/**
 * @author agitrubardemir
 */
public class Ogrenci {

    private String tcNo;
    private int no;
    private int sinifKodu;
    private String ad;
    private String soyad;
    private String dogumTarihi;
    private String cinsiyet;
    private String telefonNumarasi;
    private String veliAdSoyad;
    private String veliTelefonNumarasi;

    public Ogrenci(String tcNo, int no, int sinifKodu, String ad, String soyad, String dogumTarihi, String cinsiyet, String telefonNumarasi, String veliAdSoyad, String veliTelefonNumarasi) {
        this.tcNo = tcNo;
        this.no = no;
        this.sinifKodu = sinifKodu;
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
        this.cinsiyet = cinsiyet;
        this.telefonNumarasi = telefonNumarasi;
        this.veliAdSoyad = veliAdSoyad;
        this.veliTelefonNumarasi = veliTelefonNumarasi;
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

    public int getSinifKodu() {
        return sinifKodu;
    }

    public void setSinifKodu(int sinifKodu) {
        this.sinifKodu = sinifKodu;
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

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
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

    public String getVeliAdSoyad() {
        return veliAdSoyad;
    }

    public void setVeliAdSoyad(String veliAdSoyad) {
        this.veliAdSoyad = veliAdSoyad;
    }

    public String getVeliTelefonNumarasi() {
        return veliTelefonNumarasi;
    }

    public void setVeliTelefonNumarasi(String veliTelefonNumarasi) {
        this.veliTelefonNumarasi = veliTelefonNumarasi;
    }

}
