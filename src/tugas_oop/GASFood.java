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
public class GASFood {
    String nama;
    int harga,total;
    int ongkir = 5000;
    
    GASFood(String nama1,int harga1){
        
        this.nama = nama1;
        this.harga = harga1;
        total = harga+ongkir;
    }
    
    void tampilGASFood(){
        
        System.out.println("\nMasukkan Pilihan Anda "+nama);
        System.out.println("\nTotal Pesanan   : "+total);
    }
}
