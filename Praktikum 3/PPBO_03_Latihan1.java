// Nama : Asyahra Rahmasari Ariyahaq
// NIM  : M0521013

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        double totalBeli = sc.nextInt();
        double diskon;

        if(totalBeli < 50000){
            diskon = 0;
            System.out.println("anda tidak mendapat diskon");
        }else if(totalBeli >= 50000 && totalBeli < 75000){
            diskon = 0.05;
            System.out.println("anda mendapat diskon 5%");
        }else if(totalBeli >= 75000 && totalBeli < 125000){
            diskon = 0.15;
            System.out.println("anda mendapat diskon 15%");
        }else{
            diskon = 0.20;
            System.out.println("anda mendapat diskon 20%");
        }
        
        double totalBayar = (totalBeli - (diskon*totalBeli));
        System.out.println("Total : " + totalBayar);

        // tambahkan code untuk menyimpan nominal total pembelian
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
