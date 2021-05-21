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

abstract class Ride{
    String jemput;
    String tujuan;
    int biaya,total,jarak;
    int ongkir = 4000;

    public abstract void tampilGASRide();
}
public class GASRide extends Ride{
    
   public GASRide (String jemput1, String tujuan1, int biaya1, int jarak1){
       
       this.jemput = jemput1;
       this.tujuan = tujuan1;
       this.biaya = biaya1;
       this.jarak = jarak1;
       total = (biaya*jarak)+ongkir;
   }
    public void tampilGASRide(){
        
        System.out.println("\nLokasi Anda         : "+jemput);
        System.out.println("\nLokasi Tujuan Anda  : "+tujuan);
        System.out.println("\nBiaya Order Anda    : "+total);
    }
}
