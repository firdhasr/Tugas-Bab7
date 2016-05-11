package bab7;

public abstract class Anggota extends Pelanggan {

    private double diskonProduk = 0.1;

    public Anggota(String nama) {
        super(nama);
    }

    public void setDiskonProduk(double diskonProduk) {
        this.diskonProduk = diskonProduk;
    }

    public double getDiskonProduk() {
        return diskonProduk;
    }
}
