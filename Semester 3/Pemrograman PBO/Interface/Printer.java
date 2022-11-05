/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author ASUS
 */
public class Printer implements Copier, Scanner{
        @Override
        public void scanImage(){
            System.out.println("Scanning image...");
        }
        @Override
        public void copyImage(){
            System.out.println("Copy image...");
        }
        public void printImage(){
            System.out.println("Print image...");
        }
        
}
