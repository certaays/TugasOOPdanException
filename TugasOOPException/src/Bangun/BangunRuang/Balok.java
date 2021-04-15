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
public class Balok implements BangunDatar, BangunRuang {
    double panjang, lebar, tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public Balok(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        return 2*(panjang+lebar);
    }

    @Override
    public double volume() {
        return panjang*lebar*tinggi;
    }

    @Override
    public double luasPermukaan() {
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi);
    }
    
    
}
