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
public class Kubus implements BangunRuang, BangunDatar {
    double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double volume() {
        return sisi*sisi*sisi;
    }

    @Override
    public double luasPermukaan() {
       return sisi*sisi*6;
    }

    @Override
    public double luas() {
        return sisi*sisi;
    }

    @Override
    public double keliling() {
        return 4*sisi;
    }
    
}
