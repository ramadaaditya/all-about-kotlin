# All About Kotlin 🟣

Repository ini berisi perjalanan belajar Kotlin saya dari level dasar sampai ke Android, Coroutine, dan Kotlin Multiplatform (KMP). Isinya campuran antara catatan, contoh kode kecil, dan mini project supaya bisa jadi referensi sendiri di kemudian hari.

> Target utama repo ini: **punya satu tempat terpusat yang isinya semua hal tentang Kotlin yang sering saya pakai di project nyata.**

---

## 📚 Daftar Isi

1. [Motivasi](#motivasi)
2. [Roadmap Belajar](#roadmap-belajar)
3. [Struktur Folder](#struktur-folder)
4. [Cara Pakai Repo Ini](#cara-pakai-repo-ini)
5. [Tools & Versi Kotlin](#tools--versi-kotlin)
6. [Ide Pengembangan Berikutnya](#ide-pengembangan-berikutnya)
7. [Lisensi](#lisensi)

---

## Motivasi

**Sambil menyelam tenggelam :v** 

---

## Roadmap Belajar

Roadmap ini sifatnya fleksibel. Bisa diulang atau diloncat sesuai kebutuhan.

1. **Fundamental Kotlin**  
   Variabel, tipe data, kontrol alur, function, OOP, null-safety.
2. **Kotlin Advanced**  
   Collections, extension, generics, sealed class, delegation.
3. **Functional Style**  
   Lambda, higher-order function, scope functions (`let`, `run`, `apply`, `also`, `with`).
4. **Coroutines & Flow**  
   `suspend`, `launch` vs `async`, dispatcher, structured concurrency, `StateFlow`.
5. **Testing Kotlin**  
   Ngetes fungsi-fungsi Kotlin murni.
6. **Android Kotlin**  
   ViewModel, lifecycle, DataStore/Room, integrasi coroutine.
7. **Jetpack Compose**  
   Layout dasar, state, theming, navigation, reusable component.
8. **Architecture & DI**  
   MVVM, Clean Architecture, Hilt/Koin.
9. **Kotlin Multiplatform (KMP)**  
   `expect/actual`, shared module, networking, Compose Multiplatform (opsional).
10. **Mini Projects**  
    Bikin aplikasi kecil buat mindahin teori ke kode nyata.

---

## Struktur Folder

> Catatan: beberapa folder mungkin belum ada isinya sekarang. Ini memang dirancang supaya repo bisa **tumbuh** pelan-pelan.

```text
all-about-kotlin/
├── README.md
├── 00-roadmap/               # peta belajar dan catatan mingguan
├── 01-kotlin-fundamentals/   # dasar bahasa kotlin
│   ├── variables/
│   ├── control-flow/
│   ├── functions/
│   ├── oop/
│   └── exercises/
├── 02-kotlin-advanced/       # fitur kotlin tingkat lanjut
│   ├── collections/
│   ├── generics/
│   ├── extensions/
│   ├── delegation/
│   ├── dsl/
│   └── exercises/
├── 03-functional-style/      # gaya fungsional yang sering dipakai di android
│   ├── lambdas/
│   ├── higher-order-func/
│   ├── scope-functions/
│   └── exercises/
├── coroutines/            # concurrency di kotlin
│   ├── basics/
│   ├── structured-concurrency/
│   ├── flow/
│   ├── channels/
│   └── exercises/
├── 05-testing-kotlin/        # junit / kotest untuk kotlin murni
├── 06-android-basics/        # jembatan kotlin -> android
│   ├── viewmodel-lifecycle/
│   ├── datastore-room/
│   └── exercises/
├── 07-android-compose/       # ui deklaratif
│   ├── layout-basics/
│   ├── state/
│   ├── navigation/
│   ├── theming/
│   └── components/
├── 08-architecture/          # mvvm, clean, di
│   ├── mvvm-basic/
│   ├── clean-modularization/
│   ├── di-hilt/
│   └── di-koin/
├── 09-kmp-intro/             # kotlin multiplatform
│   ├── expect-actual/
│   ├── shared-module/
│   ├── ktor-client/
│   └── compose-multiplatform/
├── 10-mini-projects/         # project kecil biar gak cuma teori
│   ├── console/
│   ├── android/
│   └── kmp/
└── notes/                    # catatan bebas, error, snippet
