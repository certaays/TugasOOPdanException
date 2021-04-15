/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun;

import Bangun.BangunDatar.*;
import Bangun.BangunRuang.*;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        char ulang; int pilih; boolean auto;
        do{
        auto = false;
        System.out.println("Menu");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Persegi Panjang ");
        System.out.println("4. Segitiga");
        System.out.println("5. Kubus");
        System.out.println("6. Silinder");
        System.out.println("7. Balok");
        System.out.println("0. Sudahi sajaa");
        try{
        System.out.print("Masukkan pilihan Anda : ");
        
        pilih = input.nextInt();
        switch(pilih){
            case 1 -> { Square(); }
            case 2 -> { Circle(); }
            case 3 -> { Rectangle(); }
            case 4 -> { Triangle(); }
            case 5 -> { Cube(); }
            case 6 -> { Cylinder(); }
            case 7 -> { Cuboid(); }
            case 0 -> { System.exit(0); }
            default -> {System.out.println("\nMaaf! pilihan anda tidak ada di menu"); }      
        }
        System.out.print("\nMau lagi (y/n) ? : "); 
        } catch(Exception error){
            System.out.println("\nInput yang Anda masukkan salah!!!");
            auto=true;
        }   
        ulang = input.next().charAt(0);
        System.out.println("");
        }while (auto || ulang=='y' || ulang=='Y');
    }
    
    private static void Circle(){
        System.out.println("===LINGKARAN===");
        double r;
        
        System.out.print("Masukkan jari - jari : ");
        r = input.nextDouble();
        BangunDatar lingkaran = new Lingkaran(r);
        
        System.out.println("");
        System.out.println("Luas Lingkaran : " + lingkaran.luas());
        System.out.println("Keliling Lingkaran : " + lingkaran.keliling());
    }
    
    private static void Square(){
        System.out.println("===PERSEGI===");
        double s;
        
        System.out.print("Masukkan sisi : ");
        s = input.nextDouble();
        BangunDatar persegi = new Persegi(s);
        
        System.out.println("");
        System.out.println("Luas Persegi : " + persegi.luas());
        System.out.println("Keliling Persegi : " + persegi.keliling());
    }
    
    private static void Rectangle(){
        System.out.println("===PERSEGI PANJANG===");
        double p, l;
        
        System.out.print("Masukkan panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        l = input.nextDouble();
        BangunDatar persegiPanjang = new PersegiPanjang(p, l);
        
        System.out.println("");
        System.out.println("Luas Persegi Panjang : " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang : " + persegiPanjang.keliling());
    }
    
    private static void Triangle(){
        System.out.println("===SEGITIGA===");
        double a, t;
        
        System.out.print("Masukkan alas : ");
        a = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();
        BangunDatar segitiga = new Segitiga(a, t);
        
        System.out.println("");
        System.out.println("Luas Segitiga : " + segitiga.luas());
    }
    
    private static void Cube(){
        System.out.println("===KUBUS===");
        double s;
        System.out.print("Masukkan sisi : ");
        s = input.nextDouble();
        BangunDatar kubus = new Kubus(s);
        BangunRuang kubus2 = new Kubus(s);
        
        System.out.println("");
        System.out.println("Luas Alas : " + kubus.luas());
        System.out.println("Keliling Alas : " + kubus.keliling());
        System.out.println("Volume Kubus: " + kubus2.volume());
        System.out.println("Luas Permukaan Kubus : " + kubus2.luasPermukaan());
    }
    
    private static void Cuboid(){
        System.out.println("===BALOK===");
        double p, l, t;
        System.out.print("Masukkan panjang : ");
        p = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        l = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();
        BangunDatar balok = new Balok(p,l);
        BangunRuang balok2 = new Balok(p, l, t);
        
        System.out.println("");
        System.out.println("Luas Alas : " + balok.luas());
        System.out.println("Keliling Alas : " + balok.keliling());
        System.out.println("Volume Balok : " + balok2.volume());
        System.out.println("Luas Permukaan Balok : " + balok2.luasPermukaan());
    }
    
    private static void Cylinder(){
        System.out.println("===SILINDER===");
        double r, t;
        System.out.print("Masukkan jari - jari : ");
        r = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        t = input.nextDouble();
        BangunDatar silinder = new Silinder(r);
        BangunRuang silinder2 = new Silinder(r, t);
        
        System.out.println("");
        System.out.println("Luas Alas : " + silinder.luas());
        System.out.println("Keliling Alas : " + silinder.keliling());
        System.out.println("Volume Silinder : " + silinder2.volume());
        System.out.println("Luas Permukaan Silinder : " + silinder2.luasPermukaan());
    }
}
