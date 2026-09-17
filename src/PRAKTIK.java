import java.util.Scanner;

public class PRAKTIK{
    public static void main(String[] args) throws Exception{
        
        Scanner KASIR = new Scanner(System.in);
        int totalBelanja, hargaBarang, jumlahBarang;
        String lanjutkan;

        totalBelanja= 0;
        hargaBarang= 0;
        jumlahBarang= 0;
        lanjutkan = "yes";

        while (lanjutkan.equals("yes")){

            System.out.println("Masukkan harga barang:");
            hargaBarang = KASIR.nextInt();

            totalBelanja = hargaBarang + totalBelanja;
            jumlahBarang = jumlahBarang + 1;

            System.out.println("Apakah anda ingin menambah barang lagi?:");
            lanjutkan = KASIR.next();

            

        } System.out.println("total belanja: " +totalBelanja +"jumlah barang:" + jumlahBarang);
    } 
}