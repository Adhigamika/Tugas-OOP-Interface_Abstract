/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_oop;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class GASJek {
    
    String username;
    int password;
    
    public static void main(String[] args){
        String user="gasbro";
        int pass = 12345;
        
       Scanner input = new Scanner (System.in);
        System.out.println("====== PROGRAM OJEK SEDERHANA DENGAN KONSEP OOP ======");
       
       System.out.println("\n --- SILAHKAN LOGIN ---");
       System.out.print("\nMasukkan Username Anda  : ");
       String username=input.nextLine();
       System.out.print("\nMasukkan Password Anda  : ");
       int password=input.nextInt();
       if (username.equals(user)&&password==pass){
       
       System.out.println("\nSilahkan Pilih Menu   : ");
       System.out.println("1. GASRide");
       System.out.println("2. GASFood");
       System.out.println("3. GASSend");
       System.out.print("\nMasukkan Pilihan Anda   : ");
       
       int pilih = input.nextInt();
       
       switch(pilih){
            
           case 1:
           
               System.out.println("\nSilahkan Pilih Alamat dan Tujuan");
               System.out.println("1. Denpasar - Jimbaran");
               System.out.println("2. Denpasar - Kuta");
               System.out.println("3. Mengwi - Sempidi");
               System.out.print("\n Masukkan Pilihan Anda   :");
        
       int pilih1=input.nextInt();
       
           switch(pilih1){
               
               case 1:
                   
               GASRide a=new GASRide("Denpasar", "Jimbaran", 4000,8);
               a.tampilGASRide();
                break;
                 
               case 2:
                   
               GASRide b=new GASRide("Denpasar", "Kuta", 4000,5);
               b.tampilGASRide();
                break;
                 
               case 3:
                   
               GASRide c=new GASRide("Mengwi", "Sempidi", 4000,2);
               c.tampilGASRide();
                break;
           }
                break;
                
           case 2:
           
           System.out.println("\nSilahkan Pilih Menu GASFood");
           System.out.println("1.Nasi Goreng");
           System.out.println("2.Soto Ayam");
           System.out.println("3.Nasi Campur");
           System.out.println("4.Ayam Kremes");
           System.out.println("5.Tahu Balado");
           System.out.print("\n Masukkan Pilihan Anda   : ");
           int pilih2=input.nextInt();
           
           switch(pilih2){
               
               case 1:
               
               GASFood a=new GASFood("Nasi Goreng", 12000);
               a.tampilGASFood();
                break;
                 
               case 2:
               
               GASFood b=new GASFood("Soto Ayam", 8000);
               b.tampilGASFood();
                break;
                 
                case 3:
               
                    
               GASFood c=new GASFood("Nasi Campur", 15000);
               c.tampilGASFood();
                break;
                 
                case 4:
               
               GASFood d=new GASFood("Ayam Kremes", 17000);
               d.tampilGASFood();
                break;
                 
                case 5:
               
               GASFood e=new GASFood("Tahu Balado", 11000);
               e.tampilGASFood();
                break;
           }
                break;
                
           case 3:
           
           System.out.println("\nSilahkan Pilih Menu GASSend");
           System.out.println("1.Paket Pecah Belah");
           System.out.println("2.Paket Plastik");
           System.out.println("3.Paket kayu");
           System.out.println("\n Masukkan Pilihan Anda : ");
           int pilih3=input.nextInt();
           
           switch(pilih3){
               
                case 1:
                   
            GASSend a =new GASSend("Paket Pecah Belah",5.5,1.28);
               a.tampilGASSend();
                 break;
                 
                 case 2:
                   
            GASSend b =new GASSend("Paket Plastik",5.5,2);
               b.tampilGASSend();
                 break;
                 
                 case 3:
                   
            GASSend c =new GASSend("Paket Kayu",5.5,3.5);
               c.tampilGASSend();
                 break;
                 
           }
       } 
       } else {
           System.out.println("\n LOGIN ERROR");
       }
    }
       
}
