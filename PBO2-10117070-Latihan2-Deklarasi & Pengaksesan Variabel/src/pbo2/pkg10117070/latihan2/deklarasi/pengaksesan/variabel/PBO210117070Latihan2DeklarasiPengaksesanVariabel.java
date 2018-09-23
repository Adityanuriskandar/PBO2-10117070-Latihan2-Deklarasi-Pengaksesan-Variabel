/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan2.deklarasi.pengaksesan.variabel;

/**
 *
 * @author Aditya
 * NAMA     : Aditya Nur Iskandar
 * KELAS    : PBO2/IF2
 * NIM      : 10117070
 * Deskripsi Program : Program ini berisi program untuk mengetahui cara
 * mengakses variabel.
 */
public class PBO210117070Latihan2DeklarasiPengaksesanVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //Konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //Memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //Menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai\t= " + nilaiInt);
        System.out.println("Isi variabel PHI\t= " + PHI);
        System.out.println("Isi variabel logika\t= " + nilaiLogika);
        System.out.println("Isi variabel Karakter\t= " + nilaiKarakter);
    }
    
}
