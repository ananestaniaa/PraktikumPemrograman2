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
public class PRAK103_2110817220011_AnaNestania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int angka;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan : ");
        angka = keyboard.nextInt();
        
        int i = 5;
        
        do {            
            if (angka % 7 != 0){
                if (i == 5){
                   System.out.print(angka);
                } else {
                    System.out.print(", " + angka);
                }
            }
            
            angka--;
            i--;
        } while (i > 0);
    }
}