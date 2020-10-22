package com.etutotomasyonu.kullanici;

/**
 * @author agitrubardemir
 */
public class Sinif {

    private int sinifKodu;
    private String sinifAdi;

    public Sinif(int sinifKodu, String sinifAdi) {
        this.sinifKodu = sinifKodu;
        this.sinifAdi = sinifAdi;
    }

    public int getSinifKodu() {
        return sinifKodu;
    }

    public void setSinifKodu(int sinifKodu) {
        this.sinifKodu = sinifKodu;
    }

    public String getSinifAdi() {
        return sinifAdi;
    }

    public void setSinifAdi(String sinifAdi) {
        this.sinifAdi = sinifAdi;
    }
}
