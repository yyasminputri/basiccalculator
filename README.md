## Membuat Aplikasi Kalkulator Sederhana di Android Menggunakan Jetpack Compose

Pada Github ini, kita akan mengetahui bagaimana cara membuat aplikasi kalkulator sederhana di Android menggunakan Jetpack Compose. Aplikasi ini dapat melakukan operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian.

Langkah-Langkah Pembuatan Aplikasi Kalkulator Sederhana:
1. Persiapan:
Pertama, buka Android Studio dan membuat proyek baru dengan template "Empty Compose Activity", memilih bahasa Kotlin dan menggunakan Jetpack Compose untuk UI.
""

2. Menambahkan Dependensi:
Pastikan file build.gradle Anda sudah mengimpor dependensi Jetpack Compose

3. Mendesain Antarmuka Pengguna:
Di dalam MainActivity, kita akan menggunakan beberapa komponen UI dari Jetpack Compose seperti Box, Column, Row, TextField, dan Button. Mengatur desain antarmuka dengan menambahkan teks judul, dua kolom input untuk angka, tombol-tombol operasi, dan area untuk menampilkan hasil perhitungan. Gunakan Spacer untuk memberikan jarak antar elemen.

4. Menambahkan Fungsionalitas:
Menggunakan remember untuk menyimpan nilai input dari pengguna, serta mutableStateOf untuk menyimpan hasil perhitungan. Menambahkan logika untuk setiap tombol operasi. Misalnya, tombol "Add" akan menjumlahkan dua angka yang dimasukkan oleh pengguna, dan seterusnya untuk operasi lainnya dan menampilkan hasil perhitungan dalam bentuk yang menarik di dalam sebuah Box dengan latar belakang berwarna pink.

5. Menambahkan Styling:
Menggunakan warna-warna pastel yang lembut untuk menciptakan desain yang menenangkan seperti warna baby pink untuk latar belakang tombol dan input. Menyesuaikan ukuran dan ketebalan font untuk memastikan teks terlihat jelas dan mudah dibaca.

6. Pengujian:
Menjalankan aplikasi di emulator atau perangkat Android untuk memeriksa apakah semua tombol dan fungsi bekerja dengan baik. Memastikan aplikasi menangani input yang tidak valid (misalnya, pembagian dengan nol) dengan cara yang tepat.

7. Penyelesaian dan Penambahan Nama Pembuat
Menambahkan teks nama pembuat aplikasi di bagian bawah layar sebagai penghargaan kepada diri sendiri atas pekerjaan yang telah dilakukan.
