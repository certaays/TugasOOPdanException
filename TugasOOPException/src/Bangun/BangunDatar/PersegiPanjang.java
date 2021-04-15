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
public class PersegiPanjang implements BangunDatar{
    double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
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
    
}
