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
public class Bola extends BangunRuang {
    private float phi = 22/7;
    private float r;
    
    public Bola (float r){
        this.r = r;
    }

    @Override
    public void hitungLuas() {
        this.luas = 4 * phi * (r * r);
    }

    @Override
    public void hitungVolume() {
        this.volume = (4/3) * phi * (r * r * r);
    }
}
