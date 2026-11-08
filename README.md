# APLIKASI DAFTAR PRODUK TOKO

Project Apache NetBeans berbasis JavaFX dan Maven untuk mengelola daftar produk toko.

## CARA MENJALANKAN

1. Ekstrak ZIP project.
2. Buka Apache NetBeans.
3. Pilih **File → Open Project**, lalu pilih folder `DaftarProdukToko`.
4. Tunggu Maven memuat dependensi JavaFX.
5. Klik kanan project → **Clean and Build**.
6. Jalankan aplikasi menggunakan goal Maven berikut:

   ```bash
   javafx:run
   ```

## FITUR APLIKASI

- Menambahkan produk dengan kode otomatis (PRD001, PRD002, dan seterusnya).
- Memilih kategori produk Makanan atau Minuman.
- Validasi nama produk wajib diisi dan harga harus lebih dari nol.
- Menampilkan daftar produk dalam tabel berisi kode, nama, kategori, dan harga.
- Mencari produk berdasarkan nama melalui tombol Cari.
- Menampilkan detail produk yang dipilih dari tabel.
- Menyimpan data di memori selama aplikasi berjalan (tidak menggunakan database).

## SCREENSHOT APLIKASI

Screenshot tampilan aplikasi akan ditambahkan di bagian ini.

## CONTOH DATA UNTUK PENGUJIAN

| Nama Produk | Kategori | Harga |
|---|---|---:|
| Roti Cokelat | Makanan | 15000 |
| Air Mineral | Minuman | 5000 |
| Keripik Kentang | Makanan | 12000 |
