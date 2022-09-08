package Main;

import bangundatar.Lingkaran;
import bangundatar.Persegi;
import bangundatar.PersegiPanjang;
import bangunruang.Balok;
import bangunruang.Bola;
import bangunruang.Kubus;

public class Main {
    public static void main(String[] args) {
        PersegiPanjang panjang = new PersegiPanjang(2, 5);
            System.out.println("Persegi Panjang : ");
            panjang.hitungLuas();
            panjang.hitungKeliling();
            panjang.printInfo();
        
        Persegi persegi = new Persegi(8);
            System.out.println("Persegi : ");
            persegi.hitungLuas();
            persegi.hitungKeliling();
            persegi.printInfo();
            
        Lingkaran lingkaran = new Lingkaran(3);
        System.out.println("Lingkaran : ");
            lingkaran.hitungLuas();
            lingkaran.hitungKeliling();
            lingkaran.printInfo();
            
        Balok balok = new Balok(2, 5, 10);
            System.out.println("Balok : ");
            balok.hitungLuas();
            balok.hitungKeliling();
            balok.hitungVolume();
            balok.printInfo();
        
        Kubus kubus = new Kubus(12);
            System.out.println("Kubus : ");
            kubus.hitungLuas();
            kubus.hitungKeliling();
            kubus.hitungVolume();
            kubus.printInfo(); 
            
        Bola bola = new Bola(15);
            System.out.println("Bola : ");
            bola.hitungLuas();
            bola.hitungKeliling();
            bola.hitungVolume();
            bola.printInfo();
    }
}
