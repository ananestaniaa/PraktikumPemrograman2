package praktikum4.soal1;
/**
 *
 * @author ANA NESTANIA
 */
public class Buku {
    private String judul;
    private String penulis;
    private Integer tahun;
    
    public Buku(String j, String p, int t){
        this.judul = j;
        this.penulis = p;
        this.tahun = t;
    }
    
    void display(){
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + this.judul);
        System.out.println("Penulis adalah " + this.penulis);
        System.out.println("Tahun Terbit adalah " + this.tahun);
    }    
}