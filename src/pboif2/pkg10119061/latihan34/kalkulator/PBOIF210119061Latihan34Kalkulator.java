/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan34.kalkulator;
import java.util.Scanner;
/**
 *
 * @author Rheiza
 * NAMA  : RHEIZA AKMAL R
 * KELAS : IF2
 * NIM   : 10119061
 * 
 */
public class PBOIF210119061Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner keyboard = new Scanner(System.in);
        Kalkulator hitung = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        System.out.print("Masukkan Angka ke-1 : ");
        hitung.value1 = keyboard.nextDouble();
        
        System.out.print("Masukkan Angka ke-2 : ");
        hitung.value2 = keyboard.nextDouble();
        
        System.out.println();
        System.out.println("Hasil Pertambahan :" +hitung.tambahBilangan());
        System.out.println("Hasil Pengurangan :" +hitung.kurangBilangan());
        System.out.println("Hasil Perkalian :" +hitung.kaliBilangan());
        System.out.println("Hasil Pembagian :" +hitung.bagiBilangan());
        System.out.println("Hasil Sisa :" +hitung.sisaBilangan());
    }
    
}
