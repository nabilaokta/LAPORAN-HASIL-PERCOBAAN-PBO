import java.util.Scanner;


public class Luas_persegi_panjang {
    public static  void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int panjang, lebar, luas;
        
        System.out.print("masukkan panjang :");
        panjang =input.nextInt ();
        
        System.out.print ("masukkan lebar :");
        lebar = input.nextInt();
        
        luas = panjang*lebar;
        System.out.println ("luas persegi panjang :"+luas);
        
    }
    
}
