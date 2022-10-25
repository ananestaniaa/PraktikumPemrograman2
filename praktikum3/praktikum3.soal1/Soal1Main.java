package praktikum3.soal1;
/**
 *
 * @author ANA NESTANIA
 */
import java.util.Scanner;
public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dadu dadu = new Dadu();
        int masukkan = input.nextInt();

        dadu.setInput(masukkan);
        dadu.acakNilai();
    } 
}