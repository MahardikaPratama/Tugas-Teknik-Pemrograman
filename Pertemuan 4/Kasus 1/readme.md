Beberapa hal pada desain class Restaurant belum memenuhi konsep OOP yang benar seperti :

a.	Break up classes that have too many responsibilities 
Prinsip tersebut menekankan pentingnya memecah kelas yang memiliki terlalu banyak tanggung jawab dalam konsep Object Oriented Programming (OOP). Prinsip ini mengatakan bahwa setiap kelas harus memiliki tanggung jawab yang jelas dan terbatas, dan jika sebuah kelas memiliki terlalu banyak tanggung jawab, maka harus dibagi menjadi beberapa kelas yang lebih kecil dan fokus.

Dengan memecah kelas yang memiliki terlalu banyak tanggung jawab, kita bisa membuat sistem lebih mudah dipahami, dikelola, dan dikembangkan, karena setiap kelas hanya fokus pada tugas tertentu. Ini juga membantu mengurangi ketergantungan antar kelas dan membuat sistem lebih elastis dan mudah untuk mengatasi perubahan masa depan.

Pada class Restaurant ini saya memecah class, dengan membuat class baru yaitu class Menu yang akan bertanggung jawab dalam mengatur menu makanan pada restaurant. Saya memindahkan variabel nama_makanan, harga_makanan, serta stok ke dalam class Menu. Kemudian membuat sebuah object berbentuk array dari class Menu di class restaurant.

b.	Always keep data private.
Prinsip ini berarti bahwa data atau informasi yang berada di dalam objek harus dipertahankan sebagai informasi rahasia dan tidak boleh diterima oleh pihak luar. Penerapan prinsip ini melalui konsep encapsulation, yaitu membungkus data dan logika aplikasi dalam objek tertentu. Dengan begitu, data dan logika dapat diterima dan diproses hanya melalui metode yang didefinisikan dalam objek tersebut, dan tidak bisa diterima atau dimodifikasi secara langsung oleh pihak luar. Pada class ini semua variabel public diubah enkapsulasinya menjadi private.

c.	Not all fields need individual field accessors and mutators
Prinsip ini berarti bahwa tidak semua class membutuhkan setter dan getter. Hal ini untuk mencegah pembuatan modul yang tidak akan digunakan. Pada class ini saya tidak memberikan setter pada variabel nama_makanan dan harga_makanan karena untuk pengisian variabel tersebut sudah menggunakan constructor sehingga tidak perlu setter.

Penambahan fitur pemesanan dan pengurangan stok dengan desain class yang ada tidak terlalu sulit. Hal ini dikarenakan semua data-data yang diperlukan sudah tersedia. Pada fitur ini saya membuat modifikasi agar saat nama makanan yang dipesan tidak ada dimenu makan akan ditampilkan dilayar bahwa “makanan tidak tersedia di menu”. Selain itu saya juga memodifikasi agar ketika jumlah pesanan melebihi stok maka akan ditampilkan dilayar bahwa “stok makanan tidak tersedia untuk jumlah yang dipesan”.

