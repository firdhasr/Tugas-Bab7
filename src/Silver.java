package bab7;

public class Silver extends Anggota {

    private final String anggota = "Silver";
    private final double diskonLayanan = 0.1;

    public Silver(String nama) {
        super(nama);
    }

    @Override
    public double bayarLayanan(double harga) {
        return harga - (harga * diskonLayanan);
    }

    @Override
    public double bayarProduk(double harga) {
        return harga - (harga * getDiskonProduk());
    }

    public void tampil() {
        super.tampil();
        System.out.println("Keanggotaan : " + anggota);
        System.out.println("-----------------------------------");
    }
}
