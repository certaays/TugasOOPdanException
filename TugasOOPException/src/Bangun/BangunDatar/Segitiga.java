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
public class Segitiga implements BangunDatar{
    double alas, tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    @Override
    public double luas() {
        return alas*tinggi*0.5;
    }

    @Override
    public double keliling() {
        return 0;
    }
    
}
