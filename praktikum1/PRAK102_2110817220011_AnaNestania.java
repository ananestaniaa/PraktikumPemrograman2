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
public class PRAK102_2110817220011_AnaNestania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka, bil;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan : ");
        angka = keyboard.nextInt();
        
        int i = 7;
        while (i >= 0) {            
            if (angka % 2 == 0){
                bil = (angka / 2) - 1;
            } else {
                bil = angka;
            }
            
            if (i == 7){
               System.out.print(bil);
            } else {
                System.out.print(", " + bil);
            }
            
            angka++;
            i--;
        }
    }
}
