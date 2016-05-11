package bab7;

public class Layanan {

    private int noLayanan;
    private int harga;

    public void setNoLayanan(int noLayanan) {
        this.noLayanan = noLayanan;
    }

    public int getHargaLayanan() {
        switch (noLayanan) {
            case 1:
                harga = 80000;
                break;
            case 2:
                harga = 150000;
                break;
            case 3:
                harga = 50000;
                break;
            case 4:
                harga = 100000;
                break;
        }
        return harga;
    }

}
