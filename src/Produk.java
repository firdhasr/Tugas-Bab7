package bab7;

public class Produk {

    private int noProduk;
    private int harga;

    public void setNoProduk(int noProduk) {
        this.noProduk = noProduk;
    }

    public int getHargaProduk() {
        switch (noProduk) {
            case 1:
                harga = 100000;
                break;
            case 2:
                harga = 50000;
                break;
            case 3:
                harga = 20000;
                break;
            case 4:
                harga = 15000;
                break;
        }
        return harga;
    }

}
