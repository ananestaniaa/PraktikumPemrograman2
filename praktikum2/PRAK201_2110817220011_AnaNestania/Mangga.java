package PRAK201_2110817220011_AnaNestania;
/**
 *
 * @author ANA NESTANIA
 */
public class Mangga {
    String nama, warna, tekstur, rasa;
    double berat, tb;
    int harga, th, jb;

public Mangga(String NamaMangga, String WarnaMangga, String TeksturMangga, String RasaMangga, double BeratMangga, int JumlahBeliMangga, double TotalBeratMangga, int HargaMangga, int TotalHargaMangga){
    nama = NamaMangga;
    warna = WarnaMangga;
    tekstur = TeksturMangga;
    rasa = RasaMangga;
    berat = BeratMangga;
    harga = HargaMangga;
    jb = JumlahBeliMangga;
    tb = BeratMangga * JumlahBeliMangga;
    th = HargaMangga * JumlahBeliMangga;
    }

public void display(){
        System.out.println("Nama Mangga: " + nama);
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Jumlah Beli: " + jb);
        System.out.println("Total berat: " + tb + " kg");
        System.out.println("Total harga: Rp. " + th);
        System.out.println();
    }
}
