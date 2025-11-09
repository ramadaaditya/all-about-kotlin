Coroutine digunakan ketika menjalankan sebuah proses berat (Network,Background task) yang hasilnya tidak langsung diterima. 

## Konsep Coroutine :

### Suspend Function
Sebuah kata kunci "supend" untuk membuat fungsi menjadi coroutine. 
Dimana fungsi tersebut dapat di jeda bila diperlukan

### Coroutine Builder :

1. launch
2. async -> await
3. runBlocking

Contoh penggunaannya 
1. launch : Digunakan untuk proses yang tidak melakukan komputasi lagi pada hasilnya
2. async : Digunakan ketika hasilnya proses asyncronus dibutuhkan lagi untuk komputasi lainnya
3. runBlocking : Jembatan antara kode non coroutine dengan coroutine. Membuat sebuah fungsi biasa menjadi coroutine

### Coroutine Scope
Rumah bagi sebuah kode coroutine
di android terdapat beberapa jenisnya :

1. viewModelScope
2. lifecycleScope
3. CoroutineScope

### Dispatcher
Menentukan sebuah coroutine itu jalan di thread mana, jenisnya ada :

1. Dispatcher.Main -> UI
2. Dispatcher.IO -> Operasi I/O (network, database)
3. Dispatcher.Default -> Operasi CPU berat
4. Dispatcher.Unconfined -> kasus khusus, jarang digunakan
