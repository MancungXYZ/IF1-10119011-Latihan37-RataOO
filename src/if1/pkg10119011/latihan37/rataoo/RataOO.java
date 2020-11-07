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
public class RataOO {
    public int jumlahMahasiswa;
    public double rataNilai;
    public double jumlahNilai;
    public double nilaiMahasiswa = 0;
    public Scanner sc = new Scanner(System.in);
    
    public double menghitungRata () {
        rataNilai = jumlahNilai / jumlahMahasiswa;
        return rataNilai;
    }
    
    public void tampilNilai () {
        int i = 1;
        while (i <= jumlahMahasiswa) {
            System.out.print("Nilai mahasiswa ke-" + i + "adalah : ");
            i++;
            nilaiMahasiswa = sc.nextInt();
            jumlahNilai = nilaiMahasiswa + jumlahNilai;
        }
    }
}
