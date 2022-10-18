package PRAK202_2110817220011_AnaNestania;
/**
 *
 * @author ANA NESTANIA
 */
import java.text.DecimalFormat;
public class Mobil {
    String merek, tahun_keluaran, pemilik;
    int kapasitas, harga;

    DecimalFormat formatter = new DecimalFormat("#,###");

    String getPemilik(){
        return pemilik;
    }
      void setPemilik(String pemilik){
        this.pemilik = pemilik;
    }
    String getPajak(){
        double pajak=harga*2/100;
        return formatter.format(Double.parseDouble(String.valueOf(pajak)));
    }
    void info(){
        System.out.println("Merek Mobil: "+merek);
        System.out.println("Harga: Rp. "+formatter.format(Double.parseDouble(String.valueOf(harga))));
        System.out.println("Tahun Keluaran: "+tahun_keluaran);
        System.out.println("Kapasitas: "+kapasitas+"cc");
    }
}