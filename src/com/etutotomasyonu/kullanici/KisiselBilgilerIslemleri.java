package com.etutotomasyonu.kullanici;

/**
 * @author agitrubardemir
 */
public class KisiselBilgilerIslemleri {

    public static String telefonNumarasiDonustur(String kisiTelefonNumarasi) {
        String telefonNumarasi = "+90 ";

        String kod = kisiTelefonNumarasi.substring(0, 3);
        String birinciKisim = kisiTelefonNumarasi.substring(3, 6);
        String ikinciKisim = kisiTelefonNumarasi.substring(6, 10);
        telefonNumarasi += "(" + kod + ") " + birinciKisim + " " + ikinciKisim;

        return telefonNumarasi;
    }

    public static String telefonNumarasiDonusturSQL(String kisiTelefonNumarasi) {
        String telefonNumarasi = kisiTelefonNumarasi.replace(" ", "");
        telefonNumarasi = telefonNumarasi.replace("+", "");
        telefonNumarasi = telefonNumarasi.replace("(", "");
        telefonNumarasi = telefonNumarasi.replace(")", "");
        telefonNumarasi = telefonNumarasi.substring(2);

        return telefonNumarasi;
    }

    public static int cinsiyetSec(String cinsiyet) {
        if (cinsiyet.equals("Erkek")) {
            return 2;
        } else {
            return 1;
        }
    }

    public static String cinsiyetIsimDonusumuOgrenci(String cinsiyet) {
        cinsiyet = cinsiyet.toUpperCase();
        if (cinsiyet.equals("E")) {
            return "Erkek";
        } else {
            return "Kız";
        }
    }
    
        public static String cinsiyetIsimDonusumu(String cinsiyet) {
        cinsiyet = cinsiyet.toUpperCase();
        if (cinsiyet.equals("E")) {
            return "Erkek";
        } else {
            return "Kadın";
        }
    }

    public static String cinsiyetIsimDonusumuSQL(int cinsiyet) {
        if (cinsiyet == 1) {
            return "K";
        } else {
            return "E";
        }
    }

    public static String tarihDonusumuSQL(String tarih) {
        String[] split = tarih.split("/");
        String gun = split[0];
        String ay = split[1];
        String yil = split[2];

        return yil + "-" + ay + "-" + gun;
    }

    public static String tarihDonusumu(String tarih) {
        String[] split = tarih.split("-");
        String yil = split[0];
        String ay = split[1];
        String gun = split[2];

        return gun + "/" + ay + "/" + yil;
    }
}
