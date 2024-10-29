package Tugas3;

public class TiketPesawat extends Pemesanan implements Tugas3.Tiket {
    protected String nama;
    private String asal;
    protected String tujuan;
    private double Tiket;
    protected double diskon;

    public TiketPesawat(String nmInfo, String aSal, String tujuan, double Tiket, double distance) {
        this.setNama(getNama());
        this.asal = asal;
        this.setTujuan(tujuan);
        this.Tiket = Tiket;
        this.setDiskon(getDiskon());
    }

    public double hitungBiayaTiket() {
        return Tiket - (Tiket * (getDiskon() / 100));
    }

    public double hitungDiskon() {
        return Tiket * (getDiskon() / 100);
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Penumpang: " + getNama());
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + getTujuan());
        System.out.println("Harga Tiket: " + Tiket);
        System.out.println("Diskon: " + getDiskon() + "%");
        System.out.println("Biaya Tiket Setelah Diskon: " + hitungBiayaTiket());
        System.out.println("Jumlah Diskon: " + hitungDiskon());
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }
}
