// Nama : Asyahra Rahmasari Ariyahaq
// NIM  : M0521013

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        /*for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);*/
        for(int i = 0; i < 5; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab: 
/*source code diatas kurang tepat, karena index array dimulai dari 0. Sedangkan pada pemanggilan for i = 1,
index array juga dimulai dari 1. Sehingga ketika pemanggilan i = 5, index pada array tidak ada.*/
