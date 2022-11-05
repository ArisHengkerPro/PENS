package Senjata;


public class Gun extends Weapon{
    public int bullets;
    
    public Gun(int bullets){
        this.bullets = bullets;
    }

    @Override
    public void Attack() {
        System.out.println("Senjata");
        System.out.println("Menembakkan peluru");
        bullets -= 1;
        System.out.println("Sisa peluru : " + bullets);
    }

    
}
