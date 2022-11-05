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
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.scanImage();
        printer.copyImage();
        printer.printImage();
        
    }
}
