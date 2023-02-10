# LnT-Mobile-Java

Run program dari file bernama Basedata.java
Di dalam file tersebut, terdapat array untuk menampung data yang diinput


Basedata.java akan menjalankan command main yang terdapat di HomePage.java
HomePage.java akan mengeluarkan output di console dan menjalankan perintah sesuai pilihan yang diinput user
(1 untuk Input.java, 2 untuk View.java, 3 untuk keluar, dan sisanya akan tetap looping)


User menginput data pada Input.java sesuai ketentuan dan data tersebut akan dimasukkan ke array yang terdapat di Basedata.java
Array data dari Basedata.java akan ditampilkan pada View.java sesuai ketentuan, dimana user dapat memilih kendaraan untuk di-test drive dan diberi harga


Pada Vehicle.java, terdapat abstract class Vehicle yang berisi semua data yang diperlukan dari sebuah kendaraan beserta ketentuannya secara umum
Ketentuan secara spesifik terdapat pada class Car dan Motor yang merupakan inheritance dari Vehicle
Class Datab yang juga merupakan inheritance dari Vehicle digunakan untuk membuat array pada Basedata.java
