// Nama : Asyahra Rahmasari Ariyahaq
// NIM  : M0521013
import java.text.DecimalFormat;

public class PPBO_02_Latihan1 {
    public static void main(String[] args) {
        int a = 10;
        double b = 3.0;
        float c = 4.3f;

        double A = Double.valueOf(a);
        double C = Double.valueOf(c);

        DecimalFormat decimal = new DecimalFormat("#.##");

        double jumlah = A + b + C;

        System.out.println("Jumlah variabel a,b,c adalah " + decimal.format(jumlah));
    }
}

// ubah variabel a dan c ke tipe data double
// jumlahkan variabel a, b, dan c
// tampilkan hasil penjumlahan ketiga variabel

/*
 * Output yang diharapkan:
    17.3
 */
