/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bangun.BangunRuang;

import Bangun.BangunDatar.BangunDatar;

/**
 *
 * @author ASUS
 */
public class Silinder implements BangunDatar, BangunRuang {
    final double pi = 3.1415;
    double jari2, tinggi;

    public Silinder(double jari2, double tinggi) {
        this.jari2 = jari2;
        this.tinggi = tinggi;
    }
    public Silinder(double jari2){
        this.jari2 = jari2;
    }
    
    @Override
    public double luas() {
        return pi*jari2*jari2;
    }

    @Override
    public double keliling() {
        return 2*pi*jari2;
    }

    @Override
    public double volume() {
       return pi*jari2*jari2*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*pi*jari2*(jari2+tinggi);
    }
    
}
