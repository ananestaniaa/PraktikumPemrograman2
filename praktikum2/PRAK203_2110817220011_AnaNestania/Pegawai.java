package PRAK203_2110817220011_AnaNestania;
/**
 *
 * @author ANA NESTANIA
 */
public class Pegawai {
    public String nama;
    //Pada baris ini tipe data char diganti menjadi tipe data String karena menyimpan banyak kata
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        return asal;
    }
    //Pada baris ini terjadi error dikarenakan tidak mendeklarasikan variabel j terlebih dahulu. 
    //Sehingga variabel j harus dideklarasikan terlebih dahulu 
    //public void setJabatan() {     
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
