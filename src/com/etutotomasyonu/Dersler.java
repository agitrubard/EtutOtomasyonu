package com.etutotomasyonu;

/**
 * @author agitrubardemir
 */
public class Dersler {

    private int dersKodu;
    private String dersAdi;

    public Dersler(int dersKodu, String dersAdi) {
        this.dersKodu = dersKodu;
        this.dersAdi = dersAdi;
    }

    public int getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }
}
