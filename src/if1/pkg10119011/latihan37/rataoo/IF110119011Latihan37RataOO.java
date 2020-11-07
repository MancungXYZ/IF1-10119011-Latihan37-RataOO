/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan37.rataoo;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan37RataOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        RataOO rt = new RataOO();
        
        System.out.print("Masukan banyaknya mahasiswa : ");
        rt.jumlahMahasiswa = sc.nextInt();
        
        System.out.println();
        
        rt.tampilNilai();
        
        System.out.println("Maka, Rata-rata Nilainya adalah " + rt.menghitungRata());
        System.out.println("Devoleped by Reihan Wiyanda");
        
    }
    
}
