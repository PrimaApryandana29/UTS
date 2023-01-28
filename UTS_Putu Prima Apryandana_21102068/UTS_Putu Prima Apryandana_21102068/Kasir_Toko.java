/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_21102068_primaaprandana;
import java.util.Scanner;

/**
 *
 * @author 21102068/PrimaApryandana
 */
public class Kasir_Toko {
    //property
    Scanner dtain = new Scanner(System.in);
    
    //properties
    private int HargaBarang, Diskon, TotalHarga;
    private String NamaKaryawan, AlamatKaryawan, NamaBarang;
    
    //methods
    public void SetNamaKaryawan(String nama){
        this.NamaKaryawan = nama;
    }
    
    public void SetAlamatKaryawan(String alamat){
        this.AlamatKaryawan = alamat;
    }
    
    public void SetNamaBarang(int i, String t){
        i = 1;
        t = "";
        String n;
        System.out.print("Berapa Banyak Barang?: ");
        String bn = dtain.nextLine();
        while (i <= Integer.parseInt(bn)){
            System.out.print("Masukan Nama barang ke-"+i+": ");
            n = dtain.nextLine();
            i++;
            System.out.println("Barang: "+n);
            n = "\n" + n;
        }
        this.NamaBarang = t;
    }
    
    
    public void SetHargaBarang(int i, int t){
        i = 1;
        t = 0;
        System.out.print("Berapa banyak barang yang ingin dimasukan?: ");
        String bn = dtain.nextLine();
        while (i <= Integer.parseInt(bn)){
            System.out.print("Masukan Harga barang ke-"+i+": ");
            String n = dtain.nextLine();
            i++;
            t = t + Integer.parseInt(n);
            System.out.println("Harga barang ke-"+i+": "+n);
        }
        this.HargaBarang = t;
        System.out.println("Total Harga: "+t);
    }
    
    public void SetDiskon(int n){
        
        if (n >= 100000  ){
            n = n * 15/100;
            System.out.println(n);
            this.Diskon = n;
        }
        else if (n >= 500000){
            n = n * 30/100;
            System.out.println(n);
            this.Diskon = n;
        }
        else if (n >= 1000000){
            n = n * 50/100;
            System.out.println(n);
            this.Diskon = n;
        }
        
        else{
            n = n * 0;
            System.out.println("Maaf Anda Tidak Dapat Diskon");
            this.Diskon = n;
        }
    }
    
    public void SetTotalHarga (int t, int d){
     
        this.TotalHarga = t - d;
    }
    
    public String GetNamaKaryawan(){
        return this.NamaKaryawan;
        
    }
    public String GetAlamatKaryawan(){
        return this.AlamatKaryawan;
    }
    
    public String GetNamaBarang(){
        return this.NamaBarang;
    }
    
    public int GetHargaBarang (){
        return this.HargaBarang;
    }
    
    public int GetDiskon (){
        return this.Diskon;
    }
    
    public int GetTotalHarga (){
        return this.TotalHarga;
    }
}

