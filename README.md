# Tugas Praktikum Minggu 1 - Pengembangan Aplikasi Mobile (IF25-22017)

Repositori ini berisi implementasi Tugas Praktikum Minggu 1 mata kuliah **Pengembangan Aplikasi Mobile (IF25-22017)** pada Program Studi Teknik Informatika, Institut Teknologi Sumatera (ITERA).

---

## 👤 Informasi Mahasiswa
- **Nama**: Ahmad Mulia Saputra
- **NIM**: 123140168
- **Program Studi**: Teknik Informatika
- **Institusi**: Institut Teknologi Sumatera (ITERA)

---

## 📱 Deskripsi Proyek & Teknologi

Proyek ini dibangun menggunakan:
- **[Kotlin Multiplatform (KMP)](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)**: Memungkinkan berbagi logika aplikasi secara lintas platform (cross-platform) antara target Android, Desktop (JVM), dan iOS.
- **[Compose Multiplatform](https://www.jetbrains.com/lp/compose-multiplatform/)**: Framework UI deklaratif dari JetBrains berbasis Jetpack Compose untuk merender tampilan antarmuka (UI) secara konsisten di semua target platform.
- **Pola Expect/Actual**: Digunakan untuk mengakses API spesifik dari setiap runtime sistem operasi (misalnya mendeteksi nama dan versi platform secara dinamis: Android SDK level, Desktop JVM / OS, dan iOS UIDevice).

---

## 📸 Screenshot Aplikasi

> **Catatan**: Bagian ini disiapkan sebagai bukti aplikasi berjalan pada minimal 2 platform (Android & Desktop) untuk memenuhi target kriteria penilaian dan bonus (+10%).

### 1. Target Android
| Tampilan Utama Android | Tampilan Interaktif (Detail) |
| :---: | :---: |
| ![Screenshot Android](docs/screenshots/android_main.png) | ![Screenshot Android Detail](docs/screenshots/android_detail.png) |
*Simpan file tangkapan layar Android pada direktori `docs/screenshots/android_main.png`*

### 2. Target Desktop JVM
| Tampilan Utama Desktop | Tampilan Interaktif (Detail) |
| :---: | :---: |
| ![Screenshot Desktop](docs/screenshots/desktop_main.png) | ![Screenshot Desktop Detail](docs/screenshots/desktop_detail.png) |
*Simpan file tangkapan layar Desktop pada direktori `docs/screenshots/desktop_main.png`*

---

## 🚀 Cara Menjalankan Aplikasi

Pastikan prasyarat environment telah terpenuhi:
- **JDK 17** (atau Java 21 yang kompatibel)
- **Android Studio** (dengan SDK Android terinstall)
- **KMP Plugin** pada Android Studio / IntelliJ IDEA

### 1. Menjalankan Target Desktop (JVM)
Jalankan perintah berikut melalui terminal di root direktori proyek:
```bash
./gradlew :composeApp:run
```
Atau melalui Android Studio / IntelliJ IDEA:
1. Buka drop-down *Run Configurations*.
2. Pilih task **desktop** / **composeApp [run]**.
3. Klik tombol **Run (▶)**.

### 2. Menjalankan Target Android
Pastikan emulator Android sedang aktif atau perangkat Android fisik terhubung dengan mode USB Debugging aktif, kemudian jalankan:
```bash
./gradlew :composeApp:installDebug
```
Atau melalui Android Studio:
1. Pilih configuration **composeApp**.
2. Pilih target emulator / device.
3. Klik tombol **Run (▶)**.

### 3. Build & Verifikasi Proyek
Untuk memverifikasi bahwa seluruh modul dapat di-compile tanpa error:
```bash
./gradlew build
```

---

## 📂 Struktur Modul Proyek
```text
PAM-TugasPraktikum1/
├── composeApp/
│   ├── src/
│   │   ├── commonMain/      # Shared UI (Compose) & expect declarations
│   │   ├── androidMain/     # Implementasi actual Android & MainActivity
│   │   ├── desktopMain/     # Implementasi actual Desktop (JVM) & main()
│   │   └── iosMain/         # Implementasi actual iOS & MainViewController
│   └── build.gradle.kts     # Konfigurasi target platform & dependencies
├── gradle/
│   └── libs.versions.toml   # Dependency version catalog
├── settings.gradle.kts
└── build.gradle.kts
```
