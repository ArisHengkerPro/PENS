/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kpop;

/**
 *
 * @author ASUS
 */
public class Fans {
    private String name;
    
    public Fans(){
        
    }
    
    public Fans(String name){
        this.name = name;
    }
    
    public void showName(){
        System.out.print(name + ": ");
    }
    
    public void watchingPerformances(){
        System.out.println("noname: melihat idolanya dari youtube");
    }
    
    public void watchingPerformances(Musician musician){
        System.out.print(name + ": " + " melihat idolanya ");
        musician.perform();
    }
    
}
