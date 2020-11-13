/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan47.nilaimahasiswa;

/**
 * @author 
 * Nama      : Garry Prang
 * Kelas     : PBO2
 * NIM       : 10116147
 * Deskripsi : Program untuk menampilkan nilai mahasiswa.
 */

public class PBO210116147Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa mhs = new NilaiMahasiswa();
        mhs.setQuiz(75);
        mhs.setUts(45);
        mhs.setUas(34);
        System.out.println("QUIZ = " + mhs.getQuiz());
        System.out.println("UTS  = " + mhs.getUts());
        System.out.println("UAS  = " + mhs.getUas());
        
        System.out.println();
        
        System.out.println("Nilai Akhir = " + mhs.hitungNilaiAkhir());
        
        System.out.println();
        
        System.out.println("Index = " + mhs.indexNilai(mhs.hitungNilaiAkhir()));
        System.out.println("Keterangan = " + mhs.IndexKeterangan(mhs.indexNilai(mhs.hitungNilaiAkhir())));
    }
    
}
