/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_21102052_sudarma;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class UTS_21102068_PrimaApryandana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dtain = new Scanner(System.in);
        Kasir_Toko KT = new Kasir_Toko();
        
        //set Identitas Karyawan
        System.out.print("Masukan Nama Karyawan: ");
        KT.SetNamaKaryawan(dtain.nextLine());
        System.out.print("Masukan Alamat karyawan: ");
        KT.SetAlamatKaryawan(dtain.nextLine());
        
        //set Nama Barang
        KT.SetNamaBarang(1,"");
        
        //set Harga Barang
        KT.SetHargaBarang(1,0);
        
        //set Diskon
        KT.SetDiskon(KT.GetHargaBarang());
        
        //set Total Harga
        KT.SetTotalHarga(KT.GetHargaBarang(),KT.GetDiskon());
        
        System.out.println("============================================================");
        System.out.println();
        
        //get Identitas Karyawan
        System.out.println("Nama Karyawan : "+ KT.GetNamaKaryawan());
        System.out.println("Alamat Karyawan : "+ KT.GetAlamatKaryawan());
        
        //get Nama Barang
        System.out.println("Nama Barang   : "+ KT.GetNamaBarang());
        
        //get Harga Barang
        System.out.println("Harga Barang    : "+ KT.GetHargaBarang());
        
        //get Diskon
        System.out.println("Diskon    : "+ KT.GetDiskon());
        
        //get Total Harga
        System.out.println("Total Harga    : "+ KT.GetTotalHarga());
                
    } 
}
