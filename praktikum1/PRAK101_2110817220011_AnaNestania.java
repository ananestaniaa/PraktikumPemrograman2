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
public class PRAK101_2110817220011_AnaNestania {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //deklarasi variabel//
        
        String nama, tempatlahir;
        int tanggallahir, bulanlahir, tahunlahir, tinggibadan ;
        float beratbadan;
        
        //membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        //Tampilkan output ke user
        System.out.print("Masukkan Nama Lengkap: ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        tempatlahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggallahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        bulanlahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        tahunlahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        tinggibadan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        beratbadan = keyboard.nextFloat();
        
        //BulanLahir
        String bulan = "a";
        switch (bulanlahir) {
            case 1:
                bulan = "Januari";
                break;
            case 2:
                bulan = "Februari";
                break;
            case 3:
                bulan = "Maret";
                break;
            case 4:
                bulan = "April";
                break;
            case 5:
                bulan = "Mei";
                break;
            case 6:
                bulan = "Juni";
                break;
            case 7:
                bulan = "Juli";
                break;
            case 8:
                bulan = "Agustus";
                break;
            case 9:
                bulan = "September";
                break;
            case 10:
                bulan = "Oktober";
                break;
            case 11:
                bulan = "November";
                break;
            case 12:
                bulan = "Desember";
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
                break;
        }
        
        //Menampilkan apa yang sudah disimpan di variabel
        System.out.println("Data Telah Ditambahkan,");
        
        System.out.print("Nama Lengkap " + nama + ",");
        System.out.print(" Lahir di " + tempatlahir);
        System.out.print(" pada Tanggal " + tanggallahir);
        System.out.print(" " + bulan + " ");
        System.out.println(tahunlahir + " ");
        System.out.print("Tinggi Badan " + tinggibadan + " cm ");
        System.out.print("dan berat badan " + beratbadan + " kilogram");
        
        
    }
    
}
