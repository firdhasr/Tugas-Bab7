package bab7;

public abstract class Pelanggan {

    private final String nama;

    public Pelanggan(String nama) {
        this.nama = nama;
    }

    public void tampil() {
        System.out.println("====================================");
        System.out.println("  =====SALON KECANTIKAN SABIL=====");
        System.out.println("====================================");
        System.out.println("Nama        : " + nama);
    }

    public abstract double bayarLayanan(double harga);

    public abstract double bayarProduk(double harga);
}
