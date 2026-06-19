package uas;

import java.util.Scanner;

public class MainRental {
    public static void main(String[] args) {
        // MATERI 12: IO Sederhana (Scanner)
        Scanner input = new Scanner(System.in);
        
        // Membuat objek dari Class Anak
        PaketHarian rentalR50 = new PaketHarian();
        
      //rentalR50.setTarifPerHari("masukkan harga terbaru"); //kode ini digunakan jika ada perubahan harga tarif

        // MATERI 13: Array Biasa (Syarat ketentuan ukuran tetap)
        String[] infoSyarat = {
            "Wajib meninggalkan KTP Asli / KTM.",
            "Kamera kembali dalam kondisi bersih dan lengkap seperti awal.",
            "Keterlambatan pengembalian dari janji awal didenda Rp30.000/hari.",
            "Kerusakan unit menjadi tanggung jawab penuh penyewa."
        };

        // Tampilan Antarmuka Awal
        System.out.println("=== SISTEM MANAJEMEN RENTAL KAMERA EOS R50 ===");
        System.out.println("Model Kamera  : " + rentalR50.getNamaModel());
        System.out.println("Kelengkapan   : " + rentalR50.getKelengkapan());
        System.out.println("Tarif Sewa    : Rp" + rentalR50.getTarifPerHari() + " / hari");
        System.out.println("------------------------------------");
        System.out.println("SYARAT & KETENTUAN:");
        for (int i = 0; i < infoSyarat.length; i++) {
            System.out.println("- " + infoSyarat[i]);
        }
        System.out.println("====================================");

        int janjiSewa = 0;
        int hariKembali = 0;

        // MATERI 11: Perulangan & MATERI 14: ERROR HANDLING untuk input janji sewa
        while (true) {
            try {
                System.out.print("Masukkan jumlah hari kontrak sewa: ");
                janjiSewa = input.nextInt();

                // MATERI 10: Seleksi Validasi angka harus di atas 0
                if (janjiSewa <= 0) {
                    System.out.println("[ERROR] Jumlah hari sewa harus lebih besar dari 0!");
                    continue;
                }
                break; // Keluar dari loop jika input benar
            } catch (Exception e) {
                System.out.println("[ERROR] Input salah! Mohon masukkan angka bilangan bulat.");
                input.next(); // Bersihkan sisa input salah agar tidak infinite loop (menghapus yang salah dan meminta input baru)
            }
        }

        // Perulangan & Error Handling untuk input Realisasi Pengembalian
        while (true) {
            try {
                System.out.print("Masukkan jumlah hari nyata hingga kamera dikembalikan: ");
                hariKembali = input.nextInt();

                if (hariKembali <= 0) {
                    System.out.println("[ERROR] Jumlah hari pengembalian harus lebih besar dari 0!"); 
                    continue;//jika haripengembalian lebih kecil dari hari sewa, maka yg dihitung tetap kontrak sewa awal
                }
                break;
            } catch (Exception e) {
                System.out.println("[ERROR] Input salah! Mohon masukkan angka bilangan bulat.");
                input.next();
            }
        }

        // Proses Hitung Biaya Menggunakan Prinsip OOP (object oriented programming)
        double biayaSewaDasar = rentalR50.hitungBiayaSewa(janjiSewa);
        double totalDenda = rentalR50.hitungDenda(janjiSewa, hariKembali);
        double totalBayar = biayaSewaDasar + totalDenda;

        int hariKeterlambatan = hariKembali - janjiSewa;

        // Cetak Nota Transaksi Akhir
        System.out.println("\n==============================================");
        System.out.println("          NOTA RENTAL CANON EOS R50           ");
        System.out.println("==============================================");
        System.out.println("Model Kamera  : " + rentalR50.getNamaModel());
        System.out.println("Kelengkapan   : " + rentalR50.getKelengkapan());
        System.out.println("Janji Sewa    : " + janjiSewa + " hari");
        System.out.println("Hari kembali  : " + hariKembali + " hari");
        System.out.println("----------------------------------------------");
        System.out.println("Biaya Sewa    : Rp" + biayaSewaDasar);
        System.out.println("Keterlambatan : " + (hariKeterlambatan > 0 ? hariKeterlambatan : 0) + " hari");
        System.out.println("Total Denda   : Rp" + totalDenda);
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL BAYAR   : Rp" + totalBayar);
        System.out.println("==============================================");

        input.close(); // Menutup objek scanner
    }
}