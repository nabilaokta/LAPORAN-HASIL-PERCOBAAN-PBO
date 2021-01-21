import java.util.Scanner;


public class Luas_lingkaran {
     public static  void main (String[] args) {
         //inisialisasi objek input dari class scanner
        Scanner input = new Scanner (System.in);
        //deklarasi variabel
        double luas, phi=3.14;
        int r;
        //input nilai jari-jari
        
        System.out.print("masukkan jari-jari :");
        r= input.nextInt ();
        
        //menghitung luas lingkaran
        luas = phi*r*r;
        //tampilkan hasil
        
        System.out.println ("luas lingkaran :"+luas);
     }
    
}
