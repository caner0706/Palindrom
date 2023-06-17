package palindrom;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lütfen Hesaplamak İstediğiniz Sayıyı Girin : ");
        int sayi = scanner.nextInt();
       // PalindromHesapla(sayi);
       if(PalindromHesapla(sayi) == true){
           System.out.println(sayi + " Palindromiktir");
       }
       else{
           System.out.println(sayi + " Palindromik Değildir...");
       }
        
    }
    
    public static boolean  PalindromHesapla(int sayi){
        
        int tersSayi= 0;
        int orijinalSayi = sayi;
        
        while(sayi != 0 ){
            int basamak = sayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            sayi /= 10;
        }
        
        return orijinalSayi == tersSayi;
    }
    
}

