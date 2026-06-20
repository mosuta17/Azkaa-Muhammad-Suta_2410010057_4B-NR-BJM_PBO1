# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data transaksi persewaan kamera menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa jumlah hari kontrak sewa awal dan jumlah hari nyata saat unit dikembalikan, lalu memberikan output berupa nota transaksi detail yang berisi biaya sewa dasar, hari keterlambatan, nominal denda, serta total keseluruhan yang harus dibayar.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kamera`, `PaketHarian`, dan `MainRental` adalah contoh dari class.

```bash
public class Kamera {
    ...
}

public class PaketHarian extends Kamera {
    ...
}

public class MainRental {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `PaketHarian rentalR50 = mew PaketHarian();` adalah contoh pembuatan object.

```bash
PaketHarian rentalR50 = new PaketHarian();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaModel`, `tarifPerHari`  dan `kelengkapan` adalah contoh atribut.

```bash
String namaModel;
String kelengkapan;
double tarifPerHari;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Kamera` dan `PaketHarian`.

```bash
public Kamera() {
    this.namaModel = "Canon EOS R50";
    this.kelengkapan = "Body + Lensa Kit + Baterai + Charger + Tas";
}

public PaketHarian() {
    super();
    this.tarifPerHari = 60000;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setTarifPerHari` adalah contoh method mutator.

```bash
public void setTarifPerHari(double tarifPerHari) {
    this.tarifPerHari = tarifPerHari;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaModell`, `getKelengkapan`, dan `getTarifPerHari` adalah contoh method accessor.

```bash
public String getNamaModel() { 
    return namaModel; 
}

public String getKelengkapan() { 
    return kelengkapan; 
}

public double getTarifPerHari() {
    return tarifPerHari;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaModel`, `kelengkapan` dan `tarifPerHari` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaModel;
private String kelengkapan;
private double tarifPerHari;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PaketHarian` mewarisi `Kamera` dengan sintaks `extends`.

```bash
public class PaketHarian extends Kamera {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `hitungBiayaSewa` di `PaketHarian` merupakan override dari method `hitungBiayaSewa` di `Kamera`.

```bash
@Override
public double hitungBiayaSewa(int durasiSewa) {
    return durasiSewa * this.tarifPerHari;
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if` dalam method `hitungDenda` dan seleksi ternary `?:` pada saat pencetakan hari keterlambatan di nota transaksi.
    
```bash
public double hitungDenda(int janjiSewa, int hariKembali) {
    int hariTerlambat = hariKembali - janjiSewa;
    if (hariTerlambat > 0) {
        return hariTerlambat * 30000;
    }
    return 0;
}

System.out.println("Keterlambatan : " + (hariKeterlambatan > 0 ? hariKeterlambatan : 0) + " hari");
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk menampilkan daftar informasi syarat ketentuan rental, serta loop `while (true)` untuk mengulang form input durasi sewa jika terjadi kesalahan input.

```bash
for (int i = 0; i < infoSyarat.length; i++) {
    System.out.println("- " + infoSyarat[i]);
}

while (true) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input angka hari sewa dan method `System.out.println` untuk menampilkan output nota secara terstruktur ke layar terminal.

```bash
Scanner input = new Scanner(System.in);
System.out.print("Masukkan jumlah hari kontrak sewa: ");
janjiSewa = input.nextInt();

System.out.println("\n==============================================");
System.out.println("          NOTA RENTAL CANON EOS R50           ");
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `String[] infoSyarat = { ... };` adalah contoh penggunaan array biasa dengan ukuran tetap.
    
```bash
String[] infoSyarat = {
    "Wajib meninggalkan KTP Asli / KTM.",
    "Kamera kembali dalam kondisi bersih dan lengkap seperti awal.",
    "Keterlambatan pengembalian dari janji awal didenda Rp30.000/hari.",
    "Kerusakan unit menjadi tanggung jawab penuh penyewa."
};
```

14. **Error Handling digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan struktur `try catch` untuk menangani InputMismatchException apabila kasir salah menginput karakter huruf pada inputan jumlah hari.
    
```bash
try {
    System.out.print("Masukkan jumlah hari kontrak sewa: ");
    janjiSewa = input.nextInt();
    ...
} catch (Exception e) {
    System.out.println("[ERROR] Input salah! Mohon masukkan angka bilangan bulat.");
    input.next();
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat Sistem Rental Kamera Canon EOS R50

Nama: Azkaa Muhammad Suta
NPM: 2410010057
