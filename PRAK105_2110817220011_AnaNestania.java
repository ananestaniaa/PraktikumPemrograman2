/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

/**
 *
 * @author ANA NESTANIA
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class PRAK105_2110817220011_AnaNestania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jari, tinggi, hasil;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari : ");
        jari = keyboard.nextDouble();
        
        System.out.print("Masukkan tinggi : ");
        tinggi = keyboard.nextDouble();
        
        hasil = 3.14 * jari * jari * tinggi;
        
        System.out.println("Volume tabung dengan jari-jari " + jari + " cm ");
        System.out.println("dan tinggi " + tinggi + " cm ");
        System.out.println("adalah " + df.format(hasil) + " m3");
    }
}