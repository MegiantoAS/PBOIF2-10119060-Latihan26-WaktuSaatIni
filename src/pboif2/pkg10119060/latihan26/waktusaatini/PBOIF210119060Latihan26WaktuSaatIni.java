/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan26.waktusaatini;
   import java.util.*;
/**
 *
 @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Waktu Saat ini
 */
public class PBOIF210119060Latihan26WaktuSaatIni {
   

  public static void main(String[] args){
    int detik, menit, jam, hari, tanggal, bulan, tahun;
    GregorianCalendar date = new GregorianCalendar();
    String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
    String namahari[] = { "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Juma'at","Sabtu"};
    detik = date.get(Calendar.SECOND);
    menit = date.get(Calendar.MINUTE);
    jam =  date.get(Calendar.HOUR_OF_DAY);
    hari = date.get(Calendar.DAY_OF_WEEK);
    tanggal = date.get(Calendar.DAY_OF_MONTH);
    bulan = date.get(Calendar.MONTH);
    tahun = date.get(Calendar.YEAR);
    System.out.println("Hari ini adalah hari : "+namahari[hari-1]+"," +tanggal+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
  }
}
 
 
    

