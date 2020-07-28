package entities;

public class Books {

    int barkoid, sayfasayisi;
    String kitapadi, kitapyazari;

    public int getBarkoid() {
        return barkoid;
    }

    public void setBarkoid(int barkoid) {
        this.barkoid = barkoid;
    }

    public int getSayfasayisi() {
        return sayfasayisi;
    }

    public void setSayfasayisi(int sayfasayisi) {
        this.sayfasayisi = sayfasayisi;
    }

    public String getKitapadi() {
        return kitapadi;
    }

    public void setKitapadi(String kitapadi) {
        this.kitapadi = kitapadi;
    }

    public String getKitapyazari() {
        return kitapyazari;
    }

    public void setKitapyazari(String kitapyazari) {
        this.kitapyazari = kitapyazari;
    }
}
