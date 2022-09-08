
package bangundatar;

public class Lingkaran extends BangunDatar {
    private float phi = 22/7;
    private float r;
   
    public Lingkaran(float r){
        this.r = r;
    }
    
    @Override
    public void hitungLuas(){
        this.luas = phi * (r * r);
    }

    @Override
    public void hitungKeliling() {
        this.keliling = 2 * phi * r;
    }
}
