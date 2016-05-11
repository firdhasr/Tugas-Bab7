package bab7;

public class NonAnggota extends Pelanggan {

    private final String anggota = "Non Anggota";

    public NonAnggota(String nama) {
        super(nama);
    }

    @Override
    public double bayarLayanan(double harga) {
        return harga;
    }

    @Override
    public double bayarProduk(double harga) {
        return harga;
    }

    public void tampil() {
        super.tampil();
        System.out.println("Keanggotaan : " + anggota);
        System.out.println("-----------------------------------");
    }
}
