# TUGAS 4
# Tiket Pesawat Refactored

## Deskripsi
Program ini merupakan aplikasi sederhana untuk menghitung harga total tiket pesawat berdasarkan maskapai, kelas penerbangan, dan harga dasar yang ditentukan oleh pengguna. Program mendukung pemilihan maskapai dan kelas penerbangan dengan berbagai harga yang telah ditentukan untuk masing-masing maskapai.

## Fitur
- Mendukung beberapa maskapai dengan harga yang berbeda untuk tiap kelas penerbangan.
- Pilihan kelas penerbangan yang disesuaikan dengan maskapai yang dipilih.
- Perhitungan harga total berdasarkan harga dasar dan kelas penerbangan.

## Struktur Program
Kode terdiri dari satu class utama `TiketPesawatRefactored`, yang mencakup:
- **Variabel `hargaKelasPerMaskapai`**: Menyimpan data harga kelas penerbangan untuk setiap maskapai.
- **Method `hitungHargaTotal()`**: Menghitung harga total tiket berdasarkan maskapai, kelas, dan harga dasar.
- **Method `pilihKelas()`**: Menampilkan daftar kelas penerbangan sesuai maskapai yang dipilih dan meminta pengguna untuk memilih kelas.
- **Method `main()`**: Method utama untuk menjalankan program, meminta input pengguna untuk maskapai, kelas, dan harga dasar.

## Cara Menjalankan Program
1. **Kompilasi Program**: 
   ```bash
   javac Tugas4/TiketPesawatRefactored.java
