/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun.BangunDatar;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements BangunDatar {
    double jari2;
    final double pi = 3.1415;
    
    public Lingkaran(double jari2) {
        this.jari2 = jari2;
    }
    
    @Override
    public double luas() {
        return pi*jari2*jari2;
    }

    @Override
    public double keliling() {
        return pi*2*jari2;
    }
    
}
