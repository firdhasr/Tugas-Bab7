package bab7;

import java.util.Scanner;

public class MainSalon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("============================================");
        System.out.println("==SELAMAT DATANG DI SALON KECANTIKAN SABIL==");
        System.out.println("============================================");
        System.out.print("Masukkan Nama Anda : ");
        String nama = in.nextLine();
        System.out.print("Apakah Anda Terdaftar Sebagai Anggota?(ya/tidak): ");
        String masuk = in.nextLine();
        int noAnggota = 0;
        if (masuk.equalsIgnoreCase("ya")) {
            System.out.print("Jenis Keanggotaan:\n1.Premium\n2.Gold\n3.Silver\n");
            System.out.print("Pilih Jenis Keanggotaan : ");
            noAnggota = in.nextInt();
        }
        Pelanggan a;
        a = null;
        int totalHargaLayanan = 0;
        int totalHargaBarang = 0;
        while (true) {
            System.out.println("Membeli Layanan atau Produk? ");
            String jawab = in.nextLine();
            if (jawab.equalsIgnoreCase("Layanan")) {
                Layanan l = new Layanan();
                System.out.println("Daftar Jenis Layanan Salon Sabil dan Harga");
                System.out.println("1.Cream Bath         80000");
                System.out.println("2.Hair Color        150000");
                System.out.println("3.Potong Rambut      50000");
                System.out.println("4.Smoothing         100000");
                System.out.print("Masukkan Jenis Layanan Yang Di Inginkan : ");
                l.setNoLayanan(in.nextInt());
                totalHargaLayanan = totalHargaLayanan + l.getHargaLayanan();
            } else if (jawab.equalsIgnoreCase("Produk")) {
                Produk p = new Produk();
                System.out.println("Daftar Produk Salon Sabil dan Harga");
                System.out.println("1.Cat Rambut        100000");
                System.out.println("2.Hair Tonic         50000");
                System.out.println("3.Hair Vitamin       20000");
                System.out.println("4.Shampoo            15000");
                System.out.print("Masukkan Jenis Produk Yang Di Inginkan : ");
                p.setNoProduk(in.nextInt());
                totalHargaBarang = totalHargaBarang + p.getHargaProduk();
            } else {
                System.out.println("Anda tidak menuliskan kata Produk atau Layanan ");
            }
            System.out.println("Apakah Anda Ingin Melakukan transaksi lagi? (y/t)");
            String lagi = in.nextLine();
            if (lagi.equalsIgnoreCase("t")) {
                break;
            }
            switch (noAnggota) {
                case 1:
                    a = new Premium(nama);
                    break;
                case 2:
                    a = new Gold(nama);
                    break;
                case 3:
                    a = new Silver(nama);
                    break;
                default:
                    a = new NonAnggota(nama);
            }
        }
        a.tampil();
        System.out.println("Total Harga Layanan             : " + totalHargaLayanan);
        System.out.println("Total Harga Produk              : " + totalHargaBarang);
        System.out.println("Harga Layanan Setelah Di Diskon : " + (int) a.bayarLayanan(totalHargaLayanan));
        System.out.println("Harga Produk Setelah Di Diskon  : " + (int) a.bayarProduk(totalHargaBarang));
        System.out.println("------------------------------------");
        System.out.println("Total Pembayaran                : " + (int) (a.bayarLayanan(totalHargaLayanan) + (a.bayarProduk(totalHargaBarang))));
    }

}
