/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan48.kalkulator;

/**
 *Nama  : Brigita Julia Puspita Nsi Goncalves
 *Kelas : PBO-2
 *NIM   : 10117074
 *Deskripsi Program : program ini berisi program project kalkulator
 */
public class PBO210117074Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kalkulator klt = new kalkulator();
        
        System.err.println("value1 = 7.0 ");
        klt.setValue1(7.0);
        System.out.println("value2 = 5.0");
        klt.setValue2(5.0);
        System.out.println("");
        klt.setNamaProject();
        System.out.println("");
        klt.setNoteProject("This project shown you how to manage method in java");
        System.out.println("Result add is = " + klt.add(7.0, 5.0));
        System.out.println("Result minus is = " + klt.minus(7.0, 5.0));
        System.out.println("Result multiple is = " + klt.minus(7.0, 5.0));
        System.out.println("Result division id = " + klt.division(7.0,5.0));
    }
}