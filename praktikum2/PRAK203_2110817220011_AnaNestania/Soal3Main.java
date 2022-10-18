package PRAK203_2110817220011_AnaNestania;
/**
 *
 * @author ANA NESTANIA
 */
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada baris ini terjadi error karena tidak ada (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Pada baris ini kurang deklarasi umur 
        p1.umur = 17;
        //Pada baris ini output yang diperlukan adalah Nama:Roi, sehingga kata Pegawai dihapus saja
        //System.out.println("Nama Pegawai : " + p1.getNama());
        System.out.println("Nama : " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ini kurang +" tahun" setelah cetak umur
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur +" tahun");
    }
}