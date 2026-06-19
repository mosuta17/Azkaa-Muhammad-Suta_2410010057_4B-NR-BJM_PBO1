package uas;

// MATERI 8: CLASS INHERITANCE
public class PaketHarian extends Kamera {
    private double tarifPerHari;

    // Constructor Kelas Anak
    public PaketHarian() {
        super(); // Memanggil constructor induk
        this.tarifPerHari = 60000; // Tarif harian Rp60.000
    }

    // MATERI 6: Accessor Getter untuk tarif harian
    public double getTarifPerHari() {
        return tarifPerHari;
    }

    // MATERI 5: Mutator Setter jika suatu saat tarif harian berubah harga [sambungan/setternya di class main]
    public void setTarifPerHari(double tarifPerHari) {
        this.tarifPerHari = tarifPerHari;
    }

    // MATERI 9: POLYMORPHISM OVERRIDING
    @Override
    public double hitungBiayaSewa(int durasiSewa) {
        return durasiSewa * this.tarifPerHari;
    }
}