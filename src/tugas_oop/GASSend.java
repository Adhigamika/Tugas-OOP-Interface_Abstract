/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_oop;

/**
 *
 * @author user
 */

/**
 * Send
 */
public interface Send {
    public void tampilGASSend();
}


public class GASSend implements Send{
    
    String nama;
    double jarak,berat,biaya;
    
   GASSend (String nama1, double jarak1, double berat1){
       
       this.nama = nama1;
       this.jarak = jarak1;
       this.berat = berat1;
       biaya = (berat*3000)+(jarak*2000)+3000;
   }
   
  public void tampilGASSend (){
      
      System.out.println("\nNama Paket    : "+nama);
      System.out.println("\nBerat Paket   : "+berat+" KG");
      System.out.println("\nJarak Kirim   : "+jarak+" KM");
      System.out.println("\nBiaya Order   : "+biaya);
  }
}
