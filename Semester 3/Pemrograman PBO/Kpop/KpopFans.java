/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kpop;


public class KpopFans extends Fans{
    public KpopFans(){
        
    }
    
    public KpopFans(String name){
       super(name);
    }
    
    public void watchingPerformances(Musician musician, String expression){
            super.showName();
            System.out.print(expression + " melihat idolanya ");
            musician.perform();
    }
    
}
