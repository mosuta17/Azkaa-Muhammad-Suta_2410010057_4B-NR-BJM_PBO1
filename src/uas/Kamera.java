package uas;

// MATERI 1 & 7: CLASS & ENCAPSULATION
public class Kamera {
    // MATERI 3: Atribut
    private String namaModel;
    private String kelengkapan;

    // MATERI 4: konstruktor
    public Kamera() {
        this.namaModel = "Canon EOS R50";
        this.kelengkapan = "Body + Lensa Kit + Baterai + Charger + Tas";
    }

    // MATERI 6: Accessor (Getter)
    public String getNamaModel() { return namaModel; }
    public String getKelengkapan() { return kelengkapan; }

    // MATERI 9: POLYMORPHISM (Method polimorphisme yang akan di-override kelas anak)
    public double hitungBiayaSewa(int durasiSewa) {
        return 0;
    }

    // Logika perhitungan denda keterlambatan (Rp30.000 / hari)
    public double hitungDenda(int janjiSewa, int hariKembali) {
        int hariTerlambat = hariKembali - janjiSewa;
        if (hariTerlambat > 0) {
            return hariTerlambat * 30000;
        }
        return 0;
    }
}