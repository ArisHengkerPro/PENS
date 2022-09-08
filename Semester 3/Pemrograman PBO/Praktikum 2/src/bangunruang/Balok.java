/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class Balok extends BangunRuang {
    private float p;
    private float l;
    private float t;
    
    public Balok(float p, float l, float t){
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    public void hitungLuas() {
        this.luas = 2 * ((p * l) + (p * t) + (l * t));
    }

    @Override
    public void hitungKeliling() {
        this.keliling = 4 * (p + l + t);
    }
    
    @Override
    public void hitungVolume() {
        this.volume = p * l * t;
    }
}
