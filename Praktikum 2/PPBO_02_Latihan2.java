// Nama : Asyahra Rahmasari Ariyahaq
// NIM  : M0521013
public class PPBO_02_Latihan2 {
    public static final int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String args[]) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}
// Apa yang salah dengan source code tersebut?
// Jawaban : KURS_DOLLAR sudah dideklarasikan sebagai konstanta sehingga nilainya tidak dapat ditimpa kembali dengan nilai yang berbeda.
// Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
// Jawaban : memungkinkan sebuah property atau method diakses langsung tanpa melalui object cukup menulis nama class saja.
