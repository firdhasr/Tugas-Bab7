package bab7;

public class Premium extends Anggota {

    private final String anggota = "Premium";
    private final double diskonLayanan = 0.2;

    public Premium(String nama) {
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

    public void Tampil() {
        super.tampil();
        System.out.println("Keanggotaan : " + anggota);
        System.out.println("-----------------------------------");
    }
}
